package code;

import java.io.*;

public class Sumofnearest {
    public static void main(String[] args) {
        BufferedReader sr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Count");
        try {
            int n=Integer.parseInt(sr.readLine());
            // int x=Integer.parseInt(sr.readLine());
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(sr.readLine());
            }
            

        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
