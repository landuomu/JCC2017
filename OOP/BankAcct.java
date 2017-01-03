public class BankAcct {
    private static int quantity = 0;
    private int acctNum;
    private double balance;

    // default constructor
    public BankAcct() {
        this(9999, 450);
    }

    // overloaded constructor
    public BankAcct(int acctNum, double balance) {
        this.acctNum = acctNum;
        this.balance = balance;
        quantity++;
    }

    // accessor / getters

    public int getAcctNum() {
        return acctNum;
    }

    public double getBalance() {
        return balance;
    }

    // mutators / setters
    
    // checks if amount is positive before depositing
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Cannot deposit nonpositive amount");
            return;
        }
        
        balance += amount;
        System.out.printf("Deposited $%.2f into %d\n", amount, getAcctNum());
        System.out.println(this);
        System.out.println();
    }

    // checks if there is enough balance before withdrawing
    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient balance to withdraw.");
            return;
        }

        balance -= amount;
        System.out.printf("Withdrawn $%.2f into %d\n", amount, getAcctNum());
        System.out.println(this);
        System.out.println();
    }

    // changes bank account number and output new account number
    public void updateAcct(int newAcctNum) {
        System.out.println("Old account number: " + getAcctNum());
        acctNum = newAcctNum;
        System.out.println("New account number: " + getAcctNum());
        System.out.println(this);
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("[Acct %d: Balance $%.2f]", getAcctNum(), getBalance());
    }

    @Override
    public boolean equals(Object obj) {
        // short-circuit: true if both are from the same reference
        if (this == (BankAcct) obj)
            return true;

        // match by data values of BankAcct
        if (obj instanceof BankAcct) {
            BankAcct acc = (BankAcct) obj;
            return (this.getAcctNum() == acc.getAcctNum()) 
                   // consider relative error when comparing equality of double
                   && (Math.abs(this.getBalance() - acc.getBalance()) < 0.01);
        } else {
            return false;
        }
    }
}
