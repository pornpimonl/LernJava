package lesson10;

import java.util.ArrayList;

class TestArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>(3);
        System.out.println(al.size());
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al.size());
    }
}
