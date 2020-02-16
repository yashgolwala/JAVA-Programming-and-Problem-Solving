import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
		String word2 = scan.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
		char[] ch1 = word1.toCharArray();
		char[] ch2 = word2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if((ch1.length==ch2.length) && ch1.length!=0) {
		boolean result = Arrays.equals(ch1, ch2);
		if(result) {
			System.out.print("TRUE");
		}
		else {
			System.out.print("FALSE");
		}
	}
	}

}