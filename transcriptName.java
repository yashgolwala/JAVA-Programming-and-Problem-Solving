import java.util.Arrays;
import java.util.Scanner;

public class transcriptName {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String st = scan.nextLine();
		if(st.length()<=50) {
		String[] ch = st.split(" ");
		int len = ch.length;

		if(len==1) {
			System.out.print(ch[0]);
		}
		else if(len==3) {
			System.out.print(ch[2]+" "+ch[0]+" "+ch[1]);
		}
		else {
			char[] chc = st.toCharArray();			
			if(chc[chc.length-1]=='a'||chc[chc.length-1]=='e'||chc[chc.length-1]=='i'||chc[chc.length-1]=='o'||chc[chc.length-1]=='u'||chc[chc.length-1]=='A'||chc[chc.length-1]=='E'||chc[chc.length-1]=='I'||chc[chc.length-1]=='O'||chc[chc.length-1]=='U') {
				System.out.print(ch[1]+" "+ch[0]);
			}
			else {
				System.out.print(ch[0]+" "+ch[1]);
			}
		}
		}
		}
}
