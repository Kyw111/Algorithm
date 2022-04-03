package star;

public class PrintStar {

	public static void main(String[] args) {
		
		System.out.println("정사각형");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print('☆');
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("계단");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('☆');
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("계단 반대");
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j <= i-1; j++) {
				System.out.print('☆');
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("계단 반대 다른방법");
		for(int i=0; i<5; i++) {
			for(int j=0; j+i<5; j++)
				System.out.print('☆');
				System.out.println();
		}
		System.out.println("----------");
		System.out.println("삼각형");
		for(int i = 0; i < 5; i++) { // 줄바꿈
			for(int j = 0; j < 4-i; j++) { // 줄바꿈될때마다 공백수 줄여주기
				System.out.print(" "); // 공백출력
			}
			for(int j = 0; j < 2*i+1; j++) { //줄바꿈될때마다 별2개 추가하고 1개를 더해줌
				System.out.print("☆"); // 별출력
			}
			System.out.println();
		}
		System.out.println("----------");
		System.out.println("다이아몬드");
		for(int i = 0; i < 5; i++) { // 줄바꿈
			for(int j = 0; j < 4-i; j++) { // 줄바꿈될때마다 공백수 줄여주기
				System.out.print(" "); // 공백출력
			}
			for(int j = 0; j < 2*i+1; j++) { //줄바꿈될때마다 별2개 추가하고 1개를 더해줌
				System.out.print("☆"); // 별출력
			}
			System.out.println();
		} //여기까지하면 피라미드
		for(int x = 4; x > 0; x--) { // 줄바꿈 _ 여기선 x변수에 4를 넣고 내려가는 방식으로
			for(int i = 0; i < 5-x; i++) { // 줄바꿈될때마다 공백수 늘리기 _ 위코드에서 x가 줄어가니까 공백수는 점점 커진다
				System.out.print(" "); // 공백출력
			}
			for(int i = 0; i < 2*x-1; i++) { // 줄바꿈될때마다 별 줄이기 ( x는 처음 4부터 시작해서 점점 줄어가는 변수 )
				System.out.print("☆"); // 별출력
			}
			System.out.println();
		}
		
	}

}
