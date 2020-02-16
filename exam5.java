import java.util.*;

public class exam5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine().toLowerCase();
		String str2 = scan.nextLine().toLowerCase();
		
		HashSet<Character> hs1 = new HashSet<Character>();
		HashSet<Character> hs2 = new HashSet<Character>();
		
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		for(int i =0; i<c1.length;i++) {
			hs1.add(c1[i]);
		}
		
		for(int i =0; i<c2.length;i++) {
			hs2.add(c2[i]);
		}
		
		int t1 =0, t2=0;
		char temp1=c1[0];
		for(int i=0;i<c1.length;i++) {
			if(temp1 == c1[i]) {
				t1++;
			}
		}
		
		char temp2=c2[0];
		for(int i=0;i<c2.length;i++) {
			if(temp1 == c2[i]) {
				t2++;
			}
		}
		
		int s1=hs1.size() , s2= hs2.size();
		
		if((s1==s2) && s1>1 && s2>1) {
			System.out.print("YES 1");
		}
		else {
			if(t1>t2) {
				System.out.print("NO "+t1);
			}
			else {
				System.out.print("NO "+t2);
			}
		}
	}
}
