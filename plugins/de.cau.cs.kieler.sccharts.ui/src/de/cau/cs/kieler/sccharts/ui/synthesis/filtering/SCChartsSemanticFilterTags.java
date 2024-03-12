/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
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
 * @author tik
 */
public abstract class SCChartsSemanticFilterTags {
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

    /** Tag giving semantic meaning that the element is initial. */
    public static final SemanticFilterTag INITIAL = new SemanticFilterTag("initial");
    /** Tag giving semantic meaning that the element is a dataflow region. */
    public static final SemanticFilterTag NOT_INITIAL_STATE = new SemanticFilterTag("notInitialState");
    /** Tag giving semantic meaning that the element is final. */
    public static final SemanticFilterTag FINAL = new SemanticFilterTag("final");

    /** Returns a tag giving semantic meaning how many declarations an element has. */
    public static SemanticFilterTag DECLARATIONS(Double num) {
        return new SemanticFilterTag("numDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many input declarations an element has. */
    public static SemanticFilterTag INPUT_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numInputDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many output declarations an element has. */
    public static SemanticFilterTag OUTPUT_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numOutputDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many static declarations an element has. */
    public static SemanticFilterTag STATIC_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numStaticDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many signal declarations an element has. */
    public static SemanticFilterTag SIGNAL_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numSignalDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many const declarations an element has. */
    public static SemanticFilterTag CONST_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numConstDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many extern declarations an element has. */
    public static SemanticFilterTag EXTERN_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numExternDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many volatile declarations an element has. */
    public static SemanticFilterTag VOLATILE_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numVolatileDeclarations", num);
    }
    /** Returns a tag giving semantic meaning how many global declarations an element has. */
    public static SemanticFilterTag GLOBAL_DECLARATIONS(Double num) {
        return new SemanticFilterTag("numGlobalDeclarations", num);
    }
}
