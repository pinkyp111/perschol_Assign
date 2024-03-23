package pa303_7_1;

public class Question6 {
    //
    public static void main(String[] args) {
        // Write a program where you create an integer array of 5 numbers.
        // Loop through the array and assign the value of the loop control variable
        // multiplied by 2 to the corresponding index in the array.
        // (e.g., i) to the corresponding index in the array.
        int[] aar = {10, 20, 30, 40, 50};

        for (int i = 0 * 2; i <= aar.length - 1; i++) {
            i = i * 2;
            System.out.println("Value of i : " + i + " Value at i " + aar[i]);

        }

    }
}
