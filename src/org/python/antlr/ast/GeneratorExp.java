// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class GeneratorExp extends exprType {
    public exprType elt;
    public java.util.List<comprehensionType> generators;

    private final static String[] fields = new String[] {"elt", "generators"};
    public String[] get_fields() { return fields; }

    public GeneratorExp(exprType elt, java.util.List<comprehensionType>
    generators) {
        this.elt = elt;
        addChild(elt);
        this.generators = generators;
        if (generators != null) {
            for(PythonTree t : generators) {
                addChild(t);
            }
        }
    }

    public GeneratorExp(Token token, exprType elt,
    java.util.List<comprehensionType> generators) {
        super(token);
        this.elt = elt;
        addChild(elt);
        this.generators = generators;
        if (generators != null) {
            for(PythonTree t : generators) {
                addChild(t);
            }
        }
    }

    public GeneratorExp(int ttype, Token token, exprType elt,
    java.util.List<comprehensionType> generators) {
        super(ttype, token);
        this.elt = elt;
        addChild(elt);
        this.generators = generators;
        if (generators != null) {
            for(PythonTree t : generators) {
                addChild(t);
            }
        }
    }

    public GeneratorExp(PythonTree tree, exprType elt,
    java.util.List<comprehensionType> generators) {
        super(tree);
        this.elt = elt;
        addChild(elt);
        this.generators = generators;
        if (generators != null) {
            for(PythonTree t : generators) {
                addChild(t);
            }
        }
    }

    public String toString() {
        return "GeneratorExp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("GeneratorExp(");
        sb.append("elt=");
        sb.append(dumpThis(elt));
        sb.append(",");
        sb.append("generators=");
        sb.append(dumpThis(generators));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitGeneratorExp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elt != null)
            elt.accept(visitor);
        if (generators != null) {
            for (PythonTree t : generators) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    private int lineno = -1;
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    public void setCol_offset(int num) {
        col_offset = num;
    }

}
