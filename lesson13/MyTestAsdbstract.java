package lesson13;

abstract class TestAbstract{
    public abstract void a1();
    public abstract void a2();
    public void a3(){
        System.out.println("Test A3");
    }
}

class MyTestAsdbstract extends TestAbstract{
    public static void main(String[] args) {
        MyTestAsdbstract m = new MyTestAsdbstract();
        m.a1();
        m.a2();
        m.a3();
    }
    public void a1(){
        System.out.println("Test A1");
    }
    public void a2(){
        
    }
}
