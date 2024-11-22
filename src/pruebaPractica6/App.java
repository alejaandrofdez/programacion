package pruebaPractica6;


public class App {
    
    public static void main(String[] args) throws Exception{
        
        
        
        Autobus a1 = new Autobus("6547DDD", 0.50);
        a1.alquilar(100000);
        System.out.println(a1);
        
        if (!a1.alquilar(100000)) {
            System.out.println("error");
        }

        a1.devolver(100300);
        System.out.println(a1);

        


        Tractor t1 = new Tractor();
        System.out.println(t1);

        


        /*System.out.println( "El alquiler es: "+ calcularPrecio() + );



    
        Autobus a2 = new Autobus();
        System.out.println(a2);*/



    }
}
