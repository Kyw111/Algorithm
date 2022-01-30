/*
 * 두 수의 최대공약수 구하기
 */
public class GreatestCommonFactor {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 18;
		
		int big, small; 
		
		// num1, num2 숫자가 서로 위치가 바뀌어도 출력값이 잘 나오도록 할 조건
		if(num1 > num2) { 
			big = num1;
			small = num2;
		}
		else {
			big = num2;
			small = num1;
		}
		
		// 공약수 구할 코드
		int num=1;
		for(int i=1; i<=small; i++) {
			if(big % i == 0 && small % i == 0) { // 나눌 수를 1부터 계속 돌아가면서 반복, big과 small 둘다 공통되도록 &&로 두가지조건을 걸어줌
				num = i; // 그 값을 num에다가 계속해서 대입하면, 최종적으로 최대공약수가 저장됨
			}
			
		}
		System.out.println(num);
		
		
		
	}

}
