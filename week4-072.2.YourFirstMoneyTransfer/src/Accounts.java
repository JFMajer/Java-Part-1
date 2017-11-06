
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account account1 = new Account("Matt's account", 1000);
        Account account2 = new Account("My account", 0);
        account1.withdrawal(100.0);
        account2.deposit(100.0);
        System.out.println(account1);
        System.out.println(account2);
    }

}
