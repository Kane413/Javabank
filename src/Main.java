import java.util.Scanner;
import java.util.Stack;
public class Main{
    public static void main(String[] args) {
    String name;
    int choice, choice2;
    double userBal = 0, userAmt = 0;
    Account account = new Account();
    Account account1 = new Account();
    boolean isTrue = true;
    Stack<String> stack = new Stack<>();
    System.out.println("==========================================");
    System.out.println("   WELCOME TO JAVA SIMULATED BANK (CLI)   ");
    System.out.println("==========================================");
        
     Scanner scanner = new Scanner(System.in);

    System.out.print("Input your name:");
    name = scanner.nextLine();
    System.out.print("Enter the balance of your account:");
             userBal = scanner.nextInt();
             account.setBal(userBal);
    while(isTrue){

    System.out.println("Hello "+name+", which of the following banking services would you like: ");
     System.out.printf("1)Send money\n"+"2)Check Balance\n"+"3)Withdraw money\n"+"4)Deposit money\n"+"5)Savings account\n"+"6)Transaction history\n"+"7)Exit\n");
     choice = scanner.nextInt();
     switch(choice){
        case 1 -> {
            
            
             System.out.print("Enter the amount you want to send: ");
             userAmt = scanner.nextDouble();
             account.setAmount(userAmt);
             account.send(userAmt);
             if(account.send(userAmt)){
                System.out.println("You have sent "+userAmt+", and your balance is: "+account.checkBal());
                stack.push("\nYou have sent "+userAmt+", and your balance is: "+account.checkBal());
             }
        }
        case 2 ->{
            
             
             System.out.println("Your balance is:"+account.checkBal());
             stack.push("Your balance is:"+account.checkBal());
            
        }
        case 3 ->{
            
           
             System.out.print("Enter the amount you want to Withdraw: ");
             userAmt = scanner.nextDouble();
             account.setAmount(userAmt);
             account.withdraw(userAmt);
             if(account.withdraw(userAmt)){
                System.out.println("You have withdrawn "+userAmt+", and your balance is: "+account.checkBal());
                stack.push("\nYou have withdrawn "+userAmt+", and your balance is: "+account.checkBal());
             }
        }
        case 4 ->{
             
            
             System.out.print("Enter the amount you want to deposit: ");
             userAmt = scanner.nextDouble();
             account.setAmount(userAmt);
             account.deposit(userAmt);
             if(account.deposit(userAmt)){
                System.out.println("You have deposited"+userAmt+", and your balance is: "+account.checkBal());
                stack.push("\nYou have deposited"+userAmt+", and your balance is: "+account.checkBal());
             }
        }
        case 5 ->{
           
            System.out.print("Enter the balance of your Savings account: ");
            userBal = scanner.nextDouble();
            account1.setBal(userBal);
            stack.push("\nYou have created a Savings account with a balance of: "+userBal);
            System.out.println("Would you like to 1)deposit or 2)withdraw from your Savings account? (1 for deposit, 2 for withdraw)");
            choice2 = scanner.nextInt();
            if(choice2 == 1){
                System.out.print("Enter the amount you want to deposit: ");
                userAmt = scanner.nextDouble();
                account1.setAmount(userAmt);
                account1.deposit(userAmt);
                if(account1.deposit(userAmt)){
                    System.out.println("You have deposited "+userAmt+", in your Savings account, and your balance is: "+account1.checkBal());
                    stack.push("\nYou have deposited "+userAmt+", in your Savings account, and your balance is: "+account1.checkBal());
                }
            }else if(choice2 == 2){
                System.out.print("Enter the amount you want to withdraw: ");
                userAmt = scanner.nextDouble();
                account1.setAmount(userAmt);
                account1.withdraw(userAmt);
                if(account1.withdraw(userAmt)){
                    System.out.println("You have withdrawn "+userAmt+", from your Savings account, and your balance is: "+account1.checkBal());
                    stack.push("\nYou have withdrawn "+userAmt+", from your Savings account, and your balance is: "+account1.checkBal());
                }
            }else{
                System.out.println("Invalid choice");
            }
        }
        case 6 ->{
            System.out.println("Transaction history: "+stack);
        }
        case 7 ->{
            isTrue = false;
        }
        default -> System.out.println("Invalid choice");
     }
    }
     
     scanner.close();
    }
}
