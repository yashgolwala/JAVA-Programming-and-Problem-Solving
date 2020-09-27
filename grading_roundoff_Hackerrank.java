import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    int length = grades.size();
    List<Integer> res = new ArrayList<Integer>(); //for storing result
        
        if(length>=1 && length<=60){  //corner cases
            for(int i=0;i<length;i++){
                int original = grades.get(i);  //value inital
                    if(original>=0 && original<=100){. //marks in between 0 & 100
                        if(original<38) res.add(original); //if less 38 marks
                        else {
                            int temp= original%10; //checking the last digit
                            temp%=5;               // mutliple of 5
                           
                            if(temp>5 && (10-temp)<3) { //if marks is near mutliple of 5
                                original += (10-temp);
                                res.add(original);
                            }
                            else if(temp<5&& (5-temp)<3) { //if marks is near mutliple of 5
                                original += (5-temp);
                                res.add(original);
                            }
                            else res.add(original); //if not round off and is more than 38
                        }
                    }
            }

        }
        return res; // returning the final arrayList

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}