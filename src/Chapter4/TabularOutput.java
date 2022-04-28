package Chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        int n = 1;
        int n10 = 0;
        int n100 = 0;
        int n1000 = 0;
        System.out.println("N" + "\t\tN*10" + "\t\tN*100" + "\t\tN*1000");
        while (n <= 5) {
            n10 += 10;
            n100 += 100;
            n1000 += 1000;

            System.out.println(n + "\t\t" + n10 + "\t\t\t" + n100 + "\t\t\t" + n1000);
            n++;
        }
    }
}
