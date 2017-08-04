package strategy.pojo;

import strategy.Duck;
import strategy.FlyingStragety;
import strategy.impl.FlyWithWind;

/**
 * Created by Jun on 2017/8/4.
 */
public class RedDuck extends Duck {

    public RedDuck() {
        //在构造函数中组合 需要的算法策略
        super.setFlyingStragety(new FlyWithWind());
    }

    @Override
    public void display() {
        System.out.println("红色的鸭子");
    }

}
