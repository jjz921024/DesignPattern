package responsibilitychain.pojo;

/**
 * Created by Jun on 2017/8/4.
 */
public class Saler extends PriceHandle{

    /**
     * 每个handler可以处理的逻辑
     */
    @Override
    public void processDiscount(float discount) {
        if (discount < 0.05) {
            System.out.println(this.getClass().getName() + "批准了折扣：" + discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
