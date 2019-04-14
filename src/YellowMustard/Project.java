package YellowMustard;

import java.time.LocalDate;
import java.util.*;


public class Project{

    private int ID = 1000;
    private String Title;
    private double InitialBudget;
    private HashMap<Integer, Employee> Team = new HashMap<Integer, Employee>();
    private int DayDuration;
    private LocalDate StartDate;
    private LocalDate EndDate;


    Project(String title, double initial_budget, int day_duration, LocalDate start_date, LocalDate end_date){

        this.ID = ID++;
        this.Title = title;
        this.InitialBudget = initial_budget;
        this.DayDuration = day_duration;
        this.StartDate = start_date;
        this.EndDate = end_date;
    }

    /*Getters*/

    public int GetProjectId(){

        return ID;
    }

    public String GetTittle(){

        return Title;
    }

    public double GetInitialBudget(){

        return InitialBudget;
    }


    public int GetDayDuration(){

        return DayDuration;
    }


    public LocalDate GetStartDate(){

        return StartDate;
    }

    public LocalDate GetEndDate(){

        return EndDate;
    }


    /*Setters*/

    public void SetTittle(String new_title){

        this.Title = new_title;
    }

    public void SetInitialBudget(int new_budget){

        this.InitialBudget = new_budget;
    }

    /*public void GetTeam(){

        return Team;
    }*/

    public void SetDayDuration(int days){

        this.DayDuration = days;
    }


    public void SetStartDate(LocalDate date){

        this.StartDate = date;
    }

    public void SetEndDate(LocalDate date){

        this.EndDate = date;
    }



}



