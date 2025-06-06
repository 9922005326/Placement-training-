abstract class service{
    int a = 10;
    void settings(){
        System.out.println(a);
    }
    abstract void profile();
}
class all extends service{
    void profile(){
        System.out.println("absrtact method is being called and defined.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        all s = new all();
        s.profile();
        s.settings(); 
    }
}
