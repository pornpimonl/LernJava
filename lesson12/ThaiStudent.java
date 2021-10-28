package lesson12;

public class ThaiStudent extends People {
    double grade;

    public ThaiStudent() {
        grade = 3.06;
        age = 6;
    }

    public void printData() {
        System.out.println(age);
        System.out.println(grade);
    }

    public static void main(String[] args) {
        ThaiStudent s = new ThaiStudent();
        s.setName("Joy");
        System.out.println(s.getName());
        s.printData();
    }
}
