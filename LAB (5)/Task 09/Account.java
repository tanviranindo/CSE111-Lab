/**
 *
 * @author 19101268
 */
public class Account {
    public static double interestRate = 5.0;
    private String name;
    private double balance;
    
    Account() {
        name = "Default Account";
        balance = 0.0;
    }
    Account(String n, int b) {
        name = n;
        balance = b;
    }
    public String nameKi() {
        return name;
    }
    public void nameBoshao(String n) {
        name = n;
    }
    public double balanceKi() {
        return balance;
    }
    public void balanceBoshao(double b) {
        balance = b;
    }
    void withdraw(int w) {
        if (balance - w > 100) { 
            balance -= w;
            System.out.println("Withdraw successful! New balance is: " + balance);
        } 
        else {
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
    }    
}
