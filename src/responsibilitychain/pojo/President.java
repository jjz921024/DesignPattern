package responsibilitychain.pojo;

/**
 * Created by Jun on 2017/8/4.
 */
public class President extends PriceHandle {
    @Override
    public void processDiscount(float discount) {
        if (discount < 0.45) {
            System.out.println(this.getClass().getName() + "批准了折扣：" + discount);
        } else {
            System.out.println(this.getClass().getName() + "拒绝了折扣：" + discount);
        }
    }
}
