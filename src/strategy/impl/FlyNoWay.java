package strategy.impl;

/**
 * Created by Jun on 2017/8/4.
 */
public class FlyNoWay implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("不能飞行.....");
    }
}
