class Shape {
    double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

class Main15 {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5.0);
        System.out.println("Area of Circle    : " + s.calculateArea());

        s = new Rectangle(10.0, 20.0);
        System.out.println("Area of Rectangle : " + s.calculateArea());

        s = new Triangle(10.0, 8.0);
        System.out.println("Area of Triangle  : " + s.calculateArea());
    }
}
