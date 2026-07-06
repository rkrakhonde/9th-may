package polymorphism;

public class sample1 {
    //method overloading
    //method with 2 int parameter
    public void add(int num1, int num2) {
        System.out.println(num1 + num2);

    }

    //method with 3 parameter
    public void add(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void main(String[] args) {
        sample1 s1 = new sample1();
        s1.add(2, 3);
        s1.add(5, 6, 7);
    }

}
