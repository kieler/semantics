/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.filtering;

import de.cau.cs.kieler.klighd.filtering.SemanticFilterTag;

/**
 * Contains semantic filter tags for SCCharts.
 * 
 * @author stu215592
 */
public class SCChartsSemanticFilterTags {
    /** Tag giving semantic meaning that the element is a state. */
    public static final SemanticFilterTag STATE = new SemanticFilterTag("state");
    /** Tag giving semantic meaning that the element is a region. */
    public static final SemanticFilterTag REGION = new SemanticFilterTag("region");

    /** Tag giving semantic meaning that the element is a simple state. */
    public static final SemanticFilterTag SIMPLE_STATE = new SemanticFilterTag("simpleState");
    /** Tag giving semantic meaning that the element is a hierarchical state. */
    public static final SemanticFilterTag HIERARCHICAL_STATE =
            new SemanticFilterTag("hierarchicalState");
    /** Tag giving semantic meaning that the element is a connector state. */
    public static final SemanticFilterTag CONNECTOR_STATE = new SemanticFilterTag("connectorState");
    /** Tag giving semantic meaning that the element is a controlflow region. */
    public static final SemanticFilterTag CONTROLFLOW_REGION =
            new SemanticFilterTag("controlflowRegion");
    /** Tag giving semantic meaning that the element is a dataflow region. */
    public static final SemanticFilterTag DATAFLOW_REGION = new SemanticFilterTag("dataflowRegion");
    
    /** Tag giving semantic meaning that the element is a transition. */
    public static final SemanticFilterTag TRANSITION = new SemanticFilterTag("transition");    
    /** Tag giving semantic meaning that the element is a transition. */
    public static final SemanticFilterTag WEAK_TRANSITION = new SemanticFilterTag("weakTransition");    
    /** Tag giving semantic meaning that the element is a transition. */
    public static final SemanticFilterTag TERMINATING_TRANSITION = new SemanticFilterTag("terminatingTransition");    
    /** Tag giving semantic meaning that the element is a transition. */
    public static final SemanticFilterTag ABORTING_TRANSITION = new SemanticFilterTag("abortingTransition");

    /** Tag giving semantic meaning that the element is an initial state. */
    public static final SemanticFilterTag INITIAL_STATE = new SemanticFilterTag("initialState");
    /** Tag giving semantic meaning that the element is a dataflow region. */
    public static final SemanticFilterTag NOT_INITIAL_STATE = new SemanticFilterTag("notInitialState");
    /** Tag giving semantic meaning that the element is a final state. */
    public static final SemanticFilterTag FINAL_STATE = new SemanticFilterTag("finalState");
}
