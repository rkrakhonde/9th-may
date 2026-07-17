package Array;
import java.util.Arrays;
public class Ex3_IntArraySorting {
    public static void main(String[] args) {
        int[] ar = new int[5];    //index 0 to 3
        ar[0] = 10;
        ar[1] = 30;
        ar[2] = 50;
        ar[3] = 40;
        ar[4] = 20;
        System.out.println("--print original data:before sorting--");
        for (int i = 0; i <= ar.length - 1; i++) {
            System.out.println(ar[i]);
        }
        Arrays.sort(ar);       //10 30 50 40 20//diff class name.methodname(arrayobjname)
        System.out.println("--print array in ascending order--");
        for (int i =0;  i<=ar.length-1;i++)

        {
            System.out.println(ar[i]);
        }
        System.out.println("--print array in descending order--");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i]);

        }
    }
}