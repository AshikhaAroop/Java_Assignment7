package library.management_2;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
   private final List<Book> books = new ArrayList<>();
   private String title, author;
   private int year;
    public void addBookStatic(Book b){
        books.add(b);
        System.out.println("Book "+b.getBookName()+" is added");
    }
    public void addBookDynamically() throws Exception {
        System.out.println("Enter the book title, author and year");
        Scanner sc=new Scanner(System.in);
        title=sc.nextLine();
        author=sc.nextLine();
        year=sc.nextInt();
        int currentYear = Year.now().getValue();
        if(year>currentYear || year<1){
            throw new Exception("Invalid year entered");
        }
        Book b=new Book(title,author,year);
        books.add(b);
        System.out.println("Book "+b.getBookName()+" is added");
    }
    public void displayBooks(){
        System.out.println("List of books in the library: ");
        for(Book book:books)
        {System.out.println("\t\t"+book.getBook());}
    }
    public void removeBook() throws Exception {
        System.out.println("Enter the book title to remove");
        Scanner sc=new Scanner(System.in);
        title=sc.nextLine();
        if(!books.removeIf(book -> (book.getBookName()).equals(title)))
            System.out.println("Not a valid book title, please enter valid book title");
        else {
        System.out.println("Library books collection updated successfully");
        updatedBookVerify(title);}
    }

    public void updatedBookVerify(String bookName) throws Exception {
        for(Book book:books){
            if((book.getBookName().equals(bookName)))
                throw new Exception("Book not deleted");
    }
        System.out.println("Book " + bookName + " successfully removed from library");
        displayBooks();
    }
}