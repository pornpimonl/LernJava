package lesson13;

public class TestThis {
    private String name = "Doraemon";

    public TestThis(String name) {
        this.name = name;
        // name = name;
    }

    public void print() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        TestThis t = new TestThis("Joy");
        t.print();
    }
}
