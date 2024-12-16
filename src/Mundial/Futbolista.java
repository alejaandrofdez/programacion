package Mundial;

public class Futbolista extends Persona implements Deportista {
    
    private int dorsal;
    private String demarcacion;


    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    public int getDorsal() {
        return dorsal;
    }


    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }


    public String getDemarcacion() {
        return demarcacion;
    }


    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    


}
