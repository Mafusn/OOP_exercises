package session13.visitors;

import session13.mathexpression.EqualNode;
import session13.mathexpression.IntegerNode;
import session13.mathexpression.SubstractionNode;
import session13.mathexpression.SumNode;

public class CountOperations implements Visitor{
    int num_operations = 0;


    @Override
    public void visit(IntegerNode node) {

    }

    @Override
    public void visit(SumNode node) {
        num_operations++;
    }

    @Override
    public void visit(EqualNode node) {

    }

    @Override
    public void visit(SubstractionNode node) {
        num_operations++;
    }

    @Override
    public String toString() {
        return "CountOperations{" +
                "num_operations=" + num_operations +
                '}';
    }
}
