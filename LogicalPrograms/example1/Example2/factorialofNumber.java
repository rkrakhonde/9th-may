package LogicalPrograms.example1.Example2;

public class factorialofNumber {
    public static void main(String[] args) {
        int num =4;     //4*3*2*1
        int fact =1;

        for (int i = num; i >= 1; i--) {
            fact= fact*i;
        }
        System.out.println(fact);
    }

}


