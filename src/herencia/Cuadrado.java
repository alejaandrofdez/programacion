package herencia;



public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado(){
        
        super();
        this.lado = 0;
    }

    public Cuadrado(String color, double grosor,double lado){
        super(color, grosor);
        this.lado = 1;

    }

    public Cuadrado(Cuadrado color){

        super((Figura) color);
        this.lado = color.lado;

    }
    

    @Override
    public String toString(){
        return "Cuadrado [lado =" +lado+ "]";
    }
}
