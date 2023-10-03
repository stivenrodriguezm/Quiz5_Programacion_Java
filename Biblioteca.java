import java.util.LinkedList;
public class Biblioteca {
    LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();
    public void registrarLibro (Libro libro){
        librosDisponibles.add(libro);
    }
    public void buscarLibro (String titulo){

    }
}
