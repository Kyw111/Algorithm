// �� �ڸ����� �� ���ϱ�
public class SumNumbers {

	public static void main(String[] args) {
		
		int number = 1242; // 1 + 2 + 4 + 2 = 9. 
		
		int sum=0; //���� ������ �뵵
		
		while(number > 0) { //number�� 1242 -> 124 -> 12 -> 1 -> 0�� �ɶ�����
			
			sum += number % 10; // number�� 10���� ���� �������� sum���ٰ� ��������
			
			number /= 10; // number�� 10���� ���� ���� number�� ���Ž��Ѽ� ������ - ���ڸ����� �ٿ������� ����.
		}
		System.out.println(sum);
	

	}

	
}
