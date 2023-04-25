class library {
    String[] books;
    int no_of_Books = 0;

    library() {
        this.books = new String[100];
        this.no_of_Books = 0;
    }

    void addBook(String book) {
        this.books[no_of_Books] = book;
        no_of_Books++;
        System.out.println(book + " " + "has been added!");
    }

    void showBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This Book is not exist!");
    }
    void returnBook(String book){
       addBook(book);
    }
}

public class P39_exe04 {
    public static void main(String[] args) {
        library centralLibrary = new library();
        centralLibrary.addBook("Rich dad Poor dad");
        centralLibrary.addBook("Think and Grow");
        centralLibrary.addBook("The Marvels");

        centralLibrary.showBooks();
        
        centralLibrary.issueBook("Rich dad Poor dad");
        centralLibrary.showBooks();
        
        centralLibrary.returnBook("Rich dad Poor dad");
        centralLibrary.showBooks();
    }
}