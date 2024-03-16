package perscholas.javabasics;

public class JavaBasics {
    public static void main(String[] args) {
        //Question 1

        int a=10;
        System.out.println("Enter the value of integer a"+" "+a);
        int b=20;
        System.out.println("Enter the value of integer b"+" "+b);
        int sum=a+b;
        System.out.println("Sum of integers"+" " +sum);

        //Question 2

        double c=10.12;
        System.out.println("Enter the value of double c"+" "+c);
        double d=20.457;
        System.out.println("Enter the value of double d"+" "+d);
        double sum1=c+d;
        System.out.println("Sum of double"+" " +sum1);

        //Question 3

        double e= 30.789;
        System.out.println("Enter the value of double e"+" "+e);
        int f=20;
        System.out.println("Enter the value of integer f"+" "+f);
        double sum2=e+f;
        System.out.println("Sum is"+" " +sum2);

        //Question 4

        float i1=50;
        System.out.println("Enter the value of integer i1" +" "+i1);
        float i2=12;
        System.out.println("Enter the value of integer i2"+" "+i2);
        float i3;
        i3 = i1>i2 ? i1/i2 : i2/i1;
        System.out.println("Final result of division"+" "+i3);
        //Question 5---casting
        System.out.println("Question 5");
        double d1=50.10;
        double d2=60.45;
        System.out.println("Enter the value of double d1"+" "+d1);
        System.out.println("Enter the value of double d2"+" "+d2);
        double d3 = d2>d1 ? d1/d2 : d2/d1;
        System.out.println("Print the result"+" "+d3);
        int i4;
        i4=(int)d3;
        System.out.println("Print only the integer part"+" "+i4);
        System.out.println("Question 6");
        int x=5;
        int y=6;
        double q=y/x;
        System.out.println("Print the value of first q"+" "+q);
        double temp;
        temp= (double) y;
        System.out.println("Print y"+" "+y);
        q=y;
        System.out.println("Print the value of second q"+" "+q);
        //Question 7
        System.out.println("Question 7");
        final double length=10;
        final double breadth=20;
        System.out.println("Enter the value of double d of length and breadth of a Rectangle"+" "+length+" "+breadth);
        double area= length*breadth;
        System.out.println("Print the area of rectangle"+" "+area);
//Question 8 : Caffe Solution.
        System.out.println("Question 8");
        double p_coffee=3.25;
        double p_tea=2.12;
        double p_espresso=4.45;
        System.out.println("Display all the items in the cafe"+" \n"+"COFFEE "+"$"+p_coffee+" \n"+"TEA "+"$"+p_tea+"\nESPRESSO"+" "+"$"+p_espresso);

        double subtotal;
         subtotal=3*p_coffee+4*p_espresso+2*p_tea;
        System.out.println("Print total cost before tax "+"$"+subtotal);
        //
        final double Salestax=5.12;
        double totalSale=subtotal+Salestax;
        System.out.println("Print the final cost after tax "+"$"+totalSale);




    }
}
