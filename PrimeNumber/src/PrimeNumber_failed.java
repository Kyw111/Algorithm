/*
 * 소수 판별하기
 * 소수 : 자신을 나눌때 딱 나누어떨어지는 몫이 1과 자신밖에 없는 수
 *  ex) 13은 1과 13밖에 없음 - 소수
 *  	4는 1과 2와 4 - 소수가 아님, 1과 자신 외에 2가 있기 때문
 */
public class PrimeNumber_failed {

	public static void main(String[] args) {
		
		int number = 4; // 해당 수를 소수인지 아닌지 판별해볼거임 - 숫자를 바꿔서 적을때 마다 알 수 있음.
		boolean tf = true; 
		
		for(int i = 1; i <= number; i++) {
			if (i != 1 && i != number) {
				int num = number % i;
				tf = (num != 0) ? false : true;
			}
			System.out.printf("%d로 나눴을때 나누어지는지?: %b\n", i, tf);
		}
	}// 그냥 혼자 생각하면서 풀어보긴 한건데 불안전하고 깔끔하지 못한 느낌, 소수가 아닌지만 판별가능한 정도
	// number에 대입되는 숫자만큼 반복문을 돌며 true 또는 false가 출력되는데 
	// 1과 자기자신 외에 다른 숫자에 true가 나오면 소수가 아님
	// 근데 이렇게하면 자기자신의 숫자도 false가 나옴... 무튼 실패
	

}
