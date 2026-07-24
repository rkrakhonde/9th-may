package S3.ExceptionHandaling;

public class Ex9_NestedTryBlock
{
    public static void main(String[]args) {
        String s1 = "abcd";
        int[] ar = {90, 40, 80, 10};
        try     //outer try block
        {
            System.out.println(s1.charAt(8)); //riskycode
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        System.out.println(ar[8]);//risky code2
    }











    }
