package PruebaPractica6Recu1;

public class LibroFisico extends Libro {
    
    private String isbn;
    private String estado;
    
    
    public LibroFisico(String titulo, String autor, int año, int numPaginas, String isbn, String estado) {
        super(titulo, autor, año, numPaginas);
        this.isbn = isbn;
        this.estado = estado;
    
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getEstado() {
        return isbn;
    }

    public void setEstado(String isbn) {
        this.isbn = isbn;
    }
    
   

    @Override
    public void mostraInfo(){
        super();
        System.out.println("ISBN: "+ isbn);
        System.out.println("Estado: "+ estado);
    }
    
    
    
}
