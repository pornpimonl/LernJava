package lesson09;

class TestNestedFor {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=3;i++){
            System.out.println(i);
            for(j=1;j<=i;j++)
                System.out.println(j);
                System.out.println();
                
        }    
        
    }
}
