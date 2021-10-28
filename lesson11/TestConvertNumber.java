package lesson11;

class TestConvertNumber {
    public static void main(String[] args) {
        int num1 = 123;
        double num2 = 45.67;
        String s1, s2;
        s1 = "" + num1;
        s2 = "" + num2;
        System.out.println(num1 + s1);
        System.out.println(num2 + s2);
        System.out.println(num1 + "" + Integer.toString(num1));
        System.out.println(num2 + "" + Double.toString(num2));
    }
}
