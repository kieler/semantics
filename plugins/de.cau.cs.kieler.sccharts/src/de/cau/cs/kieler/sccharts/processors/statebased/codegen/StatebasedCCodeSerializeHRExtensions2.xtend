/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2026 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.statebased.codegen

import com.google.inject.Singleton
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtend.lib.annotations.Delegate
import de.cau.cs.kieler.kexpressions.keffects.ReferenceCallEffect
import de.cau.cs.kieler.kexpressions.ReferenceCall

/**
 * @author als
 *
 */
@Singleton
class StatebasedCCodeSerializeHRExtensions2 extends CCodeSerializeHRExtensions {
    
    dispatch override CharSequence serializeHR(Assignment assignment) {
        // Use assignment serialization for SCH nodes in underlying serializer
        return (new DelegationSCGAssignment(assignment) as de.cau.cs.kieler.scg.Assignment).serializeHR
    }
    
    dispatch override CharSequence serializeHR(ReferenceCallEffect e) {
        // Delegate to less specific implementation
        _serializeHR(e as ReferenceCall)
    }
}

@Data
class DelegationSCGAssignment implements de.cau.cs.kieler.scg.Assignment {
    @Delegate val Assignment delegate
    
    override getNext() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override setNext(ControlFlow value) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override isIsInitial() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override isSchizophrenic() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override setIsInitial(boolean value) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override setSchizophrenic(boolean value) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override getName() {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override setName(String value) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
}
