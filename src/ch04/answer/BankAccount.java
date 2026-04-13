package ch04.answer;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    void doposit(int money) {
        balance+=money;
    }
    void withdraw(int money) {
        if(balance>=money){
            balance-=money;
            System.out.println( money +"원이 출금되었습니다.");
        } else {
            System.out.println( "잔액이 부족합니다.");
        }
    }
    void showBalance() {
        System.out.println(owner+"님의 잔액 : "+balance);
    }
}
