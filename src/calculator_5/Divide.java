package calculator_5;

import java.util.Scanner;

public class Divide {
    int num2;
    int divide(int num1) {
        System.out.println("Enter the number to divide: ");
        Scanner sc=new Scanner(System.in);
        num2 = sc.nextInt();
        System.out.println("The quotient of " + num1 + " and " + num2 +
                " is: ");
        return num1/num2;
    }
}
