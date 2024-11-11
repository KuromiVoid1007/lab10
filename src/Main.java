public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавляем книги
        library.addBook(new Book(1, "Война и мир", "Лев Толстой"));
        library.addBook(new Book(2, "Преступление и наказание", "Фёдор Достоевский"));
        library.addBook(new Book(3, "Анна Каренина", "Лев Толстой"));

        // Удаляем книгу по ID
        library.removeBookById(2);

        // Ищем книгу по названию
        Book foundBook = library.findBookByTitle("Анна Каренина");
        if (foundBook != null) {
            System.out.println("Найдена книга: " + foundBook);
        }

        // Выводим все книги
        library.listAllBooks();

        // Выводим книги конкретного автора
        library.listBooksByAuthor("Лев Толстой");
    }
}