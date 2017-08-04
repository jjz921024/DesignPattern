package strategy.impl;

import strategy.FlyingStragety;

/**
 * Created by Jun on 2017/8/4.
 */
public class FlyWithWind implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用翅膀飞行...");
    }
}
