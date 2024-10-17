public class Rprimo {
    public static void main(String[] args) throws Exception{


        int[] numeros= {3,6,7,11}; /*Cantidad primos:3 */
        int cant =0;

        for(int i=0; i<numeros.length;i++){
            if (esPrimo(numeros[i])==true) {
                cant++;
            }
        }
        System.out.println("Hay"+cant+"numeros primos");


    } 
    public static boolean esPrimo( int numero){
        int cant=0;

        for(int i=numero;i>=1;i--){
            if (numero%i==0) {
                cant++;
            }

        }
        if (cant==2) {
           return true;
        }
        else{
             return false;
        }
       
     

}
}