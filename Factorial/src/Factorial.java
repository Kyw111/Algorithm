/*
 * 팩토리얼
 * 숫자가 5라면 5*4*3*2*1= 120 이 정답이 됨
 */
public class Factorial {

	public static void main(String[] args) { // 드디어 혼자 힘으로 풀었다. 감격ㅠㅠ
		
		int number = 5; //5의 팩토리얼을 구하시오
		int fac = 1; // 합을 담을 변수 fac
		
		for(int i = number-1; i > 1; i--) {

			fac = number * i;
			number = fac;
			System.out.println(fac);
		} // 근데 정답을 보니 너무나도 간단했다. 나는 괜히 어렵게 생각하고 있었다
		
		System.out.println("--------------------");
		
		number = 5;
		fac = 1;
		// ------------다시 변수 초기화
		
		for(int i=1; i <= number; i++) {
			fac *= i; // 그저 반복하면서 fac변수에 계속 곱하여 저장
		}
		System.out.println(fac); // 이렇게 간단할수가
		

	}

}
