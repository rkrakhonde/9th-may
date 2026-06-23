package constructor;

public class sample9 {
    int num1;
    int num2;

    sample9() {
        num1 = 10;
        num2 = 20;
        System.out.println("running sample9 without parameter");
    }

    public void add() {
        System.out.println(num1 + num2);
    }

    public void sub() {
        System.out.println(num1 - num2);

    }

    public static void main(String[] args) {
        sample9 s2 = new sample9();
        s2.add();
        s2.sub();
        System.out.println("----------");

        sample10 s3 = new sample10();
        s3.mult();
        s3.div();

    }
}


