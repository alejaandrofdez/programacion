public class diseño1 {
    public static void main(String[] args) throws Exception {
        for(int i =0;i<5;i++) {
            for(int j=5;j>0;j--){
                if (i<j) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
