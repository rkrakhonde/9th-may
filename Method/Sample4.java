package Method;

public class Sample4 {

    //non- static method call from same class

    public static void main(String[] args) {
  //1: class name create object/copy/new class name
   // 2:  method call-using object name.method name()

        Sample4 s4 = new Sample4();
        s4.m5();
        s4.m6();
        s4.m6();

    }

    public void m5() {
        System.out.println("running non static regular method m5from same class");

    }

    public void m6() {
        System.out.println("running non- static regular method m6 from same class ");

    }

    }


