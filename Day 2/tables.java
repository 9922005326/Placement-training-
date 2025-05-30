import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,i;
        System.out.println("Enter the number:");
        a = sc.nextInt();
        for(i = 1;i<=10;i++){
            System.out.println(i +" * " + a + " = " + i*a);
        }

        
    }
    
}
