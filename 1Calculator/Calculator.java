// 1E-CITCS
//Benoza Jelaica P

package calculator;
import java.util.Scanner;
public class Calculator {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter the first number:");
      double first = input.nextDouble();
      System.out.println("Enter the second number:");
      double second = input.nextDouble();
      
     System.out.println("Enter an operator (+, -, *,/,%):");
     Scanner input2 = new Scanner(System.in);
     String operator = input2.nextLine();
     double result;
     
     switch(operator)
     {
         case "+":
         case "add":
            result = first + second;
            
 System.out.println("The answer is "+result);
            break;

        case "-":
        case "subtract":
            result = first - second;
            
 System.out.println("The answer is "+result);
            break;

        case "*":
        case "multiply":
            result = first * second;
            
 System.out.println("The answer is "+result);
            break;

        case "/":
        case "divide":
            result = first / second;
            
 System.out.println("The answer is "+result);
            break;

        default:
          System.out.println("Error! The operator is not correct:"); 
     }
    }
}
