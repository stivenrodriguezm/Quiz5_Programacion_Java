public class Libro {
    /**
     * definimos las variables privadas de titulo, autor y paginas(entero)
     * complejidad O(1) constante
     */
    private String titulo;
    private String autor;
    private int paginas;

    /**
     * creamos el objeto Libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param paginas numero de paginas del libro
     * complejidad O(1) constante
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * metodo get para el objeto Titulo
     * @return titulo del libro
     * complejidad O(1) constante
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * método set para establecer un titulo
     * @param titulo titulo del libro
     * complejidad O(1) constante
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * método get para obtener el autor del libro
     * complejidad O(1) constante
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * método set para establecer un autor del libro
     * complejidad O(1) constante
     * @param autor titulo del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * método get para obtener el numero de paginas del libro
     * complejidad O(1) constante
     * @return autor del libro
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * método set para establecer numero de paginas de un titulo
     * complejidad O(1) constante
     * @param paginas titulo del libro
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
