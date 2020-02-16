import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		HashMap<String,HashMap<String,ArrayList<String>>> map = new HashMap<>();
		ArrayList<String> al = new ArrayList<>();
				
		for( int i=0; i<n ; i++) {
			String[] str = scan.nextLine().trim().split(",");
			if(map.get(str[0])==null) {
				map.put(str[0], new HashMap<>());
				}
				if(map.get(str[0]).get(str[1])==null) {
					map.get(str[0]).put(str[1], new ArrayList<>());
				}
				map.get(str[0]).get(str[1]).add(str[2]);
				al.add(str[2]);
				map.get(str[0]).get(str[1]).add(str[3]);
				al.add(str[3]);
				map.get(str[0]).get(str[1]).add(str[4]);
				al.add(str[4]);
		}
		System.out.print(map);
		System.out.print("\n"+al);
		HashMap<String,Integer> map1 = new HashMap<>();
		for(int i=0; i<al.size();i++) {
			if(map1.get(al.get(i))==null)
			{
				map1.put(al.get(i), 0);
			}
			map1.put(al.get(i), map1.get(al.get(i))+1);
		}
		System.out.print("\n"+map1);
		int max=0;
		String maxParent= new String();
		for(Map.Entry<String, Integer> entry : map1.entrySet()) {
			String str = entry.getKey();
			int t = entry.getValue();
			if(max<t) {
				max=t;
				maxParent = str;		
				}
		}
		System.out.print("\n"+max+" "+maxParent);
		
	}
	

}
