package observer.common;

/**
 * Created by Jun on 2017/8/3.
 */
public class ConcreteObserver implements Observer {

    //观察者的状态
    private String observerState;

    /**
     * 观察者拿到订阅subject 进行处理
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        //更新观察者的状态
        observerState = ((ConcreteSubject)subject).getSubjectState();
    }
}
