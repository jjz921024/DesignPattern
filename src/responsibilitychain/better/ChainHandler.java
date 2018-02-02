package responsibilitychain.better;

/**
 * Created by Jun on 2018/2/2.
 */
public abstract class ChainHandler {

    // 暴露的方法，供chain调用
    // 先执行自己的逻辑，再判断并调用下一个handler
    public void execute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

    // 每个handler的逻辑
    protected abstract void handleProcess();
}
