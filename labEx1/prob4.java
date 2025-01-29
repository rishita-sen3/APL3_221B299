class One {
    One(int x) {
        System.out.println("Constructor of One with value: " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x);
        System.out.println("Constructor of Two with value: " + x);
    }
}
public class prob4 {
    public static void main(String[] args) {
        Two obj = new Two(5);
    }
}