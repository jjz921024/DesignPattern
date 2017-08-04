package responsibilitychain;

import org.junit.Test;
import responsibilitychain.pojo.PriceHandle;
import responsibilitychain.pojo.PriceHandlerFactory;

import java.util.Random;

/**
 * Created by Jun on 2017/8/4.
 */
public class Customer {

    //传入的handle，相当于处理请求的handle
    private PriceHandle priceHandle;

    public void setPriceHandle(PriceHandle priceHandle) {
        this.priceHandle = priceHandle;
    }

    //用户发起请求
    public void requestDiscount(float discount) {
        priceHandle.processDiscount(discount);
    }

    @Test
    public void test() {
        Customer customer = new Customer();
        customer.setPriceHandle(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();
        for (int i=0; i<100; i++) {
            customer.requestDiscount(random.nextFloat());
        }
    }
}
