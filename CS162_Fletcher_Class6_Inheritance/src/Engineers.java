public class Engineers extends Employee {
    private int signonBonusBasic = 5000;
    private int signonBonusAdvanced = 10000;

    /**
     *
     */
    public Engineers() {
        super();
    }

    /**
     *
     * @param name imports and sets an employee name to the Engineers object
     * @param job imports and sets employee's job title to the Engineers object
     * @param yearsAtCompany imports and sets how many years an employee has worked at the company to the Engineers object
     * @param yearsOfExperience imports and sets how many years of experience an employee has to the Engineers object
     */
    public Engineers(String name, String job, int yearsAtCompany, int yearsOfExperience){
        super(name, job, yearsAtCompany, yearsOfExperience);
        this.setSalaryMultiplier( 1.5 );
        this.setFirstYearVacationDays( 14 );
        this.setVacationDaysPerYear( 21 );
    }

    /**
     *
     * @return returns the Engineers department motto
     */
    public String motto(){
        return "\"To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.\"";
    }

    /**
     *
     * @return returns the sign on bonus in string format
     */
    public String toString() {
        String s = super.toString();
        s += "\nSign on Bonus: " + this.getSignOnBonus();
        return s;
    }

    /**
     *
     * @return returns what amount of a sign on bonus an engineer will get, based on experience
     */
    public int getSignOnBonus() {
        if (this.getYearsOfExperience() < 5) {
            return this.signonBonusBasic;
        }
        else {
            return this.signonBonusAdvanced;
        }
    }
}
