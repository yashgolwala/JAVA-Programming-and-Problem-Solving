import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class occur {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().trim();
		char[] c = scan.nextLine().trim().toCharArray();
		Matcher matcher = Pattern.compile(String.valueOf(c[0])).matcher(str);
		int res =0;
		while(matcher.find()) {
			res++;
		}
		System.out.print("count using matcher and compile method:"+res);
		
	//or
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==c[0]) {
				count++;
			}
		}
		System.out.print("\nCount using charAt method:"+count);
	//occur of each character in given string
		int t=0;
		System.out.print("\nOccurence of each character in string:");
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					t++;
				}
			}
			System.out.print("\n"+str.charAt(i)+":"+t);
			t=0;
		}
		
	}

}
