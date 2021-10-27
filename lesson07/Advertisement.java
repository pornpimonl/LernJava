package lesson07;

public class Advertisement {
    public static void main(String[] args) {
        String adverText;

        Banner banner = new Banner();
        adverText = banner.getText();
        System.out.println(adverText);
        banner.setText("Test2");
        adverText = banner.getText();
        System.out.println(adverText);
    }    
}
