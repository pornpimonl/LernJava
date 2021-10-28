package lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaxValue {
    public static void main(String[] args) {
        String s[] = new String[3];
        int num[] = new int[3];
        int max;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        try{
            System.out.print("Input1 : ");
            s[0]=in.readLine();
            System.out.print("Input2 : ");
            s[1]=in.readLine();
            System.out.print("Input3 : ");
            s[2]=in.readLine();
            for(int i=0;i<s.length;i++){
                num[i]=Integer.parseInt(s[i]);
            }
            max=num[0];
            for(int i=1;i<num.length;i++){
                if(num[i]>max){
                    max=num[i];
                }
            }
            System.out.println(max);
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
