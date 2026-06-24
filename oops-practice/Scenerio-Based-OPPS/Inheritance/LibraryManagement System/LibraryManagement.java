class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author: " + author.getName());
        System.out.println("Author Bio: " + author.getBio());
    }
}

class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("George Orwell", "English novelist and essayist.");
        Book book = new Book("1984", 1949, author);
        book.displayInfo();
    }
}
