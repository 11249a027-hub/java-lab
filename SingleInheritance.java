//Ex 4A single inheritance!
public class SingleInheritance {
    class Person {
        void displayName() {
            System.out.println("I am a person");
        }
    }
   class Student extends Person {
        void study() {
            System.out.println("I am studying");
         }
    }    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance();
        Student s = obj.new Student();
        s.displayName();
        s.study();
    }
}