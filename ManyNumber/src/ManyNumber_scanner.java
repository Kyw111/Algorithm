import java.util.Scanner;

public class ManyNumber_scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] inputNum = new int[10];
		for(int i=0; i<inputNum.length; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10]; // ���� ī��Ʈ ����뵵�� �迭
		
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++; // ���� �������� ++�������μ� ī��Ʈ�� ����
		}
		int number = 0;
		int numcnt = 0;
		for(int j=0; j < inputNum.length; j++) {
			if(numcnt < mode[j]) {
				numcnt = mode[j];
				number = j;
			}
		}
		System.out.println("�ֺ��: "+number+", ����Ƚ��: "+numcnt);

	}

}
