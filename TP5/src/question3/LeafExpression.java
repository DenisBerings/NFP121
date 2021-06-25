package question3;
// On implémente l'interface Expression sur cette classe pour que celle-ci hérite de sa méthode abstraite accept()
public class LeafExpression implements Expression {
    // On déclare un entier value
    private int value;
    // On crée un constructeur qui prend l'entier en paramètre et l'instancie
    public LeafExpression(int value) {
        this.value = value;
    }
    // On génère le getter de l'entier instancié
    public int getValue() {
        return value;
    }
    /* On surcharge la méthode abstraite accept() héritée de l'interface Expression pour qu'elle 
       retourne un appel à la méthode visit() sur la liste de Visitor passée en paramètre */
    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
