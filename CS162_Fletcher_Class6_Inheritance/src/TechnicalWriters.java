public class TechnicalWriters extends Employee {
    public TechnicalWriters() {
        super();
    }

    public TechnicalWriters(String name, int yearsAtCompany, int yearsOfExperience){
        super(name, yearsAtCompany, yearsOfExperience);
    }


    public String motto(){
        return "\"You can always edit a bad page. You can’t edit a blank page.\"";
    }
}
