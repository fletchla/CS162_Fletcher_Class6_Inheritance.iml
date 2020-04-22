public class ProductManagers extends Employee {
    private int stocksPerYear = 100;

    /**
     *
     */
    public ProductManagers() {
        super();
    }

    /**
     *
     * @param name imports and sets an employee name to the ProductManagers object
     * @param job imports and sets employee's job title to the ProductManagers object
     * @param yearsAtCompany imports and sets how many years an employee has worked at the company to the ProductManagers object
     * @param yearsOfExperience imports and sets how many years of experience an employee has to the ProductManagers object
     */
    public ProductManagers(String name, String job, int yearsAtCompany, int yearsOfExperience){
        super(name, job, yearsAtCompany, yearsOfExperience);
        this.setSalaryMultiplier( 2.0 );
        this.setFirstYearVacationDays( 21 );
        this.setVacationDaysPerYear( 28 );
    }

    /**
     *
     * @return returns the amount of stocks per year a ProductManagers will get in string format
     */
    public String toString() {
        String s = super.toString();
        s += "\nStock Shares: " + this.getCompanyStockShares();
        return s;
    }

    /**
     *
     * @return returns the amount of stocks per year a ProductManagers will get
     */
    public int getCompanyStockShares() {
        return this.getYearsAtCompany() * this.stocksPerYear;
    }

    /**
     *
     * @return returns the ProductManagers department motto
     */
    public String motto(){
        return "\"There is nothing so useless as doing efficiently that which should not be done at all\"";
    }
}
