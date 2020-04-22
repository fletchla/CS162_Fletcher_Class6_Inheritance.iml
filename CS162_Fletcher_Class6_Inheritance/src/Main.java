import java.util.ArrayList;

/**
 * Laurie Fletcher
 * CS162
 * Inheritance Challenge Part 2
 */
public class Main {
    /**
     * main
      * @param args default main function
     */
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        TechnicalWriters t = new TechnicalWriters("Bob", "Technical Writer",6,8);
        employees.add(t);

        Engineers eng = new Engineers("Lisa","Engineer",9,12);
        employees.add(eng);

        ProductManagers pm = new ProductManagers("Jebidiah","Product Manager",2,0);
        employees.add(pm);

        for (Employee e: employees) {
            System.out.println(e.toString());
            System.out.println("");
        }

    }
}
