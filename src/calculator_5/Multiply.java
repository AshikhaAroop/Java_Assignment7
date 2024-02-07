package calculator_5;

import java.util.Scanner;

public class Multiply {
    int num2;
    int multiply(int num1) {
        System.out.println("Enter the number to multiply: ");
        Scanner sc=new Scanner(System.in);
        num2 = sc.nextInt();
        System.out.println("The product of " + num1 + " and " + num2 +
                " is: ");
        return num1*num2;
    }
}
