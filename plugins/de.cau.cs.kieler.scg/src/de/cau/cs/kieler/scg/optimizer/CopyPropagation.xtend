/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.SCGraph

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Guard

/**
 * @author ssm
 *
 */
 
class CopyPropagation extends AbstractOptimizer {
    
    @Inject
    extension KExpressionsExtension
    
    private static val GUARDPREFIX = "g" 
    private static val CONDPREFIX = "_cond"
    private static val GOGUARD = "_GO"
    private static val GOGUARDVALUEDOBJECTNAME = "g0"
    
    private val assignmentReferences = <ValuedObject, ValuedObject> newHashMap
    private val reverseGuardMap = <ValuedObject, Guard> newHashMap
    
    override optimize(SCGraph scg) {
        
        scg.guards.forEach[
            reverseGuardMap.put(valuedObject, it)
        ]
        
        scg.guards.filter[ expression instanceof ValuedObjectReference ].forEach[
            if ((valuedObject.name.contains(GUARDPREFIX) || valuedObject.name.contains(CONDPREFIX))
//               && (!(expression as ValuedObjectReference).valuedObject.name.contains(GOGUARD))
            ) {
                assignmentReferences.put(it.valuedObject, (expression as ValuedObjectReference).valuedObject)
            }    
        ]  
        
        val toDelete = <Guard> newArrayList // make this a set for final review!
        
        for (key : assignmentReferences.keySet.immutableCopy) {
            for (guard : scg.guards.filter[ !isDead ]) {
                if (guard.expression instanceof ValuedObjectReference) {
                        if ((guard.expression as ValuedObjectReference).valuedObject == key) {
                            (guard.expression as ValuedObjectReference).valuedObject == assignmentReferences.get(key)
                        }
                } else {
                    val references = guard.expression.eAllContents.filter(typeof(ValuedObjectReference)).filter[ it.valuedObject == key ].toSet
                    for (ref : references) {
                        if (ref.valuedObject == key) {
                            ref.valuedObject = assignmentReferences.get(key)
                        }
                    }
                }
                
                if ((guard.valuedObject == key) && (!guard.valuedObject.name.startsWith(GOGUARDVALUEDOBJECTNAME))) {
                    toDelete += guard
                }
            } // guards
            
                for (ar : assignmentReferences.keySet.immutableCopy) {
                    if (assignmentReferences.get(ar) == key) {
                        assignmentReferences.put(ar, assignmentReferences.get(key))
                    }
                }            
        }  // assignment references
        
        
        
        System.out.print("Copy propagation: ")
        for (del : toDelete.immutableCopy) {
            System.out.print(del.valuedObject.name + " ")
        }
        System.out.println("")
        
        for (del : toDelete.immutableCopy) {
            if (del.valuedObject.name.startsWith(GUARDPREFIX)) {
                System.out.println("Copy propagation: relinking " + del.valuedObject.name)
                val vo = (del.expression as ValuedObjectReference).valuedObject
                val newGuard = reverseGuardMap.get(vo)
                del.schedulingBlockLink.guard = newGuard
            }
        }
        System.out.println("")

        for (del : toDelete.immutableCopy) {
            scg.guards -= del
        }
        
        scg
    }
    
}