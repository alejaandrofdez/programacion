package Lectura;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws Exception {
        
        /*FileReader fr  = new FileReader("prueba.txt");

        int data = fr.read();
        
    

        while (data!= -1) {
            System.out.println((char)data);
            data= fr.read();

        }
        fr.close();



        System.out.println("Tengo mil lineas mas de codigo que ejecutar en el flujo de mi programa ");*/


        //LINEA A LINEA
        FileReader fr = null;
        try{
            fr  = new FileReader("prueba.txt");
            //Generar un flujo de lectura linea a linea a un fichero de texto
            //dispone del metodo redLine()

            BufferedReader br = new BufferedReader(fr);

            //lectura de fichero
            String linea;
            while ((linea= br.readLine()) != null) {
            
            System.out.println(linea);
            }
            br.close();
        }
        catch(IOException e){

            System.out.println("Error de lectura: "+ e.toString());
            throw new NullPointerException();
        }
        fr.close();

        //Escritura de caracter a caracter y linea a linea

        FileWriter fw = null;

        try {
            fw = new FileWriter("escritura.txt", true);

            for(int i = 65; i<91; i++){
                //caracter a caracter
                fw.write((char)i);
            }
            fw.close();

        } catch (IOException e) {
            System.out.println("Error de escritura: "+ e.toString());
            throw new NullPointerException();
        }
        
    }


    

    
}