package constructor;

public class sample1 {
    //example of default constructor

    //default constructor->provided by compiler
//use to copy all the non-static members(methods, variables)of class into object
//sample()
//{
//
//}
    public void m1() {
        System.out.println("running method m1");
    }

    public static void main(String[] args) {
        sample1 s1 = new sample1();  //default constructer call from same class
        s1.m1();
        //1;sample1->classname->data type/objecttype
        //2.s1->objectname->use to identify/refer object
        //3.new->keyword->createempty/blank object
        //4.sample1->className->constructer call
        System.out.println("----------");

        sample2 s2 = new sample2();   //default constructer call from diff another class
        s2.m2();

    }


}









