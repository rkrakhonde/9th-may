package TypesOfVariables;

public class sample2
{
  int num3=20;
  public void m1() {
      int num2 = 10;
      System.out.println(num2);
      System.out.println(num3);

  }

    public void m2() {

        int num1 = 30;
        System.out.println(num1);
        System.out.println(num3);

    }

    public static void main(String[]args) {
        sample2 s4 = new sample2();
        s4.m1();
        s4.m2();
    }


}




