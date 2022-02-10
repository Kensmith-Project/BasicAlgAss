package AlgorithmAssign;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AlgorithmTonight {
    /*
   1 An Anagram is the list of words that has the same character elements irrespective of cases.
    Steps on how to solve the Anagram
    *First convert all to lowercase
    *Then split into array of characters
    *Sort the array to ensure that they are in the same order
    *Compare the two to check if they are same string or array i.e,have the same element, length,
     */

    public static void main(String[] args) {
        solution2("Madam","racecar");
        arryD();



    }
    public static String solution2(String str1, String str2){
        String []string1= str1.toLowerCase(Locale.ROOT).split("");
        String []string2 = str2.toLowerCase(Locale.ROOT).split("");
        Arrays.sort(string1);
        Arrays.sort(string2);
        System.out.println(string1[0]);
        System.out.println(string2[0]);
        System.out.println(Arrays.equals(string1,string2));

        if(Arrays.equals(string1,string2)){
            System.out.println("Anagram");
            return "Anagram";
        }else{
            System.out.println("Not Anagram");
            return  "Not Anagram";
        }


    }
    /*
    Task

The code in your editor does the following:

Reads an integer from stdin and saves it to a variable, , denoting some number of integers.
Reads  integers corresponding to  from stdin and saves each integer  to a variable, .
Attempts to print each element of an array of integers named .
Write the following code in the unlocked portion of your editor:

Create an array,capable of holding  integers.
Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. For example, the first value must be stored in , the second value must be stored in , and so on.
Good luck!

Input Format

The first line contains a single integer, , denoting the size of the array.
Each line  of the  subsequent lines contains a single integer denoting the value of element .

Output Format
You are not responsible for printing any output to stdout. Locked code in the editor loops through array  and prints each sequential element on a new line.
     */

public  static void arryD(){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
int [] a= new int[n];
for(int i=0; i<n;i++){
    a [i] = scan.nextInt();
}
    scan.close();

    // Prints each sequential element in array a
    for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }

}






}
