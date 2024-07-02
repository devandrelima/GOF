package strategy;

public class DefenseBehavior implements Behavior{

    @Override
    public void toMove() {
        System.out.println("Moving defending.");
    }

}
