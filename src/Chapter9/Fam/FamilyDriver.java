package Chapter9.Fam;

public class FamilyDriver {
    public static void main(String[] args) {
    Father akinsola = new Father(0, 0, 0);
    Daughter bisola = new Daughter(0,0,0,0);
    GrandChild fikayo = new GrandChild(0,0,0,0, "baby");
    Daughter fiks = new GrandChild(2,0,0,0,"babies");

    Father fikss = new GrandChild(2,0,0,0, "s");

        System.out.println( fikss.getAge());
        fikayo.worshipGod();
    }
}
