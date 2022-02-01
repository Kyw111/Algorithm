
public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 20;
		
		boolean tf = true;
		
		for(int i=2; i <= number/2; i ++) { // 숫자를 2로 나눈수보다 큰숫자로 그 숫자를 나누려고해봤자 어차피 안되므로 number/2를 해줌 
			if(number % i == 0) {
				tf = false; // 한번이라도 약수가 나오면 tf가 false로 갱신돼버림
			}
		}
		if(tf) {
			System.out.println(number + "는 소수 입니다");
		}
		else {
			System.out.println(number + "는 소수가 아닙니다");
		}

	}

}
