package lesson11;

class TestConvertString {
    public static void main(String[] args) {
        String word = "Java Programming Language";
        String s1 = "123",s2 = "350 Baht.";
        System.out.println("\""+word+"\""+word.toUpperCase());
        System.out.println("\""+word+"\""+word.toLowerCase());
        System.out.println("\""+s1+"\""+Integer.parseInt(s1));
        System.out.println("\""+s2+"\""+Double.parseDouble(s2.substring(0, 3)));
    }
}
