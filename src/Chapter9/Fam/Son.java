package Chapter9.Fam;

public class Son extends Father {
    private int money;
    public Son(int age, int weight, int height, int money) {
        super(age, weight, height);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public void walk() {
        System.out.println("i walk faster");
    }
}
