public class Engineers extends Employee {
    private int signonBonusBasic = 5000;
    private int signonBonusAdvanced = 10000;

    public Engineers() {
        super();
    }

    public Engineers(String name, int yearsAtCompany, int yearsOfExperience){
        super(name, yearsAtCompany, yearsOfExperience);
        this.setSalaryMultiplier( 1.5 );
        this.setFirstYearVacationDays( 14 );
        this.setVacationDaysPerYear( 21 );
    }

    public String motto(){
        return "\"To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.\"";
    }

    public String toString() {
        String s = super.toString();
        s += "\nSign on Bonus: " + this.getSignOnBonus();
        return s;
    }

    public int getSignOnBonus() {
        if (this.getYearsOfExperience() < 5) {
            return this.signonBonusBasic;
        }
        else {
            return this.signonBonusAdvanced;
        }
    }
}
