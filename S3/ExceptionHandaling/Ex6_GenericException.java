package S3.ExceptionHandaling;

public class Ex6_GenericException
{
    public static void main(String[]args) {
        String s1 = "abcd";
        try {
            System.out.println(s1.charAt(7));//risky code
        } catch (Exception e) {

            System.out.println("Generic Exception handled");
        }
        System.out.println("hii");


    }






    }
