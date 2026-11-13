class Payment {

    void pay() {
        System.out.println("Payment process");
    }
}

class UPI extends Payment {

    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CreditCard extends Payment {

    void pay() {
        System.out.println("Payment through Credit Card");
    }
}

class DebitCard extends Payment {

    void pay() {
        System.out.println("Payment through Debit Card");
    }
}

class Main12 {

    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new DebitCard();
        p.pay();
    }
}
