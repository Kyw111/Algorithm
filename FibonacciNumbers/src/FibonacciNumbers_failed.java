// �Ǻ���ġ ���� 
// ù° �� ��° ���� 1�̸� �� ���� ��� ���� �ٷ� �� �� ���� ���� �����̴�. 
// 1, 1, 2, 3, 5, 8, 13, 21, 34...
public class FibonacciNumbers_failed {

	public static void main(String[] args) { // �迭, for�� �̿�
		
		int x;
		int y;
		int sum = 0;
						//0, 1, 2, 3, 4, 5, 6, 7, 8
		int[] numbers = { 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		
		for(int i=0; i <numbers.length ; i++) {

			if(numbers[i] == numbers[0]) {
				sum = numbers[0];
			}
			else if(numbers[i] == numbers[1]) {
				sum = numbers[1];
			}
			else {
				sum = numbers[i] + numbers[i-1];
			}
			System.out.print(sum + " ");
			
			// �׳� ȥ�� �غ��ǵ� 
			// �̷��� �ϴϱ� numbers[2]�� �ִ� 2�� ����� �ȵ�
			// ��� �̰� ���ڰ� �ִ� �ڵ���
			
			
		}
		
	}

}
