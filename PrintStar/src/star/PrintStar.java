package star;

public class PrintStar {

	public static void main(String[] args) {
		
		System.out.println("���簢��");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print('��');
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("���");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('��');
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("��� �ݴ�");
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j <= i-1; j++) {
				System.out.print('��');
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("��� �ݴ� �ٸ����");
		for(int i=0; i<5; i++) {
			for(int j=0; j+i<5; j++)
				System.out.print('��');
				System.out.println();
		}
		System.out.println("----------");
		System.out.println("�ﰢ��");
		for(int i = 0; i < 5; i++) { // �ٹٲ�
			for(int j = 0; j < 4-i; j++) { // �ٹٲ޵ɶ����� ����� �ٿ��ֱ�
				System.out.print(" "); // �������
			}
			for(int j = 0; j < 2*i+1; j++) { //�ٹٲ޵ɶ����� ��2�� �߰��ϰ� 1���� ������
				System.out.print("��"); // �����
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("���̾Ƹ��");
		for(int i = 0; i < 5; i++) { // �ٹٲ�
			for(int j = 0; j < 4-i; j++) { // �ٹٲ޵ɶ����� ����� �ٿ��ֱ�
				System.out.print(" "); // �������
			}
			for(int j = 0; j < 2*i+1; j++) { //�ٹٲ޵ɶ����� ��2�� �߰��ϰ� 1���� ������
				System.out.print("��"); // �����
			}
			System.out.println();
		} //��������ϸ� �Ƕ�̵�
		for(int x = 4; x > 0; x--) { // �ٹٲ� _ ���⼱ x������ 4�� �ְ� �������� �������
			for(int i = 0; i < 5-x; i++) { // �ٹٲ޵ɶ����� ����� �ø��� _ ���ڵ忡�� x�� �پ�ϱ� ������� ���� Ŀ����
				System.out.print(" "); // �������
			}
			for(int i = 0; i < 2*x-1; i++) { // �ٹٲ޵ɶ����� �� ���̱� ( x�� ó�� 4���� �����ؼ� ���� �پ�� ���� )
				System.out.print("��"); // �����
			}
			System.out.println();
		}
		
	}

}
