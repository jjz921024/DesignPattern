package template;

/**
 * Created by Jun on 2017/8/4.
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void addSomething() {
        System.out.println("add sugar");
    }

    @Override
    protected void brew() {
        System.out.println("泡咖啡");
    }
}
