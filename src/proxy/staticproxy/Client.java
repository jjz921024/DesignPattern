package proxy.staticproxy;

/**
 * Created by Jun on 2018/2/2.
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
