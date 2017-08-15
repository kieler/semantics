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
package de.cau.cs.kieler.scg.processors.transformators

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.AssignOperator
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.DataDependencyType
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGPlugin
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.List
import java.util.Map
import java.util.Set
import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.annotations.TypedStringAnnotation
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import com.google.inject.Injector
import de.cau.cs.kieler.kexpressions.keffects.util.ValuedObjectContainer
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.common.ValuedObjectNodeContainer

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

class DependencyTransformation extends Processor<SCGraphs, SCGraphs> {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.transformators.dependency"
    }
    
    override getName() {
        "Dependency"
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
    override process() {
        for (scg : getModel.scgs) {
            scg.addDependencies                               
        }        
    }
       

    protected val parameterMapping = <String, List<ValuedObject>> newHashMap
    protected val HashMultimap<Assignment, ValuedObject> writerObjectCache = HashMultimap.create 
    protected val HashMultimap<Node, ValuedObject> readerObjectCache = HashMultimap.create 

    
    def SCGraph addDependencies(SCGraph scg) {

		scg.createStringAnnotation(SCGFeatures.DEPENDENCY_ID, SCGFeatures.DEPENDENCY_NAME)
		
		val threadMapping = <Entry, Set<Node>> newHashMap
		val nodeMapping = <Node, List<Entry>> newHashMap;
		scg.nodes.head.asEntry.getAllThreadNodesAndThreads(threadMapping, nodeMapping)
		
		val assignments = <Assignment> newHashSet
		val conditionals = <Conditional> newHashSet
		val writer = HashMultimap.create
		val relativeWriter = <Assignment> newHashSet
		val reader = HashMultimap.create
		parameterMapping.clear
		writerObjectCache.clear
		readerObjectCache.clear

        for(entry : scg.nodes.filter(Entry)) {
            val parameterList = <ValuedObject> newArrayList
            for(tsa : scg.annotations.filter(TypedStringAnnotation).filter[ name.equals("voLink") && values.head.equals(entry.name)]) {
                parameterList += scg.findValuedObjectByName(tsa.type)
            }
            parameterMapping.put(entry.name, parameterList)
        }

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
    	Multimap<ValuedObject, ValuedObjectNodeContainer> writer, Set<Assignment> relativeWriter, 
    	Multimap<ValuedObject, ValuedObjectNodeContainer> reader
	) {
		for(node : nodeMapping.keySet.filter[ it instanceof Assignment || it instanceof Conditional ]) {
			if (node instanceof Assignment) {
				if (node.valuedObject != null) {
					assignments += node
					
					val VOC = injector.getInstance(ValuedObjectNodeContainer) => [ it.set(node, node) ]
					writer.put(VOC.valuedObject, VOC)
					
					val allReferences = node.expression.allReferences
					node.indices.forEach[ allReferences += it.allReferences ]
					
					allReferences.forEach[ vor |
					    val expVOC =  injector.getInstance(ValuedObjectNodeContainer) => [ it.set(vor, node) ]
						reader.put(expVOC.valuedObject, expVOC)
						
						if (expVOC.equals(VOC)) {
							relativeWriter += node
						}
					]
					
					if (node.operator != AssignOperator::ASSIGN) {
						relativeWriter += node
					}
				} else {
				    val expression = node.expression
				    if (expression instanceof ReferenceCall) {
				        assignments += node
				        val refName = expression.valuedObject.declaration.asReferenceDeclaration.extern
				        val refList = parameterMapping.get(refName)
				        for(var i = 0; i < refList.size; i++) {
				            val pex = expression.parameters.get(i).expression
				            if (pex instanceof ValuedObjectReference) {
				                val vo = pex.valuedObject
				                val refVODeclaration = refList.get(i).declaration
				                if (refVODeclaration instanceof VariableDeclaration) {
				                    val VOC =  injector.getInstance(ValuedObjectNodeContainer) => [ set(vo, node) ]
				                    if (refVODeclaration.input) {
				                        reader.put(VOC.valuedObject, VOC)
				                        readerObjectCache.put(node, vo)
				                    } else {
				                        writer.put(VOC.valuedObject, VOC)
                                        writerObjectCache.put(node, vo)
				                    }
				                }
				            }  
				        }
				    }
				}
			} else if (node instanceof Conditional) {
				conditionals += node
				node.condition.getAllReferences.forEach[ vor |
                    val expVOC =  injector.getInstance(ValuedObjectNodeContainer) => [ set(vor, node) ]
                    reader.put(expVOC.valuedObject, expVOC)
				]
			}
		}
    }   
    
    protected def createDependencies(Assignment assignment, Multimap<ValuedObject, ValuedObjectNodeContainer> writer,
    	Set<Assignment> relativeWriter, Multimap<ValuedObject, ValuedObjectNodeContainer> reader, Map<Node, List<Entry>> nodeMapping
    ) {
        val VOC = injector.getInstance(ValuedObjectNodeContainer) => [ set(assignment, assignment) ]
        VOC.potentiallyEqual = true
        if (!relativeWriter.contains(assignment)) { 
            val vOCWriter = writer.get(VOC.valuedObject)
        	for(VOWriter : vOCWriter.filter[ 
        	    equals(VOC)
        	].map[ node ].filter[ !equals(assignment) ]
        	) {
        		val dependency = assignment.createDataDependency(VOWriter, 
        			if (relativeWriter.contains(VOWriter)) DataDependencyType.WRITE_RELATIVEWRITE else DataDependencyType.WRITE_WRITE
        		)
        		dependency.checkAndSetConfluence
        		dependency.checkAndSetConcurrency(nodeMapping)
        		
        		dependency.trace(assignment)
        	}	
    	}
    	val vOCReader = reader.get(VOC.valuedObject) 
    	for(VOReader : vOCReader.filter[ 
    	    equals(VOC)
    	].map[ node ].filter[ !equals(assignment) ]) {
    	    
    		val dependency = assignment.createDataDependency(VOReader, DataDependencyType.WRITE_READ)
    		dependency.checkAndSetConfluence
    		dependency.checkAndSetConcurrency(nodeMapping)
    		
    		dependency.trace(assignment)
    	}	
    }

}