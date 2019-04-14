package YellowMustard;

import java.time.LocalDate;

public class Employee {

    private int EmpID = 01;
    private String first_name;
    private String surname;
    private LocalDate birthdate;
    private Enum role;
    private double rate;


    Employee(int id){

        this.EmpID = EmpID++;

    }


}
