package S2_Access_Specifier1;

public class Sample1 {
    private int num1;      //private access specifer

    private Sample1()      //private access specifer
    {
        num1 = 10;
    }

    private void m1()     //private access specifer
    {
        System.out.println(num1 * num1);
    }

    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        s1.m1();
        System.out.println(s1.num1);
    }
}

