package calculator_5;

import java.util.Scanner;

public class Subtraction {
    int num2;
    int subtract(int num1) {
        System.out.println("Enter the number to subtract: ");
        Scanner sc=new Scanner(System.in);
        num2 = sc.nextInt();
        System.out.print("The difference of " + num1 + " and " + num2 +
                " is: ");
        return num1-num2;
    }
}
