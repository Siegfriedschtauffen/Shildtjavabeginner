
// Объявление защищенными переменных экземпляра в классе Book.
package paketi.bookpack;

public class Book {
    // При объявлении этих переменных использован
    // модификатор доступа protected.
    protected String title;
    protected String author;
    protected int pubDate;

    // Теперь конструктор объявлен открытым.
    public Book(String t,String a, int d){
        title = t;
        author = a;
        pubDate = d;
    }

    // Теперь метод объявлен открытым.
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
