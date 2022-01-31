// 각 자릿수의 합 구하기
public class SumNumbers {

	public static void main(String[] args) {
		
		int number = 1242; // 1 + 2 + 4 + 2 = 9. 
		
		int sum=0; //합을 저장할 용도
		
		while(number > 0) { //number가 1242 -> 124 -> 12 -> 1 -> 0이 될때까지
			
			sum += number % 10; // number를 10으로 나눈 나머지를 sum에다가 저장해줌
			
			number /= 10; // number를 10으로 나눈 값을 number에 갱신시켜서 저장함 - 한자리수씩 줄여나가기 위함.
		}
		System.out.println(sum);
	

	}

	
}
