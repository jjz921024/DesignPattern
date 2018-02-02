package template;

/**
 * Created by Jun on 2017/8/4.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void addSomething() {
        System.out.println("add lemon");
    }

    @Override
    protected void brew() {
        System.out.println("泡茶");
    }

    /**
     * 通过重写钩子函数的方法 进行挂钩
     * @return
     */
    @Override
    protected boolean isCustom() {
        return false;
    }
}
