import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class bracketMatching {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<>();

		int n = Integer.parseInt(s.nextLine());
		for (int i = 0; i < n; i++) {
			String data = s.nextLine().trim();
			str.add(data);
		}
		for (int i = 0; i < str.size(); i++) {
			boolean flag = true;
			char[] c = str.get(i).toCharArray();
			Stack<Character> stack = new Stack<>();

			for (int j = 0; j < c.length; j++) {
				if (c[j] == '{' || c[j] == '(' || c[j] == '[') {
					stack.push(c[j]);
				}

				else if (c[j] == '}' || c[j] == ')' || c[j] == ']') {
					if (stack.isEmpty()) {
						flag = false;
						break;
					}

					else {
						switch (c[j]) {
						case '}':
							if (stack.peek() == '{') {
								stack.pop();
							}
							break;
						case ')':
							if (stack.peek() == '(') {
								stack.pop();
							}
							break;
						case ']':
							if (stack.peek() == '[') {
								stack.pop();
							}
							break;
						}
					}
				}
			}
			if (i != str.size() - 1) {
				if (flag == true && stack.isEmpty()) {
					System.out.println("TRUE");
				} else {
					System.out.println("FALSE");
				}
			} else {
				if (flag == true && stack.isEmpty()) {
					System.out.print("TRUE");
				} else {
					System.out.print("FALSE");
				}
			}

		}
	}
}