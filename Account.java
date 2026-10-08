import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Account {
    private String username;

    public Account(String requestedName) throws FileNotFoundException {
            int num = 1;
            String possibleName = requestedName;
            while (!Account.isAvailable(possibleName)) {
                possibleName = requestedName + num;
                num++;
            }
            username = possibleName;
    public static boolean isAvailable(String str) throws FileNotFoundException {
        File f = new File("usernames.txt");
        java.util.Scanner s = new Scanner(f);
        while (s.hasNextLine()) {
            if (s.nextLine().equals(str)) {
                return false;
            }
        }
        return true;
    }
    }
}