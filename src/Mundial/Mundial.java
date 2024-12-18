package Mundial;

public class Mundial {
    
    private int id;
    private int anyo;
    
    public Mundial(int id, int anyo) {
        this.id = id;
        this.anyo = anyo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    public boolean anyadirSeleccion(Seleccion s){

        return true;

    }

    public boolean quitarSeleccion(int id){

        return false;
    }

    public Seleccion getSeleccion(int id){

    }

    public void listarSelecciones(){

        System.out.println();
    }

    

    
}
