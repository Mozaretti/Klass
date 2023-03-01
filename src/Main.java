public class Main {

    public static void main(String[] args) {
        Book idiot = new Book();
        idiot.name = " Идиот";
        System.out.println("Название книги - " + idiot.name);
        idiot.author =" Фёдор Михайлович Достоевский";
        System.out.println("Автор - " + idiot.author);
        idiot.age = 1869;
        System.out.println("Год - " + idiot.age);
    }
}