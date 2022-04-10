package failedPlayer;

import java.util.Arrays;

public class Solution {
	
public String Solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        for(; i <= completion.length; i++) 
        	if(!participant[i].equals(completion[i])) 
        		break;
        	return participant[i];
        
	}

public static void main(String[] args) {

	String[] part = {"david", "tom", "jerry"};
	String[] comp = {"david", "tom"};
	
	Solution sol = new Solution();
	System.out.println(sol.Solution(part, comp));

}

}
