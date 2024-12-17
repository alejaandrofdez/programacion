package Mundial;

public class Entrenador extends Persona {
    
    private int idFederacion;
    
    public Entrenador(int id, String nombre, String apellidos, String fechaNac, double peso, double altura, int idFederacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.idFederacion = idFederacion;
    }
    
    @Override
    public void viajar() {
        System.out.println("El entrenador viaja con el equipo.");
    }
    
    @Override
    public String toString() {
    return super.toString() + ", ID Federacion: " + idFederacion;
    }
    
    
    
}
