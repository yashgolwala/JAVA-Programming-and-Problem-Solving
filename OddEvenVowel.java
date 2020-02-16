import java.util.Scanner;

public class OddEvenVowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] str = scan.nextLine().trim().toLowerCase().toCharArray();
		boolean flag=false;
		//if len is even check odd vowels
		if(str.length%2==0) {
		for(int i=0;i<str.length;i+=2) {
			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		}
		//if len is odd check odd vowels
		else {
			for(int i=1;i<str.length;i+=2) {
				if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}
		}
	
		if(flag) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}
	}

}
