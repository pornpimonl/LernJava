package lesson12;

class A {
    public int number = 0;

    A(int num) {
        number = num + 3;
        System.out.println(number);
    }

    A() {
        number = 3;
        System.out.println(number);
    }

    void PrintA() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
    }

    B(int num) {
    }
}

public class TestInheritance {
    public static int i = 3;

    public static void main(String[] args) {
        A a = new A(i);
        A a2 = new A();
        B b = new B();
        B b2 = new B(i);
        a.PrintA();
        a2.PrintA();
        b.PrintA();
        b2.PrintA();
    }
}
