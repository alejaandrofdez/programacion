package Mundial;

public class Entrenador extends Persona implements Deportista, Integrante{
    
    private int idFederacion;
    public static int maxPersona= 1;
    
    public Entrenador(int id, String nombre, String apellidos, String fechaNac, double peso, double altura, int idFederacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
        this.idFederacion = idFederacion;
    }
    
    
    public int getIdFederacion() {
        return idFederacion;
    }


    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }


    @Override
    public void viajar() {
        System.out.println("El entrenador con id: "+ idFederacion + "viaja con la seleccion");
    }

    @Override
    public boolean asignarSeleccion(Seleccion s){
        return false;
    }

    @Override

    public boolean quitarSeleccion(int idFederacion){
       return false;
       
    }

    @Override
    public boolean tieneSobrepeso() {
        double imc = getPeso() / (getAltura() * getAltura());
        return imc >= 25; 
    }


    @Override
    public String toString() {
    return super.toString() + ", ID Federacion: " + idFederacion;
    }


    @Override
    public void comer() {
        
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }


    @Override
    public void dormir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'dormir'");
    }


    @Override
    public void concentrarse() {
        
        throw new UnsupportedOperationException("Unimplemented method 'concentrarse'");
    }


    @Override
    public void entrenar() {
        
        throw new UnsupportedOperationException("Unimplemented method 'entrenar'");
    }


    @Override
    public void jugarPartido() {
        
        throw new UnsupportedOperationException("Unimplemented method 'jugarPartido'");
    }


    @Override
    public boolean tieneSobrepeso() {
       
        throw new UnsupportedOperationException("Unimplemented method 'tieneSobrepeso'");
    }
    
    
    
}
