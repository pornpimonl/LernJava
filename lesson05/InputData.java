package lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    public static void main(String[] args) {
        String s;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.print("Enter your text here : ");
        try{
            s = in.readLine();
            System.out.println("Your text is "+s);
        }catch(IOException e){
            System.out.println("Read input keyboard error");
        }
    }
}
