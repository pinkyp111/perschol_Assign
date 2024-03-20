package pa303_3;

import java.util.Scanner;

public class Pa303_4_1_Taxes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 7");
//Question 7
        System.out.println("Calculate tax based on income and status");
        double tax;
        System.out.println("Enter your income");
        double income = scan.nextDouble();
        System.out.println("Display the income ::"+income);
        scan.nextLine();
        System.out.println("Enter your status");
        String st="";
        st=scan.nextLine();
        System.out.println("Enter the status : "+st);
        String status=st.toLowerCase();
        System.out.println("Display the status in lowercase : "+status);
        switch (status){
            case "single" : if(income<=8350)
            {
                tax=0.1*income;
                System.out.println("Print the tax amount to be payed");
                System.out.println(tax);
            }
                else if(income>=8351 && income < 33950)
            {
                tax=0.15*income;
                System.out.println("Print the tax amount to be payed");
                System.out.println(tax);

            } else if (income>=33951 && income<82250) {
                tax=0.25*income;
                System.out.println("Print the tax amount to be payed");
                System.out.println(tax);
            } else if (income>=82251 && income<171550) {
                tax=0.28*income;
                System.out.println("Print the tax amount to be payed");
                System.out.println(tax);

            } else if (income>=171551 && income<372950) {
                tax=0.33*income;
                System.out.println("Print the tax amount to be payed");
                System.out.println(tax);
            } else if (income>=372951) {
                tax=0.35*income;
                System.out.println("Print the tax amount to be payed");
                System.out.println(tax);
            }
                break;
        case "married filing jointly" :
            if(income<=16700)
        {
            tax=0.1*income;
            System.out.println("Print the tax amount to be payed");
            System.out.println(tax);
        }
        else if(income>=16701 && income < 67900)
        {
            tax=0.15*income;
            System.out.println("Print the tax amount to be payed");
            System.out.println(tax);

        } else if (income>=67901 && income<137050) {
            tax=0.25*income;
            System.out.println("Print the tax amount to be payed");
            System.out.println(tax);
        } else if (income>=137051 && income<208850) {
            tax=0.28*income;
            System.out.println("Print the tax amount to be payed");
            System.out.println(tax);

        } else if (income>=208851 && income<372950) {
            tax=0.33*income;
            System.out.println("Print the tax amount to be payed");
            System.out.println(tax);
        } else if (income>=372951) {
            tax=0.35*income;
            System.out.println("Print the tax amount to be payed");
            System.out.println(tax);
        }
        break;
            case "married filing separately" :
                if(income<=8350)
                {
                    tax=0.1*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                }
                else if(income>=8351 && income < 33950)
                {
                    tax=0.15*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);

                } else if (income>=33951 && income<68525) {
                    tax=0.25*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                } else if (income>=68526 && income<104425) {
                    tax=0.28*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);

                } else if (income>=104426 && income< 186475) {
                    tax=0.33*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                } else if (income>=186476) {
                    tax=0.35*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                }
                break;
            case "head of household" :
                if(income<=11950)
                {
                    tax=0.1*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                }
                else if(income>=11951 && income < 45500)
                {
                    tax=0.15*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);

                } else if (income>=45501 && income<117450) {
                    tax=0.25*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                } else if (income>=117451 && income<190200) {
                    tax=0.28*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);

                } else if (income>=190201 && income<372650) {
                    tax=0.33*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                } else if (income>=372951) {
                    tax=0.35*income;
                    System.out.println("Print the tax amount to be payed");
                    System.out.println(tax);
                }
                break;

    }


        }

        }
