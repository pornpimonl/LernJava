package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestStringLength {
    public static void main(String[] args) {
        String message;
        int len;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.print("Enter : ");
        try{
            message = in.readLine();
            len = message.length();
            System.out.println("Length "+message+" is "+len);
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
