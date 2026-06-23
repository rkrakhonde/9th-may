package constructor;

public class sample3 {
    public void m1() {
        System.out.println("running method m1 from same class");
    }

    public static void main(String[] args) {
        sample3 s2 = new sample3();
        s2.m1();

        System.out.println("--------------");

        sample4 s3 = new sample4();
        s3.m2();
    }

}
