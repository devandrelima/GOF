package strategy;

public class NormalBehavior implements Behavior{

    @Override
    public void toMove() {
       System.out.println("moving normally.");
    }
}
