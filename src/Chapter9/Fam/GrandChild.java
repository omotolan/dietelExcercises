package Chapter9.Fam;

public class GrandChild extends Daughter {
    private String sleep;
    public GrandChild(int age, int weight, int height, int money, String sleep) {
        super(age, weight, height, money);
        this.sleep = sleep;
    }

    @Override
    public void walk() {
        System.out.println("i crawl");
    }

    public String getSleep() {
        return sleep;
    }

}
