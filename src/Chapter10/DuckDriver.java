package Chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class DuckDriver {
    static Scanner input = new Scanner(System.in);
   static CityDuck cityDuck = new CityDuck(2, 2);
    static WildDuck wildDuck = new WildDuck(4, 2);
    static RubberDuck rubberDuck = new RubberDuck(0, 0);
    public static void main(String[] args) {
        Duck duck = new Duck(3, 2);

        CityDuck cityDuck = new CityDuck(2, 2);
        WildDuck wildDuck = new WildDuck(4, 2);
        RubberDuck rubberDuck = new RubberDuck(0, 0);
        // quack behaviours
        QuackQuack quackQuack = new QuackQuack();
        Quack quack = new Quack();
        NoQuack noQuack = new NoQuack();
        // fly behaviours
        FlyFly flyFly = new FlyFly();
        NonFly nonFly = new NonFly();



        ArrayList<Duck> ducks = new ArrayList<>();

        ducks.add(cityDuck);
        ducks.add(wildDuck);
        ducks.add(rubberDuck);
        //quack behaviour
        cityDuck.setIQuackBehaviour(quack);
        wildDuck.setIQuackBehaviour(quackQuack);
        rubberDuck.setIQuackBehaviour(noQuack);
        for (Duck value : ducks) {
            value.quack();
        }

        // fly behaviour
        cityDuck.setIFlyBehaviour(flyFly);
        wildDuck.setIFlyBehaviour(flyFly);
        rubberDuck.setIFlyBehaviour(nonFly);
        for (int i = 0; i < ducks.size(); i++) {
            ducks.get(i).fly();
        }

        //fly and quack behaviour
        for (Duck value : ducks){
            value.quack();
            value.fly();
        }










//        cityDuck.setIQuackBehaviour(quack);
//
//        cityDuck.quack();
//        cityDuck.setIFlyBehaviour(flyFly);
//        cityDuck.fly();
//
//        wildDuck.setIQuackBehaviour(quackQuack);
//        wildDuck.quack();
//        wildDuck.setIFlyBehaviour(flyFly);
//        wildDuck.fly();
//
//        rubberDuck.setIQuackBehaviour(noQuack);
//        rubberDuck.quack();
//        rubberDuck.setIFlyBehaviour(nonFly);
//        rubberDuck.fly();


    }
    private static void instructions(){
        String options = """
                Types of Duck:
                press 1 to select a CityDuck
                press 2 to select a WildDuck
                press 3 to select a WildDuck
                press 4 to quit
                """;
    }
    private static void varieties(Duck option){

        if(option.equals(cityDuck)){
            System.out.println(cityDuck);
        } else if (option.equals(wildDuck)) {
            System.out.println(wildDuck);
        } else if (option.equals(rubberDuck)) {
            System.out.println(rubberDuck);
            
        }else {
            System.out.println("wrong selection");
        }
    }
}
