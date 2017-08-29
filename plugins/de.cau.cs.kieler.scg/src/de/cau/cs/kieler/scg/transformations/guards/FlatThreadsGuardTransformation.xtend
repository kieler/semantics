/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations.guards

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsReplacementExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.inject.Injector

/** 
 * @author ssm
 * @kieler.design 2016-04-07 proposed 
 * @kieler.rating 2016-04-07 proposed yellow
 * 
 */
class FlatThreadsGuardTransformation extends AbstractGuardTransformation implements Traceable {
	
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::FT_GUARDS_ID
    }

    override getName() {
        return SCGTransformations::FT_GUARDS_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::GUARDS_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::GUARD_EXPRESSIONS_ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject 
    extension SCGDeclarationExtensions
         
    @Inject 
    extension KExpressionsValuedObjectExtensions	
    
    @Inject 
    extension KExpressionsReplacementExtensions 
    
    @Inject
    extension AnnotationsExtensions
    
    // -------------------------------------------------------------------------
    // -- Guard Transformation
    // -------------------------------------------------------------------------    
      
    @Inject private Injector injector      
      
    public def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
         
        val simpleGuardTransformation = injector.getInstance(SimpleGuardTransformation)
        
        val mySCG = simpleGuardTransformation.transform(scg, context)    
         
     	val go = mySCG.findValuedObjectByName("_GO")
     	
     	val nodes = mySCG.nodes.filter[ it instanceof Assignment && it.hasAnnotation(SCGAnnotations.ANNOTATION_HEADNODE)].toList
     	for(node : nodes) {
     		for(dependency : node.dependencies.filter[ it instanceof ExpressionDependency ]) {
     			var targetAssignment = dependency.target as Assignment
     			val newExpression = targetAssignment.expression.replace(node.asAssignment.valuedObject, go.reference)
     			targetAssignment.expression = newExpression
     		}
     		
     		node.dependencies.removeAll
     		val incomingDependencies = node.incoming.filter(Dependency).toList
     		for(id : incomingDependencies) {
     			id.remove
     		}
     		mySCG.nodes -= node
     	}
     	
     	mySCG	
     }
}