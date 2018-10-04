package by.yaroshuk.miniLibrary;

import java.util.List;

public class LibraryBuisinessLogic {
    private Library library;
    private FileDataStoreg storeg;

    public LibraryBuisinessLogic() {
        storeg = new FileDataStoreg("books.txt");
        List<Book> books = storeg.read();
        library = new Library(100, books);
    }

    public long add(String name, String author){
        long id = library.add(name, author);
        storeg.save(library.list());
        return id;
    }

    public boolean delete (long id) {
        boolean delete = library.delete(id);
        storeg.save(library.list());
        return delete;
    }

    public Book search(long id) {
        return library.search(id);
    }

    public List<Book> list() {
        return library.list();
    }
}
