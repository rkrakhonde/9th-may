package TypesOfVariables;

public class sample7          //example of non static global variable
{
    int num3 = 40;          //non-static global variable

    public static void main(String[] args) {
        //1.non static global variable call from same class
        sample7 s4 = new sample7();   //create object of same class
        System.out.println(s4.num3);//variable call->sameclassobjectname.variablename

//non static global variable call from diff class
        sample8 s6 = new sample8();//crete object from diff class
        System.out.println(s6.num4);//variable call->diffclassobjectname.variablename
    }

    public static void m5() {
        sample7 s4 = new sample7();

        System.out.println(s4.num3);
    }

    public void m6() {
        System.out.println(num3);


    }

}