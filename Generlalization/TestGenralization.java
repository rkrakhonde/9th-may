package Generlalization;

public class TestGenralization {
    public static void main(String[] args) {
        System.out.println("------Featurs of Saving Account");
        SavingAcc saving = new SavingAcc();
        saving.CD();
        saving.CW();
        saving.MT();
        saving.newfeatureA();

        System.out.println(" ------Featurs of salary Acc-----");
        SalaryAcc salary = new SalaryAcc();
        salary.CD();
        salary.CW();
        salary.MT();

        System.out.println("-----Featurs of currentAcc---");
        CurrentAcc current = new CurrentAcc();
        current.CD();
        current.CW();
        current.MT();
    }
}



