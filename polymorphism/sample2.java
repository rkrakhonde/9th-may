package polymorphism;

public class sample2 {
    //we can overload static method
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        add(2, 3);
        add(2, 3, 4);
    }
}
