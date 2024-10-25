package RepasoFunciones;

import java.util.ArrayList;
public class FuncionBingo {

    public static void main(String[] args) throws Exception{
        
        /*Cada fila tiene 5 numeros y 4 ocultos
         * 15 numeros en el carton
         * Es una matriz
         * 3x9
         * numeros (1/90) aleatorios
         * 9 columnas/3 filas
         * tres columnas con un solo numero, las demas con dos
         */
           
         //Numeros aleatorios
        
        
        
            
        /*  
        int[][] carton = generarCarton();

        for(int i = 0; i < carton.length; i++){

            for(int j = 0; j < carton[i].length; j++){
                System.out.print(carton[i][j]);
            }
        
            System.out.println();
            
        }*/



    }

    public static int [][] generarCarton(){

        ArrayList<Integer> cartonFila0 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila1 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila2 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila3 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila4 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila5 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila6 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila7 = new ArrayList<Integer>();
        ArrayList<Integer> cartonFila8 = new ArrayList<Integer>();


        


        //int [][] carton ={{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};

        
        for(int i = 0; i < 15; i++){

            
                int numeroAleatorio = (int)Math.floor(Math.random()*90+1);

                if(numeroAleatorio >= 1 && numeroAleatorio < 10){
                    if(cartonFila0.size()== 0){
                        cartonFila0.add(numeroAleatorio);
                    }
                    else{
                        carton[0][1] = numeroAleatorio;

                    }

                }
                else if(numeroAleatorio >= 10 && numeroAleatorio < 20){

                }
                else if(numeroAleatorio >= 20 && numeroAleatorio < 30){
                    
                }
                else if(numeroAleatorio >= 30 && numeroAleatorio < 40){
                    
                }
                else if(numeroAleatorio >= 40 && numeroAleatorio < 50){
                    
                }
                else if(numeroAleatorio >= 50 && numeroAleatorio < 60){
                    
                }
                else if(numeroAleatorio >= 60 && numeroAleatorio < 70){
                    
                }
                else if(numeroAleatorio >= 70 && numeroAleatorio < 80){
                    
                }
                else if(numeroAleatorio >= 80 && numeroAleatorio <= 90){
                    
                }



                carton[i][j] = numeroAleatorio;
            }

           
            System.out.println();
        }

        return carton;
        
    }
    

}