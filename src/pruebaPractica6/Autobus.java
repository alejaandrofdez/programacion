package pruebaPractica6;

public class Autobus extends Vehiculo{
    
    private double precioKm; // como es un precio double
    private double cantKmAl;
    private double cantKmDev;


    public Autobus(){
        this.precioKm = 0.21;
        this.cantKmAl = 0;
        this.cantKmDev = 0;
    }
    
    public Autobus(String m, double precio){// no metemos los km finales porque no los sabemos
        super(m);
        this.precioKm = precio;
       
    }
    public Autobus(Autobus a){// no metemos los km finales porque no los sabemos
        super(a);
        this.precioKm = a.precioKm;
        this.cantKmAl = a.cantKmAl;
        this.cantKmDev = a.cantKmDev;
    }
        

    public double getPrecioKm() {
        return this.precioKm;
    }

    public void setPrecioKm(double nuevo) {
        this.precioKm = nuevo;
    }

    public double getCantKmAl() {
        return this.cantKmAl;
    }

    public void setCantKmAl(double nuevo) {// set va con void
        this.cantKmAl = nuevo;
    }

    public double getCantKmDev(double n) {
        return this.cantKmDev;
    }

    public void setCantKmDev(double n) {
        this.cantKmDev = n;
    }

    //utilizamos el boolean porque queremos que nos muestre si esta alquilado
    public boolean alquilar(double cantKmAl){//para alqilar necesitamos saber los km ini, por tanto un doble
        
        if (!super.alquilado) {
            super.alquilado= true;
            this.cantKmAl=cantKmAl;
            return true;
        }
        return false;
    
    }
    public boolean devolver(double cantKmDev){//para alqilar necesitamos saber los km ini, por tanto un doble
        
        if (!super.alquilado) {
            super.alquilado= false;
            this.cantKmDev=cantKmDev;
            return true;
        }
        return false;
    
    }
    public double calcularPrecio(){
        return (this.cantKmDev);
    }

    @Override
    public String toString() {
        return "Autobus [precioKm=" + this.precioKm + ", cantKmAl=" + this.cantKmAl + ", cantKmDev=" + this.cantKmDev + "]";
    }
    
    /*public void alquilar(){

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
    }*/


}

