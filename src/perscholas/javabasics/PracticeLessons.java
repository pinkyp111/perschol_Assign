package perscholas.javabasics;

import java.util.Scanner;

public class PracticeLessons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1= scan.nextLine();
        //scan.nextLine();
        System.out.println("display first string \n"+s1);
        System.out.println("Enter second string");
        String s2 = scan.next();
        System.out.println("Display string s2\n"+s2);
        s2=scan.nextLine();//aaaaaa
        System.out.println("s2="+s2+"\nEnter the integer");
        int s= scan.nextInt();
        System.out.println("Display the integer \n"+s);
        // In the input stream buffer if we are continously asking for String datatype no issue but if we want a
        // different datatype like int,double we have to make the cursor skip that line of string input skip it
        //and then ask for int or double
        //if the input buffer has some piece of entered string remaining in the buffer it will throw an exception
// if we ask for a different datatype.
    }




}
