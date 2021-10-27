package lesson06;

public class TestCasting {
    public static void main(String[] args) {
        //byte num1 = 127;
        byte num1 = (byte)500;
        System.out.println("num1 = "+num1);
        //short num2 = (short)32768;
        short a = 1; short num2 = (short)(a+5);
        //short a = 32767; int num2 = a+5;
        System.out.println("num2 = "+num2);
        //int b = 3; int num3 = (float) b/3;
        int b = 3; float num3 = (float) b/3;
        System.out.println("num3 = "+num3);
        //int x; long y; y = 10l; x=y;
        int x; long y; x=20; y=x;
        System.out.println("x = "+x+", y = "+y);
        //short xx=1,yy=2,z1; zz=xx+yy;
        short xx=1,yy=2,zz; zz= (short)(xx+yy);
        System.out.println("zz = "+zz);
        //float xxx = 3.0f;
        double xxx = 2.5f;
        System.out.println("xxx = "+xxx);
    }
}
