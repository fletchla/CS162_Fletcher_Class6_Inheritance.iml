public class ProductManagers extends Employee {
    private int stocksPerYear = 100;

    public ProductManagers() {
        super();
    }

    public ProductManagers(String name, int yearsAtCompany, int yearsOfExperience){
        super(name, yearsAtCompany, yearsOfExperience);
        this.setSalaryMultiplier( 2.0 );
        this.setFirstYearVacationDays( 21 );
        this.setVacationDaysPerYear( 28 );
    }

    public String toString() {
        String s = super.toString();
        s += "\nStock Shares: " + this.getCompanyStockShares();
        return s;
    }

    public int getCompanyStockShares() {
        return this.getYearsAtCompany() * this.stocksPerYear;
    }

    public String motto(){
        return "\"There is nothing so useless as doing efficiently that which should not be done at all\"";
    }
}
