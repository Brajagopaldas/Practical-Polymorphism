class Employee {
    double getSalary() { return 50000.0; }
}

class Manager extends Employee {
    double getSalary() { return 80000.0; }
}

class Main7 {
    public static void main(String[] args) {
        Employee e;

        e = new Employee();
        System.out.println("Employee: Rs. " + e.getSalary());

        e = new Manager();
        System.out.println("Manager: Rs. " + e.getSalary());
    }
}
