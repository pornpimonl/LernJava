package lesson09;

class TestIfElse {
    public static void main(String[] args) {
        new TestIfElse().calGrade(72);
        new TestIfElse().calGrade(49);
    }
    public void calGrade(int points){
        if(points>50){
            System.out.println("Your");
            System.out.println("Not");
        }
        else{
            System.out.println("Your");
            System.out.println("fail");
        }
        System.out.println("End");
    }  
}
