package question1;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    // On déclare une liste d'Observer
    private List<Observer> observerList;
    // On crée un constructeur qui va instancier la liste observerList (et qui sera le constructeur par defaut de la classe fille "Cac40")
    Observable() {
        this.observerList = new ArrayList<>();
    }
    // On crée une méthode add qui prend un objet de type Observer en paramètre et l'ajoute à la liste observerList
    public void add(Observer o) {
        this.observerList.add(o);
    }
    // On crée une méthode remove qui prend un objet de type Observer en paramètre et le retire de la liste observerList
    public void remove(Observer o) {
        this.observerList.remove(o);
    }
    // On crée une méthode getObserverCount qui retourne la taille de la liste observerList
    public int getObserverCount() {
        return this.observerList.size();
    }
    // On crée une méthode notifyObs qui appelle la méthode update() sur chaque observer de la liste observerList
    public void notifyObs() {
        for (Observer o: this.observerList) {
            o.update();
        }
    }
}
