import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/*


	����Ŭ ���� Ȩ������ stream ���� : ������ ó�� ������ �����ϵ��� �ҽ����� ����� ���
	����ؼ� �帣�� �ó����� ���ϱ⵵ �� - ���α׷������� �������� ������ �帧�̶�� �Ϳ� ������ ���� �����ϱ�
	stream - �����͸� ��� �ٷ� ���ΰ� �ϴ� ������ �����������̶�� �� �� �ִ�.
	
  // �ڹ�8 ���� stream������ ������ �� for���� �̿��ϴ� ��� - JPA �����Ҷ� �Խ��� crud ���� �����ߴ� ����

// ��� ��� ��ȸ
 public List<CommentDto> comments(Long articleId) { 
 
   List<Comment> comments = commentRepository.findByArticleId(articleId); // ��ƼƼ���� ������ ��������

     List<CommentDto> dtos = new ArrayList<CommentDto>(); // ArrayList ����

	//Entity -> DTO ��ȯ
     for (int i = 0; i < comments.size(); i++) { 
         Comment c = comments.get(i); // �ϴ� ��ƼƼ list�� Ǯ��
         CommentDto dto = CommentDto.toDto(c);  // CommentDto Ŭ������ toDto �޼ҵ� �����ص�
         dtos.add(dto); 
     }
     return dtos;
   }
   
   
for���� �̿��ϰ� �Ǹ�
repository���� findById�� ã�ƿ� ������ ����ȭ �����ܰ� ���ÿ�
ArrayList�� �������ְ� dto�� ��ȯ���� ������ ArrayList�� add ���ִ°� �Ǵ� 
���⿡�� ������� ���� �� �ڵ�� ���� �ڵ带 �ۼ��� �� �ۿ� ����.
   
   
// stream �̿� : ���� -> ���� -> �Һ�
  
 1. ���� :  stream ��Ʈ������
 
 2. ���� :  �߰�����
 
     * filter
     * map
     
 3. �Һ� : collect �������� 
                                         
 public List<CommentDto> comments(Long articleId) {                                        
       return commentRepository.findByArticleId(articleId).stream().map(comment-> CommentDto.toDto(comment))
       .collect((Collectors.toList()));
    }
         
         
���� �� �������̰� �ڵ��� �絵 �����ϰ� ���� �� �ִ�

map �ܿ��� stream�� �����κп��� �������� �޼ҵ尡 �ִ�. (filter, map, peek, sorted, distinct, limit ...)

## ��Ʈ�� ��� ����ϴ°�? - ���������̴�, ü�̴�

 


�ڷᱸ���� �����ϴ� ��� ���� �޼ҵ忡 �����ϴ� �÷��ǰ� �ٸ���,
��Ʈ���� ��û�� ���� ��Ҹ� ����ϴ� ������ �ڷᱸ���� ������.
*/


public class Stream {
	
	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Stream() {}

	public Stream(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		// map �޼ҵ� ���
		// ���� ��Ʈ�� ���� ��Ҹ� ���ϴ� Ư�� ���·� ��ȯ�� �� �ֽ��ϴ�.
		// Stream�̶�� ��ü�� ������ List<Stream> ���� ���ڿ� name �ʵ常�� List �ڷᱸ���� ��� ����ϴ� �ڵ��Դϴ�
		
		List<Stream> streamList = Arrays.asList
				(new Stream("jacob", 32)
				, new Stream("david", 30));

		List<String> names = streamList.stream()
				.map(Stream::getName)
				.collect(Collectors.toList());

		names.forEach(System.out::println);
		// jacob, david ���
		
		System.out.println("--------------------------------");
		
		
		List<String> list1 = streamList.stream()
				.map(stream -> stream.getName())
				.collect(Collectors.toList()); // ���ٽ� ����
		System.out.println(list1);
		// jacob, david ���
		
		List<String> list2 = streamList.stream()
				.map(Stream::getName)
				.collect(Collectors.toList()); // �޼ҵ� ����
		System.out.println(list2);
		// jacob, david ���
		
		
		System.out.println("--------------------------------");
		
		
		
		String[][] namesArr = new String[][] {
			{"kim", "jacob"}, {"lee", "jeong"}, {"park", "chanho"}, {"kang", "hodong"}
		};
		
//		flatMap �޼���� ��Ʈ���� ���°� �迭�� ���� ��, ��� ���Ҹ� ���� ���� ��Ʈ������ ��ȯ�� �� �ֽ��ϴ�.
//		2���� �迭���� ���ڿ��� ���̰� 4 ���� ���� ���ڿ��� ����ϴ� �ڵ�
		
		List<String> streamArr1 = Arrays.stream(namesArr)
		.flatMap(innerArr -> Arrays.stream(innerArr))
		.filter(name -> name.length() < 4) // filter ���״�� ���͸� �ϴ� �۾� - �������� �־��شٴ� ����?
		.collect(Collectors.toList());
		
		System.out.println(streamArr1);
		// kim, lee ���
		
		
		List<String> streamArr2 = Arrays.stream(namesArr)
				.flatMap(innerArr -> Arrays.stream(innerArr))
				.filter(name -> name.equals("kim")) // filter ���״�� ���͸� �ϴ� �۾� - �������� �־��شٴ� ����?
				.collect(Collectors.toList());
		
		System.out.println(streamArr2);
		// kim ���
		

		List<String> streamArr3 = Arrays.stream(namesArr)
				.flatMap(innerArr -> Arrays.stream(innerArr))
				.filter(name -> name.startsWith("j")) // filter ���״�� ���͸� �ϴ� �۾� - �������� �־��شٴ� ����?
				.collect(Collectors.toList());
		
		System.out.println(streamArr3);
		// jacob, jeong ���
		
		
	}

}
