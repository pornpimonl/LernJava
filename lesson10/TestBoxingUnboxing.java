package lesson10;

class TestBoxingUnboxing {
    public static void main(String[] args) {
        byte a=1;
        short b=2;
        int c=3;
        long d=4l;
        float e=5.0f;
        double f=6.0;
        char g='a';
        boolean h=true;

        //Boxing
        /*Byte aObj=new Byte(a);
        Short bObj=new Short(b);
        Integer cObj=new Integer(c);
        Long dObj=new Long(d);
        Float eObj=new Float(e);
        Double fObj=new Double(f);
        Character gObj=new Character(g);
        Boolean hObj=new Boolean(h);

        //Unboxing
        byte aUn=aObj.byteValue();
        short bUn=bObj.shortValue();
        int cUn=cObj.intValue();
        long dUn=dObj.longValue();
        float eUn=eObj.floatValue();
        double fUn=fObj.doubleValue();
        char gUn=gObj.charValue();
        boolean hUn=hObj.booleanValue();*/

        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
    }
}
