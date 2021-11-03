package lesson13;

public class MyHourlyEmployee extends MyEmployee{
    private double salary;
    public String calSalary(int hourOfWork){
        salary=hourOfWork*35;
        return "saraly : "+salary;
    }
    public String getFirstEmpid(){
        return "First Emp id : 9\n";
    }
}
