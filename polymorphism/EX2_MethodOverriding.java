package polymorphism;

public class EX2_MethodOverriding {
    public static void main(String[] args) {
        Father f = new Father();
        f.Car();
        f.Home();
        f.Money();
        System.out.println("_____");
        son s = new son();
        s.Laptop();
        s.Car();
        s.Home();
        s.Money();
    }
}




