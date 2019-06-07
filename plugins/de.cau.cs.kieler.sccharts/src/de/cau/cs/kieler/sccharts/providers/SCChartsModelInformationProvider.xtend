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
package de.cau.cs.kieler.sccharts.providers

import de.cau.cs.kieler.kicool.registration.IModelInformationProvider
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXResource

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCChartsModelInformationProvider implements IModelInformationProvider {
    
    override getResourceExtension(Object model) {
        if (model instanceof SCCharts) {
            return SCTXResource.FILE_EXTENSION
        }
        return null
    }
    
}
