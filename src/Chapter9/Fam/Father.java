package Chapter9.Fam;

public class Father {
    private int age;
    private int weight;
    private int height;

    public Father(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
    public void walk(){
        System.out.println("i walk fast");
    }

    public final void worshipGod(){
        System.out.println("I wordship God");
    }
}
