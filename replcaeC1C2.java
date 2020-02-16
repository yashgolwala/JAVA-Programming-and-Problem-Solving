import java.util.Arrays;
import java.util.Scanner;

public class replcaeC1C2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] ch = scan.nextLine().trim().toLowerCase().toCharArray();
		char[] str = scan.nextLine().trim().toCharArray();
		
		char c1 = str[0];
		char c2 = str[2];
		
		System.out.println(c1);
		
		for(int i=0; i<ch.length;i++) {
			if(ch[i]==c2) {
				ch[i]=c1;
			}
			else if(ch[i]==c1) {
				ch[i]=c2;
			}
		}
	
		System.out.print(ch);
		scan.close();
	}
}