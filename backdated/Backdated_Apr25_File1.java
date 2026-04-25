public class Backdated_Apr25_File1 {
    private String name;

    public Backdated_Apr25_File1(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(new Backdated_Apr25_File1("Java").greet());
    }
}
