package perscholas.javabasics;

public class AutoPromoteTest {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
// Expression:
        double result = (f * b) + (i / c) - (d * s);
        //238.14+515.46-126.36
//Result after all the promotions are done.
        System.out.println("result = " + result);
        // ASCII Codes of different keyboard characters.
        char b1 = 0101;
        System.out.println("Print the value of b1" + " " + b1);
        char nine = 57;
        System.out.println("Print the value of nine" + " " + nine);
        //Swapping numbers
        int m = 10;
        int n = 5;
        System.out.println("Display the initial values of m and n" + " " + m + " " + n);
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Display m and n" + " " + m + " " + n);
//Largest of three numbers
        int a1 = 50;
        int b2 = 100;
        int c1 = 30;
        int temp1;
        if (a1 > b2) //10>15
        {
            temp1=a1;
        }
        else
            temp1=b2;
        if(temp1>c1)
        {
            System.out.println("Print the largest "+temp1);
        }
        else
            System.out.println("Print the largest "+c1);
    }
}