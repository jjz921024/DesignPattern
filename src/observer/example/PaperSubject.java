package observer.example;

/**
 * Created by Jun on 2017/8/3.
 */
public class PaperSubject extends Subject {
    private int paperSubject;

    public int getPaperSubject() {
        return paperSubject;
    }

    public void setPaperSubject(int paperSubject) {
        this.paperSubject = paperSubject;
        this.notifyObserverPaper();
    }
}
