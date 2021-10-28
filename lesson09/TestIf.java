package lesson09;

class TestIf {
    public static void main(String[] args) {
        new TestIf().calGrade(72);
        System.out.println();
        new TestIf().calGrade(49);
    }
    public void calGrade(int points){
        if(points>50){
            System.out.println("Your");
            System.out.println("Not");
        }
        System.out.println("End");
    }
}
