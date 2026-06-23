package Method;

public class Test2         //static regular method call from same class -method name();
{
    public static void main(String[] args)  //main method
    {
        System.out.println("main method started");
        m1();
        m1();
        m2();
        System.out.println("main method ended");
    }


    public static void m1() {
        System.out.println("running method m1");
    }


    public static void m2()
    {
        System.out.println("running method m2");

    }


}
