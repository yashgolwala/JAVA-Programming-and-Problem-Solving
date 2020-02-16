import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occurHashMapUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		if(n<=0) return;
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i =0; i<n ; i++) {
			list.add(scan.nextLine().trim());
		}
		countOccur(list);
		scan.close();
		
	}

	private static void countOccur(ArrayList<String> list) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String s:list) {
			String temp = s;
			Integer j = map.get(s);
			if(map.containsKey(s)) {
				map.put(s,j+1 );
			}
			else {
				map.put(s, 1);
			}
		}
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.print("\nElement "+entry.getKey()+" Occurence: "+entry.getValue());
		}
	}
}
