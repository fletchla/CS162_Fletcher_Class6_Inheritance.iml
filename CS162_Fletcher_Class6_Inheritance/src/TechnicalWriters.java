public class TechnicalWriters extends Employee {
    public TechnicalWriters() {
        super();
    }

    /**
     *
     * @param name imports and sets an employee name to the technicalWriter object
     * @param job imports and sets employee's job title to the technicalWriter object
     * @param yearsAtCompany imports and sets how many years an employee has worked at the company to the technicalWriter object
     * @param yearsOfExperience imports and sets how many years of experience an employee has to the technicalWriter object
     */
    public TechnicalWriters(String name, String job, int yearsAtCompany, int yearsOfExperience){
        super(name, job, yearsAtCompany, yearsOfExperience);
    }

    /**
     *
     * @return returns the technicalWriter department motto
     */
    public String motto(){
        return "\"You can always edit a bad page. You can’t edit a blank page.\"";
    }
}
