package lesson10;

class ArrayOutOfBound {
    public static void main(String[] args) {
        char[] ch;
        ch=new char[3];
        ch[0]='A';
        ch[1]='B';
        ch[2]='C';
        //ch[3]='D';
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
