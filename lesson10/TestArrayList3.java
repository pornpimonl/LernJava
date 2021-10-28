package lesson10;

import java.util.ArrayList;

class TestArrayList3 {
    public static void main(String[] args) {
        ArrayList<Character> arrList = new ArrayList<Character>();
        arrList.add('s');
        arrList.add('h');
        arrList.add('a');
        arrList.add('r');
        arrList.add('e');
        System.out.println(arrList.size()+" "+arrList);
        arrList.remove(0);
        System.out.println(arrList.size()+" "+arrList);
        arrList.remove(arrList.indexOf('e'));
        System.out.println(arrList.size()+" "+arrList);
    }
}
