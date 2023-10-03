public class Principal {
    public static void main(String[] args){
        /**
         * crear biblioteca llamada bibliotecaKonradLorenz
         * 0(N) complejidad lineal
         */
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();


        /**
         * Creamos los libros
         * 0(N) complejidad lineal
         */
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código DaVinci", "DanBrown", 656);
        Libro libro3 = new Libro("1984", "GeorgeOrwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R.Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);

        /**
         * agregar libros a la biblioeca creada anteriormente bibliotecaKonradLorenz
         * 0(N) complejidad lineal
         */
        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);

    }
}
