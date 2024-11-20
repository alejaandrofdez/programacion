package pruebaPractica6;

public class Vehiculos {
    
    protected String matricula;
    protected boolean alquiler;
    
    public Vehiculos(String matricula, boolean alquiler) {
        this.matricula = matricula;
        this.alquiler = alquiler;
    }
    public Vehiculos(){

        super();
        

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAlquiler() {
        return alquiler;
    }

    public void setAlquiler(boolean alquiler) {
        this.alquiler = alquiler;
    }

    @Override
    public String toString() {
        return "Vehiculos [matricula=" + matricula + ", alquiler=" + alquiler + "]";
    }

    public void alquilar(){
        if(!alquiler){
            alquiler  = true; 
           
            
        }else{
            System.out.println("Error, este vehiculo ya está alquilado");
        }

    }

    public void devolver(){
        if(!alquiler){
            
            System.out.println("Error, este vehiculo no está alquilado");
            
        }else{
            
        }
    }

   


}
