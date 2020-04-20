public class Main {
    public static void main(String[] args) {
        TechnicalWriters t = new TechnicalWriters("Bob",6,8);
        System.out.println(t.toString());
        System.out.println("");

        Engineers e = new Engineers("Lisa",9,12);
        System.out.println(e.toString());
        System.out.println("");

        ProductManagers pm = new ProductManagers("Jebidiah",2,0);
        System.out.println(pm.toString());
    }
}
