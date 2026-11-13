class Bank {
    double interestRate() { return 0.0; }
}

class SBI extends Bank {
    double interestRate() { return 7.5; }
}

class ICICI extends Bank {
    double interestRate() { return 8.0; }
}

class HDFC extends Bank {
    double interestRate() { return 8.5; }
}

class Main9 {
    public static void main(String[] args) {
        Bank b;
        
        b = new Bank();
        System.out.println("Bank Default Rate : " + b.interestRate() + "%");

        b = new SBI();
        System.out.println("SBI Rate     : " + b.interestRate() + "%");

        b = new ICICI();
        System.out.println("ICICI Rate : " + b.interestRate() + "%");
        
        b = new HDFC();
        System.out.println("HDFC Rate    : " + b.interestRate() + "%");
    }
}
