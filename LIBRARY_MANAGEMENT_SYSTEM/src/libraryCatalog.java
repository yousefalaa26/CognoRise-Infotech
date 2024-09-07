import java.util.ArrayList;

public class libraryCatalog {
    private ArrayList<Book> books = new ArrayList <> ();

    public void addBook (Book book) {
        if(!books.contains(book)) {
            books.add(book);
        }
        else {
            System.out.println(book.getTitle()+" It is already in the library catalog");
        }
    }

    public void searchByTitle (String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title) && book.getStatus()) {
                book.displayBook();
                return;
            }
        }
        System.out.println(title+" is not in the library catalog");
    }

    public void searchByAuthor (String Author) {
        for(Book book : books) {
            if(book.getAuthor().equalsIgnoreCase(Author) && book.getStatus()) {
                book.displayBook();
                return;
            }
        }
        System.out.println(Author+" is not in the library catalog");
    }

    public void checkout (String title) {
        for(Book book : books) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                book.setStatus(false);
                System.out.println(title+" has been checked out");
                return;
            }
        }
        System.out.println(title+" is not found in the library catalog");
    }

    public void returnBook (String title) {
        for(Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)){
                book.setStatus(true);
                System.out.println(title+" has been returned");
                return;
            }
        }
        System.out.println(title+" is not found in the library catalog");
    }

}
