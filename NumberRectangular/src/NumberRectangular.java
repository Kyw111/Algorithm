/*
 * �Էµ� ��(n) ��ŭ n�� n���� ���·� �����ؼ� ��µǴ� ���� �簢���� ����Ͻÿ�
 * ex) 4�� �Էµȴٸ�? 4�� 4��
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 */
public class NumberRectangular {

	public static void main(String[] args) {
		
		int number = 4; // ����� �Է°�
		
		int num = 1;
		
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= number; j++) {
				System.out.printf("%4d ", num); // printf�� ���� ������ ���� �簢���� �������� ����ϱ� ����.
				num++; // �ٹٲ��� �ֵ���� �������, 1���� �����ϰ� �ݺ����� ���������� ���� ����
			}
			System.out.println(); // ������ �� ��� �� �ٹٲ�
		}
		

	}

}
