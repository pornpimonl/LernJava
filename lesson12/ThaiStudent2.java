package lesson12;

public class ThaiStudent2 {
    String name;
    int age;
    double grade;

    public ThaiStudent2() {
        grade = 3.06;
        age = 6;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void printData() {
        System.out.println(grade);
        System.out.println(age);
    }

    public static void main(String[] args) {
        ThaiStudent s = new ThaiStudent();
        s.setName("Joy");
        System.out.println(s.getName());
        s.printData();
    }
}
