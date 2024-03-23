package pa303_7_1;

public class Question7 {
    //Write a program where you create an array of 5 elements.
    // Loop through the array and print the value of each element, except for the middle (index 2) element
    public static void main(String[] args) {
        int[] aar = {10, 20, 30, 40, 50}; //10 20 30 40 50

        for (int i = 0; i <= aar.length - 1; i++) {
          /*  int z = 1;
            if (aar.length % 2 == 0) {
                //System.out.println("Print without the middle elements ::");
                //
                int x = aar[(aar.length / 2) - 1];
                int y = aar[(aar.length / 2)];
                if (aar[i] == x || aar[i] == y) {
                    continue;
                }
                System.out.println(aar[i]);*/


            //System.out.println("Print without middle element: ");

            int z = aar[aar.length / 2];
            if (aar[i] == z) {
                continue;
            }
            System.out.println(aar[i]);
        }
    }
        }



