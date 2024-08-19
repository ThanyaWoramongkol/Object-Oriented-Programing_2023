package BookLibrary;
public class Library {
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    
    public void addBook(Book book, int slot){
        if (slot == 1){
            book1 = book;
        } else if (slot == 2){
            book2 = book;
        } else if (slot == 3){
            book3 = book;
        }
    }
    
    public void removeBook(int slot){
        if (slot == 1){
            book1 = null;
        } else if (slot == 2){
            book2 = null;
        } else if (slot == 3){
            book3 = null;
        }
    }
    
    public void printLibraryDetails(){
        System.out.println("Library: " + libraryName);
        printBookDetails(book1);
        printBookDetails(book2);
        printBookDetails(book3);
    }
    
    public void checkBookAvailability(int slot){
        Book book = null;
        if (slot == 1){
            book = book1;
        } else if (slot == 2){
            book = book2;
        } else if (slot == 3){
            book = book3;
        }
        if (book != null) {
            System.out.println(String.format("%s is available", book.title));
        } else {
            System.out.println(String.format("Book in slot %s is not available", slot));
        }
    }
    
    public void updateBookPrice(int slot, double newPrice){
        Book book = null;
        if (slot == 1){
            book = book1;
        } else if (slot == 2){
            book = book2;
        } else if (slot == 3){
            book = book3;
        }
        if (book != null){
            System.out.println(String.format("Updated price of %s to $%s.", book.title, newPrice));
            book.price = newPrice;
        } else {
            System.out.println("No book in this slot.");
        }
    }
    
    public void printBookDetails(Book book){
        if (book != null){
            System.out.println("\nTitle: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("Publisher: " + book.publisher);
            System.out.println("Year Published: " + book.yearPublished);
            System.out.println("Price: $" + book.price);
            System.out.println("Available: " + ((book.isAvailable) ? "Yes": "No"));
        } else {
            System.out.println("\nNo book in this slot.");
        }
    }
}
