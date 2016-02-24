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
package de.cau.cs.kieler.scg.transformations.dependencies

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.Node
import com.google.common.collect.SetMultimap
import com.google.common.collect.HashMultimap

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					<== YOU ARE HERE
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */

class DependencyTransformationEx extends AbstractProductionTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::DEPENDENCY_ID
    }

    override getName() {
        return SCGTransformations::DEPENDENCY_ID
    }

    override getProducedFeatureId() {
        return SCGFeatures::DEPENDENCY_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::BASIC_ID)
    }
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
       
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension AnnotationsExtensions    
    
    @Inject
    extension KEffectsExtensions


    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
    public static val ANNOTATION_DEPENDENCYTRANSFORMATION = "dependencies"
    
    /**
     * transformSCGToSCGDEP executes the transformation from a standard SCG to 
     * an SCG with dependency information.
     * 
     * @param scg 
     * 			the originating source scg
     * @return Returns a copy of the scg enriched with dependency information.
     */   
    def SCGraph transform(SCGraph scg) {

		scg.createStringAnnotation(SCGFeatures.DEPENDENCY_ID, SCGFeatures.DEPENDENCY_NAME)
		
		val assignments = <Assignment> newLinkedHashSet
		val conditionals = <Conditional> newLinkedHashSet
		scg.nodes.filter[ it instanceof Assignment || it instanceof Conditional ].forEach[
			if (it instanceof Assignment) {
				assignments += it
			} else {
				conditionals += it as Conditional
			}
		]
		
		val writer = HashMultimap.create
		val reader = HashMultimap.create

		for(assignment : assignments) {
			writer.put(assignment.valuedObject, assignment)
			assignment.expression.getAllReferences.forEach[
				reader.put(it.valuedObject, assignment)
			]
		}
		for(conditional : conditionals) {
			conditional.condition.getAllReferences.forEach[
				reader.put(it.valuedObject, conditional)
			]
		}
		
		for(assignment : assignments) {
			assignment.createDependency(scg)
		}
		
        // Return the SCG with dependency data.
        scg
    }   
    
    protected def createDependency(Assignment assignment, SCGraph scg) {
    	
    }
 
}