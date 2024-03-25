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
        //Enter your thing: phone
        //Enter your thing: tv
        //Enter your thing: xbox
        //Enter your thing: wine
        //Enter your thing: beer
        //Enter your thing: sofa
        //Enter your thing: book
        //Your favorite  things are:
        //phone tv xbox wine beer sofa book
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many favorite things you have");
        int things = scan.nextInt();
        System.out.println("Display the number of favorite things you have" + things);
        String[] items = {"phone", "tv", "xbox", "wine", "beer", "sofa", "book"};
        for (int i = 0; i < items.length; i++) {
            System.out.println("Enter your thing :: " + items[i]);
        }
        System.out.println("Your favorite things are : " + Arrays.toString(items));
    }
}