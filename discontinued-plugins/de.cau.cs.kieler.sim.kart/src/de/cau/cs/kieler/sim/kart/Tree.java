/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * A simple tree in which Scope instances can be inserted. The tree is able to produce a textual
 * presentation of the scopes contained in it.
 * 
 * @author ssc, cmot
 * @kieler.design 2012-02-23 cmot
 * @kieler.rating 2012-02-23 yellow cmot
 */
public class Tree {

    /**
     * The value of this node.
     */
    private EObject value;

    // -------------------------------------------------------------------------

    /**
     * A list of successor Scopes.
     */
    private List<Tree> children;

    // -------------------------------------------------------------------------

    /**
     * Create a new empty tree.
     */
    public Tree() {
        this.value = null;
        children = new LinkedList<Tree>();
    }

    // -------------------------------------------------------------------------

    /**
     * Create a new tree with a specific value.
     * 
     * @param value
     *            the value contained in the root node of the tree
     */
    public Tree(final EObject value) {
        this.value = value;
        children = new LinkedList<Tree>();
    }

    // -------------------------------------------------------------------------

    /**
     * Retrieve the node's value.
     * 
     * @return the value contained in this node
     */
    public EObject getValue() {
        return value;
    }

    // -------------------------------------------------------------------------

    /**
     * Search for a specific value in the tree.
     * 
     * @param find
     *            the Scope instance to find
     * @return either the tree's node containing the searched Scope or null
     */
    public Tree findValue(final EObject find) {
        Tree retval = null;
        if (value != null && value.equals(find)) {
            retval = this;
        } else {
            for (Tree child : children) {
                retval = child.findValue(find);
                break;
            }
        }
        return retval;
    }

    // -------------------------------------------------------------------------

    /**
     * Add a child tree to this node.
     * 
     * @param child
     *            the tree to add as a child
     */
    public void addChild(final Tree child) {
        this.children.add(child);
    }

    // -------------------------------------------------------------------------

    /**
     * Return a textual representation of this tree.
     * 
     * @return the textual representation
     */
    public String toString() {
        return toString("");
    }

    // -------------------------------------------------------------------------

    /**
     * Return a textual representation of this tree.
     * 
     * @param indent
     *            a String to prepend before the node's value
     * @return a textual representation of this tree
     */
    public String toString(final String indent) {
        String retval = "";
        if (value != null) {
            retval = indent + "- " + getValue().toString() + "\n";
        }
        for (Tree child : children) {
            retval += child.toString(indent + "  ");
        }
        return retval;
    }

    // -------------------------------------------------------------------------

}
