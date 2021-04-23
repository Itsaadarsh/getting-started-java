class Book {
    String BName;
    boolean isAvailable;
    int BID;

    Book(String name, int ID) {
        isAvailable = true;
        BName = name;
        BID = ID;
    };
}

class Student {
    String SName;
    int SID;

    Student(String name, int ID) {
        this.SName = name;
        this.SID = ID;
    }

    Student(String name) {
        this.SName = name;
        this.SID = 0;
    }

    void issueBook(Book book) {
        if (book.isAvailable) {
            System.out.println(book.BName + " book issued to " + this.SName);
            System.out.println("---------------------------");
            book.isAvailable = false;
        } else {
            System.out.println(book.BName + " book is not Available");
            System.out.println("---------------------------");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("Life", 1);
        Book b2 = new Book("Dead", 2);
        Book b3 = new Book("El Chapo", 3);

        Student bob = new Student("Bob", 1);
        Student alice = new Student("Alice");
        Student aman = new Student("Aman");

        bob.issueBook(b1);
        alice.issueBook(b1);
        alice.issueBook(b2);
        aman.issueBook(b3);
    }
}