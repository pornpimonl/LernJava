package lesson13;

class TestOverloadMethod {
    public static void main(String[] args) {
        TestOverloadMethod tom = new TestOverloadMethod();
        if (args.length == 0 || args.length > 2) {
            System.out.print("Input : ");

        } else if (args.length == 1)
            tom.testPrint(args[0]);
        else if (args.length == 2)
            tom.testPrint(args[0], args[1]);

    }

    public void testPrint(String msg) {
        System.out.println(msg);
    }

    public void testPrint(String msg, String sign) {
        int len = msg.length();
        for (int i = 0; i < len + 2; i++)
            System.out.println(sign);
        System.out.println();
        System.out.println(sign);
        System.out.println(msg);
        System.out.println(sign);
        System.out.println();
        for (int i = 0; i < len + 2; i++)
            System.out.println();
    }
}
