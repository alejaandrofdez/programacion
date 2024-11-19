package herencia;

public class Figura {
    
    protected String color;
    protected double grosor;

    public Figura(String color,double grosor){
        this.color = color;
        this.grosor = grosor;
    }

    public Figura(Figura figura){
        this.color = figura.color;
        this.grosor = figura.grosor;

    }

    public String getColor(){
        return color;

    }

    public void setColor(String color){
        this.color = color;

    }

    public double getGrosor(){
        return grosor;
    }

    public void setGrosor(double grosor){
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Figura [color=" + color + ", grosor=" + grosor + "]";
    }
    




}
