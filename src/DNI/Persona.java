package DNI;

public class Persona {

     private String nombre;
     private String apellidos;
     private String fechaNac;
     private int edad;
     private Dni dni;
     

    public Persona(String n, String ape, String fec, int edad){

        this.nombre = n;
        this.apellidos = ape;
        this.fechaNac = fec;
        this.edad = edad;


    }
    //ponemos getNombre para que muestre y opere los datos de public String toString
    
    public String getNombre(){

        return this.nombre;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public String getApellidos(){

        return this.apellidos;
    }

    public void setApellidos(String ape){
        this.apellidos = ape;
    }

    public String getFecha(){

        return this.fechaNac;
    }

    public void setFecha(String fec){
        this.fechaNac = fec;
    }

    public int getEdad(){

        return this.edad;
    }

    public void setEdad(int ed){
        this.edad = ed;
    }

    public void setDni(Dni d){

        this.dni = d;
    }

    public Dni getDni(){

        return this.dni;
    }


    

    // lo utilizamos para visualizar
    public String toString(){

         return "Nombre: " + this.nombre +
                "Apellidos: " + this.apellidos +
                "fecha Nacimiento: " + this.fechaNac +
                "Edad: " + this.edad;
            
                  
    }

}

