package strategy;

import org.junit.Test;
import strategy.pojo.BigYellowDuck;
import strategy.pojo.RedDuck;

/**
 * Created by Jun on 2017/8/4.
 */
public class Main {

    @Test
    public void test(){
        Duck d1 = new RedDuck();
        d1.quack();
        d1.display();
        d1.fly();

        BigYellowDuck d2 = new BigYellowDuck();
        d2.quack();
        d2.display();
        d2.fly();
    }
}
