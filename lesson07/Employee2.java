package lesson07;

public class Employee2 {
    public int empId;
    private double saraly;
    public String timeIn;
    public String timeOut;

    public void setTimeIn(String time){
        timeIn=time;
    }

    public void setTimeOut(String time){
        timeOut=time;
    }

    private double getSalary(int empId){
        if(empId == 2264) saraly=30000;
        else saraly = 20000;
        return saraly;
    }

    public static void main(String[] args) {
        Employee2 employee2= new Employee2();
        employee2.empId=2264;
        
        employee2.setTimeIn("08.20");
        employee2.setTimeOut("18.00");
        employee2.getSalary(employee2.empId);

        System.out.println(employee2.empId);
        System.out.println(employee2.saraly);
        System.out.println(employee2.timeIn);
        System.out.println(employee2.timeOut);
    }
}
