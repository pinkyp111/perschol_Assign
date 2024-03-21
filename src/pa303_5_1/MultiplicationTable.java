package pa303_5_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result;
        System.out.println("Display Multiplication table");
        //int num=scan.nextInt();
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                result = j * i;
                System.out.print("\t" + result);

            }
            System.out.println("\n");
        }
    }
}

