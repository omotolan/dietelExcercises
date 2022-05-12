package OOP;

public class PapaNosa {

    /* when you have a method that can be used by various objects, instead of writing the code in multiple places(when you inherit
    , you tend to write the same method for objects that performs  a method same way), you can
    * just use composition and the objects will take the method from the particular class(sub class) i.e pray class**/
    private Walk walk;
    private Pray pray;


    public PapaNosa(Walk walk, Pray pray) {
        this.walk = walk;
        this.pray = pray;

    }

    public void setPray(Pray pray) {
        this.pray = pray;
    }

    public void pray() {
        this.pray.pray();
    }

    public void walk() {
        this.walk.walk();
    }
}
