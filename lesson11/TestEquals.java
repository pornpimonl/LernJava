package lesson11;

class TestEquals {
    public static void main(String[] args) {
        String s1 = "java", s2 = "Java", s3 = "java";
        String str1 = new String("java");
        String str2 = new String("Java");
        String str3;
        str3 = str1;
        if (s1.equals(s2))
            System.out.println(s1 + "1" + s2);
        if (s1.equals(s3))
            System.out.println(s1 + "2" + s3);
        if (str1 == str2)
            System.out.println(str1 + "3" + str2);
        if (str1 == str3)
            System.out.println(str1 + "4" + str3);
        if (str1.equals(str2))
            System.out.println(str1 + "5" + str2);
        if (str1.equals(str3))
            System.out.println(str1 + "6" + str3);
        if (s1 == s3)
            System.out.println(s1 + "7" + s2);
    }
}
