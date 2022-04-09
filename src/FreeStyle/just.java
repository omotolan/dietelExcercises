package FreeStyle;

public class just {
    public String name;

    public void setName(String oruko, int number) {
        name = oruko;
        number = 0;
    }

    public String getName() {
        return name;
    }

    public void setAnother(String oruko) {
        name = oruko;
    }

    public String getA() {
        return name;
    }

    public static void main(String[] args) {
        just tola = new just();
        tola.setName("rgdf", 4);
        System.out.println(tola.getA());
        tola.setAnother("fssf");
        System.out.println(tola.getA());
        System.out.println(tola.getName());

        grade();

    }
   static int studentGrade = 40;
    public static void grade(){
        if (studentGrade >= 60) {
           // return true;
            System.out.println("Passed");
        }
        System.out.println("Passed");
    }
}