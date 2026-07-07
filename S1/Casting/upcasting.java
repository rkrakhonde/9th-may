package S1.Casting;

public class upcasting
{
public static void main(String[]args) {
    //   son s1= new son();
    //s1.Mobile();
    //  s1.Car();
    //s1.Money();
    //s1.Home();

    //create object of sub class with refrence data type of super class
    Father F = new son();
    F.Car();
    F.Money();
    F.Home();

}

}