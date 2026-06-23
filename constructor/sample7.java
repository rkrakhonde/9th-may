package constructor;

public class sample7 {
    //example of user defind without parameter constructer
    //declaration of variable
    int num1;     //10
    int num2;     //20

    //user defined constructer->provided by programmer/user
//use1;intialize global variable
//use2;to copy all the non-static members(methods,variables) of class into object
    sample7()       //without/zero parameter constructor
    {
        num1 = 10;
        num2 = 20;
        System.out.println("sample7 class constructer running");
    }

    public void add() {
        System.out.println(num1 + num2);
    }

    public void mult() {
        System.out.println(num1 * num2);
    }

    public static void main(String[] args) {
        sample7 s2 = new sample7();

        s2.add();
        s2.mult();
        System.out.println("---------");

        sample8 s3 = new sample8();
        s3.sub();
        s3.div();

    }

}


