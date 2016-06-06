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

import java.util.List
import de.cau.cs.kieler.core.properties.IProperty

/**
 * @author ssm
 *
 */
interface ISCTGeneratorExtension {
    def String getTab()
    def List<IProperty<?>> getProperties()
}