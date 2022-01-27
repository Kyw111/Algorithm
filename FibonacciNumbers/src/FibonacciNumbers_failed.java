// 피보나치 수열 
// 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다. 
// 1, 1, 2, 3, 5, 8, 13, 21, 34...
public class FibonacciNumbers_failed {

	public static void main(String[] args) { // 배열, for문 이용
		
		int x;
		int y;
		int sum = 0;
						//0, 1, 2, 3, 4, 5, 6, 7, 8
		int[] numbers = { 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		
		for(int i=0; i <numbers.length ; i++) {

			if(numbers[i] == numbers[0]) {
				sum = numbers[0];
			}
			else if(numbers[i] == numbers[1]) {
				sum = numbers[1];
			}
			else {
				sum = numbers[i] + numbers[i-1];
			}
			System.out.print(sum + " ");
			
			// 그냥 혼자 해본건데 
			// 이렇게 하니까 numbers[2]에 있는 2가 출력이 안됨
			// 고로 이건 하자가 있는 코드임
			
			
		}
		
	}

}
