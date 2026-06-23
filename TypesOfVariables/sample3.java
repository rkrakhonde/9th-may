package TypesOfVariables;
public class sample3          //example of static /class variable
{

    static int num1 = 10;            //static global variable


    public static void main(String[] args) {
//static global variable call from same class
        System.out.println(num1);    //    variable name
//static global variable call from diff class

        System.out.println(sample4.num2);  //diffclassname.variablename
    }

    public static void m3() {
        System.out.println(num1);   //variablename
    }

    public void m4() {
        System.out.println(num1);  //variable name

    }


}











