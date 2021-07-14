/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.StaticAccessExpression
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kexpressions.kext.extensions.KExtEnumExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.sccharts.State

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts static access Transformation.
 * 
 * @author als
 */
class StaticAccess extends SCChartsProcessor implements Traceable {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExtEnumExtensions
    
    public static val ID = "de.cau.cs.kieler.sccharts.processors.staticAccess"
    
    static public final String GENERATED_PREFIX = "_"
    
    override getId() {
        ID
    }

    override getName() {
        "Static Access"
    }

    override process() {
        for (root : model.rootStates) {
            root.handleStaticAccesses
        }
    }
    
    def void handleStaticAccesses(State root) {
        // Collect
        val accessMap = HashMultimap.create
        for (access : root.eAllContents.filter(StaticAccessExpression).toList) {
            if (access.target !== null && access.subReference !== null) {
                var ref = access.subReference.lowermostReference
                if (ref !== null && ref.valuedObject !== null) {
                    if (ref.isEnumValue) {
                        ref = ref.eContainer as ValuedObjectReference
                    }
                    val decl = ref.valuedObject.variableDeclaration
                    if (decl !== null &&
                        ((decl.const && ref.valuedObject.initialValue !== null) || decl.isEnum)) {
                        accessMap.put(ref.valuedObject, access)
                    } else {
                        environment.errors.add("Static access is not referring to a constant valued object", access, true)
                    }
                } else {
                    environment.errors.add("Static access is missing reference to value valued object", access, true)
                }
            } else {
                environment.errors.add("Static access is missing a reference", access, true)
            }
        }
        
        // Create copy and change reference
        for (accessedVO : accessMap.keySet) {
            val accesses = accessMap.get(accessedVO)
            
            val someAccess = accesses.head
            var subRef = someAccess.subReference
            var name = GENERATED_PREFIX + someAccess.target.name
            while(subRef !== null && !subRef.isEnumValue) {
                name += GENERATED_PREFIX + subRef.valuedObject.name
                subRef = subRef.subReference
            }
            
            val newDecl = accessedVO.declaration.copy
            root.declarations += newDecl
            
            if (accessedVO.isEnum) {
                Enum.markCopyForConsolidation(newDecl, accessedVO.declaration)
                
                val newEnum = newDecl.valuedObjects.head
                newEnum.name = name
                
                for(access : accesses) {
                    val newRef = newEnum.reference
                    newRef.subReference = (newDecl as ClassDeclaration).declarations.head.valuedObjects.findFirst[
                        it.name.equals(access.subReference.lowermostReference.valuedObject.name)
                    ].reference
                    access.replace(newRef)
                }
            } else {
                val newConst = createValuedObject(name)
                newConst.initialValue = accessedVO.initialValue.copy
                newDecl.valuedObjects.clear
                newDecl.valuedObjects += newConst
                for(access : accesses) {
                    access.replace(newConst.reference)
                }
            }
        }
    }
}
