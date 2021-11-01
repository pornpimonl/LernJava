package lesson13;

public class TestPolymorphism {
    String name, dept;
    int empId;
    double salary;
    public TestPolymorphism(String name,int empId,double salary){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
        this.dept="N/A";
    }
    public TestPolymorphism(String name,int empId,double salary,String dept){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
        this.dept=dept;
    }
    public void printData(){
        System.out.println(name+" "+empId+" "+salary+" "+dept);
    }
    public static void main(String[] args) {
        TestPolymorphism tp;
        if(args.length<3||args.length>4){
            System.out.println("input");
        }
        else if(args.length==3){
            tp=new TestPolymorphism(args[0],Integer.parseInt(args[1]),Double.parseDouble(args[2]));
            tp.printData();
        }
        else if(args.length==3){
            tp=new TestPolymorphism(args[0],Integer.parseInt(args[1]),Double.parseDouble(args[2]),args[3]);
            tp.printData();
        }
    }
}
