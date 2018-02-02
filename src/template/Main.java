package template;

import org.junit.Test;

/**
 * Created by Jun on 2017/8/4.
 */
public class Main {

    @Test
    public void test() {
        Coffee coffee = new Coffee();
        coffee.prepareBeverageTemplate();

        System.out.println("\n");

        Tea tea = new Tea();
        tea.prepareBeverageTemplate();

    }
}
