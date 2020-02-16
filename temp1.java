import java.util.*;

public class temp1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] str = scan.nextLine().trim().split(",");

		ArrayList<Integer> ip = new ArrayList<Integer>();
		ArrayList<Integer> op = new ArrayList<Integer>();
		for(int i=0;i<str.length;i++) {
			int a = Integer.parseInt(str[i]);
			ip.add(a);
		}

		int count=0;
		int j=1;
		for(int i =0 ; i<ip.size()-1;i++) {
			j=i+1;
			count=0;
			if(ip.get(i)<ip.get(j)) {
				op.add(1);
				continue;
			}
			else if(ip.get(i)>ip.get(j)) {
				count=1;
				while(!(ip.get(i)<ip.get(j)) && j<ip.size()-1) {
					count++;
					j++;
				}
				op.add(count);
				continue;
			}
			else {
				op.add(count);
			}
			
		}
		op.add(0);
		System.out.print(ip+"\n"+op);
	}
}