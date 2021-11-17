package code;

class Swap {
    int minSwap(int a[], int b[],int n){
        int count=0;
        for(int i=1;i<n;i++){
            if((a[i]<=a[i-1])||(b[i]<=b[i-1])){
                a[i]=a[i]+b[i];
                b[i]=a[i]-b[i];
                a[i]=a[i]-b[i];
                count++;
            }
        }
        for(int i=1;i<n;i++){
            if((a[i]<=a[i-1])||(b[i]<=b[i-1])){
                return -1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={6,7,5,0,1,7};
        int b[]={0,1,3,9,6,3};
        int n=a.length;
        Swap s = new Swap();
        System.out.println(s.minSwap(a, b, n));
    }
}
