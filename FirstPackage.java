import mypackage.Addition;

public class FirstPackage {
    public static void main(String[] args) {
        Addition obj = new Addition();
        int result = obj.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}
