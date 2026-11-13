class Product {
    String productId;
    String productName;
    double productPrice;

    Product(String productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    double calculateDiscount() {
        return 0.0;
    }

    void display(String category) {
        double discount = calculateDiscount();
        System.out.println("\n[" + category + "]");
        System.out.println("ID           : " + productId);
        System.out.println("Name         : " + productName);
        System.out.println("Original Price: Rs. " + productPrice);
        System.out.println("Discount     : Rs. " + discount);
        System.out.println("Final Payable: Rs. " + (productPrice - discount));
    }
}

class Electronics extends Product {
    Electronics(String productId, String productName, double productPrice) {
        super(productId, productName, productPrice);
    }

    double calculateDiscount() { return productPrice * 0.10; }
}

class Clothing extends Product {
    Clothing(String productId, String productName, double productPrice) {
        super(productId, productName, productPrice);
    }

    double calculateDiscount() { return productPrice * 0.20; }
}

class Grocery extends Product {
    Grocery(String productId, String productName, double productPrice) {
        super(productId, productName, productPrice);
    }

    double calculateDiscount() { return productPrice * 0.05; }
}

class Main19 {
    public static void main(String[] args) {
        Product p;

        p = new Electronics("E101", "Laptop", 50000.0); 
        p.display("Electronics Summary"); 
        
        p = new Clothing("C202", "Jacket", 2000.0);
        p.display("Clothing Summary"); 

        p = new Grocery("G303", "Rice", 1000.0);
        p.display("Grocery Summary");
    }
}
