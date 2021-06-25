package question2;
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
    /* On surcharge la méthode interpreter() hétitée de l'interface Expression pour qu'elle retourne  
       la soustraction des apples de méthodes intepreter() sur les 2 objets Expression */
    @Override
    public int interpreter() {
        return this.op1.interpreter() - this.op2.interpreter();
    }
}
