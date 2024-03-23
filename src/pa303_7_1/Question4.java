package pa303_7_1;

public class Question4 {
    //Write a program that creates an integer array with 5 elements (i.e., numbers).
    // The numbers can be any integers.
    // Print out the value at the first index and the last index using length - 1 as the index.
    // Now try printing the value at index = length (e.g., myArray[myArray.length] ).
    // Notice the type of exception which is produced.
    // Now try to assign a value to the array index 5. You should get the same type of exception.
    //???????????
    public static void main(String[] args) {
        int[] intarry = {1, 2, 8, 9, 7};
        int len = intarry[intarry.length] - 1;//len= length of array-1
        for (int i = 0; i <= len; i++) {
            if (i == 0 || i == len - 1)
                System.out.println(intarry[i] + " " + intarry[len - 1]);

        }


    }
}
