package Chapter9;

import java.util.ArrayList;

public class AnimalDriver {
    public static void main(String[] args) {
        Vertebrate vertebrate = new Vertebrate();
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(vertebrate);
        for (int i = 0; i < animals.size(); i++) {
              //  vertebrate.move();
                animals.get(i).move();

        }
    }
}
