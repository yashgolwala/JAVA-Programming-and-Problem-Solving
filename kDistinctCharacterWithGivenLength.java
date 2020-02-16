import java.util.Scanner;

public class kDistinctCharacterWithGivenLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		String s = new String();
	
		for(int i=0;i<k;i++) {
			s = s + (char)('a'+i);
		}
		int count =0;
		
		for(int i=0;i<n-k;i++) {
			s =s + (char)('a'+count);
			count++;
			if(count==k) {
				count=0;
			}
		}
		
	System.out.print(s);

	}

}