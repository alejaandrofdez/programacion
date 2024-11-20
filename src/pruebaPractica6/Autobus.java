package pruebaPractica6;

public class Autobus extends Vehiculos{
    
    private double precioKm;
    private double cantKmAl;
    private double cantKmDev;
    
    public Autobus(String matricula, boolean alquiler, double precioKm, double cantKmAl, double cantKmDev) {
        super(matricula, alquiler);
        this.precioKm = precioKm;
        this.cantKmAl = cantKmAl;
        this.cantKmDev = cantKmDev;
    }
    public Autobus(){
        super();
        this.precioKm = 3;
        this.cantKmAl = 100;
        this.cantKmDev = 500;
        
    }

    public double getPrecioKm() {
        return precioKm;
    }

    public void setPrecioKm(double precioKm) {
        this.precioKm = precioKm;
    }

    public double getCantKmAl() {
        return cantKmAl;
    }

    public void setCantKmAl(double cantKmAl) {
        this.cantKmAl = cantKmAl;
    }

    public double getCantKmDev() {
        return cantKmDev;
    }

    public void setCantKmDev(double cantKmDev) {
        this.cantKmDev = cantKmDev;
    }

    @Override
    public String toString() {
        return "Autobus [precioKm=" + precioKm + ", cantKmAl=" + cantKmAl + ", cantKmDev=" + cantKmDev + "]";
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
        }
        else{
            this.cantKmAl = 100;
            this.cantKmDev = 500;
            alquiler = false;
        }

    }

    public void calcularPrecio(){

        this.precioKm = 3;
        this.cantKmAl = 100;
        this.cantKmDev = 500;
        System.out.println("Precio Autobus: "+ precioKm*(cantKmDev-cantKmAl));
    }


}

