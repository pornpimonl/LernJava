package lesson09;

class TestSwitchCase {
    public static void main(String[] args) {
        new TestSwitchCase().calGrade(3);
        new TestSwitchCase().calGrade(4);
        new TestSwitchCase().calGrade(1);
        new TestSwitchCase().calGrade(0);
    }
    public void calGrade(int grade){
        switch (grade){
            case 4 :
            System.out.println("A");
            System.out.println("Very");
            break;

            case 3 :
            System.out.println("B");
            break;

            case 2 :
            System.out.println("C");
            break;

            case 1 :
            System.out.println("D");
            
            default :
            System.out.println("F");
        }
    }
}
