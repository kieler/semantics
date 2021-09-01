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
package de.cau.cs.kieler.kexpressions.kext.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import java.util.List

/**
 * @author als
 *
 */
class KExtEnumExtensions {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExtDeclarationExtensions
    
    def isEnumRef(Declaration decl) {
        return decl.referencedEnum !== null
    }
    def isEnumRef(ValuedObjectReference vor) {
        return vor?.valuedObject?.isEnumRef
    }
    def isEnumRef(ValuedObject vo) {
        return vo?.declaration?.isEnumRef
    }
    
    def getReferencedEnum(Declaration decl) {
        if (decl instanceof ReferenceDeclaration) {
            val ref = decl.reference
            if (ref instanceof ValuedObject) {
                val rDecl = ref.eContainer as Declaration
                if (rDecl instanceof ClassDeclaration) {
                    if (rDecl.isEnum) {
                        return rDecl
                    }
                }
            }
        }
        return null
    }
    
    def isEnum(ValuedObjectReference vor) {
        return vor?.valuedObject?.isEnum
    }
    def isEnum(ValuedObject vo) {
        return vo?.declaration?.isEnum
    }
    
    def isEnumValue(ValuedObjectReference vor) {
        return vor?.valuedObject?.isEnumValue
    }
    def isEnumValue(ValuedObject vo) {
        val decl = vo?.declaration?.eContainer
        if (decl instanceof ClassDeclaration) {
            return decl.isEnum
        }
        return false
    } 
    
    def getEnumVO(Declaration decl) {
        return decl.valuedObjects.head
    }
    
    def List<ValuedObject> getEnumValues(Declaration decl) {
        if (decl.isEnum) {
            // According to grammar values are located in the single nested declaration of the enum
            return (decl as ClassDeclaration).declarations.head.valuedObjects
        }
        return emptyList
    }     
}