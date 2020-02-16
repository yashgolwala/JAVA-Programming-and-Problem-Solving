import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		ArrayList<String> out =new ArrayList<>();
		for (int i =0; i<n ;i++){
			int m = scan.nextInt();
			if(m==0) {
				map.put(i+1,new ArrayList<Integer>());
				map.get(i+1).add(-1);
			}
		
			for(int j=0; j<m; j++) {
				if(!map.containsKey(i+1)) {
				map.put(i+1, new ArrayList<Integer>());
				}
				map.get(i+1).add(scan.nextInt());
			}
		}
		System.out.println(map);
		
		int t = scan.nextInt();
		for(int i=0;i<t;i++) {
			int t1 = scan.nextInt();
			int t2 = scan.nextInt();
			ArrayList<Integer> al = map.get(t1);
			int l =al.size();
			if(al!=null)
			{
				if(l<t2)
					out.add("ERROR");
				else
				{
					for(int k=1;k<=l;k++)
					{
						if(al.get(k-1)==-1 && l==1)
							out.add("ERROR");
						else if(k==t2)
						{
							out.add(al.get(k-1).toString());
						}
					}
				}
			}
		}
		System.out.print(out);
	}

}
