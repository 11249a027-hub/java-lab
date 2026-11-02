class Animal1 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class MyDogs extends Animal1 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends MyDogs {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   
        p.bark(); 
        p.play(); 
    }
}
