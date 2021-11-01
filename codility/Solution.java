package codility;

import java.util.ArrayList;

public class Solution {
    public int countZero;
    public int solution(int N){
        String result=Integer.toBinaryString(N);
        ArrayList<Integer> arrList=new ArrayList<Integer>();
        for(int i=0;i<result.length();i++){
            arrList.add(i, Integer.parseInt(result.substring(i)));
        }
        for(int i=0;i<arrList.size();i++){
            if(arrList.get(i)==1){
                countZero++;
            }
        }
        return countZero;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(529));
    }
}
