public class Libro {
    /**
     * definimos las variables privadas de titulo, autor y paginas(entero)
     * 0(N) complejidad lineal
     */
    private String titulo;
    private String autor;
    private int paginas;

    /**
     * creamos el objeto Libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param paginas numero de paginas del libro
     * 0(N) complejidad lineal
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * metodo get para el objeto Titulo
     * @return titulo del libro
     * 0(N) complejidad lineal
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * método set para establecer un titulo
     * @param titulo titulo del libro
     * 0(N) complejidad lineal
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * método get para obtener el autor del libro
     * 0(N) complejidad lineal
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * método set para establecer un autor del libro
     * 0(N) complejidad lineal
     * @param autor titulo del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * método get para obtener el numero de paginas del libro
     * 0(N) complejidad lineal
     * @return autor del libro
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * método set para establecer numero de paginas de un titulo
     * 0(N) complejidad lineal
     * @param paginas titulo del libro
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
