package PruebaPractica6Recu1;

public class Libro {
    
    protected String titulo;
    protected String autor;
    protected int año;
    protected int numPaginas;

    
    public Libro(String titulo, String autor, int año, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.numPaginas = numPaginas;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Libro (String l){
        super();
        this.titulo = l; 
        this.autor = l;
       

    }

    public void mostrarInfo() {
       
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Año: "+ año);
        System.out.println("NumPaginas: "+ numPaginas);
    }

    

    
        


}
