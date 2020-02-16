import java.util.*;

public class OccurConstructString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine().trim();
		String s2 = scan.nextLine().trim();

		System.out.println(count(s1,s2));

	}
	private static int count(String s1, String s2) {
		int len = s1.length(); 
        int len2 = s2.length(); 
        int ans = Integer.MAX_VALUE; 
      
        // Initialize hash for both strings 
        int [] hash1 = new int[26]; 
        int [] hash2 = new int[26]; 
      
        // hash the frequency of letters of str1 
        for (int i = 0; i < len; i++) 
            hash1[(int)(s1.charAt(i) - 'a')]++; 
      
        // hash the frequency of letters of str2 
        for (int i = 0; i < len2; i++) 
            hash2[(int)(s2.charAt(i) - 'a')]++; 
      
        // Find the count of str2 constructed from str1 
        for (int i = 0; i < 26; i++) 
            if (hash2[i] != 0) 
                ans = Math.min(ans, hash1[i] / hash2[i]); 
      
        // Return answer 
        return ans; 
    

	}
}
