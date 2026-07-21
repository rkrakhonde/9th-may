package S3.ExceptionHandaling;

public class Ex2_Array
{
    public static void main(String[]args) {
        int[] ar = {10, 20, 30, 40, 50};
        try {
            System.out.println(ar[10]);   //risky code\
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled");
        }


        System.out.println("hiii");
        System.out.println("hello");
    }









}
