package devlab;

import java.io.*;

public class Grading{
    public static void main(String[] args){
        int x,y,z,sum;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            x=Integer.parseInt(in.readLine());
            y=Integer.parseInt(in.readLine());
            z=Integer.parseInt(in.readLine());
            sum=x+y+z;
            if(sum>79&&sum<101){
                System.out.println("A");
            }else if(sum>74&&sum<80){
                System.out.println("B+");
            }else if(sum>69&&sum<75){
                System.out.println("B");
            }else if(sum>64&&sum<70){
                System.out.println("C+");
            }else if(sum>59&&sum<65){
                System.out.println("C");
            }else if(sum>54&&sum<60){
                System.out.println("D+");
            }else if(sum>49&&sum<55){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }catch(IOException e){
            System.out.print("Error");
        }
        
    }
}