package responsibilitychain.pojo;

import responsibilitychain.pojo.Director;
import responsibilitychain.pojo.President;
import responsibilitychain.pojo.PriceHandle;
import responsibilitychain.pojo.Saler;

/**
 * Created by Jun on 2017/8/4.
 */
public class PriceHandlerFactory {
    /**
     * 构建责任链的工厂方法
     *
     * 单一职责原则  创建责任链的工厂单独出来
     * @return
     */
    public static PriceHandle createPriceHandler() {
        PriceHandle saler = new Saler();
        PriceHandle director = new Director();
        PriceHandle president = new President();

        //构建后继
        saler.setSuccessor(director);
        director.setSuccessor(president);

        return saler;
    }
}
