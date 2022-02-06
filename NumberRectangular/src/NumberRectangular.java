/*
 * 입력된 수(n) 만큼 n행 n열의 형태로 연속해서 출력되는 숫자 사각형을 출력하시오
 * ex) 4가 입력된다면? 4행 4열
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 */
public class NumberRectangular {

	public static void main(String[] args) {
		
		int number = 4; // 사용자 입력값
		
		int num = 1;
		
		for(int i = 1; i <= number; i++) {
			for(int j = 1; j <= number; j++) {
				System.out.printf("%4d ", num); // printf를 쓰는 이유는 단지 사각형을 보기좋게 출력하기 위함.
				num++; // 줄바뀜이 있든없든 상관없이, 1부터 시작하고 반복문이 끝날때까지 숫자 증가
			}
			System.out.println(); // 한줄의 행 출력 후 줄바꿈
		}
		

	}

}
