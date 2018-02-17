package proxy;

/**
 * 真正执行的 被代理的类
 * Created by Jun on 2018/2/2.
 */
public class RealSubject implements Subject, Subject2 {

    @Override
    public void request() {
        System.out.println("real request success");
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void bye() {
        System.out.println("bye");
    }
}
