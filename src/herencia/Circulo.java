package herencia;

public class Circulo {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
    

}
