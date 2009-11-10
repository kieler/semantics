package ceq;

import java.util.LinkedList;

/**
 * @author ctr
 * static helper classes for clocked equations
 */
public class Ceq {
    /**
     * @param name
     * @param inputs
     * @param outputs
     * @param locals
     * @param eqs
     * @return generate Lustre code for a given set of clocked equations
     */
    public static String toLustre(final String name, final LinkedList<? extends Variable> inputs,
	    final LinkedList<? extends Variable> outputs, final LinkedList<? extends Variable> locals,
	    final LinkedList<Equation> eqs, final LinkedList<Automaton> ssms) {
	String res = "node " + name + " (\n";
	for (final Variable v : inputs) {
	    res += "    " + v.toString() + ";\n";
	}
	res += ") returns (\n";
	for (final Variable v : outputs) {
	    res += "    " + v.toString() + ";\n";
	}
	res += ");\n";
	if (!locals.isEmpty()) {
	    res += "var\n";
	    for (final Variable v : locals) {
		res += "    " + v.toString() + ";\n";
	    }
	}
	res += "let\n";
	for (final Equation eq : eqs) {
	    res += "  " + eq.toString();
	}
	res += "\n";
		
	for (final Automaton ssm: ssms){
	    res += ssm.toString();
	}
	res += "tel\n";
	return res;
    }
}
