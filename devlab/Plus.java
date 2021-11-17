package devlab;

import java.io.*;

public class Plus{
    public static void main(String[] args){
        int x,y,sum;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            x=Integer.parseInt(in.readLine());
            y=Integer.parseInt(in.readLine());
            sum=x+y;
            System.out.println(sum);

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
