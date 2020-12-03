/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd

import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.scg.klighd.actions.NodePriorityActions
import de.cau.cs.kieler.scg.klighd.actions.OptNodePrioActions
import de.cau.cs.kieler.scg.klighd.actions.PrioStatementsActions
import de.cau.cs.kieler.scg.klighd.actions.SCCActions
import de.cau.cs.kieler.scg.klighd.actions.ThreadPriorityActions
import org.eclipse.elk.graph.properties.Property

import static extension de.cau.cs.kieler.klighd.SynthesisOption.*

/** 
 * @author als
 */
class SCGraphSynthesisOptions {
    /** 
     * Prevent Instantiation.
     */
    private new() {
    }
    
    // -- CATEGORIES --
    /** 
     * The topology category 
     */
    public static val TOPOLOGY = createCategory(SCGraphSynthesisOptions, "Topology")
    /** 
     * The topology category 
     */
    public static val DEPENDENCIES = createCategory(SCGraphSynthesisOptions, "Dependencies")
    /** 
     * The topology category 
     */
    public static val DEPENDENCIES_FILTER = createCategory(SCGraphSynthesisOptions, "Filter", false).setCategory(DEPENDENCIES)
    /** 
     * The prio category 
     */
    public static val PRIO = createCategory(SCGraphSynthesisOptions, "Priorities", false)
    /** 
     * The appearance category 
     */
    public static val APPEARANCE = createCategory(SCGraphSynthesisOptions, "Appearance")
    /** 
     * The layout category 
     */
    public static val LAYOUT = createCategory(SCGraphSynthesisOptions, "Layout", false)
    

    // -- OPTIONS --

    /** Show hierarchy */
    public static val SHOW_HIERARCHY = createCheckOption(SCGraphSynthesisOptions, "Hierarchy", true).setCategory(TOPOLOGY)
    /** Show basic blocks */
    public static val SHOW_BASICBLOCKS = createCheckOption(SCGraphSynthesisOptions, "Basic Blocks", false).setCategory(TOPOLOGY)
    /** Show scheduling blocks */
    public static val SHOW_SCHEDULINGBLOCKS = createCheckOption(SCGraphSynthesisOptions, "Scheduling Blocks", true).setCategory(TOPOLOGY)
    /** Show dead blocks */
    public static val SHOW_DEAD_BLOCKS = createCheckOption(SCGraphSynthesisOptions, "Dead Blocks", true).setCategory(TOPOLOGY)

    /** Show dependencies */
    public static val SHOW_DEPENDENCIES = createCheckOption(SCGraphSynthesisOptions, "Dependencies", true).setCategory(DEPENDENCIES)
    /** Show selective dependencies */
    public static val SELECTIVE_DEPENDENCIES = createCheckOption(SCGraphSynthesisOptions, "Only Dependencies of Selected Elements", false).setCategory(DEPENDENCIES)


    // Text constants for the dependency types filter
    public static val DEPENDENCYFILTERSTRING_WRITE_WRITE = "Write - Write"
    public static val DEPENDENCYFILTERSTRING_ABSWRITE_RELWRITE = "Abs. Write - Rel. Write"
    public static val DEPENDENCYFILTERSTRING_WRITE_READ = "Write - Read"
    public static val DEPENDENCYFILTERSTRING_RELWRITE_READ = "Rel. Write - Read"
    /** Show write-write dependencies */
    public static val SHOW_DEPENDENCY_WRITE_WRITE = createCheckOption(SCGraphSynthesisOptions, DEPENDENCYFILTERSTRING_WRITE_WRITE, true).setCategory(DEPENDENCIES_FILTER)
    /** Show absolute write-relative write dependencies */
    public static val SHOW_DEPENDENCY_ABSWRITE_RELWRITE = createCheckOption(SCGraphSynthesisOptions, DEPENDENCYFILTERSTRING_ABSWRITE_RELWRITE, true).setCategory(DEPENDENCIES_FILTER)
    /** Show write-read dependencies */
    public static val SHOW_DEPENDENCY_WRITE_READ = createCheckOption(SCGraphSynthesisOptions, DEPENDENCYFILTERSTRING_WRITE_READ, true).setCategory(DEPENDENCIES_FILTER)
    /** Show relative write-read dependencies */
    public static val SHOW_DEPENDENCY_RELWRITE_READ = createCheckOption(SCGraphSynthesisOptions, DEPENDENCYFILTERSTRING_RELWRITE_READ, true).setCategory(DEPENDENCIES_FILTER)
    /** Show non concurrent dependencies */
    public static val SHOW_NONCONCURRENT = createCheckOption(SCGraphSynthesisOptions, "Non-Concurrent", false).setCategory(DEPENDENCIES_FILTER)
    /** Show confluent dependencies */
    public static val SHOW_CONFLUENT = createCheckOption(SCGraphSynthesisOptions, "Confluent", false).setCategory(DEPENDENCIES_FILTER)
    
    
    /** Show caption */
    public static val SHOW_CAPTION = createCheckOption(SCGraphSynthesisOptions, "Captions", true).setCategory(APPEARANCE)
    /** Show Annotations */
    public static val SHOW_ANNOTATIONS = createCheckOption(SCGraphSynthesisOptions, "Annotations", false).setCategory(APPEARANCE)
    /** Show shadow */
    public static val SHOW_SHADOW = createCheckOption(SCGraphSynthesisOptions, "Shadows", true).setCategory(APPEARANCE)
    /** Hierarchy transparency */
    public static val HIERARCHY_TRANSPARENCY = createRangeOption(SCGraphSynthesisOptions, "Hierarchy Opacity", 0f, 255f, 128f).setCategory(APPEARANCE)
    /** Control flow thickness */
    public static val CONTROLFLOW_THICKNESS = createRangeOption(SCGraphSynthesisOptions, "Controlflow Thickness", 0.5f, 5f, 0.5f, 2f).setCategory(APPEARANCE)
    
    
    /** Align tick start */
    public static val ALIGN_TICK_START = createCheckOption(SCGraphSynthesisOptions, "Surface/Depth Nodes Fixed", true).setCategory(LAYOUT)
    /** Align entry/exit */
    public static val ALIGN_ENTRYEXIT_NODES = createCheckOption(SCGraphSynthesisOptions, "Entry/Exit Nodes Fixed", true).setCategory(LAYOUT)
    /** left or right conditionals */
    public static val CONDITIONAL_LEFT_OR_RIGTH = createCheckOption(SCGraphSynthesisOptions, "True Branches always Right", false).setCategory(LAYOUT)
    /** Show sausage folding */
    public static val SHOW_SAUSAGE_FOLDING = createCheckOption(SCGraphSynthesisOptions, "Sausage Folding", true).setCategory(LAYOUT)
    /** Layout dependencies */
    public static val LAYOUT_DEPENDENCIES = createCheckOption(SCGraphSynthesisOptions, "Dependency Routing", false).setCategory(LAYOUT)
    /** Layout separate cc */
    public static val LAYOUT_SEPARATE_CC = createCheckOption(SCGraphSynthesisOptions, "Separate Connected Components", false).setCategory(LAYOUT)
    /** Graph orientation */
    public static val ORIENTATION = createChoiceOption(SCGraphSynthesisOptions, "Orientation",<String>newLinkedList("Top-Down", "Left-Right"), "Top-Down").setCategory(LAYOUT)
    

    /** Show potential problems */
    public static val SHOW_POTENTIALPROBLEMS = createCheckOption(SCGraphSynthesisOptions, "Potential problems", true)
    /** Adaptive Zoom */
    public static val USE_ADAPTIVEZOOM = createCheckOption(SCGraphSynthesisOptions, "Adaptive Zoom", false)

    /**  
     * Returns a list of KlighD visualization options. Called by KlighD.
     * 
     * @return Returns a list of KlighD visualization options.
     */
    static def getSCGSynthesisOptions() {
        return newLinkedList(
            TOPOLOGY,
            SHOW_HIERARCHY,
            SHOW_BASICBLOCKS,
            SHOW_SCHEDULINGBLOCKS,
            SHOW_DEAD_BLOCKS,
            
            DEPENDENCIES,
            SHOW_DEPENDENCIES,
            SELECTIVE_DEPENDENCIES,
            
            DEPENDENCIES_FILTER,
            SHOW_DEPENDENCY_WRITE_WRITE,
            SHOW_DEPENDENCY_ABSWRITE_RELWRITE,
            SHOW_DEPENDENCY_WRITE_READ,
            SHOW_DEPENDENCY_RELWRITE_READ,
            SHOW_NONCONCURRENT,
            SHOW_CONFLUENT,
            
            PRIO,
            NodePriorityActions.SHOW_NODE_PRIORITY,
            ThreadPriorityActions.SHOW_THREAD_PRIO,
            PrioStatementsActions.SHOW_PRIO_STATEMENTS,
            OptNodePrioActions.SHOW_OPT_PRIO_ID,
            SCCActions.SHOW_SCC,
            
            APPEARANCE,
            SHOW_CAPTION,
            SHOW_ANNOTATIONS,
            SHOW_SHADOW,
            HIERARCHY_TRANSPARENCY,
            CONTROLFLOW_THICKNESS,
            
            LAYOUT,
            ALIGN_TICK_START,
            ALIGN_ENTRYEXIT_NODES,
            CONDITIONAL_LEFT_OR_RIGTH,
            SHOW_SAUSAGE_FOLDING,
            LAYOUT_DEPENDENCIES,
            LAYOUT_SEPARATE_CC,
            ORIENTATION,
            
            createSeparator("Other"),
            SHOW_POTENTIALPROBLEMS,
            USE_ADAPTIVEZOOM
        )
    }

}
