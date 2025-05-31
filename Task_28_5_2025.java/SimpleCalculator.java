import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String [] args ) {
        Scanner sc = new Scanner(System.in);
         char operator;
         int a,b,result;
         System.out.println("Enter the operator ( + , - , * / )");
         operator = sc.next().charAt(0);
         System.out.println("Enter the first operand : ");
         a = sc.nextInt();
         System.out.println("Enter the secod operand : ");
         b = sc.nextInt();
         switch (operator) {
            
            case '+' :
            result = a+b;
            System.out.println(a + "+" + b + " = " + result);
            break;

             case '-' :
            result = a-b;
            System.out.println(a + "-" + b + " = " + result);
            break;

             case '*' :
            result = a*b;
            System.out.println(a + "*" + b + " = " + result);
            break;

             case '/' :
            result = a+b;
            System.out.println(a + "/" + b + " = " + result);
            break;

            default :
            System.out.println("Enter a valid operator ");
        
         }
    }
    
}
