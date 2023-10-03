import java.util.LinkedList;
public class Biblioteca {
    /**
     * Definimos y creamos lista de libros disponibles
     * complejidad O(1) constante
     */
    LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    /**
     * Metodo para registrar un libro en la biblioteca
     * complejidad O(1) constante
     * @param libro objeto libro
     */
    public void registrarLibro (Libro libro){
        librosDisponibles.add(libro);
    }

    /**
     * metodo para buscar libro
     * @param titulo titulo del libro a buscar
     * @return de encontrar el libro se retornará el libro
     * 0(N) complejidad lineal
     */
    public Libro buscarLibro (String titulo){
        for(Libro libro: librosDisponibles){
            if(libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    /**
     * se muestran lis libros disponibles en la biblioteca
     * @return todos los libros disponibles
     * complejidad O(1) constante
     */
    public LinkedList<Libro> mostrarLibrosDisponibles (){
        return librosDisponibles;
    }
}
