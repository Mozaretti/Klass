public class Main {

    public static void main(String[] args) {
        Author Dostoevskii = new Author("Фёдор ", " Достоевский");
        Author Gogol = new Author("Николай ", " Гоголь");
        Book Idiot = new Book("Идиот", Dostoevskii, 1869);
        Book Viy = new Book("Вий", Gogol, 1835);
        System.out.println("Книга - " + Idiot.getBookName());
        System.out.println("Автор - " + Idiot.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации - " + Idiot.getBookYear());
        System.out.println("Книга - " + Viy.getBookName());
        System.out.println("Автор - " + Viy.getBookAuthor().getAuthorName() +" " + Viy.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации -" + Viy.getBookYear());
        Viy.setBookYear(2023);
        System.out.println("Книга - " + Viy.getBookName());
        System.out.println("Автор - " + Viy.getBookAuthor().getAuthorFamilyName());
        System.out.println("Год публикации - " + Viy.getBookYear());
    }
}