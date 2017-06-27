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
package de.cau.cs.kieler.sccharts.legacy

import de.cau.cs.kieler.sccharts.legacy.text.SctStandaloneSetup
import org.eclipse.core.resources.IFile

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCChartsLegacyConverter {
    
    public static val INPUT_EXTENSION = "sct"
    public static val OUTPUT_EXTENSION = "sctx"
    
    static def export(IFile file) {
        val sctInjector = SctStandaloneSetup.doSetup
    }
    
}