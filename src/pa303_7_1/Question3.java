package pa303_7_1;

import java.util.Arrays;

public class Question3 {
    //Write a program that creates an array of String type and initializes it with the strings “red,” “green,” “blue,”
    // and “yellow.” Print out the array length. Make a copy using the clone( ) method.
    // Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
    public static void main(String[] args) {
        String[] st = {"red", "green", "blue", "yellow"};
        int arry_length = st.length;
        System.out.println("Print the array length" + arry_length);
        String[] targetArray = st.clone();
        System.out.println("Source Array: " + Arrays.toString(st));
        System.out.println("Target Array: " + Arrays.toString(targetArray));
        if (st == targetArray) {
            System.out.println("Same instance");
        } else {
            System.out.println("Different instance");
        }
        //
        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        int[] sourcearrays = {2, 3, 4, 5, 10};
        int[] targetarrays = new int[sourcearrays.length];
        for (int i = 0; i < sourcearrays.length; i++) {
            targetarrays[i] = sourcearrays[i];
        }
        targetarrays[0] = 114;
        // Here in this case sourcearray is intact
        System.out.println(Arrays.toString(sourcearrays));
        System.out.println(Arrays.toString(targetarrays));


    }
}
