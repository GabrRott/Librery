package libro.datos;

public class LibroDatos {
    public  String ISBN;
    public String Titulo;
    public String Autor;
    public int Pagina;

    public LibroDatos() {
    }

    public LibroDatos(String ISBN, String Titulo, String Autor, int Pagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Pagina = Pagina;
    }

    @Override
    public String toString() {
        return "LibroDatos{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Pagina=" + Pagina + '}';
    }

   
    
    
}
