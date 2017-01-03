public class TestBankAcct {
    public static void main(String[] args) {
        BankAcct ba1 = new BankAcct();
        BankAcct ba2 = new BankAcct(1020, 1749.75);

        System.out.println("Before transactions:");
        // println will output String returned by .toString() of BankAcct (subclass of Object) if an Object reference is passed in
        System.out.println(ba1); 
        System.out.println(ba2);
        System.out.println();

        // should not print
        if (ba1.equals(ba2))
            System.out.println("ba1 equals ba2");

        ba1.deposit(1000);
        ba1.withdraw(200.50);
        ba2.withdraw(500.25);
        ba2.updateAcct(9999);

        System.out.println("After transactions:");
        System.out.println(ba1);
        System.out.println(ba2);
        System.out.println();

        // should print
        if (ba1.equals(ba2))
            System.out.println("ba1 equals ba2");
    }
}
