public class Recursividad2 {
    
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5};
        System.out.println("Suma total: "+suma1(numeros));
        //System.out.println("Suma total: "+suma_eficiente(numeros));

        ArrayMenosUno(numeros); //{2,3,4,5}
    }


    //public static int suma1 (int[] numeros){}

    // ESTA ES PARA LA RECURSIVIDAD
    public static int suma(int[] Arr){
        if(Arr.length ==1 )return Arr[0];
        if(Arr.length ==1 )return Arr[0];
        int[] ArrayMenosUno = elemento_menos(Arr);
        return Arr[0]+suma(ArrayMenosUno);
    }

    public static int [] elemento_menos (int [] Arr){

        if(Arr.length==0) return Arr;

        int[] ArrayMenosUno = new int [arr.length -1];

        for(int i = 1; i < Arr.length; i++){

            ArrayMenosUno[i-1] = Arr[i];
        }

        return ArrayMenosUno;
    
    }
    
    
}

