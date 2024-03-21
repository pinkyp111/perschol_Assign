package pa303_5_1;

public class LexographicalSortingStrings {
    public static String getSmallestAndLargest(String s, int k) {
        String st = s.substring(0, k);
        String smallstr = st;
        String largest = st;


        for (int i = 1; i <= s.length() - k; i++) {
            String temp = s.substring(i, i + k);
            if (temp.compareTo(smallstr) < 0) {
                smallstr = temp;

            }
            if (temp.compareTo(largest) > 0) {
                largest = temp;

            }
        }
        return smallstr + "\n" + largest;


    }

}