// Exp4B multiple inheritance!
interface Swimmer {
    void swim();
}
interface Flyer {
    void fly();
}
class Duck implements Swimmer, Flyer {
    public void swim() {
        System.out.println("The duck is swimming.");
    }
    public void fly() {
        System.out.println("The duck is flying.");
    }
}
// Driver Class
public class MultipleInheritance {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.swim(); // Calls Swimmer implementation
        myDuck.fly();  // Calls Flyer implementation
    }
}
