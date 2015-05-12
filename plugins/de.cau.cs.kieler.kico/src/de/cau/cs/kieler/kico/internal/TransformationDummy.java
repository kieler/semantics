/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.internal;

import java.util.HashSet;

/**
 * This class represents a transformation dummy for fast processing transformation dependencies. For
 * fast processing all attributes of this class are public. Only for internal KiCo usage!
 * 
 * @author cmot
 * @kieler.design 2015-03-11 proposed
 * @kieler.rating 2015-03-11 proposed yellow
 * 
 */
public class TransformationDummy {

    /** The dependencies. */
    public HashSet<TransformationDummy> dependencies = new HashSet<TransformationDummy>();

    /** The reverse dependencies. */
    public HashSet<TransformationDummy> reverseDependencies = new HashSet<TransformationDummy>();

    /** The transformation. */
    public TransformationHandler transformation;

    /** The id. */
    public String transformationId;

    /** The parent graph/list if any */
    public TransformationDummyGraph graph = null;

    /** The marked. */
    public boolean marked = false;

    public int order = -1;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new transformation dummy that belongs to a graph and represents a certain
     * transformation.
     * 
     * @param graph
     *            the graph
     * @param transformation
     *            the transformation
     */
    public TransformationDummy(TransformationDummyGraph graph, TransformationHandler transformation) {
        this.graph = graph;
        this.transformation = transformation;
        this.transformationId = transformation.getId();
    }

    // -------------------------------------------------------------------------

}
