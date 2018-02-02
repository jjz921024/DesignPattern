package proxy.staticproxy;

/**
 * 代理类和被代理类 需要共同实现的接口
 * Created by Jun on 2018/2/2.
 */
public interface Subject {
    void request();
    void hello();
}
