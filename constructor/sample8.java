package constructor;

public class sample8 {

    //declare variable globally
    int num3;//30
    int num4;//40

    //intialize global variable ..1
//copy all the non static members of class into object
    sample8()           //without/zero parameter constructer
    {
        num3 = 30;
        num4 = 40;
    }

    public void sub() {
        System.out.println(num3-num4);
    }

    public void div() {
        System.out.println(num3/num4);
    }

}



