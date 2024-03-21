package pa303_3;

public class SubstringPractise {
    public static void main(String[] args) {
        /*String s="Welcome to world of java";
        String s1=s.substring(10);
        System.out.println(s1);
        String s2=s.substring(10,20);
        System.out.println(s2);/*

         */
        //Lexographical sorting of substrings of a string
        /*Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String n1;
        System.out.println("Display the string : " + n);
        n1=n.substring(0,3);
        System.out.println(n1);*/
        String n = "hello world";
        String currStr = n.substring(0, 3);
        String lexMin = currStr;
        String lexMax = currStr;

        // Consider all remaining substrings. We consider
        // every substring ending with index i.
        int k = 3;
        for (int i = k; i < n.length(); i++) {
            currStr = currStr.substring(1, k) + n.charAt(i);
            if (lexMax.compareTo(currStr) < 0)
                lexMax = currStr;
            if (lexMin.compareTo(currStr) > 0)
                lexMin = currStr;
        }

        // Print result.
        System.out.println(lexMin);
        System.out.println(lexMax);
        String filePath = "/home/user/documents/report.pdf";

        String fileName = filePath.substring(filePath.lastIndexOf("/"));

        System.out.println(fileName); // Outputs: report.pdf
        String s1 = "for";
        String s2 = "geeksforgeeks";
        String s3 = s2.substring(5, 8);
        if (s3.equals(s1)) {
            System.out.println("yes");
            //Print all the substrings of a string
            String str = "geeks";
            String str1 = "";
            for (int i = 0; i <= str.length(); i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    str1 = str.substring(i, j);
                    System.out.println(str1);
                }

            }
        }

    }
}

