package perscholas.javabasics;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        // -----ARITHMETIC OPERATORS--------->>>>
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        // z++ or ++z means z=z+1
        // Based on prefix or postfix the value of x will be calculated accordingly as below
        // x=z++ means  x=z;z=z+1; // x=5;z=6;
        //x=++z; means  z=z+1; x=z //x=6;z=6;
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);
        // Special Cases
        int maxint = Integer.MAX_VALUE;
        System.out.println("Display the Max value it can hold "+" "+maxint);
        int tooBig = Integer.MAX_VALUE+1;
        System.out.println("Display the value when the Max limit exceeeds"+" "+tooBig);
        // Integer.MIN_VALUE.
        int minint=Integer.MIN_VALUE;
        System.out.println("Display the Min value an int variable can hold"+" "+minint);
        int tooSmall = Integer.MIN_VALUE-1;
        // 2147483647 which is Integer.MAX_VALUE.
        System.out.println("Display the Max value an int variable can hold"+" "+tooSmall);
        System.out.println(4.0 / 0.0); // Prints: Infinity
        System.out.println(-4.0 / 0.0); // Prints: -Infinity
        System.out.println(0.0 / 0.0); // Prints: NaN
        double d1 = 12 / 8; // result: 1 by integer division. The value of d1 becomes 1.0.
        int d3 =12/8;
        System.out.println("Display d3"+" "+d3);
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);
    }
}
