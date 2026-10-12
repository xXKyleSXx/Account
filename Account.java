import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Account {
    private String username;

    public Account(String requestedName) throws FileNotFoundException {
        int num = 1;
        String possibleName = requestedName;
        while (!isAvailable(possibleName)) {
            possibleName = requestedName + num;
            num++;
        }
        username = possibleName;
    }

public static boolean isAvailable(String str) throws FileNotFoundException {
        File f = new File("usernames.txt");
        java.util.Scanner scanner = new Scanner(f);
        
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equals(str)) {
                return false;
            }
        }
        scanner.close();
        return true;
    }

public String getUsername() {
        return username;
    }
}