package pl.javastart.library.app;

import pl.javastart.library.model.Book;

class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.7";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010,
                296, "Greg", "9843423424243234");

        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch",
                2009, 352, "Helion", "9843423424223234");

        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Ber Bates, Katherine Sierra", 2008, 851,
                "McGraw-Hill Osborne Media");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
    }
}


