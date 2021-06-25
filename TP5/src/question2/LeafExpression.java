package question2;
// On implémente l'interface Expression pour que celle-ci hérite de sa méthode interpreter()
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
    // On surcharge la méthode interpreter() hétitée de l'interface Expression pour qu'elle retourne l'entier instancié
    @Override
    public int interpreter() {
        return value;
    }
}
