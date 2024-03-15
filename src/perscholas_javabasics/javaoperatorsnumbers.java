package perscholas_javabasics;

public class javaoperatorsnumbers {
    public static void main(String[] args) {
        //Question 1
        //Write a program that declares an integer a variable x, assigns the value 2 to it,
        // and prints out the binary string version of the number
        // ( Integer.toBinaryString(x) ).
        // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        // Before printing the results, write a comment with the predicted decimal value and binary string.
        // Now, print out x in decimal form and in binary notation.
        //Perform the preceding exercise with the following values:
        //9
        //17
        //88
        System.out.println("LEFT SHIFT");
        int x=88;
        System.out.println("Print the intial value of x"+" "+x);
       String  binarystring = Integer.toBinaryString(x);
        System.out.println("Print the binary string value "+binarystring);
        x <<=1;
        System.out.println("Print the decimal  value after left-shift "+x);
        String binarystring1= Integer.toBinaryString(x);
        System.out.println("Print the binary string value "+binarystring1);

        int y=17;
        System.out.println("Print the intial value of y"+" "+y);
        String  binarystring2 = Integer.toBinaryString(y);
        System.out.println("Print the binary string value "+binarystring2);
        y<<=1;
        System.out.println("Print the decimal  value after left-shift "+y);
        String binarystring3= Integer.toBinaryString(y);
        System.out.println("Print the binary string value "+binarystring3);


        int z=9;
        System.out.println("Print the intial value of z"+" "+z);
        String  binarystring4 = Integer.toBinaryString(z);
        System.out.println("Print the binary string value "+binarystring4);
        z <<=1;
        System.out.println("Print the decimal  value after left-shift "+z);
        String binarystring5= Integer.toBinaryString(z);
        System.out.println("Print the binary string value "+binarystring5);
        ///<<<<<<<<<<RIGHT SHIFT---->>>>
        System.out.println("RIGHT SHIFT");
        int a=150;
        System.out.println("Print the initial value of a"+a);
        String newstring =  Integer.toBinaryString(a);
        System.out.println("Print the binary string value "+newstring);
        a >>= 2;
        System.out.println("Print the decimal  value after right-shift "+" "+a);
        String newstring1= Integer.toBinaryString(a);
        System.out.println("Print the binary string value "+newstring1);
        //
        int b=225;
             System.out.println("Print the initial value of b"+b);
                String newstring2 =  Integer.toBinaryString(b);
                System.out.println("Print the binary string value "+newstring2);
                b >>= 2;
                System.out.println("Print the decimal  value after right-shift "+" "+b);
                String newstring3= Integer.toBinaryString(b);
                System.out.println("Print the binary string value "+newstring3);
                //
         int c=1555;
              System.out.println("Print the initial value of c"+" "+c);
              String newstring4 =  Integer.toBinaryString(c);
        System.out.println("Print the binary string value "+newstring4);
        c >>= 2;
        System.out.println("Print the decimal  value after right-shift "+c);
                        String newstring5= Integer.toBinaryString(c);
                        System.out.println("Print the binary string value "+newstring5);

//32456
         int d=32456;
                     System.out.println("Print the initial value of d"+" "+d);
                      String newstring6 =  Integer.toBinaryString(d);
                System.out.println("Print the binary string value "+newstring6);
                d>>= 2;
                System.out.println("Print the decimal  value after right-shift "+d);
                                String newstring7= Integer.toBinaryString(d);
                                System.out.println("Print the binary string value "+newstring7);
                                //Question 3
    //    Write a program that declares three int variables: x, y, and z.
        //    Assign 7 to x and 17 to y.
        //    Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
        //    Now use the bitwise AND (&) operator to derive the decimal and binary values,
        //    and assign the result to z.

        int x1=8;
        int y1=8;
        System.out.println("Display the values of x1 and y1 "+" "+x1+" "+y1);
        int z1;
        z1 = (x1 & y1);
        System.out.println("Print the decimal value of z1"+" " + z1);
        String z2 = Integer.toBinaryString(z1);
        System.out.println("Print the binary value of z1 "+" "+z2);
        

    }
}
