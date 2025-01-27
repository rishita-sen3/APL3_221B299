public class Example {

    private String name;
    private int age;

    public Example(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        Example example = new Example("John", 25);
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());

        example.setName("Jane");
        example.setAge(30);

        System.out.println("Updated Name: " + example.getName());
        System.out.println("Updated Age: " + example.getAge());
    }
}


