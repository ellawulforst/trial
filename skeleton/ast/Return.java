package ast;

import java.io.PrintStream;

public class Return extends Stmt {

    final Expr expr;

    public Return(Expr expr, Location loc) {
        super(loc);
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }

    @Override
    public String toString() {
        return "return " + expr + ";";
    }

    public void println(PrintStream ps) {
        ps.println("\nreturn " + expr + ";");
    }
}
