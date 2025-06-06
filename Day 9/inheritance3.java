//hierarchical inheritance 
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
class physics extends math{
    void display2(){
        System.out.println("multilevel");
    }
}

public class inheritance3 {
    public static void main(String[] args) {
        physics ch = new physics();
        chemistry c = new chemistry();
        c.formula();
        ch.formula();
        ch.display2();
    }
    
}