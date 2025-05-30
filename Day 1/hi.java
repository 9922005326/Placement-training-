import java.util.Scanner;
public class hi {
    public static void main(String[] args) {
        Scanner ha = new Scanner (System.in);
        int  a = ha.nextInt();
        float  f = ha.nextFloat();
        double d = ha.nextDouble();
        String s = ha.nextLine();
        System.out.println("This is what you entered "+(++a));
        System.out.println("This is what you entered "+f);
        System.out.println("This is what you entered "+d);
        System.out.println("This is what you entered "+s);
    }
}

