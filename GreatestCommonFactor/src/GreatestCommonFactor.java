/*
 * �� ���� �ִ����� ���ϱ�
 */
public class GreatestCommonFactor {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 18;
		
		int big, small; 
		
		// num1, num2 ���ڰ� ���� ��ġ�� �ٲ� ��°��� �� �������� �� ����
		if(num1 > num2) { 
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		// ����� ���� �ڵ�
		int num=1;
		for(int i=1; i<=small; i++) {
			if(big % i == 0 && small % i == 0) { // ���� ���� 1���� ��� ���ư��鼭 �ݺ�, big�� small �Ѵ� ����ǵ��� &&�� �ΰ��������� �ɾ���
				num = i; // �� ���� num���ٰ� ����ؼ� �����ϸ�, ���������� �ִ������� �����
			}
			
		}
		System.out.println(num);
		
		
		
	}

}
