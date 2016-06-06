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
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator

import de.cau.cs.kieler.core.properties.IProperty
import java.util.List

/**
 * @author ssm
 *
 */
interface ISCTGeneratorPropertyHolder {
    def String getTab()
    def List<IProperty<?>> getProperties()    
}