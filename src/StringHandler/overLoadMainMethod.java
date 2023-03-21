package StringHandler;

public class overLoadMainMethod {

    public overLoadMainMethod(int x) {
        System.out.println(x);
    }
    public overLoadMainMethod() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println("Hello  Java from main Method -1");
        main();
        overLoadMainMethod o1=new overLoadMainMethod();
    }

    public static void main() {
        System.out.println("Hello Java in main Method-2");
        main(23);
        overLoadMainMethod obj=new overLoadMainMethod(4);
    }

    public static void main(int n) {
        System.out.println("print value " +n);
    }


}
