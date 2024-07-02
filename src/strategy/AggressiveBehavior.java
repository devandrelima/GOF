package strategy;

public class AggressiveBehavior implements Behavior{

    @Override
    public void toMove() {
        System.out.println("Moving attacking!");
    }
}
