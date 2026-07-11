package S2.AbstractClass_And_ConcreteClass;
//incomplete abstract class
abstract public class sample1 {
    sample1() {
        System.out.println("running abstract clas constructer");
    }

    //complte method
    public void m1() {
        System.out.println("method m1 completed in abstract class");
    }

    //complete method
    public void m2() {
        System.out.println("method m2 completed in abstract class");
    }

    //incomplete method
    abstract public void m3();   //method declartion
    //incomplete method

    abstract public void m4();      //method declartion
}

