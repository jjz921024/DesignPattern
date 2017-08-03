package observer.common;

/**
 * Created by Jun on 2017/8/3.
 *
 * 继承Subject
 */
public class ConcreteSubject extends Subject{
    //内部维护了 主题的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    //更改主题状态时，要通知observer
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
