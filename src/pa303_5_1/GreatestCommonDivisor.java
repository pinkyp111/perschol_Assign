package pa303_5_1;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int a1, b1;
        a1 = Math.abs(a);
        b1 = Math.abs(b);
        int temp = 1;
        int temp1;
        for (int i = 2; i <= a1 && i <= b1; i++) {
            if (a1 % i == 0 && b1 % i == 0)
                temp = i;
        }
        System.out.println("Print the GCD:: " + temp);
    }
}



