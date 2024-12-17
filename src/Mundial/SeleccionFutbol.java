package Mundial;

import RepasoFunciones.ArrayList;

/*public class Seleccion {
    
    private int id;
    private String nombre;
    private ArrayList<Persona> integrantes; 
    
    public Seleccion(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.integrantes = new ArrayList<Persona>(); 

    }

    public void listarIntegrantes(){
         
        for(int i = 0; i <this.integrantes.size(); i++){
            System.out.println(this.integrantes.get(i));
        }

    }

    /*public void anyadir(Persona p ){
        this.integrantes.add(p);
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
    }

    @Override
    public String toString() {
        return "Seleccion [id=" + id + ", nombre=" + nombre + "]";
    } 
    
}*/
import java.util.ArrayList;

public class SeleccionFutbol {
    private int id;
    private String nombre;
    private ArrayList<Persona> integrantes;

    public SeleccionFutbol(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    public boolean anadirPersona(Persona p) {
        if (!integrantes.contains(p)) {
            integrantes.add(p);
            return true;
        }
        return false;
    }

    public boolean borrarPersona(int id) {
        return integrantes.removeIf(p -> p.getId() == id);
    }

    public void listarIntegrantes() {
        for (Persona p : integrantes) {
            System.out.println(p);
        }
    }

    public void listarFutbolistasSobrepeso() {
        for (Persona p : integrantes) {
            if (p instanceof Futbolista && p.tieneSobrepeso()) {
                System.out.println(p);
            }
        }
    }
}

