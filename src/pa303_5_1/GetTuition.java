package pa303_5_1;

import java.util.Scanner;

public class GetTuition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final double rates = 1.07;
        double years = 0;
        double tuition = 10000.0;
        while (tuition < 20000) {
            tuition = tuition * rates;
            years++;
        }
        System.out.println("Tuition will be doubled in " + years);
    }
}



