package chapter11;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setName("poor dad and rich dad");
        book.setPrice(100.99);

        System.out.println(book.getName());
        System.out.println(book.getPrice());
    }
}
