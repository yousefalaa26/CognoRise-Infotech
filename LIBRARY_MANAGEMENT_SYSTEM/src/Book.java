public class Book {
    private String title;
    private String author;
    private boolean status;

    public Book(String title, String author, boolean status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean getStatus() {
        return status;
    }

    public void displayBook(){
        System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nAvailable: "+getStatus());
    }
}
