/*
 * ���丮��
 * ���ڰ� 5��� 5*4*3*2*1= 120 �� ������ ��
 */
public class Factorial {

	public static void main(String[] args) { // ���� ȥ�� ������ Ǯ����. ���ݤФ�
		
		int number = 5; //5�� ���丮���� ���Ͻÿ�
		int fac = 1; // ���� ���� ���� fac
		
		for(int i = number-1; i > 1; i--) {

			fac = number * i;
			number = fac;
			System.out.println(fac);
		} // �ٵ� ������ ���� �ʹ����� �����ߴ�. ���� ���� ��ư� �����ϰ� �־���
		
		System.out.println("--------------------");
		
		number = 5;
		fac = 1;
		// ------------�ٽ� ���� �ʱ�ȭ
		
		for(int i=1; i <= number; i++) {
			fac *= i; // ���� �ݺ��ϸ鼭 fac������ ��� ���Ͽ� ����
		}
		System.out.println(fac); // �̷��� �����Ҽ���
		

	}

}
