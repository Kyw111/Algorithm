/*
 * ���� ���� ������ ���� ����Ͻÿ�.
	1 2 2 3 1 4 2 2 4 3 5 3 2
	����: 2 (5ȸ ����)
 */
public class ManyNumber {

	public static void main(String[] args) {
						//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12
		int[] numbers = { 1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2 };
		int[] manyNum = new int[13]; //�� ���ڵ��� ��� �����ϴ��� Ƚ���� ������ �뵵�� �迭
					//ex) manyNum[2] = 5 => ����2�� 5�� �����ߴ�
		
		for(int i=0; i<numbers.length; i++) {
			manyNum[numbers[i]]++; // ���ڰ� ������ ������ ++�� 1�� ������ - Ƚ��ī��Ʈ
		}
		
		
		int number = 0; //�ֺ��
		int numcnt = 0; //�ֺ���� ���� Ƚ��
		
		for(int j=0; j < numbers.length; j++) {
			if(numcnt < manyNum[j]) { //�������ֱ�
				numcnt = manyNum[j];
				number = j;//�ֺ���� �ε����� �ش��ϴ� ����
			}
		}
		System.out.println("�ֺ�� : " + number + ", Ƚ�� : " + numcnt);
		

	}

}
