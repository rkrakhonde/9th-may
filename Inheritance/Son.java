package Inheritance;
//sub/child class
public class Son extends Father {
    public void mobile() {
        System.out.println("Mobile:Samsung S20");
    }

    public void car() {
        System.out.println("car:kia Seltos");
    }

    public void Money() {
        System.out.println("Money:1cr");
    }

    public void Home() {
        System.out.println("home:2BHK");
    }

    public static void main(String[]args)
    {
            Son s1=new Son();
        s1.mobile();
        s1.car();
        s1.money();
        s1.home();
    }

}



