public class Remplazar {

    public static void main(String[] args)  throws Exception{
        

        String frase = "castillo amarillo";

        String nuevaFrase = frase.replace(oldChar:'a', newChar:'-');

        System.out.println(nuevaFrase);

        for( int i = 0; i<frase.length(); i++){

            //frase[]
            if(frase.charAt(i) == 'a'){
                
                System.out.println("-");
            }
            else{
                System.out.println(frase.charAt(i));
            }
        }

    }

}