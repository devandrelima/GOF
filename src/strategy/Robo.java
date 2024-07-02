package strategy;

public class Robo {
    private Behavior behavior; // It need to be the interface

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void toMove(){
        behavior.toMove();
    }

}
