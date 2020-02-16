import java.util.Scanner;

public class CountOccurInRepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine().trim().toLowerCase();
		String s = scan.nextLine().trim().toLowerCase();
		if(str.contains(s))
		System.out.print(check(n,str,s.charAt(0)));
	}

	private static int check(int n, String str,char x) {
		char[] c = str.toCharArray();
		int count=0;
 		for(int i=0; i<c.length;i++) {
 			if(c[i]==x) {
 				count++;
 			}
 		}
 	
 		int repeat = n/c.length;
 		count = count * repeat;
 		
 		if((n%c.length)!=0) {
 			int remainder = n%c.length;
 			
 			for(int i=0 ; i <remainder;i++) {
 				if(c[i]==x) {
 					count++;
 				}
 			}
 		}
		
		return count;
	}

}
