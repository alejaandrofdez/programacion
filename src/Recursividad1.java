public class Recursividad1 {
    public static void main(String[] args) {
        
       
    }
    /*public static void m(int x){
        m(x-1);
    }*/
    public static int metodoInfinito(int n){
        
        if(n==0)return 1;
        int t=metodoInfinito(n-1);
        return 1+t;
    }
}
