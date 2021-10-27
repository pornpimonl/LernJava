package lesson07;

public class IceCreamPromotion {
    public static void main(String[] args) {
        int myMonth;
        String myPromotion;

        Promotion promotion=new Promotion();
        myMonth=promotion.getMonth();
        myPromotion=promotion.getPromotion();

        System.out.println(promotion.monthString(myMonth));
        System.out.println(myPromotion);

        promotion.setMonth(13);

        promotion.setMonth(12);
        promotion.setPromotion("Babana");
        myMonth=promotion.getMonth();
        myPromotion=promotion.getPromotion();

        System.out.println(promotion.monthString(myMonth));
        System.out.println(myPromotion);
    }
}
