/*
 * 1���� 7���� ������ ������ �Է��ϰ� �ߺ��Ǵ� ���� �����Ͽ� ����Ͻÿ�
 *  - int[] numbers = { 4, 5, 1, 6, 1, 3, 4, 5, 1, 7, 7, 1, 7 }; 
 *  - ��� ��) 1, 3, 4, 5, 6, 7
 */
public class DeleteSameNumber {

	public static void main(String[] args) {
		
		int[] numbers = { 4, 5, 1, 6, 1, 3, 4, 5, 1, 7, 7, 1, 7 }; //�ش� �迭�ȿ��� �ߺ��Ǵ� �� �����ϱ�

		boolean[] array = new boolean[15]; 
		// �Ҹ��迭�� ���� ���� : numbers�� �ִ� ���ڵ��� �ѹ����� �����ϸ� true������ �ֱ�����. 
		// keypoint: ���ڰ� �ѹ��̶� �����ϰ� �Ǹ� �Ǵ°���.
		
		for(int i = 0; i < numbers.length; i++) {
			array[numbers[i]] = true; //booleanŸ���� �⺻���� false��� ���� �̿�
		}
		for(int x = 0; x < array.length; x++) {
			if(array[x]) { // array[x]�� true��� 
				System.out.print(x + " ");
			}
		}
		
		
	}

}
