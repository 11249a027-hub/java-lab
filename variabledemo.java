public class variabledemo {
    int instancevar = 10;
    static String staticvar = "I am karthik";

    public void showVariables() {
        int localvar = 5;
        System.out.println("instance variable:" + instancevar);
        System.out.println("static variable:" + staticvar);
        System.out.println("local variable:" + localvar);
    }

    public static void main(String[] args) {
        variabledemo obj1 = new variabledemo();
        obj1.showVariables();
        System.out.println("accessing static variable via class:" + variabledemo.staticvar);
    }
}
