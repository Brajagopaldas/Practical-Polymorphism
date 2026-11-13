class BankAccount {
    double calculateInterest() { return 0.0; }
}

class SavingsAccount extends BankAccount {
    double calculateInterest() { return 4.5; }
}

class CurrentAccount extends BankAccount {
    double calculateInterest() { return 0.0; }
}

class FixedDepositAccount extends BankAccount {
    double calculateInterest() { return 7.0; }
}

class Main14 {
    public static void main(String[] args) {
        BankAccount b;

        b = new SavingsAccount();
        System.out.println("Savings: " + b.calculateInterest() + "%");

        b = new CurrentAccount();
        System.out.println("Current: " + b.calculateInterest() + "%");

        b = new FixedDepositAccount();
        System.out.println("FD: " + b.calculateInterest() + "%");
    }
}
