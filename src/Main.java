import facade.Facade;
import singleton.*;
import strategy.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        // SINGLETON
        title("SINGLETON");

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy + "\n");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager + "\n");

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // STRATEGY
        title("STRATEGY");
        AggressiveBehavior aggressiveBehavior = new AggressiveBehavior();
        DefenseBehavior defenseBehavior = new DefenseBehavior();
        NormalBehavior normalBehavior = new NormalBehavior();

        Robo robo = new Robo();
        
        robo.setBehavior(normalBehavior);
        robo.toMove();
        robo.toMove();

        robo.setBehavior(aggressiveBehavior);
        robo.toMove();
        
        robo.setBehavior(defenseBehavior);
        robo.toMove();
        robo.toMove();

        // FACADE
        title("FACADE");
        Facade facade = new Facade();
        facade.migrarCliente("Antonio", "568987");
    }

    public static void title(String title){
        System.out.printf("\n\n----- %s -----\n\n",title);
    }
}
