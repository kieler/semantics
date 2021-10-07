/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors

import de.cau.cs.kieler.scg.processors.ReferenceCallProcessor
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration

/**
 * The Module Call Semantics SCG transformation: Java Edition.
 * Much better gameplay, but does not support ray tracing.
 * 
 * @author glu
 */
class ReferenceCallProcessorJava extends ReferenceCallProcessor {
    override getId() {
        "de.cau.cs.kieler.scg.processors.referenceCall.java"
    }

    override getName() {
        "Reference Call (Java)"
    }
    
    override rephraseCall(ReferenceCall ref, ClassDeclaration classDecl) {
        ref.subReference.valuedObject => [name = name + classDecl.name]
    }
    
    override renameModuleClasses() {}
}