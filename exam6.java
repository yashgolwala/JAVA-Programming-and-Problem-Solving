import java.util.Arrays;
import java.util.Scanner;

public class exam6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] str1 = scan.nextLine().trim().split("");
		String[] str2 = scan.nextLine().trim().split("");
		String[] str3 = scan.nextLine().trim().split("");
		String[] str4 = scan.nextLine().trim().split("");

		scan.close();

		int s1=str1.length;
		int s2=str2.length;
		int s3=str3.length;
		int s4=str4.length;

		int n1[],n2[],n3[],n4[];

		if(s1<=s2) {
			n1 = new int[str2.length];
			n2 = new int[str2.length];
		}
		else {
			n1 = new int[str1.length];
			n2 = new int[str1.length];
		}

		if(s3<=s4) {
			n3 = new int[str4.length];
			n4 = new int[str4.length];
		}
		else {
			n3 = new int[str3.length];
			n4 = new int[str3.length];
		}

		Arrays.fill(n1, 0);
		Arrays.fill(n2, 0);
		Arrays.fill(n3, 0);
		Arrays.fill(n4, 0);

		for(int i =0 ;i <str1.length;i++) {
			n1[i]= Integer.parseInt(str1[i]);
		}

		for(int i =0 ;i <str2.length;i++) {

			n2[i]= Integer.parseInt(str2[i]);

		}

		for(int i =0 ;i <str3.length;i++) {
			n3[i]= Integer.parseInt(str3[i]);
		}

		for(int i =0 ;i <str4.length;i++) {
			n4[i]= Integer.parseInt(str4[i]);
		}

		int c1=0;
		int ca1=0;

		if(s1<=s2) {
			for(int i= str2.length-1;i>=0;i--)
			{	    
				int N=n1[i]+n2[i]+ca1;  
				if((N>9)) {
					c1++;	
					ca1=1;
				}
				else {
					ca1=0;
				}
			}
		}
		else {
			for(int i= str1.length-1;i>=0;i--)
			{	    
				int N=n1[i]+n2[i]+ca1;  
				if((N>9)) {
					c1++;	
					ca1=1;
				}
				else {
					ca1=0;
				}
			}
		}

		int c2=0;
		int ca2=0;

		if(s3<=s4) {
			for(int i= str4.length-1;i>=0;i--)
			{	    
				int N=n3[i]+n4[i]+ca2;  
				if((N>9)) {
					c2++;	
					ca2=1;
				}
				else {
					ca2=0;
				}
			}
		}
		else {
			for(int i= str3.length-1;i>=0;i--)
			{	    
				int N=n3[i]+n4[i]+ca2;  
				if((N>9)) {
					c2++;	
					ca2=1;
				}
				else {
					ca2=0;
				}
			}
		}

		if(c1>c2)
		{
			System.out.print("NO" + " " +c1);
		}
		else if(c1<c2)
		{
			System.out.print("NO" + " " +c2);
		}
		else
		{
			System.out.print("YES" + " " + c1);
		}
	}
}