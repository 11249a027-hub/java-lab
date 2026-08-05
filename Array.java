class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}

public class Array {
    public static void main(String[] args) {

        int[] num = {10, 20, 30};
        double[] mark = {85.5, 90};
        char[] ch = {'J', 'A', 'V', 'A'};
        String[] fruit = {"Apple", "Mango"};
        boolean[] b = {true, false};

        int[][] arr = {
            {1, 2},
            {3, 4}
        };

        Student[] s = {
            new Student("Alice", 20),
            new Student("Bob", 21)
        };

        for (int i : num)
            System.out.print(i + " ");
        System.out.println();

        for (double d : mark)
            System.out.print(d + " ");
        System.out.println();

        for (char c : ch)
            System.out.print(c + " ");
        System.out.println();

        for (String f : fruit)
            System.out.print(f + " ");
        System.out.println();

        for (boolean x : b)
            System.out.print(x + " ");
        System.out.println();

        for (int[] row : arr) {
            for (int n : row)
                System.out.print(n + " ");
            System.out.println();
        }

        for (Student st : s)
            System.out.println(st.name + " " + st.age);
    }
}