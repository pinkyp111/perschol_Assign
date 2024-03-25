package pa303_7_1;

import java.util.Arrays;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
//Write some Java code that asks the user how many favorite things they have.
// Based on their answer, you should create a String array of the correct size.
// Then ask the user to enter the things and store them in the array you created.
// Finally, print out the contents of the array.
//Example
//How many favorite things do you have?
//7
// Enter your thing: phone
        //Enter your thing: tv
        //Enter your thing: xbox
        //Enter your thing: wine
        //Enter your thing: beer
        //Enter your thing: sofa
        //Enter your thing: book
        //Your favorite  things are:
        //phone tv xbox wine beer sofa book
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of favorite things");
        int n = scan.nextInt();
        String[] things = new String[n];
        System.out.println("Enter your favorite things");
        for (int j = 0; j < n; j++) {
            things[j] = scan.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(things[i]);
        }
        System.out.println("Display all the favorite items");
        System.out.println(Arrays.toString(things));

    }
}