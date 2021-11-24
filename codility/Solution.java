package codility;

import java.io.*;

class Solution{
    public int solution(int N){
        int w=0;
        int x=0;
        String y = Integer.toBinaryString(N);
        String z[]=y.split("1");
        for(int i=0;i<y.length();i++){
            if(Integer.parseInt(y.substring(i,i+1))==1){
                w++;
            }
        }
        if(w!=1){
            for(int j=0;j<z.length;j++){
                if(x<z[j].length()){
                    x=z[j].length();
                }
            }
        }else{
            x=0;
        }
        return x;  
    }
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter Num : ");
            int v = Integer.parseInt(in.readLine());
            Solution b = new Solution();
            System.out.println(b.solution(v));
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    
}
