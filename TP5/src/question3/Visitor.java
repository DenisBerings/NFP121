package question3;

public abstract class Visitor<T> {
    /* On impose 2 méthodes visit ayant une signature différente (polymorphisme ad-hoc)
       aux classes filles qui étendront cette classe abstraite */
    public abstract T visit(LeafExpression n);
    public abstract T visit(Substraction s);
}
