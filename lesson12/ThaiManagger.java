package lesson12;

public class ThaiManagger extends CompanyEmployee {
    protected String departmennt = "Network";

    public String getInformation() {
        return name + " " + saraly + " " + departmennt;
    }

    public static void main(String[] args) {
        CompanyEmployee emp = new CompanyEmployee();
        System.out.println(emp.getInformation());
        ThaiManagger mgr = new ThaiManagger();
        System.out.println(mgr.getInformation());
    }
}
