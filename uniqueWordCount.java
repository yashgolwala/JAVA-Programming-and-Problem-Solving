import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class uniqueWordCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ip = scan.nextLine();
		
		if(ip.length()<=2000) {
		ip = ip.replaceAll(" +"," ");
		ip = ip.toLowerCase();
		String[] ip1 = ip.split(" ");
		
		HashSet<String> hs = new HashSet();
	
		for(int i=0;i<ip1.length;i++) {
			if(ip1[i]!=" ") {
			hs.add(ip1[i].toString());
			}
		}
		System.out.print(hs.size());
		scan.close();
		}
	}

}