import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h,e;
        System.out.println("Enter an english word");
        e = sc.next();
        System.out.println("Enter the definition in hebrew");
        h = sc.next();
        Word word = new Word(h,e);
        System.out.println(word.toString());

    }
}