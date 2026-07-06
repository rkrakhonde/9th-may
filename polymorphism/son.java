package polymorphism;

public class son extends Father {
    public void Laptop() {
        System.out.println("Laptop:lenovo");
        ;
    }

    public void Car()//method override
    {
        System.out.println("Car:kia seltos");
    }

    public void Home()//method override
    {
        System.out.println("Home:2BHK");
    }

    public void Money()//method override
    {
        System.out.println("Money:1cr");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.Car();
        f.Home();
        f.Money();
        System.out.println("-------");
        son s = new son();
        s.Laptop();
        s.Car();
        s.Home();
        s.Money();
    }

}



