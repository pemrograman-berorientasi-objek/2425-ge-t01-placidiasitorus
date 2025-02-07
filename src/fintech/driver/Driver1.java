package fintech.driver;

/**
 * @author 12S23022 P. Santa Hillary Sitorus
 * @author 12S23034 Pariama Valentino Sihombing
 */
import java.util.Scanner;
public class Driver1 { 

    public static void main(String[] _args) {
     Scanner scanner = new Scanner (System.in); 
        String command = scanner.nextLine();
        String owner = scanner.nextLine();
        String accountName = scanner.nextLine();

        double balance = 0.0;

        System.out.println(accountName + "|" + owner + "|" + balance);

        scanner.close();

    }

}