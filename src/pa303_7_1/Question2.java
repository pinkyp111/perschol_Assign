package pa303_7_1;

public class Question2 {
    public static void main(String[] args) {
        //Write a program that returns the middle element in an array.
        // Give the following values to the integer array: {13, 5, 7, 68, 2}
        // and produce the following output: 7
        int z;
        int[] intarry = {13, 5, 7, 68, 2, 8};
        if (intarry.length % 2 == 0) {
            System.out.println("The middle elements are::");

            // even-length array (two middle elements)
            int x = intarry[(intarry.length / 2) - 1];
            System.out.println(x);
            int y = intarry[intarry.length / 2];
            System.out.println(y);
        } else {
            //odd-length array
            System.out.println("The middle element is :: ");
            z = intarry[intarry.length / 2];
            System.out.println(z);
        }
    }
}