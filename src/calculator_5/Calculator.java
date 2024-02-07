package calculator_5;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1,ch,inpLen=1;
        System.out.println("Enter first digit to perform arithmetic operations");
        num1=sc.nextInt();
        Addition a=new Addition();
        Subtraction s=new Subtraction();
        Multiply m=new Multiply();
        Divide d=new Divide();
        do
        {
            System.out.println("Please enter your choice: ");
            System.out.println("[1]Add [2]Subtract [3]Multiply [4]Division [5]Quit");
            ch = sc.nextInt();
            if(inpLen==4&&(ch==1|ch==2|ch==3||ch==4))
            {
                throw new Exception("Oops! This calculator allows to perform operations " +
                        "only for 4 inputs ");
            }
        switch(ch) {
            case 1: num1= a.add(num1);
                    System.out.println(num1);
                    inpLen++;
                    break;

            case 2 : num1= s.subtract(num1);
                     System.out.println(num1);
                     inpLen++;
                     break;

            case 3 : num1= m.multiply(num1);
                     System.out.println(num1);
                     inpLen++;
                     break;

            case 4 : num1 = d.divide(num1);
                     System.out.println(num1);
                     inpLen++;
                     break;

            case 5: System.out.println("Thank you!");
                    System.exit(0);

            default:System.out.println("Not a valid choice, please enter any valid value between 1-4");
                    break;
        }

        }while(true);
    }

}
