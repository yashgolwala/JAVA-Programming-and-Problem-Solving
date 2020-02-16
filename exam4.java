
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class exam4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Integer, ArrayList<Integer>> h =new HashMap<>();
		ArrayList<Integer> keysList = new ArrayList<>();
		ArrayList<Integer> resList = new ArrayList<>();
		String[] input= s.nextLine().trim().split("\\s+");
		int res= Integer.parseInt(input[0]);
		int apt= Integer.parseInt(input[1]);
		int opinions = Integer.parseInt(s.nextLine().trim());
		
		if(res == 0 || (apt== 0 && res == 0)) {
			int count=0;
			System.out.print(count);
			return;
		}
		
		if(apt == 0) {
			int count=1;
			System.out.print(count);
			return;
		}		
		
		for(int i=0;i<res;i++) {
			resList.add(i+1);
		}
		
		for(int i=0;i<opinions;i++) {
			String[] data= s.nextLine().trim().split("\\s+");
			int r= Integer.parseInt(data[0]);
			int o= Integer.parseInt(data[1]);
			if(h.get(r) == null) {
				h.put(r,new ArrayList<>());
				keysList.add(r);
			}
			if(!h.get(r).contains(o)) {
				h.get(r).add(o);
			}
			Collections.sort(h.get(r));
		}
		Collections.sort(keysList);
		
		int count=0;
		if(!keysList.equals(resList)) {
			count++;
		}
		ArrayList<String> temp = new ArrayList<>();
		for(Map.Entry<Integer,ArrayList<Integer>> map: h.entrySet()) {
			ArrayList<Integer> child = map.getValue();
			String str="";
			for(Integer c: child) {
				str+= c;
			}
			temp.add(str);
		}
		
		HashSet<String> set = new HashSet<>(temp);
		count += set.size();
		System.out.print(count);
		
	}
}
