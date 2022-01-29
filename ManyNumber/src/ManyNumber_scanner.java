import java.util.Scanner;

public class ManyNumber_scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		for(int i=0; i<inputNum.length; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10]; // 숫자 카운트 저장용도의 배열
		
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++; // 숫자 출현마다 ++해줌으로서 카운트값 저장
		}
		int number = 0;
		int numcnt = 0;
		for(int j=0; j < inputNum.length; j++) {
			if(numcnt < mode[j]) {
				numcnt = mode[j];
				number = j;
			}
		}
		System.out.println("최빈수: "+number+", 출현횟수: "+numcnt);

	}

}
