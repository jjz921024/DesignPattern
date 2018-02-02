package responsibilitychain.better;

import java.util.List;

/**
 * 责任链，维护每个handler
 * Created by Jun on 2018/2/2.
 */
public class Chain {
    private List<ChainHandler> handles;

    // handler的引用
    private int index = 0;

    // List维护着handler
    public Chain(List<ChainHandler> handles) {
        this.handles = handles;
    }

    public void proceed() {
        if (index >= handles.size())
            return;
        // 获得下一个handler，并调用
        handles.get(index++).execute(this);
    }

}
