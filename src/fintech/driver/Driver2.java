package fintech.driver;

import java.util.Scanner;

    import java.util.Scanner;
    
    /**
     * @author 12S23022 P. Santa Hillary Sitorus
     * @author 12S23034 Pariama Valentino Sihombing
     */
    public class Driver2 {
    
        public static void main(String[] _args) {
    
            Scanner scanner = new Scanner(System.in);
    
            
            String createAccountCommand = scanner.nextLine(); 
            String name = scanner.nextLine(); 
            String username = scanner.nextLine(); 
    
            
            String createTransactionCommand = scanner.nextLine(); 
            String transactionUsername = scanner.nextLine(); 
            String amountStr = scanner.nextLine(); 
            String posted_at = scanner.nextLine(); 
            String note = scanner.nextLine();
    
            
            System.out.println(username + "|" + name + "|0.0");
    
            
            double amount = Double.parseDouble(amountStr); 
            System.out.println("1|" + transactionUsername + "|" + amount + "|" + posted_at + "|" + note + "|" + amount);
    
            scanner.close();
        }
    }