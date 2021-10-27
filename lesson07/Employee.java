package lesson07;

public class Employee {
    public int empID;
    private double salary;
    public String timeIn;
    public String timeOut;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.empID=2264;
        employee.salary=20000;
        employee.timeIn="08.30";
        employee.timeOut="17.30";
        
        System.out.println("Value from attribute =>");
        System.out.println(employee.empID);
        System.out.println(employee.salary);
        System.out.println(employee.timeIn);
        System.out.println(employee.timeOut);
    }
}
