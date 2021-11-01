package lesson13;

public class TestStaticMethod {
    public static void main(String[] args) {
        System.out.println(Calculate.cal(1));
    }
}

class Calculate {
    public static int cal(int number) {
        return number + 3;
    }
}
