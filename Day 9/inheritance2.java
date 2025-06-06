
// multi level inheritance

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
class physics extends chemistry{
    void display2(){
        System.out.println("multilevel");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        physics ch = new physics();
        ch.display();
        ch.formula();
        ch.display2();
    }
    
}
