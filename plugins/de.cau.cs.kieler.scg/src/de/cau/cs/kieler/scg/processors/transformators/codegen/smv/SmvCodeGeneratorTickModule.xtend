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
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions

/**
 * @author aas
 * 
 */
class SmvCodeGeneratorTickModule extends SmvCodeGeneratorModuleBase {

    @Inject extension SmvCodeSerializeHRExtensions serializer

    override getName() {
        return class.simpleName;
    }

    override generateInit() {
    }

    override generate() {
        incIndentationLevel
        appendIndentedLine("ASSIGN")
    }

    override generateDone() {
        
    }
}
