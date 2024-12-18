package Mundial;

public class Futbolista extends Persona implements Deportista {
    
    private int dorsal;
    private String demarcacion;



    public Futbolista(int id, String nombre, String apellidos, String fechaNac, double peso, double altura,int dorsal, String demarcacion) {
        super(id, nombre, apellidos, fechaNac, peso, altura);
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
        public void entrenar() {
            System.out.println("El futbolista está entrenando.");
        }
    
        @Override
        public void jugarPartido() {
            System.out.println("El futbolista juega un partido en la posición " + demarcacion);
        }
    
        @Override
        public boolean tieneSobrepeso() {
            double imc = getPeso() / (getAltura() * getAltura());
            return imc >= 22; // Límite para futbolistas
        }
    
        @Override
        public String toString() {
            return super.toString() + ", Dorsal: " + dorsal + ", Demarcación: " + demarcacion;
        }
    
    
    


}
