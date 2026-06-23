package constructor;

public class sample5 {
    public void m1() {
        System.out.println("default constructor m1 from same class");
    }

    public static void main(String[] args) {
        sample5 s1 = new sample5();
        s1.m1();
        System.out.println("---------");
        sample6 s2 = new sample6();
        s2.m2();

    }
}













