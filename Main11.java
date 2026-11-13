class Animal {
    void makeSound() { System.out.println("Animal makes a sound"); }
}

class Dog extends Animal {
    void makeSound() { System.out.println("Dog barks"); }
}

class Cat extends Animal {
    void makeSound() { System.out.println("Cat meows"); }
}

class Cow extends Animal {
    void makeSound() { System.out.println("Cow moos"); }
}

class Main11 {
    public static void main(String[] args) {
        Animal a;
        
        a = new Animal();
        a.makeSound();

        a = new Dog();
        a.makeSound(); 
       
         a = new Cat(); 
        a.makeSound();
        
        a = new Cow();
        a.makeSound();
    }
}
