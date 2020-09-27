import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String res = "";
        if(s.length()==10){
            
            String[] temp = s.split(":");
            int hr = Integer.parseInt(temp[0]);
            int min = Integer.parseInt(temp[1]);
            String mins = ""+temp[2].charAt(0)+temp[2].charAt(1);
            int sec = Integer.parseInt(mins);
            
            boolean am = true; //check am/pm
            
            if(s.charAt(8)=='P') am=false; //if pm change boolean to false
            
            if(am){ //if am
                if(sec==60) {
                    sec%=60;
                    min++;
                }
                if(min>=60){    
                    hr++;
                    min%=60;
                }
                if(hr>=12) hr%=12;
            }
            else{
                if(sec==60) {
                    sec%=60;
                    min++;
                }
                if(min>=60){    
                    hr++;
                    min%=60;
                }
                if(hr<12) hr+=12; 
            }
            String padHr= "";
            String padMin= "";
            String padSec= "";
            if(hr<9){
                padHr += "0"+hr;
            }
            else padHr+=hr;
            
            if(min<9){
                padMin += "0"+min;
            }
            else padMin+=min;
            
            if(sec<9){
                padSec += "0"+sec;
            }
            else padSec+=sec;
            return padHr+":"+padMin+":"+padSec;
        }
        return res;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}