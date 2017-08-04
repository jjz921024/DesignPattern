package strategy.pojo;

import strategy.FlyingStragety;

/**
 * Created by Jun on 2017/8/4.
 *
 * 分析增加需求时的三种方式： 继承、抽象方法、组合(接口、策略模式)
 *
 * 抽离可变的部分，使之成为接口，具体实现部分由接口实现类负责(提供算法)
 * 对象持有接口的成员，组合
 *
 * 开闭原则： 当有业务变更，希望新增一个类而不是修改原有类来满足业务需求
 */
public abstract class Duck {

    /**
     * 继承的方式：鸭子的叫声
     * 优点：简单
     * 缺点：不灵活，变更支持性差，易遗忘变更
     */
    public void quack() {
        System.out.println("gagaga....");
    }

    /**
     * 抽象方法：具体在子类中实现
     * 优点：灵活，不会遗漏(子类中要复写)
     * 缺点：工作量大，代码不能复用
     */
    public abstract void display();


    /**
     * 组合(合成，复合)    多用组合，少用继承
     * 在类中持有 策略的接口，具体的实现由策略接口的实现类负责
     * 优点：灵活、复用代码、易于维护
     * 缺点：需要了解每个策略的实现，不能组合错误
     */
    private FlyingStragety flyingStragety;
    public void setFlyingStragety(FlyingStragety flyingStragety) {
        this.flyingStragety = flyingStragety;
    }

    public void fly() {
        flyingStragety.performFly();
    }

}
