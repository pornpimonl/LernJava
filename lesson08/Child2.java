package lesson08;

class Parent2{
    private int x;

    Parent2(int y){
        x=3+y;
        System.out.println(x);
    }
}

public class Child2 extends Parent2{
    private int y;
    public Child2(){
        super(3);
    }
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println(child2.y);
    }
}
