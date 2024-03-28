class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}

class Student {
    private String name;
    private int id;
    private Book[] borrowedBooks;
    private int numBorrowedBooks;

    public Student(String name, int id, int maxBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new Book[maxBooks];
        this.numBorrowedBooks = 0;
    }

    
    public void borrowBook(Book book) {
        if (numBorrowedBooks < borrowedBooks.length) {
            borrowedBooks[numBorrowedBooks] = book;
            numBorrowedBooks++;
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Cannot borrow more books.");
        }
    }

    public void returnBook(Book book) {
        boolean found = false;
        for (int i = 0; i < numBorrowedBooks; i++) {
            if (borrowedBooks[i].equals(book)) {
                borrowedBooks[i] = null;
                numBorrowedBooks--;
                found = true;
                System.out.println(name + " returned the book: " + book.getTitle());
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in borrowed books.");
        }
    }
    
    
}

class Library {
    private Book[] books;
    private int numBooks;

    public Library(int maxBooks) {
        this.books = new Book[maxBooks];
        this.numBooks = 0;
    }

    //add books to the library
    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks] = book;
            numBooks++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    //  display all  books
    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i].getTitle() + " by " + books[i].getAuthor() + ", " + books[i].getYear());
        }
    }
}

class CollegeLibrary {
    public static void main(String[] args) {
        Library library = new Library(3);

        
        library.addBook(new Book("Java Programming", "Bal guru", 2020));
        library.addBook(new Book("Data Structures and Algorithms", "Harry", 2019));
        library.addBook(new Book("Introduction to Database Systems", "CodeHelp", 2021));

        
        library.displayAvailableBooks();

        
        Student student1 = new Student("X", 101, 2);
        Student student2 = new Student("Y", 102, 2);

        
        student1.borrowBook(library.getBooks()[0]);
        student2.borrowBook(library.getBooks()[1]);

        
        library.displayAvailableBooks();

       
        student1.returnBook(library.getBooks()[0]);
        student2.returnBook(library.getBooks()[1]);

        // Displaying available 
        library.displayAvailableBooks();
    }
}

