// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class ExtSlice extends sliceType {
    public java.util.List<sliceType> dims;

    private final static String[] fields = new String[] {"dims"};
    public String[] get_fields() { return fields; }

    public ExtSlice(java.util.List<sliceType> dims) {
        this.dims = dims;
        if (dims != null) {
            for(PythonTree t : dims) {
                addChild(t);
            }
        }
    }

    public ExtSlice(Token token, java.util.List<sliceType> dims) {
        super(token);
        this.dims = dims;
        if (dims != null) {
            for(PythonTree t : dims) {
                addChild(t);
            }
        }
    }

    public ExtSlice(int ttype, Token token, java.util.List<sliceType> dims) {
        super(ttype, token);
        this.dims = dims;
        if (dims != null) {
            for(PythonTree t : dims) {
                addChild(t);
            }
        }
    }

    public ExtSlice(PythonTree tree, java.util.List<sliceType> dims) {
        super(tree);
        this.dims = dims;
        if (dims != null) {
            for(PythonTree t : dims) {
                addChild(t);
            }
        }
    }

    public String toString() {
        return "ExtSlice";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("ExtSlice(");
        sb.append("dims=");
        sb.append(dumpThis(dims));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitExtSlice(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (dims != null) {
            for (PythonTree t : dims) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

}
