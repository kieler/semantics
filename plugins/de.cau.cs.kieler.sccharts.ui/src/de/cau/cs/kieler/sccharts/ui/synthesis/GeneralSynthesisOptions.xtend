/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook

/** 
 * The {@link SynthesisOption}s generally used in the {@link SRTGSynthesis}. <br>
 * Specific {@link SynthesisOption} related to {@link SynthesisHook} are declared in the
 * corresponding class.
 * @author als ssm
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 */
final class GeneralSynthesisOptions {
    /** 
     * Prevent Instantiation.
     */
    private new() {
    }

    // -- CATEGORIES --
    /** 
     * The appearance category 
     */
    public static final SynthesisOption APPEARANCE = SynthesisOption.createCategory(GeneralSynthesisOptions, "Appearance")
    /** 
     * The navigation category 
     */
    public static final SynthesisOption NAVIGATION = SynthesisOption.createCategory(GeneralSynthesisOptions, "Navigation", false)
    /** 
     * The debugging category 
     */
    public static final SynthesisOption DEBUGGING = SynthesisOption.createCategory(GeneralSynthesisOptions, "Analysis / Debugging", false)
    /** 
     * The layout category 
     */
    public static final SynthesisOption LAYOUT = SynthesisOption.createCategory(GeneralSynthesisOptions, "Layout", false)
    /** 
     * Dataflow category 
     */
    public static final SynthesisOption DATAFLOW = SynthesisOption.createCategory(GeneralSynthesisOptions, "Dataflow", false).setCategory(APPEARANCE)
    /** 
     * References and OO / Inheritance
     */
    public static final SynthesisOption OO = SynthesisOption.createCategory(GeneralSynthesisOptions, "Object Orientation / References", false).setCategory(APPEARANCE)
    
    // -- OPTIONS --
    /** 
     * Option for setting the KLayLayered layout 
     */
    public static final SynthesisOption USE_KLAY = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "KLayLayered", true).setCategory(LAYOUT)
    public static final SynthesisOption SHOW_ALL_SCCHARTS = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "All SCCharts", false).setCategory(APPEARANCE)
    public static final SynthesisOption SHOW_COMMENTS = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Comment Nodes", true).setCategory(APPEARANCE)
    public static final SynthesisOption SHOW_USER_LABELS = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "User Labels", true).setCategory(APPEARANCE)
    /** 
     * Scope call parameters synthesis option 
     */
    public static final SynthesisOption SHOW_BINDINGS = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Binding Parameters", true).setCategory(OO)
    /** 
     * inherited declarations and regions synthesis option 
     */
    public static final SynthesisOption SHOW_INHERITANCE = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Inheritance Preview", true).setCategory(OO)
    public static final SynthesisOption SHOW_INHERITANCE_EDGES = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Inheritance Hierarchy", false).setCategory(OO)
    public static final SynthesisOption SHOW_AGGREGATION_EDGES = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Aggregation", false).setCategory(OO)
    public static final SynthesisOption SHOW_METHOD_BODY = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Method Implementation", true).setCategory(OO)
    /** 
     * inherited declarations and regions synthesis option 
     */
    public static final SynthesisOption SHOW_CAUSAL_DATAFLOW = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Causal Dataflow",false).setCategory(DEBUGGING)
    /**
     * Topdown layout options
     */
    public static final SynthesisOption TOPDOWN_LAYOUT = SynthesisOption.createCategory(GeneralSynthesisOptions, "Top-down layout", false).setCategory(LAYOUT)
    public static final SynthesisOption TOPDOWN_LAYOUT_TOGGLE = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Top-down layout", false).setCategory(TOPDOWN_LAYOUT)
    public static final SynthesisOption TOPDOWN_LAYOUT_CONSTRAINT = SynthesisOption.createChoiceOption("Constraint", #["Fix Width", "Fix Height", "Optimized", "Square"], "Fix Width").setCategory(TOPDOWN_LAYOUT)
    public static final SynthesisOption AUTOMATIC_DIRECTION = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Automatic direction", false).setCategory(TOPDOWN_LAYOUT)
    public static final SynthesisOption NODE_SIZE_CONSTRAINT = SynthesisOption.createRangeOption("Node Size Constraint",1.0, 500, 34).setCategory(TOPDOWN_LAYOUT)
    public static final SynthesisOption DYNAMIC_NODE_SIZE_CONSTRAINT = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Dynamic node size constraint", false).setCategory(TOPDOWN_LAYOUT)
}
