import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/*


	오라클 공식 홈페이지 stream 정의 : 데이터 처리 연산을 지원하도록 소스에서 추출된 요소
	계속해서 흐르는 시냇물에 비교하기도 함 - 프로그래밍적인 관점에서 데이터 흐름이라는 것에 초점을 맞춰 생각하기
	stream - 데이터를 어떻게 다룰 것인가 하는 일종의 파이프라인이라고 볼 수 있다.
	
  // 자바8 이전 stream문법이 나오기 전 for문을 이용하는 방식 - JPA 공부할때 게시판 crud 관련 공부했던 내용

// 댓글 목록 조회
 public List<CommentDto> comments(Long articleId) { 
 
   List<Comment> comments = commentRepository.findByArticleId(articleId); // 엔티티에서 데이터 가져오기

     List<CommentDto> dtos = new ArrayList<CommentDto>(); // ArrayList 선언

	//Entity -> DTO 변환
     for (int i = 0; i < comments.size(); i++) { 
         Comment c = comments.get(i); // 일단 엔티티 list를 풀고
         CommentDto dto = CommentDto.toDto(c);  // CommentDto 클래스에 toDto 메소드 정의해둠
         dtos.add(dto); 
     }
     return dtos;
   }
   
   
for문을 이용하게 되면
repository에서 findById로 찾아온 값들을 변수화 시켜줌과 동시에
ArrayList도 선언해주고 dto로 변환해준 값들을 ArrayList에 add 해주는게 되는 
보기에도 깔끔하지 못한 위 코드와 같은 코드를 작성할 수 밖에 없다.
   
   
// stream 이용 : 생성 -> 가공 -> 소비
  
 1. 생성 :  stream 스트림생성
 
 2. 가공 :  중간연산
 
     * filter
     * map
     
 3. 소비 : collect 최종연산 
                                         
 public List<CommentDto> comments(Long articleId) {                                        
       return commentRepository.findByArticleId(articleId).stream().map(comment-> CommentDto.toDto(comment))
       .collect((Collectors.toList()));
    }
         
         
보다 더 직관적이고 코드의 양도 간결하게 줄일 수 있다

map 외에도 stream의 가공부분에는 여러가지 메소드가 있다. (filter, map, peek, sorted, distinct, limit ...)

## 스트림 어떻게 사용하는가? - 파이프라이닝, 체이닝

 


자료구조가 포함하는 모든 값을 메소드에 포함하는 컬렉션과 다르게,
스트림은 요청할 때만 요소를 계산하는 고정된 자료구조를 가진다.
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
		
		// map 메소드 사용
		// 단일 스트림 안의 요소를 원하는 특정 형태로 변환할 수 있습니다.
		// Stream이라는 객체의 묶음인 List<Stream> 에서 문자열 name 필드만을 List 자료구조에 담아 출력하는 코드입니다
		
		List<Stream> streamList = Arrays.asList
				(new Stream("jacob", 32)
				, new Stream("david", 30));

		List<String> names = streamList.stream()
				.map(Stream::getName)
				.collect(Collectors.toList());

		names.forEach(System.out::println);
		// jacob, david 출력
		
		System.out.println("--------------------------------");
		
		
		List<String> list1 = streamList.stream()
				.map(stream -> stream.getName())
				.collect(Collectors.toList()); // 람다식 적용
		System.out.println(list1);
		// jacob, david 출력
		
		List<String> list2 = streamList.stream()
				.map(Stream::getName)
				.collect(Collectors.toList()); // 메소드 참조
		System.out.println(list2);
		// jacob, david 출력
		
		
		System.out.println("--------------------------------");
		
		
		
		String[][] namesArr = new String[][] {
			{"kim", "jacob"}, {"lee", "jeong"}, {"park", "chanho"}, {"kang", "hodong"}
		};
		
//		flatMap 메서드는 스트림의 형태가 배열과 같을 때, 모든 원소를 단일 원소 스트림으로 반환할 수 있습니다.
//		2차원 배열에서 문자열의 길이가 4 보다 작은 문자열을 출력하는 코드
		
		List<String> streamArr1 = Arrays.stream(namesArr)
		.flatMap(innerArr -> Arrays.stream(innerArr))
		.filter(name -> name.length() < 4) // filter 말그대로 필터링 하는 작업 - 조건절을 넣어준다는 느낌?
		.collect(Collectors.toList());
		
		System.out.println(streamArr1);
		// kim, lee 출력
		
		
		List<String> streamArr2 = Arrays.stream(namesArr)
				.flatMap(innerArr -> Arrays.stream(innerArr))
				.filter(name -> name.equals("kim")) // filter 말그대로 필터링 하는 작업 - 조건절을 넣어준다는 느낌?
				.collect(Collectors.toList());
		
		System.out.println(streamArr2);
		// kim 출력
		

		List<String> streamArr3 = Arrays.stream(namesArr)
				.flatMap(innerArr -> Arrays.stream(innerArr))
				.filter(name -> name.startsWith("j")) // filter 말그대로 필터링 하는 작업 - 조건절을 넣어준다는 느낌?
				.collect(Collectors.toList());
		
		System.out.println(streamArr3);
		// jacob, jeong 출력
		
		
	}

}
