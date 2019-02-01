/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
 package de.cau.cs.kieler.verification.processors.nuxmv

import de.cau.cs.kieler.verification.VerificationProperty
import org.eclipse.core.resources.IFile

/**
 * @author aas
 */
class RunNuxmvProcessor extends RunSmvProcessor {
    
    override getId() {
        return "de.cau.cs.kieler.sccharts.verification.runNuxmv"
    }
    
    override getName() {
        return "Run nuXmv"
    }
    
    override protected getProcessBuilderCommandList(IFile smvFile, VerificationProperty property) {
        return #["nuXmv", "-int", smvFile.name]
    }
}
