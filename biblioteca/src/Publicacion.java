public class Publicacion {

    protected String titulo;
    protected String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrarFicha(){
        System.out.println("El titulo del libro es: " + this.titulo + 
        " y el autor es: " + this.autor );
    }

}
