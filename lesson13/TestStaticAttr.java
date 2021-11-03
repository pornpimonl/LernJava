package lesson13;

import java.io.*;

public class TestStaticAttr {
    public static double cost;
    public static int choice;
    public static void main(String[] args) {
        int choice=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Jacket");
        do{
            TestStaticAttr tsa = new TestStaticAttr();
            System.out.print("Input : ");
            try{
                choice=Integer.parseInt(in.readLine());
                if(choice<=0||choice>5){
                    System.out.println("Error");
                }
                else if(choice==1)tsa.calCost(500);
                else if(choice==2)tsa.calCost(400);
                else if(choice==3)tsa.calCost(300);
                else if(choice==4)tsa.calCost(200);
            }catch(IOException e){
                System.out.println("Error");
            }
        }while(choice!=5);
        System.out.println("Total cost is "+cost+" Baht");
        cost=cost-((cost*10)/100);
        System.out.println("Sale 10% = "+cost);
    }
    public double calCost(double price){
         cost+=price;
         return cost;
        
    }
}
