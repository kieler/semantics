/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis

import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.kicool.ProcessorReference
import de.cau.cs.kieler.klighd.krendering.KText

/**
 * Additional properties
 * 
 * @author ssm
 * @kieler.design 2017-06-12 proposed 
 * @kieler.rating 2017-06-12 proposed yellow
 */
class KNodeProperties {
    
    public static val IProperty<IntermediateData> INTERMEDIATE_DATA =
        new Property<IntermediateData>("de.cau.cs.kieler.kicool.ui.intermediateData", null)
        
    public static val IProperty<ProcessorReference> PROCESSOR_IDENTIFIER = 
        new Property<ProcessorReference>("de.cau.cs.kieler.kicool.processorEntry", null)
        
    public static final IProperty<KContainerRendering> PROCESSOR_ON_OFF_BUTTON = new Property<KContainerRendering>(
        "de.cau.cs.kieler.kicool.ui.ProcessorOnOffButton", null);

    public static final IProperty<KContainerRendering> PROCESSOR_INTERMEDIATE_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.kicool.ui.ProcessorIntermediateContainer", null);

    public static final IProperty<Boolean> SOURCE_NODE = new Property<Boolean>(
        "de.cau.cs.kieler.kicool.ui.SourceNode", false);
        
    public static final IProperty<String> PROCESSOR_CAPTION = new Property<String>(
        "de.cau.cs.kieler.kicool.ui.ProcessorCaption", null);
        
    public static final IProperty<Boolean> TEMPORARY_PROCESSOR = new Property<Boolean>(
        "de.cau.cs.kieler.kicool.ui.ProcessorTemporary", false);
        
    public static final IProperty<Boolean> FINAL_INTERMEDIATE_RESULT = new Property<Boolean>(
        "de.cau.cs.kieler.kicool.ui.intermediateData.final", false);        
}