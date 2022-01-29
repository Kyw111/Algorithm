/*
 * 가장 많이 출현한 수를 출력하시오.
	1 2 2 3 1 4 2 2 4 3 5 3 2
	정답: 2 (5회 출현)
 */
public class ManyNumber {

	public static void main(String[] args) {
						//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12
		int[] numbers = { 1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2 };
		int[] manyNum = new int[13]; //각 숫자들이 몇번 출현하는지 횟수를 저장할 용도의 배열
					//ex) manyNum[2] = 5 => 숫자2가 5번 출현했다
		
		for(int i=0; i<numbers.length; i++) {
			manyNum[numbers[i]]++; // 숫자가 출현할 때마다 ++로 1씩 증가됨 - 횟수카운트
		}
		
		
		int number = 0; //최빈수
		int numcnt = 0; //최빈수가 나온 횟수
		
		for(int j=0; j < numbers.length; j++) {
			if(numcnt < manyNum[j]) { //갱신해주기
				numcnt = manyNum[j];
				number = j;//최빈수는 인덱스에 해당하는 숫자
			}
		}
		System.out.println("최빈수 : " + number + ", 횟수 : " + numcnt);
		

	}

}
