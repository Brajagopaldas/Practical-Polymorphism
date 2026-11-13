class Person {
    String name = "Ram";

    void display() { 
        System.out.println("Name    : " + name); 
    }
}

class Student extends Person {
    int rollNo = 101;

    void display() {
        super.display();
        System.out.println("Roll No : " + rollNo);
    }
}

class Main10 {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
