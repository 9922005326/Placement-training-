class outer_class{
    String str = "Nesting Inner class in outer class.";
    class inner{
        void display(){
            System.out.println(str);
        }
    }
}
public class Outer {
    public static void main(String[] args) {
        outer_class obj = new outer_class();
        outer_class.inner inobj = obj.new inner();
        inobj.display();
    }
}
