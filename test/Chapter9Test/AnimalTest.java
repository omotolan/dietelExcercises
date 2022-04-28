package Chapter9Test;

import Chapter9.Animal;
import Chapter9.Vertebrate;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void main() {
        Animal animal = new Animal(23);
        animal.move();
    }

    @Test
    public void vertebrateTest() {
        Vertebrate animal = new Vertebrate();
        animal.move();
        animal.yourFathesMove();
    }

    @Test
    public void constructorTest() {
        Vertebrate vertebrate = new Vertebrate();
    }
}
