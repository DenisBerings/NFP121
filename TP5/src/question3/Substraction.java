package question3;

// On implémente l'interface Expression sur cette classe pour que celle-ci hérite de sa méthode interpreter()
public class Substraction implements Expression {
    // On déclare 2 objets de type Expression
    Expression op1;
    Expression op2;
    // On crée un constructeur qui prend les 2 objets Expression en paramètre et les instancie
    public Substraction(Expression op1, Expression op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
    /* On surcharge la méthode abstraite accept() héritée de l'interface Expression pour qu'elle 
       retourne un appel à la méthode visit() sur la liste de Visitor passée en paramaère */
    @Override
    public <T> T accept(Visitor<T> v) {
        return v.visit(this);
    }
}
