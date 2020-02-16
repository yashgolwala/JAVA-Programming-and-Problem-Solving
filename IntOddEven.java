import java.util.Scanner;

public class IntOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		if(n>0) {
		int counter=0;
		int r=0;
		
		if((n&2)==0) {
			while(r==0) {
				if(n==1) {
					r=1;
					break;
				}
				else {
				n=n/2;
				counter++;
				}
			}
			System.out.print(counter);
			counter=0;
		}
		else {
			n=n+1;
			counter++;
			while(r==0) {
				if(n==1) {
					r=1;
					break;
				}
				else {
				n=n/2;
				counter++;
				}
			}
			System.out.print(counter);
			counter=0;
		}
	}
	}

}
