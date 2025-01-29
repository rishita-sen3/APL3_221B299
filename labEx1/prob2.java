
class Mother {
    int x = 10; 

    
    void show() {
        System.out.println("Hello World from Mother class.");
    }
}

class Child extends Mother {

   
    @Override
    void show() {
        System.out.println("Hello JUET from Child class.");
    }
}

public class prob2 {
    public static void main(String[] args) {
        
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 

        Mother m2 = new Child();
        m2.show(); 
    }
}
