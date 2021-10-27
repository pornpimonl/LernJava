package lesson06;

public class TestBitwise {
    public static void main(String[] args) {
        int bit1=66;
        int bit2=30;
        int bit3=-30;

        System.out.println(bit1&bit2);
        System.out.println(bit1|bit2);
        System.out.println(bit1^bit2);
        System.out.println(~bit1);
        System.out.println(~bit2);
        System.out.println(bit1>>3);
        System.out.println(bit3>>3);
        System.out.println(bit1>>>3);
        System.out.println(bit3>>>3);
        System.out.println(bit2<<6);
    }
}
