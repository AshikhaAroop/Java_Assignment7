package library.management_2;

import java.util.Scanner;

import static java.lang.System.exit;

public class LibraryMngmtSystem {
    public static void main(String[] args) throws Exception {
        Library lib=new Library();
        lib.addBookStatic(new Book("Book1", "Author 1", 1998));
        lib.addBookStatic(new Book("Book2", "Author 2", 1470));
        lib.addBookStatic(new Book("Book3", "Author 3", 1947));
        int ch;
        while (true) {
            System.out.println("Enter any choice 1. Add book 2. Display books 3. Remove book 4. Exit");
            Scanner sc=new Scanner(System.in);
            ch=sc.nextInt();
            switch (ch){
                case 1:lib.addBookDynamically();
                       break;
                case 2:lib.displayBooks();
                       break;
                case 3:lib.removeBook();
                       break;
                case 4: exit(0);
                default:System.out.println("Not a valid choice, please enter any valid value between 1-4");
                        break;
            }
        }
    }
}
