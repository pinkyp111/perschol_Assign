package pa303_7_1;

public class Question8 {
    //Write a program that creates a String array of 5 elements
    // and swaps the first element with the middle element without creating a new array.
    public static void main(String[] args) {
        String[] st = {"hello", "java", "python", "ruby", "c++"};

        String temp;

        for (int i = 0; i < st.length; i++) {
            temp = st[0];
            st[0] = st[st.length / 2];
            st[st.length / 2] = temp;
        }

        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }


    }
}
