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
import de.cau.cs.kieler.kicool.ui.synthesis.actions.ToggleOnOffData
import de.cau.cs.kieler.kicool.ProcessorEntry

/**
 * @author ssm
 * @kieler.design 2017-06-12 proposed 
 * @kieler.rating 2017-06-12 proposed yellow
 */
class KNodeProperties {
    
    public static val IProperty<IntermediateData> INTERMEDIATE_DATA =
        new Property<IntermediateData>("de.cau.cs.kieler.kicool.ui.intermediateData", null)
        
    public static val IProperty<ToggleOnOffData> TOGGLE_ON_OFF_DATA = 
        new Property<ToggleOnOffData>("de.cau.cs.kieler.kicool.ui.toggleOnOffData", null)
        
    public static val IProperty<ProcessorEntry> PROCESSOR_IDENTIFIER = 
        new Property<ProcessorEntry>("de.cau.cs.kieler.kicool.processorEntry", null)
        
}