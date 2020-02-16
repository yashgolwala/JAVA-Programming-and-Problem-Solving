import java.util.Scanner;

public class replcaeCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] ip = scan.nextLine().trim().toLowerCase().toCharArray();
		//'a'=97 and 'z'=122
		for(int i=0; i<ip.length;i++) {
			int t = ip[i];
			int r = t - (26 -(ip[i] - 'a'));
			int m = r%26;
			ip[i] = (char)(m + 'a');
		}
		String str2 = String.valueOf(ip);
		System.out.print(str2);
	}

}
