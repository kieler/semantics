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
     * Options for Topdown layout
     */
    public static final SynthesisOption USE_TOPDOWN_LAYOUT = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Topdown Layout", false).setCategory(LAYOUT)
    public static final SynthesisOption TOPDOWN_LAYOUT_CHOICE = SynthesisOption.createChoiceOption("Topdown Layout Variant", #["Variant 1" ,"Variant 2", "Variant 3"], "Variant 1").setCategory(LAYOUT)
    public static final SynthesisOption TOPDOWN_HIERARCHICAL_NODE_WIDTH = SynthesisOption.createRangeOption("Topdown Hierarchical Node Width", 50.0f, 300.0f, 1.0f, 150.0f).setCategory(LAYOUT)
    public static final SynthesisOption TOPDOWN_HIERARCHICAL_NODE_ASPECT_RATIO = SynthesisOption.createRangeOption("Topdown Hierarchical Node Aspect Ratio", 0.5f, 2.0f, 0.01f, 1.41f).setCategory(LAYOUT)
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
}
