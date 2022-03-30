package Classwork;
//practiced use of constructor
public class TestAC {
   int temp;
    String name;
     int fanSpeed;
    public TestAC(int temp){
        temp = 16;
        this.temp = temp;
    }
    public  int temperature(){
        //temp++;
        //the temp above if not commented out is going to change the default temp of 16 by adding +1
        return temp;
    }

    public static void main(String[] args) {
        TestAC tolani = new TestAC(16);
        System.out.println(tolani.temperature());
    }
}
