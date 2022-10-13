/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ide.synthesis

import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * @author als
 */
class EquationSynthesisProperties {
    
    // IMPORTANT!!!
    // These properties should be copied back into the EquationSynthesis class as soon as it is migrated from ui to ide.
    
    public static final IProperty<Boolean> INLINED_REFERENCE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.inlinedReference", false);
    public static final IProperty<Boolean> INPUT_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.inputFlag", false);
    public static final IProperty<Boolean> OUTPUT_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.outputFlag", false);
    public static final IProperty<Boolean> DATA_ARRAY_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.dataArrayFlag", false);
    public static final IProperty<Boolean> DATA_ACCESS_FLAG = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.dataAccessFlag", false);
    public static final IProperty<Boolean> REFERENCE_NODE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.referenceNode", false);
    public static final IProperty<Boolean> SEQUENTIAL_EDGE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.sequential", false);
    public static final IProperty<Boolean> INSTANCE_EDGE = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.dataflow.instance", false);
}