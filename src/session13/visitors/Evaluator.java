package session13.visitors;

import session13.mathexpression.*;
import session13.visitors.Visitor;

public class Evaluator implements Visitor {
    int result;
    int currentInteger;
    Node lastOperation = new SumNode("+");

    @Override
    public void visit(IntegerNode node) {
        this.currentInteger = node.getIntValue();

        this.lastOperation.accept(this);
    }

    @Override
    public void visit(SumNode node) {
        this.result += this.currentInteger;
        this.lastOperation = node;
    }

    @Override
    public void visit(EqualNode node) {

    }

    @Override
    public void visit(SubstractionNode node) {
        this.result -= this.currentInteger;
        this.lastOperation = node;
    }

    @Override
    public String toString() {
        return "Result = " + this.result;
    }
}
