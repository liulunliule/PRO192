//PAPER_NO1_PRACTICAL EXAM
//PAPER_NO1_PRACTICAL EXAM
//PAPER_NO1_PRACTICAL EXAM
//PAPER_NO1_PRACTICAL EXAM
//PAPER_NO1_PRACTICAL EXAM
public class SavingAccount {

    private String accountID;
    private int balance;

    public SavingAccount(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public int getMoney() {
        return this.balance;
    }

    public boolean savingWithdraw(int money) {
        if (money >= 0 && (money < this.balance)) {
            this.balance -= money;
            return true;
        } else {
            return false;
        }
    }

    public boolean savingDeposit(int money) {
        if (money >= 0) {
            this.balance += money;
            return true;
        } else {
            return false;
        }
    }
}
