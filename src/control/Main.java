package control;


import model.BookCatalog;
import model.Subject;

public class Main {

        public static void main(String[] args) {
        BookCatalog catalog = new BookCatalog ();
        catalog.addAuthor ("ELÍSABET", "BENAVENT");
        catalog.addAuthor ("ANDREW", "GRAHAM-DIXON");
        catalog.addAuthor ("IAN", "NATHAN");
        catalog.addBook("LOS ABRAZOS LENTOS", "SUMA DE LETRAS, S.L.", 2022, Subject.Novel, catalog.getAuthor(0));
        catalog.addBook("CARAVAGGIO. UNA VIDA SAGRADA Y PROFANA", "TAURUS", 2022, Subject.Art, catalog.getAuthor(1));
        catalog.addBook("GUILLERMO DEL TORO. EL LABERINTO FILMICO DE UN DIRECTOR PRODIGIOSO", "CÚPULA", 2022, Subject.Cinema, catalog.getAuthor(2));
        System.out.println("El catálogo contiene " + catalog.bookCount() + " libro(s)");
        System.out.println("El primer libro es " + catalog.getBook(0).getTitle());
        System.out.println("El autor del primer libro es " + catalog.getBook(0).getAuthor().getName());
        System.out.println("El segundo libro es " + catalog.getBook(1).getTitle()); catalog.removeBook(1);
        System.out.println("El catálogo contiene " + catalog.bookCount() + " libro(s)");
        System.out.println("");
        Author author = catalog.getAuthor(0);
        System.out.println(author.getName() + " tiene " + author.bookCount() + " libro(s)");
        System.out.println("Los libros vinculados a este autor son: ");
        for (int i=0; i<author.bookCount(); i++ ) {
            System.out.println(" - Libro " + i + ": " + author.getBook(i).getTitle());
        }
    }

}
