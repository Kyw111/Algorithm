package failedPlayer;

import java.util.Arrays;

public class FailedPlayer { 
	
	
	public String Solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i <= completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		break;
        	}

            return participant[i];
        }
        
		return answer;
	}

	public static void main(String[] args) {

		String[] part = {"david", "tom", "jerry"};
		String[] comp = {"david", "tom"};
		
		Solution sol = new Solution();

	}

}
