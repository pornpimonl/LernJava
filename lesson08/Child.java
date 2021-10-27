package lesson08;

class Parent{
    private int x=3;

    Parent(){
        System.out.println(x);
    }
}

public class Child extends Parent {
    private int y;
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.y);
    }
}
