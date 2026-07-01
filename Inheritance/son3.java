package Inheritance;

public class son3 extends Father1
{
public void laptop()
{
    System.out.println("laptop:lenovo");
}
public void car ()
{
    System.out.println("car:kiya alto");
}
public void home() {
    System.out.println("home:2BHK");
}
public void money()
        {
            System.out.println("money:1lakh");
        }

public static void main (String[]args) {
    System.out.println("----Featurs of son1----");
    son1 s1 = new son1();
    s1.mobile();
    s1.car();
    s1.home();
    s1.money();
    System.out.println("----Featurs of son2----");
    son2 s2 = new son2();
    s2.bike();
    s2.car();
    s2.home();
    s2.money();
    System.out.println("----Featurs of son3-----");
    son3 s3 = new son3();
    s3.laptop();
    s3.car();
    s3.home();
    s3.money();
}




}








