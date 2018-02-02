package proxy.dynamic.jdkproxy;

import proxy.staticproxy.RealSubject;
import proxy.staticproxy.Subject;

import java.lang.reflect.Proxy;

/**
 * Created by Jun on 2018/2/2.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{Subject.class, Subject2.class},  //基于接口实现
                new JDKProxy(new RealSubject())); //InvocationHandler的实现类
        subject.request();
        subject.hello();
        // 基于多态
        Subject2 anSub = (Subject2) subject;
        anSub.bye();

    }
}
