public class nestedif {
     public static void main(String[] args) {
        int pass  = 35;
        int mymark = 100;
    
        if (mymark>=pass) {
            System.out.println("Pass");
            if (mymark>=50) {
                System.out.println("graterthan 50");
                if (mymark>=90) {
                    System.out.println("Above 90");
                    if (mymark==100) {
                        System.out.println("Centum");
                    }
                }
            }
        }
        else{
             System.out.println("Fail");
        }
    }
}