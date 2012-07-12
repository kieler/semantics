/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.synccharts.sim.ptolemy.oaw;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.ptolemy.moml.EntityType;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.OperatorType;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.kexpressions.Value;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.sim.ptolemy.SyncchartsSimPtolemyPlugin;

/**
 * The class XtendJava implements some Java escape code used in the model2model Xtend
 * transformation.
 * 
 * @author cmot
 */
public final class XtendJava {

    /** The modal models. */
    private static LinkedList<EntityType> modalModels =  new LinkedList<EntityType>();;

    /** The port names. */
    private static LinkedList<String> portNames = new LinkedList<String>();;

    /** The inputoutputtransformation. */
    private static boolean inputoutputtransformation = true;

    /** The raiselocalsignals. */
    private static boolean raiselocalsignals = true;

    /** The optimizeinputsignals. */
    private static boolean optimizeinputsignals = true;

    /** The optimizeoutputsignals. */
    private static boolean optimizeoutputsignals = false;
    
    private static final int SLEEP_TIME = 10; 

    //-------------------------------------------------------------------------
    
    /**
     * Utility class should not be instantiated.
     */
    private XtendJava() {
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the input output transformation.
     * 
     * @param enable
     *            the new input output transformation
     */
    public static void setInputOutputTransformation(final boolean enable) {
        inputoutputtransformation = enable;
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the input output transformation.
     * 
     * @return the input output transformation
     */
    public static boolean getInputOutputTransformation() {
        return inputoutputtransformation;
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the raise local signals.
     * 
     * @param enable
     *            the new raise local signals
     */
    public static void setRaiseLocalSignals(final boolean enable) {
        raiselocalsignals = enable;
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the raise local signals.
     * 
     * @return the raise local signals
     */
    public static boolean getRaiseLocalSignals() {
        return raiselocalsignals;
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * Sets the optimize input signals.
     * 
     * @param enable
     *            the new optimize input signals
     */
    public static void setOptimizeInputSignals(final boolean enable) {
        optimizeinputsignals = enable;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Gets the optimize input signals.
     * 
     * @return the optimize input signals
     */
    public static boolean getOptimizeInputSignals() {
        return optimizeinputsignals;
    }

    //-------------------------------------------------------------------------

    /**
     * Sets the optimize output signals.
     * 
     * @param enable
     *            the new optimize output signals
     */
    public static void setOptimizeOutputSignals(final boolean enable) {
        optimizeoutputsignals = enable;
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the optimize output signals.
     * 
     * @return the optimize output signals
     */
    public static boolean getOptimizeOutputSignals() {
        return optimizeoutputsignals;
    }

    //-------------------------------------------------------------------------
    
    /**
     * Reset queue2 delete.
     */
    public static void resetQueue2Delete() {
        if (modalModels == null) {
            modalModels = new LinkedList<EntityType>();;
        }
        modalModels.clear();
        if (portNames == null) {
            portNames = new LinkedList<String>();;
        }
        portNames.clear();
    }

    //-------------------------------------------------------------------------

    /**
     * Gets the queue size2 delete.
     * 
     * @return the queue size2 delete
     */
    public static int getQueueSize2Delete() {
        if (modalModels == null) {
            return 0;
        } else {
            return modalModels.size();
        }
    }

    //-------------------------------------------------------------------------
    
    /**
     * Enqueue2 delete.
     * 
     * @param modalModel
     *            the modal model
     * @param portName
     *            the port name
     */
    public static void enqueue2Delete(final EntityType modalModel, final String portName) {
        modalModels.push(modalModel);
        portNames.push(portName);
    }

    //-------------------------------------------------------------------------

    /**
     * Pop port name2 delete.
     * 
     * @return the string
     */
    public static String popPortName2Delete() {
        if (portNames != null && portNames.size() > 0) {
            return portNames.pop();
        } else {
            return null;
        }
    }

    //-------------------------------------------------------------------------

    /**
     * Pop modal model2 delete.
     * 
     * @return the entity type
     */
    public static EntityType popModalModel2Delete() {
        if (modalModels != null && modalModels.size() > 0) {
            return modalModels.pop();
        } else {
            return null;
        }
    }

    // --------------------------------------------------------------------

    /** The sem. */
    private static int sem = 0;

    /**
     * P.
     */
    public static synchronized void semP() {
        while (sem > 0) {
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sem++;
    }

    /**
     * V.
     */
    public static synchronized void semV() {
        sem--;
    }

    /**
     * The hash table used to remember marked states.
     * 
     * @param aString
     *            the a string
     */
    // static Hashtable<Integer,Node> ht = new Hashtable<Integer,Node>();

    // -------------------------------------------------------------------------

    /**
     * Dump a String to the system console for debugging purposes.
     * 
     * @param aString
     *            the a string
     */
    public static void dump(final String aString) {
        SyncchartsSimPtolemyPlugin.debug(aString);
    }

    /**
     * Dump i.
     * 
     * @param anInteger
     *            the an integer
     */
    public static void dumpI(final Integer anInteger) {
        SyncchartsSimPtolemyPlugin.debug(anInteger + "");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the URIFragment of a Node.
     * 
     * @param myState
     *            the my state
     * @return the URIFragment
     */
    public static String getURIFragment(final State myState) {
        // Returns the URI fragment that, when passed to getEObject will
        // return the given object.
        return myState.eResource().getURIFragment(myState).toString();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the URIFragment of a Transition.
     * 
     * @param myTransition
     *            the my transition
     * @return the URIFragment
     */
    public static String getURIFragment(final Transition myTransition) {
        // Returns the URI fragment that, when passed to getEObject will
        // return the given object.
        return myTransition.eResource().getURIFragment(myTransition).toString();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Removes the blancs.
     *
     * @param inText the in text
     * @return the string
     */
    public static String removeBlancs(final String inText) {
        if (inText == null) {
            return "";
        }
        return inText.replaceAll(" ", "");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the state id.
     * 
     * @param myState
     *            the my state
     * @return the state id
     */
    public static String getStateId(final State myState) {
        if (myState == null) {
            return "";
        }
        String returnId = "";
        if ((myState.getLabel() != null) && (myState.getLabel().length() > 0)) {
            returnId = (removeBlancs(myState.getLabel()) + "_" + hash(getURIFragment(myState)));
        } else {
            returnId = (removeBlancs(myState.getId()) + "_" + hash(getURIFragment(myState)));
        }
        // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + returnId);
        return returnId;

        // return hash(getURIFragment(myState));
    }

    // -------------------------------------------------------------------------

    /**
     * Returns a hash value of a String..
     * 
     * @param string
     *            the String
     * 
     * @return the hash value as a String
     */
    public static String hash(final String string) {
        String hashCode = string.hashCode() + "";
        if (hashCode.startsWith("-")) {
            hashCode = hashCode.substring(1);
        }
        return hashCode;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the port type.
     * 
     *    0 == not used
     *    1 == input, used in expressions, trigger
     *    2 == output, used in effects
     *   -1 == error, used in in expression AND effects
     *
     * @param signal the signal
     * @param region the region
     * @return the port type
     */
    public static int getPortType(final Signal signal, final Region region) {
        SyncchartsSimPtolemyPlugin.debug("Checking " + region.getStates().size()
                + " inner states for signal:" + signal.getName());
        boolean isOutput = isOutputPort(signal, region);
        SyncchartsSimPtolemyPlugin.debug("Again Checking for signal:" + signal.getName());
        boolean isInput = isInputPort(signal, region);
        SyncchartsSimPtolemyPlugin.debug("out:" + isOutput + ",  in:" + isInput);
        if (isOutput && isInput) {
            return -1;
        } else if (isInput) {
            return 1;
        } else if (isOutput) {
            return 2;
        } else {
            return 0;
        }
    }

    /**
     * Checks if is output port.
     * 
     * @param signal
     *            the signal
     * @param region
     *            the region
     * @return true, if is output port
     */
    public static boolean isOutputPort(final Signal signal, final Region region) {
        EList<State> innerStates = region.getStates();
        for (int c = 0; c < innerStates.size(); c++) {
            State innerState = innerStates.get(c);
            EList<Transition> transitions = innerState.getOutgoingTransitions();
            // search all outgoing transition for this signal
            for (int cc = 0; cc < transitions.size(); cc++) {
                Transition transition = transitions.get(cc);
                if (isSignalInEffect(signal, transition.getEffects())) {
                    return true;
                }
            } // next transition
             // search inner regions recursively
            EList<Region> innerRegions = innerState.getRegions();
            for (int cc = 0; cc < innerRegions.size(); cc++) {
                if (isOutputPort(signal, innerRegions.get(cc))) {
                    return true;
                }
            } // next inner region
        }
        return false;
    }

    /**
     * Checks if is signal in effect.
     * 
     * @param signal
     *            the signal
     * @param effects
     *            the effects
     * @return true, if is signal in effect
     */
    private static boolean isSignalInEffect(final Signal signal, final EList<Effect> effects) {
        for (int c = 0; c < effects.size(); c++) {
            if (effects.get(c) instanceof Emission) {
                Emission emission = (Emission) effects.get(c);
                if (signal == emission.getSignal()) {
                    return true;
                }
            }
        }
        return false;
    }

    /** The moved signal names. */
    private static EList<String> movedSignalNames;

    /**
     * Gets the moved signal names.
     * 
     * @return the moved signal names
     */
    public static EList<String> getMovedSignalNames() {
        return movedSignalNames;
    }

    /**
     * Move to signal list.
     * 
     * @param newList
     *            the new list
     * @param signalList
     *            the signal list
     */
    public static void moveToSignalList(final EList<Signal> newList,
            final EList<Signal> signalList) {
        movedSignalNames = new BasicEList<String>();
        if (signalList == null) {
            return;
        }
        for (int c = 0; c < signalList.size(); c++) {
            movedSignalNames.add(signalList.get(c).getName());
            newList.add(signalList.get(c));
        }
    }

    /**
     * Checks if is input port.
     * 
     * @param signal
     *            the signal
     * @param region
     *            the region
     * @return true, if is input port
     */
    public static boolean isInputPort(final Signal signal, final Region region) {
        EList<State> innerStates = region.getStates();
        for (int c = 0; c < innerStates.size(); c++) {
            State innerState = innerStates.get(c);
            EList<Transition> transitions = innerState.getOutgoingTransitions();
            // search all outgoing transition for this signal
            for (int cc = 0; cc < transitions.size(); cc++) {
                Transition transition = transitions.get(cc);
                if (isSignalInExpression(signal, transition.getTrigger())) {
                    return true;
                }
            } // next transition
             // search inner regions recursively
            EList<Region> innerRegions = innerState.getRegions();
            for (int cc = 0; cc < innerRegions.size(); cc++) {
                if (isInputPort(signal, innerRegions.get(cc))) {
                    return true;
                }
            } // next inner region
        }
        return false;
    }

    /**
     * Checks if is signal in expression.
     * 
     * @param signal
     *            the signal
     * @param expression
     *            the expression
     * @return true, if is signal in expression
     */
    private static boolean isSignalInExpression(final Signal signal,
            final Expression expression) {
        boolean returnValue = false;
        if (expression instanceof OperatorExpression) {
            OperatorExpression operatorExpression = (OperatorExpression) expression;
            EList<Expression> subExpressionList = operatorExpression.getSubExpressions();
            for (int c = 0; c < subExpressionList.size(); c++) {
                Expression subExpression = subExpressionList.get(c);
                returnValue |= isSignalInExpression(signal, subExpression);
                if (returnValue) {
                    return returnValue; // shortcut
                }
            }
        } else if (expression instanceof ValuedObjectReference) {
            ValuedObject valObj = ((ValuedObjectReference) expression).getValuedObject();
            if (valObj instanceof Signal) {
                Signal sig = (Signal) valObj;
                SyncchartsSimPtolemyPlugin.debug(sig.getName() + "==" + signal.getName());
                if (sig == signal) {
                    return true;
                    // SyncchartsSimPtolemyPlugin.DEBUG("-> NO");
                }
            }
        }
        return returnValue;
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the trigger.
     * 
     * @param expression
     *            the expression
     * @param terminatedURIHash
     *            the terminated uri hash
     * @return the string
     */
    public static String buildTrigger(final Expression expression,
            final String terminatedURIHash) {
        String trigger = buildExpression(expression);
        if (!terminatedURIHash.equals("")) {
            // replace any trigger in this case
            // no trigger should be there in the normal, correct case
            trigger = "terminated" + terminatedURIHash + "_isPresent";
        }
        return trigger;
    }

    /**
     * Checks if is local.
     * 
     * @param signal
     *            the signal
     * @return true, if is local
     */
    public static boolean isLocal(final Signal signal) {
        return (!signal.isIsInput() && (!signal.isIsOutput()));
    }

    /**
     * Builds the effect.
     * 
     * @param myEffectList
     *            the my effect list
     * @param terminatedURIHash
     *            the terminated uri hash
     * @return the string
     */
    public static String buildEffect(final EList<Effect> myEffectList,
            final String terminatedURIHash) {
        StringBuffer myEmissionBuf = new StringBuffer();
        for (int c = 0; c < myEffectList.size(); c++) {
            if (myEffectList.get(c) instanceof Emission) {
                Emission emission = (Emission) myEffectList.get(c);
                if (myEmissionBuf.length() > 0) {
                    myEmissionBuf.append("; ");
                }
                myEmissionBuf.append(emission.getSignal().getName());
                if (isLocal(emission.getSignal())) {
                    // local signal -> set output signal -> signalo
                    myEmissionBuf.append("_o");
                }
                if (emission.getNewValue() == null) {
                    myEmissionBuf.append("=1"); // pure signals
                } else {
                    myEmissionBuf.append("=" + buildExpression(emission.getNewValue()));
                }
            }
        }
        if (!terminatedURIHash.equals("")) {
            if (myEmissionBuf.length() > 0) {
                myEmissionBuf.append("; ");
            }
            myEmissionBuf.append("terminated" + terminatedURIHash + "=1");
        }
        return myEmissionBuf.toString();
    }

    /**
     * Builds the expression.
     * 
     * @param expression
     *            the expression
     * @return the string
     */
    public static String buildExpression(final Expression expression) {
        //String expressionString = "";
        StringBuffer expressionStringBuf = new StringBuffer();
        if (expression instanceof Value) {
            expressionStringBuf.append(((Value) expression).toString());
        } else if (expression instanceof OperatorExpression) {
            OperatorExpression operatorExpression = (OperatorExpression) expression;
            OperatorType operator = operatorExpression.getOperator();
            String operatorString = translateOperator(operator.getLiteral());
            EList<Expression> subExpressionList = operatorExpression.getSubExpressions();
            expressionStringBuf.append("(");
            for (int c = 0; c < subExpressionList.size(); c++) {
                Expression subExpression = subExpressionList.get(c);
                if ((!expressionStringBuf.toString().equals("(") || (operatorString.equals("!")))) {
                    expressionStringBuf.append(" " + operatorString + " ");
                }
                expressionStringBuf.append(buildExpression(subExpression));
            }
            expressionStringBuf.append(")");
        } else if (expression instanceof ValuedObjectReference) {
            ValuedObjectReference signalReference = (ValuedObjectReference) expression;
            ValuedObject valObj = signalReference.getValuedObject();

            if (valObj instanceof Signal) {
                Signal signal = (Signal) valObj;

                String signalName = signal.getName();
                if (isLocal(signal)) {
                    // local signal -> set input signal -> signal i
                    signalName += "_i";
                }
                expressionStringBuf.append(signalName + "_isPresent");
            }
        }
        return expressionStringBuf.toString();
    }

    /**
     * Translate operator.
     * 
     * @param syncchartsOperator
     *            the synccharts operator
     * @return the string
     */
    private static String translateOperator(final String syncchartsOperatorParam) {
        String syncchartsOperator = syncchartsOperatorParam;
        SyncchartsSimPtolemyPlugin.debug("OP   :   " + syncchartsOperator);
        syncchartsOperator = syncchartsOperator.trim();
        if (syncchartsOperator.equalsIgnoreCase("EQ")) {
            return "==";
        }
        if (syncchartsOperator.equalsIgnoreCase("LT")) {
            return "<";
        }
        if (syncchartsOperator.equalsIgnoreCase("LEQ")) {
            return "<=";
        }
        if (syncchartsOperator.equalsIgnoreCase("GT")) {
            return ">";
        }
        if (syncchartsOperator.equalsIgnoreCase("GEQ")) {
            return ">=";
        }
        if (syncchartsOperator.equalsIgnoreCase("NOT")) {
            return "!";
        }
        if (syncchartsOperator.equalsIgnoreCase("VAL")) {
            return ""; // UNSUPPORTED
        }
        if (syncchartsOperator.equalsIgnoreCase("PRE")) {
            return ""; // UNSUPPORTED
        }
        if (syncchartsOperator.equalsIgnoreCase("AND")) {
            return "&&";
        }
        if (syncchartsOperator.equalsIgnoreCase("OR")) {
            return "||";
        }
        if (syncchartsOperator.equalsIgnoreCase("ADD")) {
            return "+";
        }
        if (syncchartsOperator.equalsIgnoreCase("SUB")) {
            return "-";
        }
        if (syncchartsOperator.equalsIgnoreCase("MULT")) {
            return "*";
        }
        if (syncchartsOperator.equalsIgnoreCase("DIV")) {
            return "/";
        }
        if (syncchartsOperator.equalsIgnoreCase("MOD")) {
            return "%";
        }
        return "";
    }

}
