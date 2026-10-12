import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Account a = new Account("mybol");
        System.out.println(a.getUsername());
        a = new Account("Ethan-David");
        System.out.println(a.getUsername());
    }
}