package lesson13;

public class TestAbstractClass {
    public static void main(String[] args) {
        MyHourlyEmployee h = new MyHourlyEmployee();
        MyGeneralEmployee e = new MyGeneralEmployee();
        MyManager m = new MyManager();
        System.out.println(h.calSalary(180));
        System.out.println(h.getFirstEmpid());
        System.out.println(e.calSalary(113));
        System.out.println(e.getFirstEmpid());
        System.out.println(m.calSalary(4));
        System.out.println(m.getFirstEmpid());
    }
}
