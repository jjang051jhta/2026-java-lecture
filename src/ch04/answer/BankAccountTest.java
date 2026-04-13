package ch04.answer;

public class BankAccountTest {
    static void main() {
        BankAccount bankAccount = new BankAccount("장성호",30000);
        bankAccount.showBalance();
        bankAccount.doposit(100000);
        bankAccount.showBalance();
        bankAccount.withdraw(50000);
        bankAccount.showBalance();
        bankAccount.withdraw(50000);
        bankAccount.showBalance();
        bankAccount.withdraw(50000);
        bankAccount.showBalance();
    }
}
