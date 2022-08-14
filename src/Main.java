public class Main {
    public static void main(String[] args) {
        Author author = new Author("Всеволод", "Гаршин");
        Book book = new Book("Четыре дня", author, 1877);
        System.out.println("Название: " + book.getName() + "; Автор: " + book.getAuthor() + "; Год издания: " + book.getPublisherDate());
        book.setPublisherDate(1897);
        System.out.println("Дата публикации через сеттер = " + book.getPublisherDate());

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1, 1767);
        System.out.println("Название: " + book1.getName() + "; Автор: " + book1.getAuthor() + "; Год издания: " + book1.getPublisherDate());
        book1.setPublisherDate(1867);
        System.out.println("Дата публикации через сеттер = " + book.getPublisherDate());

        System.out.println(book);
        System.out.println(book1.hashCode() == book1.hashCode());
        System.out.println(book.equals(book));
    }
}