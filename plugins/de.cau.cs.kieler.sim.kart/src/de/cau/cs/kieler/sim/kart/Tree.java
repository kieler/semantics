/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.synccharts.Scope;

/**
 * @author ssc
 *
 */
public class Tree {
    private Scope value;
    private List<Tree> children;
    
    public Tree(Scope value) {
        this.value = value;
        children = new LinkedList<Tree>();
    }
    
    public Scope getValue() {
        return value;
    }
    
    public Tree findValue(Scope find) {
        Tree retval = null;
        if(value != null && value.equals(find)) {
            retval = this;
        }
        else {
            for(Tree child : children) {
                retval = child.findValue(find);
                break;
            }
        }
        return retval;
    }
    
    public void addChild(Tree child) {
        this.children.add(child);
    }
    
    public String toString() {
        return toString("");
    }
    
    public String toString(String indent) {
        String retval = "";
        if(value != null) {
            retval = indent + "- " + getValue().getLabel() + "\n";
        }
        for(Tree child : children) {
            retval += child.toString(indent + "  ");
        }
        return retval;
    }
}