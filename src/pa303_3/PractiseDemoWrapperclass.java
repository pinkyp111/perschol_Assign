package pa303_3;

public class PractiseDemoWrapperclass {
    public static void main(String[] args) {
        /*int i = 100;  // primitive data type
        Integer ii = 100;  // literal method
     //   Integer iii = new Integer(1000); // new operator
        //---AUTOBOXING EXAMPLE--->>>>>
        System.out.println("Autoboxing example");
        int a = 20;
        Integer convertintoInteger = a;
       a= convertintoInteger.intValue();
        System.out.println("Print the value of a : "+a);

        char c = 'A';
        Character convertintoChar = c;

        double d = 565.23;
        Double convertintoDouble = d;/*

         */
        String str = "madam", nstr = "";
        char ch;

        System.out.print("Original word: ");
        //System.out.println("Geeks"); //Example word

        for (int p = 0; p < str.length(); p++) {
            ch = str.charAt(p); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
        if (nstr.equals(str)) {
            System.out.println("yes");
        } else
            System.out.println("No");

    }
}
