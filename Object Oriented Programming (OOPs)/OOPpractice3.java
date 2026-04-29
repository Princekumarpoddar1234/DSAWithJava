public class OOPpractice3 {
    public static void main(String args[]) {
        System.out.print(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);
        System.out.println("Price of book 1 is: " + b1.price);
        System.out.println("Price of book 2 is: " + b2.price);
    }
}class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}
