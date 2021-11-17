package lesson05;

// import java.util.*;

import java.io.*;
public class InputData{
    public static void main(String[] args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int x;
        System.out.print("Enter String :");
        try{
            s=in.readLine();
            x=Integer.parseInt(in.readLine());
            System.out.print(s+""+x);

        }catch(IOException e){
            System.out.print("Read Input Keyboard Error");
        }
        // Scanner in = new Scanner(System.in);
        // String s;
        // int x;
        // s=in.nextLine();
        // x=in.nextInt();
        // System.out.print(s+""+x);
        // in.close();
    }
}