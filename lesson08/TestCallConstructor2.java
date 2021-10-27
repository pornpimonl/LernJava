package lesson08;

public class TestCallConstructor2 {
    public static void main(String[] args) {
        new MyChild2();
    }
}
class MyGrandParent2{
    MyGrandParent2(int x){
        System.out.println(x);
    }
}
class MyParent2 extends MyGrandParent2{
    MyParent2(){
        this(100);
        System.out.println("MyParent");
    }
    MyParent2(int x){
        super(200);
        System.out.println(x);
    }
}
class MyChild2 extends MyParent2{
    MyChild2(){
        System.out.println("MyChild");
    }
}


