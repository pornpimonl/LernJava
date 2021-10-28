package lesson10;

import java.io.*;

class Month {
    public static void main(String[] args) {
        String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String s;
        int index;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.print("Input : ");
        try{
            s=in.readLine();
            index=Integer.parseInt(s);
            if(index<1||index>12){
                System.out.println("Error");
            }else{
                System.out.println(index+" "+month[index-1]);
            }
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
