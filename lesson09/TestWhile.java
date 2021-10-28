package lesson09;

class TestWhile {
    public static void main(String[] args) {
        int counter = 20;
        while((counter-=5)!=0){
            System.out.println(counter);
        }
        System.out.println(counter);
    }
}
