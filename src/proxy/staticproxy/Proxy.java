package proxy.staticproxy;

import proxy.RealSubject;
import proxy.Subject;

/**
 * Created by Jun on 2018/2/2.
 */
public class Proxy implements Subject {
    // 代理类持有 委托的引用
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("before");
        try {
            if (realSubject != null) {
                realSubject.request();
            }
        } catch (Exception e) {
            // 代理不处理实际逻辑，异常抛出给委托处理
            throw e;
        } finally {
            System.out.println("after");
        }


    }

    @Override
    public void hello() {
        //要针对每个方法都实现代理，重复逻辑多
    }
}
