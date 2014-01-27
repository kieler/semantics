/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementSequence
import java.util.HashMap
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.ScgFactory

/** 
 * SCL to SCG Transformation 
 * 
 * @author ssm
 * @kieler.design 2014-01-27 proposed 
 * @kieler.rating 2014-01-27 proposed yellow
 */

// This class contians all mandatory methods for the SCGDEP-to-SCGBB-Transformation.
class SCLToSCGTransformation extends AbstractModelTransformation {
    
    // Inject SCG Extensions.    
    @Inject
    extension SCGExtensions
    
    @Inject 
    extension SCLExtensions
         
    // M2M Mapping
//    private val nodeMapping = new HashMap<Node, Node>
//    private val revNodeMapping = new HashMap<Node, Node>
    private val processedNodes = <Node> newLinkedList
    private val valuedObjectMapping = new HashMap<ValuedObject, ValuedObject>
    
    // -------------------------------------------------------------------------
    // -- M2M Transformation 
    // -------------------------------------------------------------------------
    
	override transform(EObject eObject) {
		(eObject as Program).transformSCLToSCG
	}    
    
    def SCGraph transformSCLToSCG(Program scl) {
        // Create new SCL program...
        val scg = ScgFactory::eINSTANCE.createSCGraph
                  
        // ... and copy declarations.
        for(valuedObject : scg.valuedObjects) {
            val newValuedObject = valuedObject.copy
            scl.valuedObjects.add(newValuedObject)
            valuedObjectMapping.put(valuedObject, newValuedObject)
        }
        
        scl.transform(scg)
        
        scg
    }
    
    private dispatch def void transform(Program program, SCGraph scg) {
    	
    } 
           
    
    // Valued objects must be set according to the mapping!
    def ValuedObject copyValuedObject(ValuedObject valuedObject) {
        valuedObjectMapping.get(valuedObject)
    }
    
    // References in expressions must be corrected as well!
    def Expression copyExpression(Expression expression) {
        val newExpression = expression.copy
        if (newExpression instanceof ValuedObjectReference) {
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.copyValuedObject                    
        } else {
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ vor |
                vor.valuedObject = vor.valuedObject.copyValuedObject ]        
        }
        newExpression
    }
	


   // -------------------------------------------------------------------------   

   
}