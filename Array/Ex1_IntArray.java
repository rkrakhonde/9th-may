package Array;

public class Ex1_IntArray {
    public static void main(String[] args) {
        int[] rollNum = new int[4];   //index 0to3
        rollNum[0] = 30;
        rollNum[1] = 40;
        rollNum[2] = 10;
        rollNum[3] = 20;
        System.out.println(rollNum.length);//4
        System.out.println(rollNum[2]); //10

        System.out.println("----print all data----");
        for (int i = 0; i <= rollNum.length - 1; i++) {
            System.out.println(rollNum[i]);
        }
        System.out.println("----print all data using for each loop");
        for (int num1 : rollNum)          //[30 40 10 20]

        {

            System.out.println(num1);
        }

    }
}