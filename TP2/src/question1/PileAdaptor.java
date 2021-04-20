package question1;
// On implémente l'interface PileI sur la class PileAdaptor
public class PileAdaptor implements PileI {
    // On instancie un objet StackImpl
    public StackImpl stack;
    // On crée un constructeur à 1 paramètre (1 objet StackImpl)
    PileAdaptor(StackImpl stack) {
        this.stack = stack;
    }
    // On surcharge la méthode empiler, héritée de l'interface PileI
    @Override
    public void empiler(Object o) {
      this.stack.push(o);
    }
    // On surcharge la méthode depiler, héritée de l'interface PileI
    @Override
    public Object depiler() {
        return this.stack.pop();
    }
    // On surcharge la méthode estVide, héritée de l'interface PileI
    @Override
    public boolean estVide() {
        return this.stack.isEmpty();
    }
}
