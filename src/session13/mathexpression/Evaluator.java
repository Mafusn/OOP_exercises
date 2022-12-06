package session13.mathexpression;

import session13.visitors.Visitor;

public class Evaluator implements Visitor {
    int result;
    int lastInteger;
    Node lastOperation = new SumNode("+");

    @Override
    public void visit(IntegerNode node) {
        if (lastOperation.getString().equals("+")) {
            this.result += node.getIntValue();
        } else if (lastOperation.getString().equals("-")) {
            this.result -= node.getIntValue();
        }
    }

    @Override
    public void visit(SumNode node) {
        this.lastOperation = node;
    }

    @Override
    public void visit(EqualNode node) {

    }

    @Override
    public void visit(SubstractionNode node) {
        this.lastOperation = node;
    }

    @Override
    public String toString() {
        return "Result = " + this.result;
    }
}
