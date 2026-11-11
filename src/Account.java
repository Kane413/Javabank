
public class Account{
    
    private double bal; //, amount;

    public void setBal(double bal){
        
        if(bal < 0){
            System.out.println("Balance can't be less than 0");
        }else{
               this.bal = bal;
        }
    }
    /*
    public void setAmount(double amount){
       
        if(amount < 0){
            System.out.println("Amount can't be less than zero");
        }else{
        this.amount = amount;
        }
    }
    */
    public double checkBal(){
        return this.bal;
    }

    public boolean send(double amount){
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return false;
        }
        if (amount > this.bal) {
            System.out.println("Insufficient funds.");
            return false;
        }
        this.bal -= amount;
        return true;
    }

   public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
            return false;
        }
        if (amount > this.bal) {
            System.out.println("Insufficient funds.");
            return false;
        }
        this.bal -= amount;
        return true;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return false;
        }
        this.bal += amount;
        return true;
    }
    
}
