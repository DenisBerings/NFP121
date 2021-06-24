package question1;
// On implémente l'interface PileI sur la class PileAdaptor (test checkInstanceType())
public class PileAdaptor implements PileI {
    // On instancie un objet StackImpl (test checkInstanceType())
    public StackImpl stack;
    // On crée un constructeur à 1 paramètre (1 objet StackImpl) (test checkInstanceType())
    PileAdaptor(StackImpl stack) {
        this.stack = stack;
    }
    // On surcharge la méthode empiler, héritée de l'interface PileI (test testEmpiler())
    @Override
    public void empiler(Object o) {
      this.stack.push(o);
    }
    // On surcharge la méthode depiler, héritée de l'interface PileI (test testDepile())
    @Override
    public Object depiler() {
        return this.stack.pop();
    }
    // On surcharge la méthode estVide, héritée de l'interface PileI (test testEstVide())
    @Override
    public boolean estVide() {
        return this.stack.isEmpty();
    }
}
