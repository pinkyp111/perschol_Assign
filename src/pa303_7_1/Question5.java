package pa303_7_1;

public class Question5 {
    //
    public static void main(String[] args) {
        //Write a program where you create an integer array with a length of 5.
        // Loop through the array and assign the value of the loop control variable
        // (e.g., i) to the corresponding index in the array.
        int[] aar = {10, 20, 30, 40, 50};

        for (int i = 0; i <= aar.length - 1; i++) {
            aar[i] = i;
            System.out.println("Value of i : " + i + " Value at i :" + aar[i]);

        }

    }
}
