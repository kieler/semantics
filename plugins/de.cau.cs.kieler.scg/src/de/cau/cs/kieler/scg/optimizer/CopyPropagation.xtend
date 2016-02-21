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
package de.cau.cs.kieler.scg.optimizer

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.SCGraph

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Guard
import java.util.List
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.guardCreation.AbstractGuardCreator

/**
 * @author ssm
 *
 */
 
class CopyPropagation extends AbstractOptimizer {
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject 
    extension SCGDeclarationExtensions
    
    static final boolean DEBUG = false;

    def static void debug(String debugText) {
        debug(debugText, true);
    }

    def static void debug(String debugText, boolean lineBreak) {
        if (DEBUG) {
            if (lineBreak) {
                System.out.println(debugText);
            } else {
                System.out.print(debugText);
            }
        }
    }    
    
    
    private static val GUARDPREFIX = "g" 
    private static val CONDPREFIX = "_cond"
    private static val GOGUARD = "_GO"
    private static val GOGUARDVALUEDOBJECTNAME = "g0"
    
    private val assignmentReferences = <ValuedObject, ValuedObject> newHashMap
    private val reverseDependencyMap = <SchedulingBlock, List<Dependency>> newHashMap
    private val reverseGuardMap = <ValuedObject, Guard> newHashMap
    private val replacementMap = <Guard, Guard> newHashMap
    
    private val relinkVisited = <Guard> newHashSet
    private var Guard goGuard = null 
    
    override optimize(SCGraph scg) {
   	
    	assignmentReferences.clear
    	reverseGuardMap.clear
    	replacementMap.clear
    	relinkVisited.clear
    	goGuard = null
        
        scg.guards.forEach[
            reverseGuardMap.put(valuedObject, it)
        ]
        
        val goGuardVO = scg.findValuedObjectByName(AbstractGuardCreator.GOGUARDNAME)
        assignmentReferences.put(goGuardVO, goGuardVO)        
        
        val schedulingBlocks = <SchedulingBlock> newArrayList => [ list | 
            scg.basicBlocks.forEach[ 
                schedulingBlocks.forEach[
                    list += it
                    val dependencyList = <Dependency> newArrayList
                    reverseDependencyMap.put(it, dependencyList)
                ]
            ]
        ]
        for(sb : schedulingBlocks) {
            for(dependency : sb.dependencies) {
                val targetSB = dependency.target.schedulingBlock(schedulingBlocks) 
                val dependencyList = reverseDependencyMap.get(targetSB)
                dependencyList += dependency
            }
        }
        

        
        scg.guards.filter[ expression instanceof ValuedObjectReference ].forEach[
            if (valuedObject.name.contains(GUARDPREFIX)
// FIXME: Verify removal of scheduling link            	 
//            	&& (reverseDependencyMap.get(it.schedulingBlockLink).size == 0)
            ) {
                assignmentReferences.put(it.valuedObject, (expression as ValuedObjectReference).valuedObject)
                debug("CP: " + it.valuedObject.name + " = " + (expression as ValuedObjectReference).valuedObject.name)
            }    
        ]  
        
        sortAssRef()
        
        val toDelete = <Guard> newArrayList // make this a set for final review!
        
// FIXME: Verify removal of dead guard flag
        for (guard : scg.guards /*.filter[!isDead]*/) {
            if (guard.valuedObject.name.equals("g0")) {
                debug("1")
            }
            if (guard.expression instanceof ValuedObjectReference) {
                val VOR = (guard.expression as ValuedObjectReference)
                if (assignmentReferences.containsKey(VOR.valuedObject)) {
                    VOR.valuedObject = assignmentReferences.get(VOR.valuedObject)  
                } 
            } else {
                val VORs = guard.expression.eAllContents.filter(typeof(ValuedObjectReference)).toSet
                for (VOR : VORs) {
                    if (assignmentReferences.containsKey(VOR.valuedObject)) {
                        VOR.valuedObject = assignmentReferences.get(VOR.valuedObject)  
                    } 
                }
            }
            // remove the guard if necessary
            if (assignmentReferences.containsKey(guard.valuedObject)) {
                if (guard.valuedObject.name.startsWith(GOGUARDVALUEDOBJECTNAME)) {
                    goGuard = guard
                } else {
                    toDelete += guard
                }
            }
        } // guards
        
        
        
        debug("Copy propagation: ", false)
        for (del : toDelete.immutableCopy) {
            debug(del.valuedObject.name + " ", false)
        }
        debug("")
        
        relinkVisited.clear
        replacementMap.clear
        for (del : toDelete.immutableCopy) {
            if (del.valuedObject.name.startsWith(GUARDPREFIX)) {
                del.relink(toDelete, "")
            }
        }
        debug("")
        
//        toDelete -= goGuard

        for (del : toDelete.immutableCopy) {
            scg.guards -= del
        }
        
        scg
    }
    
    private def Guard relink(Guard guard, List<Guard> deleteList, String debugIndent) {
    	if (!relinkVisited.contains(guard)) {
            debug(debugIndent + "Copy propagation: relinking " + guard.valuedObject.name)
    		relinkVisited += guard
	    	val vo = (guard.expression as ValuedObjectReference).valuedObject
        	var Guard newGuard = reverseGuardMap.get(vo)
        	if (newGuard == null) {
        	    newGuard = goGuard
        	}
        	if (deleteList.contains(newGuard)) {
        		newGuard = newGuard.relink(deleteList, "  ")
        	}
// FIXME: Verify removal of scheduling block link        	
//        	guard.schedulingBlockLink.guard = newGuard
        	reverseGuardMap.put(guard.valuedObject, newGuard)
//			replacementMap.put(guard, newGuard)
        	return newGuard
        }
        
        return guard
    }
    
    private def sortAssRef() {
        for (ar : assignmentReferences.keySet.immutableCopy) {
            val value = assignmentReferences.get(ar)
            val newValue = value.setAssRefValue
            assignmentReferences.put(ar, newValue)   
            debug("CPr: " + ar.name + " = " + value.name + " -> " + newValue.name)
        }
    }
    
    private def ValuedObject setAssRefValue(ValuedObject oldVO) {
        if (assignmentReferences.keySet.contains(oldVO)) {
            val value = assignmentReferences.get(oldVO)
            if (value == oldVO) return oldVO
            val newValue = value.setAssRefValue
            if (newValue != value) {
                assignmentReferences.put(oldVO, newValue)
            }
            return newValue  
        }         
        return oldVO       
    }
}