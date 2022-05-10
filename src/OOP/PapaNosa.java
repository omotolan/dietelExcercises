package OOP;

public class PapaNosa {
    private Walk walk;
    private Pray pray;
    public PapaNosa(Walk walk, Pray pray){
        this.walk = walk;
        this.pray = pray;

    }

    public void setPray(Pray pray) {
        this.pray = pray;
    }

    public void pray(){
       this.pray.pray();
    }
    public void walk(){
        this.walk.walk();
    }
}
