/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @author Laurie Fletcher
 * @version 1
 */

public class Employee {
    private String name;
    private String jobTitle;
    private int yearsOfExperience;
    private int yearsAtCompany;

    private double baseSalary = 100.00; //not given, set at $100
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
     * function description
     * @param name imports and sets an employee name to the employee object
     * @param job imports and sets employee's job title to the employee object
     * @param yearsAtCompany imports and sets how many years an employee has worked at the company to the employee object
     * @param yearsOfExperience imports and sets how many years of experience an employee has to the employee object
     */
    public Employee(String name, String job, int yearsAtCompany, int yearsOfExperience){
        this.setName(name);
        this.setJobTitle(job);
        this.setYearsAtCompany(yearsAtCompany);
        this.setYearsOfExperience(yearsOfExperience);
    }

    /**
     *
     * @return returns the name of the employee
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name imports a name and assigns it to the employee object
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String job) {
        this.jobTitle = job;
    }



    /**
     *
     * @return returns the base employee salary
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    /**
     *
     * @param salary imports salary given and sets it as base employee salary
     */
    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    /**
     *
     * @return returns how many years of experience the employee object has
     */
    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    /**
     *
     * @param years imports and sets how many years of experience the employee object has
     */
    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }

    /**
     *
     * @return returns how many years the employee object has worked at the company
     */
    public int getYearsAtCompany() {
        return this.yearsAtCompany;
    }

    /**
     *
     * @param years imports and sets how many years the employee object has worked at the company
     */
    public void setYearsAtCompany(int years) {
        this.yearsAtCompany = years;
    }

    /**
     *
     * @return returns the employee object's salary multiplier, to be used in computing salary
     */
    public double getSalaryMultiplier() {
        return this.salaryMultiplier;
    }

    /**
     *
     * @param multiplier imports and sets the employee object's salary multiplier, to be used in computing salary
     */
    public void setSalaryMultiplier(double multiplier) {
        this.salaryMultiplier = multiplier;
    }

    /**
     *
     * @return  returns how many days an employee gets or got in their first year of employment
     */
    public int getFirstYearVacationDays() {
        return this.firstYearVacationDays;
    }

    /**
     *
     * @param days imports and sets how many days an employee gets or got in their first year of employment
     */
    public void setFirstYearVacationDays(int days) {
        this.firstYearVacationDays = days;
    }

    /**
     *
     * @return returns how many days an employee gets each year
     */
    public int getVacationDaysPerYear() {
        return this.vacationDaysPerYear;
    }

    /**
     *
     * @param days imports and sets how many vacation days an employee gets each year
     */
    public void setVacationDaysPerYear(int days) {
        this.vacationDaysPerYear = days;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Employee Name: " + this.getName() + ", " + this.getJobTitle() +  "\n" +
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

    /**
     *
     * @return returns the total number of vacation days an employee has (not accounting for time used)
     */
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

    /**
     *
     * @return returns an employees actual salary
     */
    public double getSalary() {
        return this.getBaseSalary() * this.getSalaryMultiplier();
    }
}