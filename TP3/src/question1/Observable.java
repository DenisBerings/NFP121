package question1;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    // On déclare une liste d'Observer
    private List<Observer> observerList;
    // On crée un constructuer
    Observable() {
        //on instancie la liste d'observer
        this.observerList = new ArrayList<>();
    }
    // On crée une méthode add
    public void add(Observer o) {
        this.observerList.add(o);
    }
    // On crée une méthode remove
    public void remove(Observer o) {
        this.observerList.remove(o);
    }
    // On crée une méthode getObserverCount
    public int getObserverCount() {
        return this.observerList.size();
    }
    // On crée une méthode notifyObs
    public void notifyObs() {
        for (Observer o: this.observerList) {
            o.update();
        }
    }



}
