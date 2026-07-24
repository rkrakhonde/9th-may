package S3.ExceptionHandaling;

public class Ex8_HandalingMultipleException
{
   public static void main(String[]args) {
       String s1 = "abcd";
       try {
           System.out.println((s1.charAt(9)));//riskycode
       } catch (StringIndexOutOfBoundsException e) {
           System.out.println("StringIndexOutOfBoundsException handles");
       }
       System.out.println("hii");

       int[] ar = {90, 40, 50, 30, };
       try {
           System.out.println( ar[8]);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("ArrayIndexOutOfBoundsException e");
       }
       System.out.println("hello");

   }

}
