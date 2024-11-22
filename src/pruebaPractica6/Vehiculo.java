package pruebaPractica6;

public class Vehiculo {
    
    protected String matricula;
    protected boolean alquilado;
    
    public Vehiculo(String matricula, boolean alquilado) {
        this.matricula = "0000AAA";
        this.alquilado = false; // UTILIZAMOS EL CONSTRUCTOR POR DEFECTO, PARA CUANDO QUERAMOS INDICAR TRUE, SE CAMBIA AQUI
    }

    public Vehiculo(String m){
        super();
        this.matricula = m;
        //aqui no ponemos this.alquilado = false; porque ya lo utilizamos en el constructor 

    }
    public Vehiculo(Vehiculo v){
        this.matricula = v.matricula;
        this.alquilado =v.alquilado;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public boolean getAlquiler() {
        return alquilado;



    }

    /*public Vehiculo(){

        super();
        

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAlquiler() {
        return alquilado;
    }

    public void setAlquiler(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Vehiculos [matricula=" + matricula + ", alquiler=" + alquilado + "]";
    }

    public void alquilar(){
        if(!alquilado){
            alquilado  = true; 
           
            
        }else{
            System.out.println("Error, este vehiculo ya está alquilado");
        }

    }

    public void devolver(){
        if(!alquilado){
            
            System.out.println("Error, este vehiculo no está alquilado");
            
        }else{
            
        }
    }*/

   

}
