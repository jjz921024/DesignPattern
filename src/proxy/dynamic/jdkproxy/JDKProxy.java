package proxy.dynamic.jdkproxy;

import proxy.staticproxy.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK实现基于接口的动态代理
 * Created by Jun on 2018/2/2.
 */
public class JDKProxy implements InvocationHandler{
    // 被代理对象
    RealSubject realSubject;

    public JDKProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = null;
        try {
            // 调用 委托对象的方法
            result = method.invoke(realSubject, args);
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("after");
        }
        return result;
    }
}
