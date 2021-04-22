/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.SCGraph
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kexpressions.kext.extensions.ValuedObjectMapping
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.SchedulingBlock

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import java.util.Map

/**
 * The SCG Extensions are a collection of common methods for SCG queries and manipulation.
 * The class is separated in several categories. If a category growths too big, it may be 
 * desired to relocate its functions in a specialized extensions class. At the moment the class
 * contains functions for the following tasks.
 * <ul>
 *   <li>Valued object handling</li>
 *   <li>Control flow queries</li>
 *   <li>Thread management</li>
 *   <li>Basic block and scheduling block qeuries</li>
 *   <li>Scheduling problem management</li>
 *   <li>Expression helper</li>
 * </ul> 
 * SCG model copy functions and transformation helper are already relocated to their appropriate
 * extensions.
 * 
 * @author ssm
 * @author cmot
 * @kieler.design 2013-08-20 proposed 
 * @kieler.rating 2013-08-20 proposed yellow
 */
class SCGDeclarationExtensions { 
    
    @Inject extension AnnotationsExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KEffectsExtensions
    @Inject extension SCGCoreExtensions

    // -------------------------------------------------------------------------
    // -- Valued object handling
    // -------------------------------------------------------------------------

    /**  
     * Creates a new ValuedObject.
     * 
     * @param valuedObjectName
     * 			the name of the valued object
     * @return Returns a new valued object with the given name.
     */
//    def ValuedObject createValuedObject(String valuedObjectName) {
//         KExpressionsFactory::eINSTANCE.createValuedObject => [
//             name = valuedObjectName
//         ]
//    }
   
//    /** 
//     * Creates a new ValuedObject in an SCG.
//     * 
//     * @param scg 
//     * 			the SCG in question
//     * @param valuedObjectName
//     * 			the name of the valued object
//     * @return Returns the new valued object. 
//     */
//    def ValuedObject createValuedObject(SCGraph scg, String valuedObjectName) {
//         createValuedObject(valuedObjectName) => [
//             scg.valuedObjects.add(it)
//         ]
//    }
   
	/** 
	 * Finds and retrieves a valued object by its name. May return null.
	 * 
	 * @param scg
	 * 			the SCG containing the object
	 * @param name
	 * 			the name of the valued object
	 * @return Returns the (first) valued object with the given name or null.
	 */
    def ValuedObject findValuedObjectByName(SCGraph scg, String name) {
    	for(tg : scg.declarations) {
    		for(vo : tg.valuedObjects) {
    			if (vo.name == name) return vo
    		}
   		}
   		return null
    }
    
    def SchedulingBlock findSchedulingBlockByVO(SCGraph scg, ValuedObject valuedObject) {
        for(bb : scg.basicBlocks) {
            for(sb : bb.schedulingBlocks) {
                if (sb.guards.head.valuedObject == valuedObject) return sb
            }
        }
        return null
    }    

    public def ValuedObjectMapping copyDeclarations(SCGraph source, SCGraph target) {
        copyDeclarations(source, target, null)
    }
    
    public def ValuedObjectMapping copyDeclarations(SCGraph source, SCGraph target, Map<SCGraph, SCGraph> scgMap) {
        val map = new ValuedObjectMapping
        val declMapping = newHashMap
        val voMapping = newHashMap
        target.declarations += source.declarations.copyDeclarations(voMapping, declMapping)
        declMapping.entrySet.forEach[
            value.trace(key)
            if (key instanceof ReferenceDeclaration && scgMap !== null) {
                (value as ReferenceDeclaration).reference = scgMap.get((key as ReferenceDeclaration).reference)
            }
        ]
        voMapping.entrySet.forEach[
            map.put(key, <ValuedObject> newLinkedList(value))
        ]
    	return map
	} 
	
	public def addValuedObjectMapping(ValuedObjectMapping map, ValuedObject source, ValuedObject target) {
	    val deque = map.get(source) 
	    if (deque === null) {
	        map.put(source, <ValuedObject> newLinkedList(target))
	    } else {
	        deque.push(target)
	    }
	} 
	
	public def ValuedObject peekValuedObjectMapping(ValuedObjectMapping map, ValuedObject source) {
	    return map.get(source)?.peek
	}
	
	public def void removeLastValuedObjectMapping(ValuedObjectMapping map, ValuedObject source) {
	    map.get(source)?.pop
	}
    
    public def void copyDeclarationsWODead(SCGraph source, SCGraph target) {
        for (declaration : source.declarations) {
            val newDeclaration = createDeclaration(declaration).trace(declaration)
            for(vo : declaration.valuedObjects) {
                val sb = source.findSchedulingBlockByVO(vo)
                if (sb === null || !sb.basicBlock.deadBlock) { 
                    vo.copyValuedObject(newDeclaration) 
                }
            }
            target.declarations += newDeclaration
        }
    }       
    
    public def ValuedObject copyValuedObject(ValuedObject sourceObject, Declaration targetDeclaration) {
        sourceObject.copy => [
	        targetDeclaration.valuedObjects += it
        ]
    }
    
    def ValuedObject getValuedObjectCopy(ValuedObject valuedObject, 
    	ValuedObjectMapping map
    ) {
        if (valuedObject === null) {
            throw new IllegalArgumentException("Can't copy valued object. Valued object is null!")
        }
        val vo = map.get(valuedObject)?.peek
        if (vo === null) {
            return valuedObject // TODO: Remove
            //throw new Exception("Valued Object not found! ["+valuedObject.name+"]")
        }
        vo
    }    

    def ValuedObject getValuedObjectCopyWNULL(ValuedObject valuedObject,
    	ValuedObjectMapping map
    ) {
        if (valuedObject === null) {
            return null
        }
        val vo = map.get(valuedObject)?.peek
        if (vo === null) {
            throw new Exception("Valued Object not found! ["+valuedObject.name+"]")
        }
        vo
    }    
    
    def ValuedObject addToValuedObjectMapping(ValuedObject source, ValuedObject target, 
    	ValuedObjectMapping map
    ) {
		map.addValuedObjectMapping(source, target)
		target    	
    }    
    
    def Expression copySCGExpression(Expression expression,
    	ValuedObjectMapping map
    ) {
    	// Use the ecore utils to copy the expression. 
        val newExpression = expression.copy
        
        if (newExpression !== null) {
            val vors = newArrayList()
            if (newExpression instanceof ValuedObjectReference) {
                vors += newExpression
            }
            vors += newExpression.eAllContents.filter(ValuedObjectReference).toIterable
            vors.forEach[ valuedObject = valuedObject.getValuedObjectCopy(map) ]
        }
        
        // Return the new expression.
        newExpression
    }   
    
    def Assignment copySCGAssignment(Assignment assignment, 
    	ValuedObjectMapping map
    ) {
    	ScgFactory::eINSTANCE.createAssignment => [ s |
    		s.valuedObject = assignment.valuedObject.getValuedObjectCopyWNULL(map)
    		s.expression = assignment.expression.copySCGExpression(map)
    		s.operator = assignment.operator
    		assignment.indices?.forEach[
    			s.indices += it.copySCGExpression(map)
    		]
            var newVOR = s.reference
            var oldSub = assignment.reference?.subReference
            while (oldSub !== null) {
                val ref = oldSub.valuedObject.getValuedObjectCopyWNULL(map).reference
                ref.indices += oldSub.indices.map[copySCGExpression(map)]
                newVOR.subReference = ref
                newVOR = ref
                oldSub = oldSub.subReference
            }
    	]
    } 

}
