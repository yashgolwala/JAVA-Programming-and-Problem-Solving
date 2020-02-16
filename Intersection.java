import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


class Intersection{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);

	int count=0;
	String[] str= s.nextLine().split(" ");		
	int v =Integer.parseInt(str[0]);
	int h =Integer.parseInt(str[1]);
	ArrayList<String> ver= new ArrayList<>();
	ArrayList<String> hor= new ArrayList<>();
	
	for(int i=0;i<v;i++) {
		String input = s.nextLine().trim();
		ver.add(input);
	}
	for(int j=0;j<h;j++) {
		String input = s.nextLine().trim();
		hor.add(input);
	}

	
	for(int i=0;i<v;i++) {
		String[] data= ver.get(i).split("\\s+");
		int x= Integer.parseInt(data[0]);
		int y1= Integer.parseInt(data[1]);
		int y2= Integer.parseInt(data[2]);
		int ymin=Math.min(y1,y2);
		int ymax=Math.max(y1,y2);
	
		for(int j=0;j<h;j++) {
		String[] data2= hor.get(j).split("\\s+");
		int y= Integer.parseInt(data2[0]);
		int x1= Integer.parseInt(data2[1]);
		int x2= Integer.parseInt(data2[2]);	
		int xmin=Math.min(x1,x2);
		int xmax=Math.max(x1,x2);
	
		if(x>= xmin && x<= xmax) {
			if(y>= ymin && y<= ymax) {
			count++;
		}	
		}
	}
}
	
	System.out.print(count);
	s.close();
}
}