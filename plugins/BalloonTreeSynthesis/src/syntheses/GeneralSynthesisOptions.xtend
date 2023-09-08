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
package syntheses

import de.cau.cs.kieler.klighd.SynthesisOption

/**
 * @author mka
 *
 */
final class GeneralSynthesisOptions {
    
    private new() {}
    
    
    public static final SynthesisOption DEBUGGING = SynthesisOption.createCategory(GeneralSynthesisOptions, "Debugging")
    public static final SynthesisOption SIZES = SynthesisOption.createCategory(GeneralSynthesisOptions, "Sizes")
    
    public static final SynthesisOption COMPOUND_NODE_ALPHA = SynthesisOption.createRangeOption(GeneralSynthesisOptions, "Compound Nodes Transparency Alpha Value", 0, 255, 255).setCategory(DEBUGGING)
    public static final SynthesisOption SHOW_LAYOUT_EDGES = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Show Layout Edges", false).setCategory(DEBUGGING)
    public static final SynthesisOption SHOW_BOUNDING_BOXES = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Show Bounding Boxes", false).setCategory(DEBUGGING)
    
    public static final SynthesisOption CENTER_ON_ROOT = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Center On Root", true)
    public static final SynthesisOption ROUNDED_BOUNDING_BOX = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Use Rounded Bounding Boxes", false)
    
    public static final SynthesisOption STRAIGHT_EDGE_LENGTH = SynthesisOption.createRangeOption(GeneralSynthesisOptions, "Straight Edge Length", 0f, 100f, 0f).setCategory(SIZES)
    public static final SynthesisOption BALLOON_RADIUS = SynthesisOption.createRangeOption(GeneralSynthesisOptions, "Balloon Radius", 0f, 100f, 35f).setCategory(SIZES)
    public static final SynthesisOption LEAF_RADIUS = SynthesisOption.createRangeOption(GeneralSynthesisOptions, "Leaf Radius", 0f, 100f, 20f).setCategory(SIZES)
}