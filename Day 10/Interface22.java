interface hr{
    //data member
    int a = 10;
    //data method
    void display();
}
class office implements hr{
    public void display(){  //since we are defining a public method in private class we use public word
        System.out.println("This is the data member of interface "+a);
    }
}
public class Interface22{
    public static void main(String[] args) {
        office obj = new office();
        obj.display();
    }
}