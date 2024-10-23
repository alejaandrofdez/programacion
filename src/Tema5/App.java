
public class App {
    public static void main(String[] args) throws Exception {
        
        int i = 0;
        double precio = 1.2;

        Persona p1 = new Persona("Javi", "10/08/1999");
        Persona p2 = new Persona("Paco", "10/04/1999");

        System.out.println(p1.toString());
        
        int[] numeros = {1,5,6,50};
        Persona[] personas = {p1,p2};

        for(int = 0; i<personas.lenght; i++){
                System.out.println(personas[i]);
        }

    }
}