public class Backdated_Feb11_File1 {
    private final int value;

    public Backdated_Feb11_File1(int value) {
        this.value = value;
    }

    public int square() {
        return value * value;
    }

    public static void main(String[] args) {
        System.out.println(new Backdated_Feb11_File1(7).square());
    }
}
