
public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 20;
		
		boolean tf = true;
		
		for(int i=2; i <= number/2; i ++) { // ���ڸ� 2�� ���������� ū���ڷ� �� ���ڸ� ���������غ��� ������ �ȵǹǷ� number/2�� ���� 
			if(number % i == 0) {
				tf = false; // �ѹ��̶� ����� ������ tf�� false�� ���ŵŹ���
			}
		}
		if(tf) {
			System.out.println(number + "�� �Ҽ� �Դϴ�");
		}
		else {
			System.out.println(number + "�� �Ҽ��� �ƴմϴ�");
		}

	}

}
