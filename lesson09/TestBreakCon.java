package lesson09;

class TestBreakCon {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
            if(i==5) break;
        }
        System.out.println(i);
    }
}
