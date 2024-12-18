package Mundial;

import RepasoFunciones.ArrayList;

public class Seleccion {
    
    private int id;
    private String nombre;
    private ArrayList<Persona> integrantes; 
    
    public Seleccion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.integrantes = new ArrayList<Persona>(); 

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }

    public boolean asignarMundial(Mundial mundial){
        
        boolean encontrado = false;

        for(int i = 0; i<this.seleccion.size() && !encontrado; i++){
            
            if (this.seleccion.get(seleccion).getId() == s.getId()) {
                encontrado= true;
            }
        }
        if (!encontrado) {
            this.mundial.add(seleccion);
        }
       

    }

    public boolean quitarMundial(){
        return false;
    
    }

    public void anyadirPersona(Persona persona ){
        this.integrantes.add(persona);
    }

    public void anyadir(Persona p){

        boolean encontrado = false;

        for(int i = 0; i<this.integrantes.size() && !encontrado;i++){
             
            if (this.integrantes.get(i).getId()==p.getId()) {
                encontrado= true;
            }
        }
        if (!encontrado) {
            this.integrantes.add(p);
        }
        
    }
    public void borrar(int id){
        boolean encontrado = false;

        for(int i = 0; i<this.integrantes.size() && !encontrado;i++){
             
            if (this.integrantes.get(i).getId()==id) {
                encontrado= true;
                this.integrantes.remove(i);
            }
            
        }
    }

    public Entrenador getEntrenador(){


    }
        

    public Fisoterapeuta getFisoterapeuta(){
        
       
    }



    public void listarIntegrantes(){
         
        for(int i = 0; i <this.integrantes.size(); i++){
            System.out.println(this.integrantes.get(i));
        }

        System.out.println("Integrantes: "+this);

    }

    public void listarFutbolistasConSobrepeso(){

        for(int i = 0; i<this.integrantes.size(); i++){

            Persona p = this.integrantes.get(i);
            Futbolista f = null; 
            Entrenador e = null;

            if (p instanceof Futbolista) {

                Futbolista f = (Futbolista)p;
                if (f.tieneSobrepeso()) {
                    System.out.println(this.integrantes.get(i));
                }
            }
            else{
                e = (Entrenador)p;
                if (e.tieneSobrepeso()) {
                    System.out.println(this.integrantes.get(i));
                }

            }

            
        }
        System.out.println("Jugadores con sobre peso: "+ this);
    }
    

    @Override
    public String toString() {
        return "Seleccion [id=" + id + ", nombre=" + nombre + "]";
    } 
    
}


