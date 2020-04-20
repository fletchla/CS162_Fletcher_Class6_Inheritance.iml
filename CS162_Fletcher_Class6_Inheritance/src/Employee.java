/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @version 1
 */
public class Employee {
    private String name;
    private int yearsOfExperience;
    private int yearsAtCompany;

    private double baseSalary = 200;
    private double salaryMultiplier = 1.0;
    private int firstYearVacationDays = 7;
    private int vacationDaysPerYear = 14;


    /**
     * Parameterless constructor
     */
    public Employee(){
        this.setName("");
        this.setYearsAtCompany(0);
        this.setYearsOfExperience(0);
    }


    /**
     *
     * @param name
     * @param yearsAtCompany
     * @param yearsOfExperience
     */
    public Employee(String name, int yearsAtCompany, int yearsOfExperience){
        this.setName(name);
        this.setYearsAtCompany(yearsAtCompany);
        this.setYearsOfExperience(yearsOfExperience);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }

    public int getYearsAtCompany() {
        return this.yearsAtCompany;
    }

    public void setYearsAtCompany(int years) {
        this.yearsAtCompany = years;
    }

    public double getSalaryMultiplier() {
        return this.salaryMultiplier;
    }

    public void setSalaryMultiplier(double multiplier) {
        this.salaryMultiplier = multiplier;
    }

    public int getFirstYearVacationDays() {
        return this.firstYearVacationDays;
    }

    public void setFirstYearVacationDays(int days) {
        this.firstYearVacationDays = days;
    }

    public int getVacationDaysPerYear() {
        return this.vacationDaysPerYear;
    }

    public void setVacationDaysPerYear(int days) {
        this.vacationDaysPerYear = days;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Employee Name: " + this.getName() + "\n" +
                "Salary: $" + this.getSalary() + "\n" +
                "Department Motto: " + this.motto() + "\n" +
                "Vacation Days: " + this.getVacationDays();
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "\"We value our employees\"";
    }


    public int getVacationDays() {
        int vacationDays = 0;
        if (this.getYearsAtCompany() >= 1) {
            vacationDays += this.getFirstYearVacationDays();
        }
        if (this.getYearsAtCompany() >= 2) {
            vacationDays += this.getVacationDaysPerYear() * (this.getYearsAtCompany() -1);
        }
        return vacationDays;
    }

    public double getSalary() {
        return this.getBaseSalary() * this.getSalaryMultiplier();
    }
}