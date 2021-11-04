package lesson14;

public class Officer implements Form{
    public void apply(String name,String sername,String address,int applyid){
        System.out.println("ID : "+applyid+" Name : "+name+"Address : "+address+"Sername : "+sername);
    }
    public void resign(int id){

    }
}
