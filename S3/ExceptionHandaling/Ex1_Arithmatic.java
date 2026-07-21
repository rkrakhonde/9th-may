package S3.ExceptionHandaling;

public class Ex1_Arithmatic
{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int Div = 0;
        try {
            Div = num1 / num2;    //risky code
        }
         catch (ArithmeticException e) {
            System.out.println("Exception Handled");
        }
        System.out.println(Div);
        System.out.println("hello");

    }
}


