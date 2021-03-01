package question1;

import java.util.Stack;

public class PileAdaptor implements PileI {

    public StackImpl stack;

    PileAdaptor(StackImpl stack) {
        this.stack = stack;
    }

    @Override
    public void empiler(Object o) {
        this.stack.push(o);
    }

    @Override
    public Object depiler() {
        this.stack.pop();
        return this.stack;
    }

    @Override
    public boolean estVide() {
        return this.stack.isEmpty();
    }

}
