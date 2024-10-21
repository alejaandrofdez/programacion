
public class Persona {

    //No hay main, va en el archivo principal
     private String nombre;
     private String fecha;   

    public Persona( String nombre , String fecha){
        //ponemos el this para que haga referencia a estos
        this.nombre = nombre;
        this.fecha = fecha;
    }
    //Ponemos el toString para que nos muestre los datos por consola
    public String toString(){
        return nombre + " " + fecha;
    }
}
