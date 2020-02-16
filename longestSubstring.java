import java.util.*;

public class longestSubstring {
	public static void main(String args[]) {

		int count=0;
		Scanner scan=new Scanner(System.in);
		String st=scan.nextLine();
		int n=st.length();

		Map<Character,Integer> map=new HashMap<>();

		for(int j=0,i=0;j<n;j++)
		{
			if(map.containsKey(st.charAt(j)))
			{
				i=Math.max(map.get(st.charAt(j)),i);
			}
			count = Math.max(count, j - i + 1);
			map.put(st.charAt(j), j + 1);
		}
		System.out.println(count);
	}
}