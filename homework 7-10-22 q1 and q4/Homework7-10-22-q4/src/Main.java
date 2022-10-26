public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Oliver Twist","Charles Dikens",200);
        System.out.println("\n"+b1);
        System.out.println("\nBook name: " + b1.getName());
        System.out.println("Book author: " + b1.getAuthor());
        System.out.println("Book number of pages: " + b1.getNumberOfPages());
    }
}