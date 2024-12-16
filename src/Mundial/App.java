package Mundial;

public class App {
    
    public static void main(String[] args) {
        /* Persona p = new Persona();*/ 
        Futbolista f = new Futbolista(1, null);
        Entrenador e = new Entrenador();

        Seleccion s = new Seleccion(1, "Española");
        
        s.anyadir(f);
        s.anyadir(e);
        s.anyadir(f);

        s.borrar(0);

    }
}
