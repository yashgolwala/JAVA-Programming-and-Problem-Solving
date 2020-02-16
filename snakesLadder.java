import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class snakesLadder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();

		for(int i=0; i<N;i++) {
			int t1 = scan.nextInt();
			int t2 = scan.nextInt();
			scan.nextLine();

			if(t1<t2) {
				if(map.get("l")==null) {
					map.put("l", new ArrayList<Integer>());
				}
				map.get("l").add(t1);
				map.get("l").add(t2);

			}
			else if(t1>t2) {
				if(map.get("s")==null) {
					map.put("s", new ArrayList<Integer>());
				}
				map.get("s").add(t1);
				map.get("s").add(t2);
			}
		}


		int D = scan.nextInt();
		scan.nextLine();
		int[]moves = new int[D];
		for(int i =0; i<D;i++) {
			int t = scan.nextInt();
			if(t>=1 && t<=6) {
				moves[i]=t;
			}
		}
		scan.close();

		ArrayList<Integer> snakes = map.get("s");
		ArrayList<Integer> ladders = map.get("l");


		ArrayList<Integer> ss = new ArrayList<>();
		ArrayList<Integer> se = new ArrayList<>();
		ArrayList<Integer> ls = new ArrayList<>();
		ArrayList<Integer> le = new ArrayList<>();


		for(int i=0; i<snakes.size();i+=2) {
			ss.add(snakes.get(i));
			se.add(snakes.get(i+1));
		}
		for(int i=0; i<ladders.size();i+=2) {
			ls.add(ladders.get(i));
			le.add(ladders.get(i+1));
		}

		int ca=1; int index=0;
		int cb=1; int temp =0;

		for(int i=0; i<D;i+=2) 
		{
			ca = ca + moves[i];
			
			while(ss.contains(ca) || ls.contains(ca)) {
				if(ss.contains(ca)) {
					index = ss.indexOf(ca);
					temp = se.get(index);
					ca =  temp;
				}
				if(ls.contains(ca)) {
					index = ls.indexOf(ca);
					temp = le.get(index);
					ca = temp;

				}
			}
		}

		for(int i=1;i<D;i+=2)
		{
			cb = cb + moves[i];
			
			while(ss.contains(cb) || ls.contains(cb)) {
				if(ss.contains(cb)) {
					index = ss.indexOf(cb);
					temp = se.get(index);
					cb =  temp;
				}
				if(ls.contains(cb)) {
					index = ls.indexOf(cb);
					temp = le.get(index);
					cb = temp;
				}
			}
		}

		if(ca<cb) {
			System.out.print("B "+cb);
		}
		else {
			System.out.print("A "+ca);
		}

	}

}

