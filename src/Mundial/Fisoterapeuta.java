package Mundial;

public class Fisoterapeuta  extends Masajista {
    
    private int anyosExperiencia;

    public Fisoterapeuta(int id, String nombre, String apellidos, String fechaNac, double peso, double altura,
            String titulacion, int anyosExperiencia) {
        super(id, nombre, apellidos, fechaNac, peso, altura, titulacion);
        this.anyosExperiencia = anyosExperiencia;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    @Override
    public void concentrarse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'concentrarse'");
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

    @Override
    public void dormir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dormir'");
    }

    
}
