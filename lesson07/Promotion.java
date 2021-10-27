package lesson07;

import java.util.Calendar;

public class Promotion {
    Calendar cal = Calendar.getInstance();
    private int month=cal.get(Calendar.MONTH)+1;
    private String promotion ="Buy1Scoop";

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int month){
        if((month<0)||(month>12)){
            System.out.println("Error");
            System.exit(0);
        }else
        this.month=month;
    }

    public String getPromotion(){
        return this.promotion;
    }

    public void setPromotion(String promotion){
        this.promotion=promotion;
    }

    public String monthString(int monthNumber){
        switch(monthNumber){
            case 1 : return "Jan";
            case 2 : return "Feb";
            case 3 : return "Mar";
            case 4 : return "Apr";
            case 5 : return "May";
            case 6 : return "Jun";
            case 7 : return "Jul";
            case 8 : return "Aug";
            case 9 : return "Sep";
            case 10 : return "Oct";
            case 11 : return "Nov";
            case 12 : return "Dec";
            default : return "Eror";

        }
    }
}
