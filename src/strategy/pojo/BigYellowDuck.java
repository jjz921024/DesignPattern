package strategy.pojo;

import strategy.impl.FlyNoWay;

/**
 * Created by Jun on 2017/8/4.
 */
public class BigYellowDuck extends Duck {

    public BigYellowDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("大大黄黄的鸭子");
    }
}
