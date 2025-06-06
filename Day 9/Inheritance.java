// single level inheritance

class math{
    void formula(){
        System.out.println("(A+B)^2");
    }
}
class chemistry extends math{
    void display(){
        System.out.println("Nothing");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        chemistry ch = new chemistry();
        ch.display();
        ch.formula();
    }
    
}
