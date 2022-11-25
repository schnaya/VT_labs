package task15;

import java.util.Comparator;
import task12.Book;

public class BooksComparator
{
    public static Comparator<Book> byAuthor = (book1, book2) -> {
        return book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
    };

    public static Comparator<Book> byTitle = (book1, book2) -> {
        return book1.getTitle().compareToIgnoreCase(book2.getTitle());
    };

    public static Comparator<Book> byPrice = Comparator.comparingInt(book -> book.getPrice());

    public static Comparator<Book> byTitleThanAuthor = byTitle.thenComparing(byAuthor);
    public static Comparator<Book> byAuthorThanTitle = byAuthor.thenComparing(byTitle);
    public static Comparator<Book> byAuthorThanTitleThanPrice = byAuthor
            .thenComparing(byTitle).thenComparing(byPrice);
}