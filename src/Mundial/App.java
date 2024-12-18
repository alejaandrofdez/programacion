package Mundial;

public class App {
    
    public static void main(String[] args) {
        /* Persona p = new Persona();*/ 
        Futbolista f = new Futbolista(0, null, null, null, 0, 0, 0, null);
        Entrenador e = new Entrenador(0, null, null, null, 0, 0, 0);

        Seleccion s = new Seleccion(1, "Española");
        Seleccion s = new Seleccion(2, "Argentina");
        Mundial m = new Mundial(1, 2022);

        
        s.anyadir(f);
        s.anyadir(e);
        s.anyadir(f);

        s.borrar(0);

    }
}
