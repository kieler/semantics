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

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.DataDependencyType
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import java.util.List
import java.util.Map
import java.util.Set
import de.cau.cs.kieler.scg.SCGPlugin
import org.eclipse.core.runtime.Plugin

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

class DependencyTransformation extends AbstractProductionTransformation implements Traceable {

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
    extension SCGCoreExtensions
    
    @Inject
    extension SCGThreadExtensions

    @Inject
    extension SCGDependencyExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension AnnotationsExtensions    
    
    @Inject
    extension KEffectsExtensions


    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
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
		
		val threadMapping = <Entry, Set<Node>> newHashMap
		val nodeMapping = <Node, List<Entry>> newHashMap;
		scg.nodes.head.asEntry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)
		
		val assignments = <Assignment> newHashSet
		val conditionals = <Conditional> newHashSet
		val writer = HashMultimap.create
		val relativeWriter = <Assignment> newHashSet
		val reader = HashMultimap.create

		nodeMapping.createNodeCaches(assignments, conditionals, writer, relativeWriter, reader)

       		
		SCGPlugin.log("Assignments: " + assignments.size)
		SCGPlugin.log("Valued Objects: " + writer.keySet.size)
		
		for(assignment : assignments) {
			assignment.createDependencies(writer, relativeWriter, reader, nodeMapping)
		}
		
        // Return the SCG with dependency data.
        scg
    }
	
    protected def void createNodeCaches(Map<Node, List<Entry>> nodeMapping, 
    	Set<Assignment> assignments, Set<Conditional> conditionals, 
    	Multimap<ValuedObject, Assignment> writer, Set<Assignment> relativeWriter, 
    	Multimap<ValuedObject, Node> reader
	) {
		for(node : nodeMapping.keySet.filter[ it instanceof Assignment || it instanceof Conditional ]) {
			if (node instanceof Assignment) {
				if (node.valuedObject != null) {
					assignments += node
					writer.put(node.valuedObject, node)
					node.expression.getAllReferences.forEach[
						reader.put(it.valuedObject, node)
						if (it.valuedObject.equals(node.valuedObject)) {
							relativeWriter += node
						}
					]
					if (node.operator != AssignOperator::ASSIGN) {
						relativeWriter += node
					}
				}
			} else if (node instanceof Conditional) {
				conditionals += node
				node.condition.getAllReferences.forEach[
					reader.put(it.valuedObject, node)
				]
			}
		}
    }   
    
    protected def createDependencies(Assignment assignment, Multimap<ValuedObject, Assignment> writer,
    	Set<Assignment> relativeWriter, Multimap<ValuedObject, Node> reader, Map<Node, List<Entry>> nodeMapping
    ) {
        if (!relativeWriter.contains(assignment)) { 
        	for(VOWriter : writer.get(assignment.valuedObject).filter[ !equals(assignment) ]
        	) {
        		val dependency = assignment.createDataDependency(VOWriter, 
        			if (relativeWriter.contains(VOWriter)) DataDependencyType.WRITE_RELATIVEWRITE else DataDependencyType.WRITE_WRITE
        		)
        		dependency.checkAndSetConfluence
        		dependency.checkAndSetConcurrency(nodeMapping)
        	}	
    	}
    	for(VOReader : reader.get(assignment.valuedObject).filter[ !it.equals(assignment) ]) {
    		val dependency = assignment.createDataDependency(VOReader, DataDependencyType.WRITE_READ)
    		dependency.checkAndSetConfluence
    		dependency.checkAndSetConcurrency(nodeMapping)
    	}	
    }
    

    

 
}