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
package de.cau.cs.kieler.kexpressions.kext.extensions

import de.cau.cs.kieler.kexpressions.kext.DeclarationScope
import de.cau.cs.kieler.kexpressions.ValuedObject
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList

/**
 * @author ssm
 * @kieler.design 2017-06-28 proposed 
 * @kieler.rating 2017-06-28 proposed yellow 
 *
 */
class KExtDeclarationExtensions {
    
    @Inject extension KExpressionsValuedObjectExtensions
    
    def getValuedObjects(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten
    }
    
    def getValuedObjectsList(DeclarationScope scope) {
        <ValuedObject>newLinkedList => [ ll |
            scope.declarations.forEach[d|d.valuedObjects.forEach[ll += it]]
        ]
    }
    
    def getPureSignals(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten.filter[ isPureSignal ]
    }

    def getValuedSignals(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten.filter[ isValuedSignal ]
    }

    def getSignals(DeclarationScope scope) {
        scope.declarations.map[valuedObjects].flatten.filter[ isSignal ]
    }

    def ValuedObject createValuedObject(DeclarationScope scope, String valuedObjectName, Declaration declaration) {
        val valuedObject = createValuedObject(valuedObjectName);
        declaration.valuedObjects += valuedObject
        if (!scope.declarations.contains(declaration)) {
            scope.declarations += declaration
        }
        valuedObject
    }
    
    def ValuedObject findValuedObjectByName(DeclarationScope scope, String name) {
        var EObject container = scope
        while (container != null) {
            var EList<Declaration> declarations = null
            if (container instanceof DeclarationScope)
                declarations = (container as DeclarationScope).declarations
            if (!declarations.nullOrEmpty)
                for (declaration : declarations) {
                    val valuedObject = declaration.findValuedObjectByName(name)
                    if(valuedObject != null) return valuedObject
                }
            container = container.eContainer
        }
        null
    }    

}