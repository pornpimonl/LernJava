package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arrayOneDimension {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[4];
        int sizeofArray = array.length;
        for (int i = 0; i < sizeofArray; i++) {
            System.out.print("Array [" + i + "] = ");
            array[i] = Integer.parseInt(stdin.readLine());
        }
        int total = 0;
        for (int i = 0; i < sizeofArray; i++) {
            total += array[i];
        }
        System.out.println("total = " + total);
    }
}
