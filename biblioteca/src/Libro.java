public class Libro extends Publicacion {

    private int numPaginas;

    public Libro(int numPaginas, String autor, String titulo) {
        this.numPaginas = numPaginas;
        super(titulo, autor);
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.print(" Y el numero de paginas del libro es: " + numPaginas);
    }

}
