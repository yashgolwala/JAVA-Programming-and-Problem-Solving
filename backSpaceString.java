import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class backSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] c1= scan.nextLine().trim().toCharArray();
		char[] c2= scan.nextLine().trim().toCharArray();
		if(c1[0]=='#' || c2[0]=='#') {
			return;
		}
		Stack<Character> s1 = new Stack<Character>();
		Stack<Character> s2 = new Stack<Character>();

		int l1=c1.length,l2=c2.length;
		int i=0;
		while(l1!=0) {
			if(c1[i]!='#') {
				s1.push(c1[i]);
				i++;
				l1--;
			}
			else {
				s1.pop();

				i++;
				l1--;
			}
		}
		i=0;
		while(l2!=0) {
			if(c2[i]!='#') {
				s2.push(c2[i]);
				i++;
				l2--;
			}
			else {
				s2.pop();
				i++;
				l2--;
			}
		}

		String str= new String();
		i=0;
		while(!s1.empty()) {
			char c =s1.pop();
			str=str+c;
			i--;
		}

		String str1= new String();
		i=0;
		while(!s2.empty()) {
			char c =s2.pop();
			str1=str1+c;
			i--;
		}

		char c11[] = str.toCharArray();
		char c22[] = str1.toCharArray();

		if(Arrays.equals(c11, c22)) {
			System.out.print("True");
		}
		else {
			System.out.print("false");
		}
	}

}
