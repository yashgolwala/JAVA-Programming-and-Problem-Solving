import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class temp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] str = scan.nextLine().trim().split(",");
		for(int i =0 ; i<str.length ; i++) {
			int t = Integer.parseInt(str[i]);
			list.add(t);
		}
		int[] ans = new int[list.size()];
		Stack<Integer> stack = new Stack<>();

		for (int i = list.size() - 1; i >= 0; i--) {
			while (!stack.isEmpty() && list.get(i) >= list.get(stack.peek())) {
				stack.pop();
			}
			if(stack.empty()) {
				ans[i]=0;
			}
			else {
				ans[i]= stack.peek()-i;
			}
			stack.push(i);
		}
		for(int i=0; i<ans.length-1;i++) {
			System.out.print(ans[i]+",");
		}
		System.out.print(ans[ans.length-1]);
		scan.close();

	}
}