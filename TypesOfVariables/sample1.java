package TypesOfVariables;
                                        //example of global and local variable
public class sample1 {
    //example of local and global variable
    int num3 = 30;       //global variable

    public void m1() {

        int num1 = 10;//local variable
        System.out.println(num1);//calling local variable
        System.out.println(num3);//calling global variable

    }

    public void m2() {
        int num2 = 20;//local variable
        System.out.println(num2);//calling local variable
        System.out.println(num3);//calling global variable
    }

    public static void main(String[]args)
    {
        sample1 s4 = new sample1();
        s4.m1();
        s4.m2();
    }

}






