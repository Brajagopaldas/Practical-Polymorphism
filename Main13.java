class Animal {

    Animal getAnimal() {
        System.out.println("Animal object");
        return new Animal();
    }
}

class Dog extends Animal {
    Dog getAnimal() {
        System.out.println("Dog object");
        return new Dog();
    }
}

class Main13 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.getAnimal();

        Dog d = new Dog();
        d.getAnimal();
    }
}