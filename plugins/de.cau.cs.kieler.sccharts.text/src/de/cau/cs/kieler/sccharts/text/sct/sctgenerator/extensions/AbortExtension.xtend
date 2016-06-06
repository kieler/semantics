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
package de.cau.cs.kieler.sccharts.text.sct.sctgenerator.extensions

import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.ISCTGeneratorExtension
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property

/**
 * @author J
 *
 */
class AbortExtension implements ISCTGeneratorExtension {
    
    override getTab() {
        SCTGenerator.SCTGENERATOR_EXTENSIONS_TAB
    }
    
    override getProperties() {
        <IProperty<?>>newArrayList(
            CHANCE_FOR_STRONG_ABORTS, CHANCE_FOR_WEAK_ABORTS
        )
    }
    
    public static val IProperty<Double> CHANCE_FOR_STRONG_ABORTS = 
        new Property<Double>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForStrongAbort",
            0.1d
        )    

    public static val IProperty<Double> CHANCE_FOR_WEAK_ABORTS = 
        new Property<Double>(
            SCTGenerator.SCTGENERATOR_ID + ".chanceForWeakAbort",
            0.1d
        )    

}