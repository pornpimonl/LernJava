package lesson12;

public class CompanyEmployee {
    protected String name = new String("Joy");
    protected double saraly;

    public CompanyEmployee() {
        saraly = 20000.00;
    }

    public String getInformation() {
        return name + " " + saraly;
    }
}
