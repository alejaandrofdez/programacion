package Mundial;

 public abstract class Masajista extends Persona implements Integrante {
    protected String titulacion;
    public static int maxPersona= 1;

    public Masajista(int id, String nombre, String apellidos, String fechaNac, double peso, double altura,
            String titulacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    
    
}