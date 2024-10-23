package Tema5;

public class Pru {
    public static void main(String[] args) throws Exception {
        

    private int edad;

    public Pru(int e){
        this.edad = e;
    }

    public void setEdad(int edad){

        if (edad>= 0 && edad <=100) {
            this.edad = edad;
        }
    } 

    public String toString(){
        return "Edad: "+ this.edad;
    }

    }

   
}
