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
package de.cau.cs.kieler.kicool.ui.synthesis

import de.cau.cs.kieler.kicool.ui.synthesis.actions.IntermediateData
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

/**
 * @author sdo
 *
 */
class KNodeUIProperties {
    public static val IProperty<IntermediateData> INTERMEDIATE_DATA =
        new Property<IntermediateData>("de.cau.cs.kieler.kicool.ui.intermediateData", null)
}