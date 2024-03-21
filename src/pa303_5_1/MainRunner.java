package pa303_5_1;

import java.util.Scanner;

import static pa303_5_1.LexographicalSortingStrings.getSmallestAndLargest;

public class MainRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));

    }
}
