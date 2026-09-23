import java.io.File;

class FileExample {
    public static void main(String[] args) {
        File file = new File("Calculator.java");

        System.out.println("File name: " + file.getName());
        System.out.println("Exists: " + file.exists());
        System.out.println("Path: " + file.getAbsolutePath());
    }
}
