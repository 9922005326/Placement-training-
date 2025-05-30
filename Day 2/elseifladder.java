public class elseifladder {
    public static void main(String[] args) {
        int pass  = 35;
        int mymark = 100;
    
        if (mymark==100) {
            System.out.println("Centum");
        }
        else if(mymark>=50){
            System.out.println("Above 50");
        }
        else if(mymark >=pass){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
