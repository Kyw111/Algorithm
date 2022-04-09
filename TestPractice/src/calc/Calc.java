package calc;

public class Calc{ // 오버플로우 발생시켜보기


	public static void main(String[] args) {
		
		Plus plus = new Plus();
		
		byte num1 = (byte)120;
		byte num2 = (byte)3;
		
		byte result = plus.plus((byte)120, (byte)50);
		System.out.println(result);
		
		
		Multi multi = new Multi();
		byte result2 = multi.multi(num1, num2);
		System.out.println(result2);
		
		
		

	}

}
