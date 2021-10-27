package lesson08;

class TestCallConstructor {
    public static void main(String[] args) {
        new MyChild();
    }
}
class MyGrandparent{
    MyGrandparent(){
        System.out.println("MyGrandparent Constructor");
    }
}
class MyParent extends MyGrandparent{
    MyParent(){
        this(100);
        System.out.println("MyParent Constructor");
    }
    MyParent(int x){
        super();
        System.out.println(x);
    }
}
class MyChild extends MyParent{
    MyChild(){
        super();
        System.out.println("MyChild Constructor");
    }
}
