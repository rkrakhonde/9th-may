package Staticnonstaticuse;

public class Emplnformation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empName = "Amol";             //initialize variable from object
        e1.empID = 101;
        Employee.empCEOName = "xyz";

        Employee e2 = new Employee();
        e2.empName = "Shardul";
        e2.empID = 102;
        Employee.empCEOName = "xyz";

        Employee e3 = new Employee();
        e3.empName = "Kundalik";
        e3.empID = 103;
        Employee.empCEOName = "ABC";

        e1.empinfo();
        e2.empinfo();
        e3.empinfo();
    }
}










