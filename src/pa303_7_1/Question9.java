package pa303_7_1;

import java.util.Arrays;

public class Question9 {
    //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
    // Print the array in ascending order, and print the smallest and the largest element of the array.
    // The output will look like the following:
    //Array in ascending order: 0, 1, 2, 4, 9, 13
    //The smallest number is 0
    //The biggest number is 13
    public static void main(String[] args) {
        int[] brr = {4, 2, 9, 13, 1, 0};
        int small;
        int largest;
        int temp;
        Arrays.sort(brr);
        System.out.printf("Modified arr[] : %s", Arrays.toString(brr));
        System.out.println();
        small = brr[0];
        largest = brr[brr.length - 1];
        System.out.println("Smallest number is " + small + "\n Largest is " + largest);

    }
}
