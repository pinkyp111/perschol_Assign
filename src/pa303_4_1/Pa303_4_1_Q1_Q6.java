package pa303_4_1;

import java.util.Scanner;

public class Pa303_4_1_Q1_Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Question 1
        System.out.println("Check if x is less than 10 ");
        int x = scan.nextInt();
        if (x < 10)
            System.out.println("x is less than 10:");
        //Question 2
        System.out.println("Check if x is less than or greater than 10");
        x = scan.nextInt();
        if (x < 10)
            System.out.println("x is less than 10");
        else
            System.out.println("x is greater than 10");
        //Question 3
        System.out.println("Check if x is greater than 20");
        x = scan.nextInt();
        if (x < 10)
            System.out.println("x is less than 10");
        if (x > 10 && x < 20)
            System.out.println("x is greater than 10 but less than 20");
        else if (x >= 20)
            System.out.println("Greater than or equal to 20");
//Question 4

        System.out.println("Check if x is in Range");
        x = scan.nextInt();
        if (x <= 10 && x <=20)
        {
            System.out.println("In range");
        }
        else
            System.out.println("Out of Range");
//Question 5

        System.out.println("Enter the grades to be calculated");
        int grades = scan.nextInt();
        if (grades >= 90 && grades <= 100)
            System.out.println("Grade is :: A");
        else if (grades >= 80 && grades <= 89)
            System.out.println("Grades is :: B");
        else if (grades >= 70 && grades <= 79)
            System.out.println("Grades is :: C");
        else if (grades >= 60 && grades <= 69)
            System.out.println("Grades is :: D");
        else if (grades < 60 && grades >=0)
            System.out.println("Grades is :: F");
        else if (grades < 0 || grades > 100) {
            System.out.println("Out of range");
        }
        //Question 6

        System.out.println("Print the day in a week");
        x=scan.nextInt();
        switch (x){
            case  1 :
                System.out.println("Monday");break;
            case  2 :
                System.out.println("Tuesday");break;
            case  3 :
                System.out.println("Wednesday");break;
            case  4:
                System.out.println("Thursday");break;
            case  5 :
                System.out.println("Friday");break;
            case  6:
                System.out.println("Saturday");break;
            case  7 :
                System.out.println("Sunday");break;
            default:if(x<1 || x>7)
                System.out.println("out of range");break;

        }

    }
}
