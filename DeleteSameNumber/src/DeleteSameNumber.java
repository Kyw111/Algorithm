/*
 * 1부터 7까지 임의의 정수를 입력하고 중복되는 수를 제거하여 출력하시오
 *  - int[] numbers = { 4, 5, 1, 6, 1, 3, 4, 5, 1, 7, 7, 1, 7 }; 
 *  - 출력 예) 1, 3, 4, 5, 6, 7
 */
public class DeleteSameNumber {

	public static void main(String[] args) {
		
		int[] numbers = { 4, 5, 1, 6, 1, 3, 4, 5, 1, 7, 7, 1, 7 }; //해당 배열안에서 중복되는 수 제거하기

		boolean[] array = new boolean[15]; 
		// 불린배열을 만든 이유 : numbers에 있는 숫자들이 한번씩만 등장하면 true값으로 주기위함. 
		// keypoint: 숫자가 한번이라도 등장하게 되면 되는거임.
		
		for(int i = 0; i < numbers.length; i++) {
			array[numbers[i]] = true; //boolean타입의 기본값이 false라는 것을 이용
		}
		for(int x = 0; x < array.length; x++) {
			if(array[x]) { // array[x]가 true라면 
				System.out.print(x + " ");
			}
		}
		
		
	}

}
