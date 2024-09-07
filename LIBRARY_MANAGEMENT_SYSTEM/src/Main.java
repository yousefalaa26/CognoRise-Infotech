public class Main {
    public static void main(String[] args) {
        Book powerOfHabit = new Book("The power of habit", "Charles Duhigg", true);
        Book atomicHabits = new Book("Atomic habits", "James Clear", true);
        Book utopia = new Book("Utopia", "Ahmed Khaled Tawfeeq", true);
        Book ecaros = new Book("مثل إيكاروس", "Ahmed Khaled Tawfeeq", true);
        Book programming = new Book("The c++ programming language", "Bjarne Stroustrup", true);
        Book cleanCode = new Book("Clean code", "Robert Martin", true);

        libraryCatalog catalog= new libraryCatalog();
        catalog.addBook(utopia);
        catalog.addBook(powerOfHabit);
        catalog.addBook(atomicHabits);
        catalog.addBook(ecaros);
        catalog.addBook(programming);
        catalog.addBook(cleanCode);

        catalog.searchByTitle("The power of habit");
        catalog.searchByTitle("random book");

        catalog.searchByAuthor("James Clear");
        catalog.searchByAuthor("random author");

        catalog.checkout("Atomic habits");
        catalog.checkout("random book");

        catalog.searchByTitle("Atomic habits");

        catalog.returnBook("Atomic habits");
        catalog.returnBook("random book");

        catalog.searchByTitle("Atomic habits");
    }
}