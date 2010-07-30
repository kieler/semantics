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

import de.cau.cs.kieler.core.expressions.Expression;
import de.cau.cs.kieler.core.expressions.OperatorExpression;
import de.cau.cs.kieler.core.expressions.OperatorType;
import de.cau.cs.kieler.core.expressions.Signal;
import de.cau.cs.kieler.core.expressions.Value;
import de.cau.cs.kieler.core.expressions.ValuedObject;
import de.cau.cs.kieler.core.expressions.ValuedObjectReference;
import de.cau.cs.kieler.synccharts.Effect;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.sim.ptolemy.SyncchartsSimPtolemyPlugin;

/**
 * The class XtendJava implements some Java escape code used in the model2model
 * Xtend transformation.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 */
public class XtendJava {

    static LinkedList<Moml.EntityType> modalModels = null;
    static LinkedList<String> portNames = null;

    public final static void resetQueue2Delete() {
        modalModels = null;
        portNames = null;
    }

    public final static int getQueueSize2Delete() {
        if (modalModels == null) {
            return 0;
        } else {
            return modalModels.size();
        }
    }

    public final static void enqueue2Delete(final Moml.EntityType modalModel,
            final String portName) {
        if (modalModels == null) {
            modalModels = new LinkedList<Moml.EntityType>();
            portNames = new LinkedList<String>();
        }
        modalModels.push(modalModel);
        portNames.push(portName);
    }

    public final static String popPortName2Delete() {
        if (portNames == null || portNames.size() > 0) {
            return portNames.pop();
        } else {
            return null;
        }
    }

    public final static Moml.EntityType popModalModel2Delete() {
        if (modalModels == null || modalModels.size() > 0) {
            return modalModels.pop();
        } else {
            return null;
        }
    }

    // --------------------------------------------------------------------

    static int sem = 0;

    public synchronized final static void P() {
        while (sem > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sem++;
    }

    public synchronized final static void V() {
        sem--;
    }

    /** The hash table used to remember marked states. */
    // static Hashtable<Integer,Node> ht = new Hashtable<Integer,Node>();

    // -------------------------------------------------------------------------

    /**
     * Dump a String to the system console for debugging purposes.
     * 
     * @param aString
     *            the a string
     */
    public final static void dump(final String aString) {
        SyncchartsSimPtolemyPlugin.DEBUG(aString);
    }

    public final static void dumpI(final Integer anInteger) {
        SyncchartsSimPtolemyPlugin.DEBUG(anInteger + "");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the URIFragment of a Node.
     * 
     * @param myNode
     *            the Node
     * 
     * @return the URIFragment
     */
    public final static String getURIFragment(final State myState) {
        // Returns the URI fragment that, when passed to getEObject will
        // return the given object.
        return myState.eResource().getURIFragment(myState).toString();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the URIFragment of a Transition.
     * 
     * @param myNode
     *            the Node
     * 
     * @return the URIFragment
     */
    public final static String getURIFragment(final Transition myTransition) {
        // Returns the URI fragment that, when passed to getEObject will
        // return the given object.
        return myTransition.eResource().getURIFragment(myTransition).toString();
    }

    // -------------------------------------------------------------------------

    /**
     * Returns a hash value of a Node.
     * 
     * @param myState
     *            the my state
     * 
     * @return the hash value as a String
     */
    // public final static String hash(Node myNode) {
    // //int i = myNode.eContainer().eContents().indexOf(myNode);
    // //return ""+i;//myNode.hashCode();
    // return ""+myNode.hashCode();
    // }

    // -------------------------------------------------------------------------

    /**
     * Returns a hash value of a Transition.
     * 
     * @param myTransition
     *            the Transition
     * 
     * @return the hash value as a String
     */
    // public final static String hash(Transition myTransition) {
    // return ""+myTransition.hashCode();
    // }

    // -------------------------------------------------------------------------

    public final static String getStateId(final State myState) {
        if (myState == null) {
            return "";
        }
        if ((myState.getLabel() != null) && (myState.getLabel().length() > 0)) {
            return (myState.getLabel() + "_" + hash(getURIFragment(myState)));
        } else {
            return (myState.getId() + "_" + hash(getURIFragment(myState)));
        }
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
    public final static String hash(final String string) {
        String hashCode = string.hashCode() + "";
        if (hashCode.startsWith("-")) {
            hashCode = hashCode.substring(1);
        }
        return hashCode;
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the trigger of a Transition.
     * 
     * @param myTransition
     *            the Transition
     * 
     * @return the trigger as a String
     */
    // public final static String buildTrigger(Transition myTransition) {
    // String myTrigger = "";
    // if (myTransition.eClass().getName().equals("EventWait")) {
    // EventWait event = (EventWait)myTransition;
    // myTrigger = "count > 25*"+event.getSeconds();
    // }
    // if (myTransition.eClass().getName().equals("EventContact")) {
    // EventContact event = (EventContact)myTransition;
    // int track = event.getTrack().getValue();
    // int pos = event.getPosition().getValue();
    // myTrigger = "contact(" + track + ") == " + pos;
    // }
    // if (myTransition.eClass().getName().equals("EventOccupied")) {
    // EventOccupied event = (EventOccupied)myTransition;
    // EList<TRACK> trackList = event.getTrack();
    // String condition = event.getCondition().getLiteral();
    // String conjunction = event.getConjunction().getLiteral();
    // if(condition.equals("IF_NOT")) condition = "!(";
    // else condition = "(";
    // if(conjunction.equals("AND")) conjunction = " && ";
    // else conjunction = " || ";
    // myTrigger = condition;
    // for (int c = 0; c < trackList.size(); c++) {
    // if (c > 0) myTrigger += conjunction;
    // int track = ((TRACK)trackList.get(c)).getValue();
    // myTrigger += "occupied("+track+") == 1";
    // }
    // myTrigger += ")";
    // }
    // return myTrigger;
    // }

    // -------------------------------------------------------------------------

    // 0 == not used
    // 1 == input, used in expressions, trigger
    // 2 == output, used in effects
    // -1 == error, used in in expression AND effects
    public final static int getPortType(final Signal signal, final Region region) {
        SyncchartsSimPtolemyPlugin.DEBUG("Checking "
                + region.getStates().size() + " inner states for signal:"
                + signal.getName());
        boolean isOutput = isOutputPort(signal, region);
        SyncchartsSimPtolemyPlugin.DEBUG("Again Checking for signal:"
                + signal.getName());
        boolean isInput = isInputPort(signal, region);
        SyncchartsSimPtolemyPlugin
                .DEBUG("out:" + isOutput + ",  in:" + isInput);
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

    public final static boolean isOutputPort(final Signal signal,
            final Region region) {
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
            }// next transition
             // search inner regions recursively
            EList<Region> innerRegions = innerState.getRegions();
            for (int cc = 0; cc < innerRegions.size(); cc++) {
                if (isOutputPort(signal, innerRegions.get(cc))) {
                    return true;
                }
            }// next inner region
        }
        return false;
    }

    private final static boolean isSignalInEffect(final Signal signal,
            final EList<Effect> effects) {
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

    public static EList<String> movedSignalNames;

    public final static EList<String> getMovedSignalNames() {
        return movedSignalNames;
    }

    public final static void moveToSignalList(final EList<Signal> newList,
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

    public final static boolean isInputPort(final Signal signal,
            final Region region) {
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
            }// next transition
             // search inner regions recursively
            EList<Region> innerRegions = innerState.getRegions();
            for (int cc = 0; cc < innerRegions.size(); cc++) {
                if (isInputPort(signal, innerRegions.get(cc))) {
                    return true;
                }
            }// next inner region
        }
        return false;
    }

    private final static boolean isSignalInExpression(final Signal signal,
            final Expression expression) {
        boolean returnValue = false;
        if (expression instanceof OperatorExpression) {
            OperatorExpression operatorExpression = (OperatorExpression) expression;
            EList<Expression> subExpressionList = operatorExpression
                    .getSubExpressions();
            for (int c = 0; c < subExpressionList.size(); c++) {
                Expression subExpression = subExpressionList.get(c);
                returnValue |= isSignalInExpression(signal, subExpression);
                if (returnValue) {
                    return returnValue; // shortcut
                }
            }
        } else if (expression instanceof ValuedObjectReference) {
            ValuedObject valObj = ((ValuedObjectReference) expression)
                    .getValuedObject();
            if (valObj instanceof Signal) {
                Signal sig = (Signal) valObj;
                SyncchartsSimPtolemyPlugin.DEBUG(sig.getName() + "=="
                        + signal.getName());
                if (sig == signal) {
                    return true;
                    // SyncchartsSimPtolemyPlugin.DEBUG("-> NO");
                }
            }
        }
        return returnValue;
    }

    // -------------------------------------------------------------------------

    public final static String buildTrigger(final Expression expression,
            final String terminatedURIHash) {
        String trigger = buildExpression(expression);
        if (!terminatedURIHash.equals("")) {
            // replace any trigger in this case
            // no trigger should be there in the normal, correct case
            trigger = "terminated" + terminatedURIHash + "_isPresent";
        }
        return trigger;
    }

    public static boolean isLocal(final Signal signal) {
        return (!signal.isIsInput() && (!signal.isIsOutput()));
    }

    public final static String buildEffect(final EList<Effect> myEffectList,
            final String terminatedURIHash) {
        String myEmission = "";
        for (int c = 0; c < myEffectList.size(); c++) {
            if (myEffectList.get(c) instanceof Emission) {
                Emission emission = (Emission) myEffectList.get(c);
                if (myEmission != "") {
                    myEmission += "; ";
                }
                myEmission += emission.getSignal().getName();
                if (isLocal(emission.getSignal())) {
                    // local signal -> set output signal -> signalo
                    myEmission += "o";
                }
                if (emission.getNewValue() == null) {
                    myEmission += "=1"; // pure signals
                } else {
                    myEmission += "=" + buildExpression(emission.getNewValue());
                }
            }
        }
        if (!terminatedURIHash.equals("")) {
            if (!myEmission.equals("")) {
                myEmission += "; ";
            }
            myEmission += "terminated" + terminatedURIHash + "=1";
        }
        return myEmission;
    }

    public final static String buildExpression(final Expression expression) {
        String expressionString = "";
        if (expression instanceof Value) {
            expressionString = ((Value) expression).toString();
        } else if (expression instanceof OperatorExpression) {
            OperatorExpression operatorExpression = (OperatorExpression) expression;
            OperatorType operator = operatorExpression.getOperator();
            String operatorString = translateOperator(operator.getLiteral());
            EList<Expression> subExpressionList = operatorExpression
                    .getSubExpressions();
            expressionString += "(";
            for (int c = 0; c < subExpressionList.size(); c++) {
                Expression subExpression = subExpressionList.get(c);
                if ((!expressionString.equals("(") || (operatorString
                        .equals("!")))) {
                    expressionString += " " + operatorString + " ";
                }
                expressionString += buildExpression(subExpression);
            }
            expressionString += ")";
        } else if (expression instanceof ValuedObjectReference) {
            ValuedObjectReference signalReference = (ValuedObjectReference) expression;
            ValuedObject valObj = signalReference.getValuedObject();

            if (valObj instanceof Signal) {
                Signal signal = (Signal) valObj;

                String signalName = signal.getName();
                if (isLocal(signal)) {
                    // local signal -> set input signal -> signal i
                    signalName += "i";
                }
                expressionString += signalName + "_isPresent";
            }
        }
        return expressionString;
    }

    private static final String translateOperator(String syncchartsOperator) {
        SyncchartsSimPtolemyPlugin.DEBUG("OP   :   " + syncchartsOperator);
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

    // public final static String buildEmission(Node myNode) {
    // String myEmission = "";
    // if (myNode.eClass().getName().equals("SetSpeed")) {
    // SetSpeed setSpeed = (SetSpeed)myNode;
    // int speed = setSpeed.getSpeed();
    // int motormode = setSpeed.getDirection().getValue();
    // EList<TRACK> trackList = setSpeed.getTrack();
    // myEmission += "tracks={";
    // for (int c = 0; c < trackList.size(); c++) {
    // if (c > 0) myEmission += ",";
    // int track = ((TRACK)trackList.get(c)).getValue();
    // //myEmission += "track"+track+"={speed="+speed+"}";
    // myEmission += "track"+track
    // +"={speed="+speed+", motormode="+motormode+"}";
    // }
    // myEmission += "};";
    // if (trackList.size() == 0)
    // myEmission = "tracks={track12345={speed=0, motormode=0}};";
    // myEmission += "signals={signal12345={lights=0}};";
    // myEmission += "points={point12345={turn=0}}";
    // //myEmission += "tracks={track12345={speed=0, motormode=0}}";
    // }
    //
    // if (myNode.eClass().getName().equals("SetPoint")) {
    // SetPoint setPoint = (SetPoint)myNode;
    // int turn = setPoint.getDirection().getValue();
    // EList<POINT> pointList = setPoint.getPoint();
    // myEmission += "points={";
    // for (int c = 0; c < pointList.size(); c++) {
    // if (c > 0) myEmission += ",";
    // int point = ((POINT)pointList.get(c)).ordinal();
    // myEmission += "point"+point+"={turn="+turn+"}";
    // }
    // myEmission += "};";
    // if (pointList.size() == 0)
    // myEmission = "points={point12345={turn=0}};";
    // myEmission += "signals={signal12345={lights=0}};";
    // //myEmission += "points={point12345={turn=0}}";
    // myEmission += "tracks={track12345={speed=0, motormode=0}}";
    // }
    //
    // if (myNode.eClass().getName().equals("SetSignal")) {
    // SetSignal setSignal = (SetSignal)myNode;
    // int color = setSignal.getColor().getValue();
    // boolean position0 = false;
    // boolean position1 = false;
    // EList<POSITION> positionList = setSignal.getPosition();
    // for (int c = 0; c < positionList.size(); c++){
    // int posval = ((POSITION)positionList.get(c)).getValue();
    // if (posval == 0) position0 = true;
    // if (posval == 1) position1 = true;
    // }
    // EList<TRACK> trackList = setSignal.getTrack();
    // myEmission += "signals={";
    // for (int c = 0; c < trackList.size(); c++) {
    // if (c > 0) myEmission += ",";
    // int track = ((TRACK)trackList.get(c)).getValue();
    // if (position0) {
    // myEmission += "signal"+track+"a={lights="+color+"}";
    // }
    // if (position0 && position1) {
    // myEmission += ",";
    // }
    // if (position1) {
    // myEmission += "signal"+track+"b={lights="+color+"}";
    // }
    // }
    // myEmission += "};";
    // if (trackList.size() == 0)
    // myEmission = "signals={signal12345={lights=0}};";
    // myEmission += "points={point12345={turn=0}};";
    // myEmission += "tracks={track12345={speed=0, motormode=0}}";
    // }
    //
    // return myEmission;
    // }

    // -------------------------------------------------------------------------

    /**
     * Mark a state Node. This puts the Node myNode into the hash table to
     * remember it.
     * 
     * @param myNode
     *            the Node to mark
     */
    // public final static void markState(Node myNode) {
    // ht.put(myNode.hashCode(), myNode);
    // }

    // -------------------------------------------------------------------------

    /**
     * Checks whether a state Node myNode is marked.
     * 
     * @param myNode
     *            the Node to check
     * 
     * @return true, if state is marked
     */
    // public final static boolean isMarked(Node myNode) {
    // return ht.contains(myNode);
    // }

}
