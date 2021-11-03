package javaprogramming;

/*import java.util.Arrays;
import java.util.BitSet;*/

import lesson13.TestStaticAttr;

public class MissingNumberInArray extends TestStaticAttr{
    public static void main(String[] args) {

        MissingNumberInArray cha = new MissingNumberInArray();
        System.out.println(cha.calCost(500));
    
        /*printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 6);
        printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 9, 8, 10 }, 10);
        printMissingNumber(new int[] { 1, 2, 3, 4, 6, 9, 8 }, 10);
        printMissingNumber(new int[] { 1, 2, 3, 4, 9, 8 }, 10);

        int[] iArray = new int[] { 1, 2, 3, 5 };
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);
    }
//เมธอด printMissingNumber มี access modifier : private คือ
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing number in integer array %s, with total number %d is %n", Arrays.toString(numbers),
                count);
        int lastMissingIndex = 0;
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }
        return expectedSum - actualSum;*/
    }
}
