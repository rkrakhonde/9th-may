package Method;

public class Sample5 {
    //3non-static method call from same/current  class

    public static void main(String[] args) {

//1 create object/copy/instance of same class              -
//2 method call-using object name.method name()

        //  class name object name= new class name();


        Sample5 s4 = new Sample5();
        s4.m5();
        s4.m6();
        s4.m6();

        //1 ;Sample5->class Name->as a data type
        //2;s4->object name->use to identify object
        //3 ;new->keyword->use to create blank /empty/object
        //4;Sample5->class name()->constructor->use to copy all the non-static members onto object

    }

    //non-static regular method->regular method
    public void m5() {
        System.out.println("running non static regular method m5from same class");

    }
    //non static regular method->regular method

    public void m6() {

        System.out.println("running non static method m6 from same class");

    }

}