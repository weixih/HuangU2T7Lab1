
import java.util.Scanner;
public class Runner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        //first sting
        System.out.print("Enter first string: ");
        String str = scan.nextLine();

        int length = str.length();
        int half = length/2;
        String firstHalf = str.substring(0, half);
        String secondHalf = str.substring(half);

        System.out.println("String length: " + length);
        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);


        //second string
        System.out.print("Enter second string: ");
        String str2 = scan.nextLine();
        int length2 = str2.length();

        //length
        if(length > length2){
            System.out.println(str + " is longer");
        } else if (length < length2) {
            System.out.println(str2 + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }

        //alphabetical order
        if(str.compareTo(str2) > 0){
            System.out.println(str2 + " is first alphabetically");
        } else if (str.compareTo(str2) < 0) {
            System.out.println(str + " is first alphabetically");
        }
        if (str.equals(str2)){
            System.out.println("Both strings have the exact same characters");
        }

        //found in
        int index = str.indexOf(str2);
        if(index > -1){
            System.out.println(str2 + " is found in " + str + " at index " + index);
        } else {
            System.out.println(str2 + " is not found in " + str);
        }

    }
}
