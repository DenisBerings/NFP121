package question3;
// On étend la classe abstraite Visitor() à cette classe pour que celle-ci hérite de ses méthodes visit()
public class VisitorCalculation extends Visitor<Integer> {
    /* On surcharge la méthode visite (LeafExpression) pour qu'elle retourne 
        un appel à la méthode getValue sur l'objet de type LeafExpression */
    @Override
    public Integer visit(LeafExpression n) {
        return n.getValue();
    }
    /* On surcharge la méthode visite (Substraction) pour qu'elle retourne l'opération des appels 
        aux méthode accept() sur les objets Epression de l'objet Substraction passé en paramètre */
    @Override
    public Integer visit(Substraction s) {
        return s.op1.accept(this) - s.op2.accept(this);
    }
}
