package lesson07;

public class TestParameter {
    public void changePrimitive(int num2){
        num2=10;
    }

    public void changeObjectRef(Data d){
        d = new Data(20);
    }

    public void changeObjectAttr(Data d){
        d.setNum(30);
    }
    public static void main(String[] args) {
        int num = 2547;
        Data data = new Data(100);
        TestParameter testParam=new TestParameter();
        System.out.println(num);
        testParam.changePrimitive(num);
        System.out.println(num);

        System.out.println(data.myNumber);
        testParam.changeObjectRef(data);
        System.out.println(data.myNumber);

        System.out.println(data.myNumber);
        testParam.changeObjectAttr(data);
        System.out.println(data.myNumber);
    }    
}
