package pruebaPractica6;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Tractor extends Vehiculos{
    
    private double precioDia;
    private LocalDateTime fechaAl;
    private LocalDateTime fechaDev;

    public Tractor(String matricula, boolean alquiler, double precioDia, double fechaAl, double fechaDev) {
        super(matricula, alquiler);
        this.precioDia = precioDia;
        this.fechaAl = LocalDateTime.now();
        this.fechaDev = LocalDateTime.plusDays(3);
    }
    public Tractor(){
        super();
        this.precioDia = 50;
        this.fechaAl = LocalDateTime.now();
        this.fechaDev = LocalDateTime.plusDay();
    }
    
    public double getPrecioDia() {
        return precioDia;
    }
    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }
    public LocalDateTime getFechaAl() {
        return fechaAl;
    }
    public void setFechaAl(LocalDateTime fechaAl) {
        this.fechaAl = fechaAl;
    }
    public LocalDateTime getFechaDev() {
        return fechaDev;
    }
    public void setFechaDev(LocalDateTime fechaDev) {
        this.fechaDev = fechaDev;
    }
    

    
    @Override
    public String toString() {
        return "Tractor [precioDia=" + precioDia + ", fechaAl=" + fechaAl + ", fechaDev=" + fechaDev + "]";
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
            this.fechaAl = LocalDateTime.now();
            this.fechaDev = LocalDateTime.plusDays(3);
            alquiler = false;
        }

    }

    public void calcularPrecio(){

        this.precioDia= 50;
        this.fechaAl = LocalDateTime.now();
        this.fechaDev = LocalDateTime.plusDays(3);

        System.out.println("Precio Tractor: "+precioDia*ChronoUnit.DAYS.between(fechaAl,fechaDev) );
    }
}
