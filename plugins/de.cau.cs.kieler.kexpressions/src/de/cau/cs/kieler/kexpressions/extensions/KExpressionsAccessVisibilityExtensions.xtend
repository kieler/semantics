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
package de.cau.cs.kieler.kexpressions.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.AccessModifier
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration

/**
 * @author als
 */
class KExpressionsAccessVisibilityExtensions {
    
    @Inject extension KExpressionsDeclarationExtensions
    
    def boolean isPublic(Declaration d) {
        if (d.hasUndefinedAccess) {
            return true
//            if (d instanceof VariableDeclaration) {
//                return d.input || d.output
//            }
//            if (d instanceof MethodDeclaration) {
//                return true
//            }
//            if (d instanceof ClassDeclaration) {
//                return d.isEnum || d.isStruct
//            }
//            return false
        }
        return d.access === AccessModifier.PUBLIC
    }
    
    def boolean isProtected(Declaration d) {
        return d.access === AccessModifier.PROTECTED
    }
    
    def boolean isPrivate(Declaration d) {
        return d.access === AccessModifier.PRIVATE || (!d.isPublic && !d.isProtected)
    }
    
    def boolean hasUndefinedAccess(Declaration d) {
        return d.access === null || d.access === AccessModifier.UNDEF
    }
}
