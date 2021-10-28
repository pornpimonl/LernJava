package lesson10;

import java.util.ArrayList;

class ForEachArrayList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Dog");
        al.add("Cat");
        al.add("Fish");
        al.add("Rabbit");
        al.add("Horse");

        System.out.print(al.size());

        for(String str : al){
            System.out.print(str);
        }
    }
}
