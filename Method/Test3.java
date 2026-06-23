package Method;

public class Test3          //static regular method call from different class
{

    public static void main(String[] args) {
        System.out.println("main method started");

        Test4.m3();
        Test4.m4();              //different class name.method name();
        Test4.m4();

        System.out.println("main method ended");
    }

}






