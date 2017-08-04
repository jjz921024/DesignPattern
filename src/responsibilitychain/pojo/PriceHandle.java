package responsibilitychain.pojo;

/**
 * Created by Jun on 2017/8/4.
 *
 * 责任链中的处理者 的接口
 *
 * 广义的接口也可以是抽象类，自身维护了 相同类型的successor后继，所有用抽象类作为接口
 */
public abstract class PriceHandle {

    /**
     * 当前handle的后继handle
     * pretecte类型，允许子类调用
     *
     * 依赖倒置原则：依赖于抽象而不是依赖于具体
     */
    protected PriceHandle successor;

    public void setSuccessor(PriceHandle successor) {
        this.successor = successor;
    }

    //处理逻辑
    public abstract void processDiscount(float discount);

}
