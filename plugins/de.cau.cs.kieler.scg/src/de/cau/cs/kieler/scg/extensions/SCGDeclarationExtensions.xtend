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
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.scg.SCGraph
import java.util.HashMap
import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension de.cau.cs.kieler.kitt.tracing.TracingEcoreUtil.*
import de.cau.cs.kieler.scg.SchedulingBlock

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
    
    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCGCoreExtensions

    /** Valued object mapping */
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>    


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
   
    /** 
     * Creates a new ValuedObject in an SCG.
     * 
     * @param scg 
     * 			the SCG in question
     * @param valuedObjectName
     * 			the name of the valued object
     * @return Returns the new valued object. 
     */
    def ValuedObject createValuedObject(SCGraph scg, String valuedObjectName) {
         createValuedObject(valuedObjectName) => [
             scg.valuedObjects.add(it)
         ]
    }
   
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
                if (sb.guard.valuedObject == valuedObject) return sb
            }
        }
        return null
    }    
    
    public def void copyDeclarations(SCGraph source, SCGraph target) {
    	for (declaration : source.declarations) {
    		val newDeclaration = createDeclaration(declaration).trace(declaration)
    		declaration.valuedObjects.forEach[ copyValuedObject(newDeclaration) ]
    		target.declarations += newDeclaration
    	}
	}     
    
    public def void copyDeclarationsWODead(SCGraph source, SCGraph target) {
        for (declaration : source.declarations) {
            val newDeclaration = createDeclaration(declaration).trace(declaration)
            for(vo : declaration.valuedObjects) {
                val sb = source.findSchedulingBlockByVO(vo)
                if (sb == null || !sb.basicBlock.deadBlock) { 
                    vo.copyValuedObject(newDeclaration) 
                }
            }
            target.declarations += newDeclaration
        }
    }       
    
    public def void copyValuedObject(ValuedObject sourceObject, Declaration targetDeclaration) {
        val newValuedObject = sourceObject.copy
        targetDeclaration.valuedObjects += newValuedObject
        valuedObjectMapping.put(sourceObject, newValuedObject)
    }    
    
    def ValuedObject getValuedObjectCopy(ValuedObject valuedObject) {
        if (valuedObject == null) {
            throw new Exception("Valued Object is already null!")
        }
        val vo = valuedObjectMapping.get(valuedObject)
        if (vo == null) {
            throw new Exception("Valued Object not found! ["+valuedObject.name+"]")
        }
        vo
    }    

    def ValuedObject getValuedObjectCopyWNULL(ValuedObject valuedObject) {
        if (valuedObject == null) {
            return null
        }
        val vo = valuedObjectMapping.get(valuedObject)
        if (vo == null) {
            throw new Exception("Valued Object not found! ["+valuedObject.name+"]")
        }
        vo
    }    
    
    def ValuedObject addToValuedObjectMapping(ValuedObject source, ValuedObject target) {
		valuedObjectMapping.put(source, target)
		target    	
    }    
    
    def Expression copySCGExpression(Expression expression) {
    	// Use the ecore utils to copy the expression. 
        val newExpression = expression.copy
        
        if (newExpression instanceof ValuedObjectReference) {
	        // If it is a single object reference, simply replace the reference with the object of the target SCG.
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.getValuedObjectCopy                    
        } else {
        	// Otherwise, query all references in the expression and replace the object with the new copy
        	// in the target SCG.
        	if (newExpression != null)
                newExpression.eAllContents.filter(typeof(ValuedObjectReference)).
            	   forEach[ valuedObject = valuedObject.getValuedObjectCopy ]        
        }
        
        // Return the new expression.
        newExpression
    }    

}
