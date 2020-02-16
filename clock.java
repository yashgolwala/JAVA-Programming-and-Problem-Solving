import java.util.Scanner;

public class clock{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int h[] = new int[n];
		int m[] = new int[n];

		for(int i=0; i<n;i++) {
			String[] temp = scan.nextLine().replace(":", " ").split(" ");
			h[i] = Integer.parseInt(temp[0]);
			m[i] = Integer.parseInt(temp[1]);
		}
		for(int i = 0 ; i < n-1 ; i++) {
			System.out.println(angle(h[i],m[i]));
		}
		System.out.print(angle(h[n-1],m[n-1]));
		scan.close();
	}
	public static double angle(int hour, int minute) {
		
		if (hour > 0 || minute < 60) {
			
			if (hour == 12) 
				hour = 0;
			
			if (minute == 60) {
				minute = 0;
				hour++;
			}
		
			double hourAngle = (hour * 60 + minute) * 0.5;
			double minAngle = minute * 6;
			double bwAngle = Math.abs(hourAngle - minAngle);
			return Math.min(360 - bwAngle, bwAngle);
		}
		return (-1);
	}
}