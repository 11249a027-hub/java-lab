import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("tammudu");
        names.add("chinnakka");
        names.add("peddakka");

        System.out.println(names);

        System.out.println("First name: " + names.get(0));

        names.remove("Bob");

        System.out.println(names);
    }
}
