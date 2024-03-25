package pa303_7_1;

public class Question10 {
    //Create an array that includes an integer, 3 strings, and 1 double. Print the array.
    public static void main(String[] args) {
        Object[] ob = new Object[10];
        ob[0] = String.valueOf("Hi");
        ob[1] = Double.valueOf(5.45);
        ob[2] = Integer.valueOf(10);
        ob[3] = String.valueOf("Hello");
        ob[4] = String.valueOf("Java");
        System.out.println(ob[0] + " " + ob[1] + " " + ob[2] + " " + ob[3] + " " + ob[4]);

    }
}
