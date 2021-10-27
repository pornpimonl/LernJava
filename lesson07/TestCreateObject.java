package lesson07;

public class TestCreateObject {
    public void getValue(){
        System.out.println("TestCreateObject");
    }
    public static void main(String[] args) {
        new TestCreateObject().getValue();
        /*TestCreateObject t =new TestCreateObject();
        t.getValue();*/        
    }
}
