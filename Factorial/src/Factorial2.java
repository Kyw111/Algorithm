
public class Factorial2 {

	public static void main(String[] args) {
		
		int inputNum = 5;
		int accNum = 1;
		
		for(int i=1; i <= inputNum; i++) {
			accNum *= i;
			
		}
		System.out.println(accNum);
	}		

}
