// �Ǻ���ġ ���� 
// ù° �� ��° ���� 1�̸� �� ���� ��� ���� �ٷ� �� �� ���� ���� �����̴�. 
// 1, 1, 2, 3, 5, 8, 13, 21, 34...
public class FibonacciNumbers {

	public static void main(String[] args) {
		
		// �Ǻ���ġ ���� ����
		// a^n = a^n-1 + a^n-2
		// ��� �� ������ 3��°�׺��� ����ǹǷ� 1,2��°�� ���� 1�� �������� �����
		int[] numbers = new int[15];
		
		numbers[0] = 1;
		numbers[1] = 1;
		
		for(int i=3; i<numbers.length; i++) {
			numbers[i] = numbers[i-1] + numbers[i-2];
			
			System.out.print(numbers[i] + " ");
		}
		// �迭�� ������ �̿��� ���
		
		System.out.println();
		
		int firstnum = 1;
		int secondnum = 1;
		System.out.print(firstnum + " ");
		System.out.print(secondnum + " ");
		
		for(int i=3; i<13; i++) {
			int number = firstnum + secondnum;
			System.out.print(number + " ");
			
			secondnum = firstnum; //�������ڴ� �����ڷ� ����
			firstnum = number;	  //�����ڴ� �����ڷ� ����
							// ������ �����߿� ��� ���ŵǸ� ����ǵ���
		}
		// �������� �̿��� ���
			
		
		
		
		

	}

}
