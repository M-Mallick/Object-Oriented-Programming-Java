/******************************************************************************

Write a Java program to create a class called "BankAccount" with attributes 
for account number, account holder's name, and balance. Include methods for
depositing and withdrawing money, as well as checking the balance. Create a
subclass called "SavingsAccount" that adds an interest rate attribute and a
method to apply interest.

*******************************************************************************/

class BankAccount {
    long accountNumber;
    String customerName;
    double balance;
    
    public BankAccount(long accountNumber,String customerName,double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
    
    private String hiddenAccountNumber(long accountNumber) {
        String acc = Long.toString(accountNumber);
        String hiddAcc = "XXXX" + acc.substring(6, acc.length());
        return hiddAcc;
    }
    public void depositing(double balance) {
        this.balance += balance;
        System.out.println(balance+"₹ creaded in your A/c No "+hiddenAccountNumber(this.accountNumber));
    }
    
    public void withdrawing(double balance) {
        if(this.balance <= 1000) {
            System.out.println("you don't have sufficient balance");
        }else {
            this.balance -= balance;
            System.out.println(balance+"₹ debited from your A/c No "+hiddenAccountNumber(this.accountNumber));
        }
    }
    
    public void balanceCecking() {
        System.out.println("Current balance: "+this.balance);
    }
}
class SavingsAccount extends BankAccount {
    
    private double interestRate;
    
    public SavingsAccount(long accountNumber,String customerName,double balance, double interestRate) {
        super(accountNumber, customerName, balance);
        this.interestRate = interestRate;
    }
    
    // method to apply interest
    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of "+interest+"₹ applied at rate "+interestRate+"%");
    } 
    
    public void setInterestRate(double i) {
        this.interestRate = i;
        System.out.println("Your current interest rate is updated with "+this.interestRate+"%");
    }
    
    public void checkInterestRate() {
        System.out.println("Your current interest rate is "+this.interestRate+"%");
    }
}

class Main{
    public static void main (String[] args) {
        SavingsAccount sa = new SavingsAccount(1234627216, "Mridu Mallick", 5000, 5.0);
        sa.depositing(3000);
        sa.balanceCecking();
        sa.withdrawing(7000);
        sa.balanceCecking();
        sa.withdrawing(500);
        sa.balanceCecking();
        sa.applyInterest();
        sa.balanceCecking();
        sa.checkInterestRate();
        sa.setInterestRate(8.46);
        sa.applyInterest();
        sa.balanceCecking();
    }
}
