interface addition{
    int add();
}

class Sum(){
    public int add(int a, int b){
        return a+b;
    }
    
}


public class MethodInt {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.add(10,20);
    }
    
}
