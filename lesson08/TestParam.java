package lesson08;

class TestParam {
    TestParam(int x){
        x++;
        System.out.println(x);
    }
    TestParam(double x, int y){
        x+=y;
        System.out.println(x);
    }
    TestParam(float x, int y){
        x+=y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        new TestParam(5);
        new TestParam(5.0d, 5);
        new TestParam(50.5f, 50);

        new TestParam(5);
        new TestParam(5.0, 5);
        new TestParam(50.5, 50);
    }
}
