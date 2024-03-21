package pa303_5_1;

public class LexographicalSortingStrings {
    public static String getSmallestAndLargest(String s, int k) {

        String smallstr = s.substring(0, k);
        String largest = s.substring(0, k);


        for (int i = 1; i < s.length() - k; i++) {
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