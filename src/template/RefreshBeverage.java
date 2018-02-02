package template;

/**
 * Created by Jun on 2017/8/4.
 */
public abstract class RefreshBeverage {

    /**
     * 模板方法，用final修饰，禁止修改
     */
    public final void prepareBeverageTemplate() {
        boilWater();
        brew();
        if (isCustom()) {
            addSomething();
        }

    }

    /**
     * hook，钩子函数，提供一个默认或空的实现
     * 由子类决定 是否挂钩 和 如何挂钩
     * @return
     */
    protected boolean isCustom() {
        return true;
    }

    protected abstract void addSomething();

    /**
     * 具体子类不同实现的方法
     * protected  抽象方法
     */
    protected abstract void brew();

    /**
     * 不变 固定的方法
     * private封装在模板中
     */
    private void boilWater() {
        System.out.println("brew water...");
    }
}
