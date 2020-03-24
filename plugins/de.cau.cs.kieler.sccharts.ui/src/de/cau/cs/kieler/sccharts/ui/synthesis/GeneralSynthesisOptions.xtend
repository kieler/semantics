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
    public static final SynthesisOption APPEARANCE = SynthesisOption.createCategory("Appearance")
    /** 
     * The navigation category 
     */
    public static final SynthesisOption NAVIGATION = SynthesisOption.createCategory("Navigation", false)
    /** 
     * The debugging category 
     */
    public static final SynthesisOption DEBUGGING = SynthesisOption.createCategory("Analysis / Debugging", false)
    /** 
     * The layout category 
     */
    public static final SynthesisOption LAYOUT = SynthesisOption.createCategory("Layout", false)
    /** 
     * Dataflow category 
     */
    public static final SynthesisOption DATAFLOW = SynthesisOption.createCategory("Dataflow", false).setCategory(APPEARANCE)
    /** 
     * References and OO / Inheritance
     */
    public static final SynthesisOption OO = SynthesisOption.createCategory("Object Orientation / References", false).setCategory(APPEARANCE)
    
    // -- OPTIONS --
    /** 
     * Option for setting the KLayLayered layout 
     */
    public static final SynthesisOption USE_KLAY = SynthesisOption.createCheckOption("KLayLayered", true).setCategory(LAYOUT)
    public static final SynthesisOption SHOW_ALL_SCCHARTS = SynthesisOption.createCheckOption("All SCCharts", false).setCategory(APPEARANCE)
    public static final SynthesisOption SHOW_COMMENTS = SynthesisOption.createCheckOption("Comment Nodes", true).setCategory(APPEARANCE)
    public static final SynthesisOption SHOW_USER_LABELS = SynthesisOption.createCheckOption("User Labels", true).setCategory(APPEARANCE)
    /** 
     * Scope call parameters synthesis option 
     */
    public static final SynthesisOption SHOW_BINDINGS = SynthesisOption.createCheckOption("Binding Parameters", true).setCategory(OO)
    /** 
     * inherited declarations and regions synthesis option 
     */
    public static final SynthesisOption SHOW_INHERITANCE = SynthesisOption.createCheckOption("Inheritance Preview", true).setCategory(OO)
    public static final SynthesisOption SHOW_INHERITANCE_EDGES = SynthesisOption.createCheckOption("Inheritance Hierarchy", false).setCategory(OO)
    public static final SynthesisOption SHOW_METHOD_BODY = SynthesisOption.createCheckOption("Method Implementation", true).setCategory(OO)
    /** 
     * inherited declarations and regions synthesis option 
     */
    public static final SynthesisOption SHOW_CAUSAL_DATAFLOW = SynthesisOption.createCheckOption("Causal Dataflow",false).setCategory(DEBUGGING)
}
