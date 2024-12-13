package PruebaPractica6Recu1;

public class LibroElectronico extends Libro {
    
    private String tamaño;
    private double formato;
   
    public LibroElectronico(String titulo, String autor, int año, int numPaginas, String tamaño, double formato) {
        super(titulo, autor, año, numPaginas);
        this.tamaño = tamaño;
        this.formato = formato;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getFormato() {
        return formato;
    }

    public void setFormato(double formato) {
        this.formato = formato;
    }


    @Override
    public void mostraInfo(){
        super();
        System.out.println("Formato: "+ formato);
        System.out.println("Tamaño: "+ tamaño);
    }
   
}
