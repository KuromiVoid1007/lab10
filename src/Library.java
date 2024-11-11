import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Library {
    private List<Book> booksList = new ArrayList<>();
    private Set<Book> booksSet = new HashSet<>();
    private HashMap<Integer, Book> booksMap = new HashMap<>();

    public void addBook(Book book) {
        if (!booksSet.contains(book)) {
            booksList.add(book);
            booksSet.add(book);
            booksMap.put(book.getId(), book);
        } else {
            System.out.println("Книга с ID " + book.getId() + " уже существует в библиотеке.");
        }
    }

    public void removeBookById(int id) {
        Book book = booksMap.get(id);
        if (book != null) {
            booksList.remove(book);
            booksSet.remove(book);
            booksMap.remove(id);
            System.out.println("Книга с ID " + id + " удалена.");
        } else {
            System.out.println("Книга с ID " + id + " не найдена.");
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : booksList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        System.out.println("Книга с названием \"" + title + "\" не найдена.");
        return null;
    }

    public void listAllBooks() {
        if (booksList.isEmpty()) {
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println("Список всех книг:");
            for (Book book : booksList) {
                System.out.println(book);
            }
        }
    }

    public void listBooksByAuthor(String author) {
        boolean found = false;
        System.out.println("Книги автора \"" + author + "\":");
        for (Book book : booksList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Нет книг автора \"" + author + "\".");
        }
    }
}