package calculator_5;

import java.util.Scanner;

public class Addition {

    int num2;
      int add(int num1) {
          System.out.println("Enter the number to add: ");
          Scanner sc=new Scanner(System.in);
          num2 = sc.nextInt();
          System.out.print("The sum of " + num1 + " and " + num2 +
                  " is: ");

          return num1+num2;
    }

//    public int Addition(int a, int b){
//        return a+b;
//    }
}
