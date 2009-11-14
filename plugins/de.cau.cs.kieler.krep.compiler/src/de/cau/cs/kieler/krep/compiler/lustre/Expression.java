package de.cau.cs.kieler.krep.compiler.lustre;

import java.util.HashMap;
import java.util.LinkedList;

import de.cau.cs.kieler.krep.compiler.exceptions.ClockException;
import de.cau.cs.kieler.krep.compiler.exceptions.TypeException;
import de.cau.cs.kieler.krep.compiler.prog.Type;

/**
 * Abstract superclass for Lustre(ec) expression
 * 
 * @author ctr
 * 
 */
abstract public class Expression {
    protected Type type = null;
    protected String name;
    protected Expression init;

    protected Expression(String name) {
        this.name = name;// TempName.get(name);
    }

    /**
     * make sure only simple variables are inside of pre operators
     * 
     * @param eqs
     *            additionally added equations
     * @return simplified expression
     */
    abstract public Expression propagatePre(HashMap<String, Expression> eqs);

    abstract public Expression extractPre(HashMap<String, Expression> eqs);

    /**
     * 
     * @return true if expression does not contain any subexpressions
     */
    abstract public boolean isAtom();

    /**
     * convert to clocked equations, this terminates if expression is too complex
     * 
     * @return expression as clocked equation
     */
    // abstract public ceq.Expression toCEQ();

    /**
     * clock for this expression, null if on base clock
     */
    protected ClockList clock;

    /**
     * Compute clock on which this expression runs
     * 
     * @param vars
     * @return list of all sub-clocks
     * @throws ClockException
     *             thrown if any clock error occurs
     */
    abstract public ClockList inferClock(HashMap<String, Variable> vars) throws ClockException;

    /**
     * Propagate to each expression, on which clock it runs. The clock vector should be computed by
     * inferClock before.
     * 
     * @param l
     *            clock-vector for the expression
     */
    abstract public void propagateClock(ClockList l);

    /**
     * remove all clock operators inside
     * 
     * @param basename
     *            name of the expression, used for auxiliary expressions
     * @param stage
     *            indicate what clock operators have already been in this equation: 0: on top level
     *            1: beyond current 2: beyond when 3: beyond ->
     * @param aux
     *            additional equations
     * @return new expression, without current, ->, and when
     */
    abstract public de.cau.cs.kieler.krep.compiler.ceq.Equation declock(String basename, int stage,
            String C, LinkedList<de.cau.cs.kieler.krep.compiler.ceq.Equation> aux);

    /**
     * 
     * @return name of the clock on which this expression runs
     */
    public String getClock() {
        return clock.getClock();
    }

    /**
     * compute types and set type member recursively in all sub-expressions
     * 
     * @throws TypeException
     *             thrown if any type problem occurs
     */
    abstract protected void inferType() throws TypeException;

    /**
     * 
     * @return type of the expression
     */
    public Type getType() {
        return type;
    }

    /**
     * @return unique Name of this expression
     */
    public String getName() {
        return name;
    }

    /**
     * @param e
     *            expression to initialize this variable
     */
    public void setInit(Expression e) {
        init = e;
    }

    /**
     * @return expression to initialize this variable
     */
    public Expression getInit() {
        return init;
    }

    public abstract Expression liftClock();

    public void addClock(String c) {
        clock.addClock(c);

    }
}
