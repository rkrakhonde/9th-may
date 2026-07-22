package S3.ExceptionHandaling;

public class Ex_MultipleCatchBlock_For_Single_TryBlock {
    public static void main(String[] args) {
        String s1 = "abcd";
        try {
            System.out.println(s1.charAt(1));   //risky code
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOfBoundsExceptionHandled");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Handled");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        System.out.println("hii");

    }
}