// 피보나치 수열 
// 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다. 
// 1, 1, 2, 3, 5, 8, 13, 21, 34...
public class FibonacciNumbers {

	public static void main(String[] args) {
		
		// 피보나치 수열 공식
		// a^n = a^n-1 + a^n-2
		// 대신 위 공식은 3번째항부터 적용되므로 1,2번째는 숫자 1로 고정값을 줘야함
		int[] numbers = new int[15];
		
		numbers[0] = 1;
		numbers[1] = 1;
		
		for(int i=3; i<numbers.length; i++) {
			numbers[i] = numbers[i-1] + numbers[i-2];
			
			System.out.print(numbers[i] + " ");
		}
		// 배열과 포문을 이용한 답안
		
		System.out.println();
		
		int firstnum = 1;
		int secondnum = 1;
		System.out.print(firstnum + " ");
		System.out.print(secondnum + " ");
		
		for(int i=3; i<13; i++) {
			int number = firstnum + secondnum;
			System.out.print(number + " ");
			
			secondnum = firstnum; //전전숫자는 전숫자로 대입
			firstnum = number;	  //전숫자는 현숫자로 대입
							// 포문이 실행중에 계속 갱신되며 진행되도록
		}
		// 포문만을 이용한 답안
			
		
		
		
		

	}

}
