import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt(), temp;
        for (int i = 2;  i<n; i++) {
            temp = n*i;
            System.out.println("Factorial is : "+temp);
        }
    }
    
}
