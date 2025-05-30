import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Switch No: ");
        int swt = sc.nextInt();
        switch (swt) {

            case 1: System.out.println("Fan");                
                break;
            case 2: System.out.println("Light");                
                break;
            case 3: System.out.println("AC");                
                break;
            default:System.out.println("Check the Switch"); 
        
        }
    }
}
