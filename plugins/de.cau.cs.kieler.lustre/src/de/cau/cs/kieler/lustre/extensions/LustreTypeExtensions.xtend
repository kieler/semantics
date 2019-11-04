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
package de.cau.cs.kieler.lustre.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.lustre.lustre.LustreValuedObject

/**
 * Types in Lustre can be attached to the VariableDeclaration or the ValuedObject. 
 * In case the ValuedObject is a LustreValuedObject, the type needs to be extracted from there.
 * 
 * @author lgr
 */
class LustreTypeExtensions extends KExpressionsTypeExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def ValueType getType(ValuedObject valuedObject) {
        if (valuedObject.isModelReference) return ValueType::REFERENCE;
        if (!valuedObject.isVariableReference) return null;
        if (valuedObject instanceof LustreValuedObject) return valuedObject.type
        valuedObject.getVariableDeclaration.type
    }
    
    override compareTypes(ValuedObject valuedObject, ValueType type) {
        valuedObject.type == type
    }
    
}