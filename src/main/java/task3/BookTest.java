package task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Маленький принц");
        book.setColor("Blue");
        book.setAuthor("Антуан де Суент-Экзюпери");
        book.setNumOfPages(96);
        book.setYearOfIssue(1942);
        System.out.println(book.toString());
    }
}
