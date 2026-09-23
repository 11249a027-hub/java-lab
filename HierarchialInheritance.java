// Ex 4c Hierarchial inheritance
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Subclass method
        System.out.println(); // Blank line for spacing
        Cat myCat = new Cat();
        myCat.eat();  // Inherited method
        myCat.meow(); // Subclass method
    }
}
