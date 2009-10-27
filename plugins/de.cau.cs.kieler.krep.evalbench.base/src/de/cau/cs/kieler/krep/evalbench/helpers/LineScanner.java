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
package de.cau.cs.kieler.krep.evalbench.helpers;

import java.util.HashMap;

import kiel.util.kit.analysis.DepthFirstAdapter;
import kiel.util.kit.node.ACompositeState;
import kiel.util.kit.node.AInitialTransition;
import kiel.util.kit.node.AOtherTransition;
import kiel.util.kit.node.ASimpleState;
import kiel.util.kit.node.Node;

/*
 * Created on Feb 6, 2009
 *
 */

public class LineScanner extends DepthFirstAdapter {

    private HashMap<String, Integer> states;
    private HashMap<Integer, Integer> sem2line;

    // private Stack<String> stack;
    // private String key;

    public LineScanner(final HashMap<String, Integer> states,
            final HashMap<Integer, Integer> sem2line) {
        super();
        this.states = states;
        this.sem2line = sem2line;
        // stack = new Stack<String>();
        // key = "";
    }

    @Override
    public void defaultIn(final Node node) {
        // System.err.println(node.getClass().getSimpleName() + ": " +
        // node.toString());
        super.defaultIn(node);
    }

    // @Override
    /*
     * public void caseADeclaration(ADeclaration node) {
     * //System.out.println("line " + node.getIdentifier().getLine() + ": \"" +
     * node.getIdentifier().getText() + "\""); key =
     * node.getIdentifier().getText().toUpperCase(); key = "declaration:" + key;
     * //System.out.println(key); if (sem2line.containsKey(key)){ for (int line
     * : sem2line.get(key)){
     * line2line.get(line).add(node.getIdentifier().getLine()); } } else{
     * System.out.println("unknown key: " + key); }
     * super.caseADeclaration(node); }
     */

    /*
     * @Override public void caseAEvent(AEvent node) {
     * //System.out.println("line " + node.getLocalevent().getLine() + ": \"" +
     * node.getString().getText() + "\""); key =
     * node.getString().getText().toUpperCase(); key = "declaration:" +
     * key.substring(key.indexOf('"')+1, key.lastIndexOf('"'));
     * //System.out.println(key); if (sem2line.containsKey(key)){ for (int line
     * : sem2line.get(key)){
     * line2line.get(line).add(node.getLocalevent().getLine()); } } else{
     * System.out.println("unknown key: " + key); } super.caseAEvent(node); }
     */

    /*
     * @Override public void caseAPriorityTransargument(APriorityTransargument
     * node) { //System.out.println("line " + node.getPriority().getLine() +
     * ": \"" + node.getInt() + "\""); key = node.getInt().getText(); key =
     * stack.peek().replaceAll("%", "%" + key.substring(key.indexOf('"')+1,
     * key.lastIndexOf('"')) + "%"); stack.pop(); stack.push(key);
     * super.caseAPriorityTransargument(node); }
     * 
     * @Override public void inAChart(AChart node) {
     * //System.out.println("line " + node.getIdentifier().getLine() + ": \"" +
     * node.getIdentifier().getText() + "\""); key = "state:" +
     * node.getIdentifier().getText().toUpperCase(); stack.push(key); if
     * (sem2line.containsKey(key)){ for (int line : sem2line.get(key)){
     * line2line.get(line).add(node.getIdentifier().getLine()); } } else{
     * System.out.println("unknown key: " + key); } //System.out.println(key);
     * super.inAChart(node); }
     */

    @Override
    public void inAInitialTransition(final AInitialTransition node) {
        System.out.println("unknown initial transition to: "
                + node.getTargetState());
        super.inAInitialTransition(node);
    }

    @Override
    public void inAOtherTransition(final AOtherTransition node) {
        String name = node.getSourceState().getText() + "->"
                + node.getTargetState().getText();

        Integer line = states.get(name.toUpperCase());
        if (line != null) {
            sem2line.put(line, node.getEdge().getLine());
        } else {
            System.out.println("unknown transition: " + name);
        }
        // System.out.println(key);
        super.inAOtherTransition(node);
    }

    @Override
    public void inACompositeState(final ACompositeState node) {
        String name = node.getIdentifier().getText();
        Integer line = states.get(name.toUpperCase());
        if (line != null) {
            sem2line.put(line, node.getIdentifier().getLine());
        } else {
            System.out.println("unknown state: " + name);
        }
        // System.out.println(key);
        super.inACompositeState(node);
    }

    @Override
    public void inASimpleState(final ASimpleState node) {
        String name = node.getIdentifier().getText();
        Integer line = states.get(name.toUpperCase());
        if (line != null) {
            sem2line.put(line, node.getIdentifier().getLine());
        } else {
            System.out.println("unknown state: " + name);
        }
        // System.out.println(key);
        super.inASimpleState(node);
    }

}
