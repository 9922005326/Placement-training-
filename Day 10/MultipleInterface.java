interface hr{
    //data member
    int a = 10;
    //data method
    void display();
}

interface finance{
    void budget();
}

interface operations{
    void SOP();
}

class Legal_office{
    void Law(){
        System.out.println("Indian laws");
    }
}

class office extends Legal_office implements hr,finance,operations{
    public void display(){  //since we are defining a public method in private class we use public key word
        System.out.println("This is the data member of interface "+a);
    }

    public void budget(){  
        System.out.println("Budget from finance ");
    }
    
    public void SOP(){ 
        System.out.println("Standard operating procedure");
    }

}
public class MultipleInterface{
    public static void main(String[] args) {
        office obj = new office();
        obj.display();
        obj.budget();
        obj.SOP();
        obj.Law();
    }
}

