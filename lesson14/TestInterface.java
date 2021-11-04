package lesson14;

import java.io.*;

public class TestInterface {
    static int undergraduateId;
    static int officerId;
    static int input;
    String inputStr;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        TestInterface tif = new TestInterface();
        Undergraduate u = new Undergraduate();
        Officer o = new Officer();
        do {
            do {
                input = tif.inputData();
            } while (input == 1000);
            if (input == 1) {
                ++undergraduateId;
                u.apply(tif.getName(), tif.getSername(), tif.getAddress(), undergraduateId);
            } else if (input == 2) {
                ++officerId;
                o.apply(tif.getName(), tif.getSername(), tif.getAddress(), officerId);
            } else if (input <= 0 || input > 3)
                System.out.println("1-3 Only");
        } while (input != 3);
    }

    public int inputData() {
        System.out.println("Input1");
        try {
            System.out.println("Input2 : ");
            input = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            System.out.println("Error");
            input = 1000;
        } catch (NumberFormatException e2) {
            System.out.println("Input Wrong");
            input = 1000;
        }
        return input;
    }

    public String getName() {
        System.out.println("name : ");
        try {
            inputStr = in.readLine();
        } catch (IOException e) {
            System.out.println("Error");
            input = 1000;
        }
        return inputStr;
    }

    public String getSername() {
        System.out.println("name : ");
        try {
            inputStr = in.readLine();
        } catch (IOException e) {
            System.out.println("Error");
            input = 1000;
        }
        return inputStr;
    }

    public String getAddress() {
        System.out.println("name : ");
        try {
            inputStr = in.readLine();
        } catch (IOException e) {
            System.out.println("Error");
            input = 1000;
        }
        return inputStr;
    }
}
