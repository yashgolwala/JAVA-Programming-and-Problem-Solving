import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freqMultipleTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		char[] ch1 = scan.nextLine().trim().toLowerCase().toCharArray();
		char[] ch2 = scan.nextLine().trim().toLowerCase().toCharArray();

		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
		boolean flag = false;

		for(int i=0; i<ch1.length;i++) {
			
			if(map1.containsKey(ch1[i])) {
				map1.put(ch1[i], map1.get(ch1[i])+1);
			}else {
				map1.put(ch1[i], 1);
			}
		}


		for(int i=0; i<ch2.length;i++) {
			if(map1.containsKey(ch2[i])) {
				map1.put(ch2[i], map1.get(ch2[i])+1);
			}else {
				map1.put(ch2[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry :map1.entrySet()) {
			if(!map2.containsKey(entry.getKey())) {
				continue;
			}
			if(map2.get(entry.getKey()) !=null && (map2.get(entry.getKey())%entry.getValue()==0 || entry.getValue()% map2.get(entry.getKey())==0 )) {
				flag = true;
			}
			else {
				flag = false;
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
