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

/**
 * Optimizer Copy Propagation.
 * 
 * @author jbus
 * @kieler.design 
 * @kieler.rating 
 */

package de.cau.cs.kieler.scg.opt.cp

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.opt.features.OptimizerFeatures
import de.cau.cs.kieler.scg.features.SCGFeatureGroups
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.SCGraph
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.impl.AssignmentImpl
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl
import de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl
import de.cau.cs.kieler.scg.impl.ConditionalImpl
import de.cau.cs.kieler.scg.Node
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Link
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl
import de.cau.cs.kieler.core.kexpressions.Declaration
import java.util.HashMap
import de.cau.cs.kieler.core.kexpressions.impl.ValueImpl

class CopyPropagation extends AbstractProductionTransformation {
    // Inject from SCGDeclarations
    @Inject 
    extension SCGDeclarationExtensions
    // Set Feature ID
    override getProducedFeatureId() {
        return OptimizerFeatures::CP_ID
    }
    // Set Required Feature IDs
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SEQUENTIALIZE_ID, SCGFeatureGroups::SCG_ID)
    }
    // Set Feature ID
    override getId() {
        return OptimizerFeatures::CP_ID
    }
    // Set Feature Name
    override getName() {
        return OptimizerFeatures::CP_NAME
    }
    /*
     * Optimization is implemented as transformation
     */
    def SCGraph transform(SCGraph scg) {
        /* SET FILTER */
        val nodes = scg.nodes
        val declarations = scg.declarations
        // get all assigments for given criteria
        val assignments = nodes.filter(typeof(AssignmentImpl)).filter[
                it.operator.getName().equals("ASSIGN")
            ].filter[
                if(it.valuedObject == null) {
                    return false
                }
                return (
                    it.valuedObject.getName().startsWith("g")
                        || it.valuedObject.getName().startsWith("PRE_g")
                        || it.valuedObject.getName().startsWith("_condg")
                )
            ]
        // extract 1-o-1 assignemts like X = Y
        val one2oneAssignments = assignments.filter[
            it.assignment.class.typeName.equals(ValuedObjectReferenceImpl.typeName)
        ]
        val constantAssignments = assignments.filter[
           it.assignment instanceof ValueImpl
        ]
        // extract  condg variables
        val condAssignments = assignments.filter[
            it.assignment.class.typeName.equals(OperatorExpressionImpl.typeName)
                && (it.assignment as OperatorExpressionImpl).operator.getName().equals("LOGICAL_OR")
                && (it.assignment as OperatorExpressionImpl).subExpressions.length == 1
        ]
        // extract pre assignemts like X = PRE_Y
        val preAssignments = assignments.filter[
            it.assignment.class.typeName.equals(OperatorExpressionImpl.typeName)
                && (it.assignment as OperatorExpressionImpl).operator.getName().equals("PRE")
        ]
        // extract not assignemnts like  X = !(Y)
        val notAssignments = assignments.filter[
            it.assignment.class.typeName.equals(OperatorExpressionImpl.typeName)
                && (it.assignment as OperatorExpressionImpl).operator.getName().equals("NOT")
        ]
        /* END FILTERING */
        /* BUILD ONE BIG FILTER */
        val relevantAssignments = one2oneAssignments.toList()
        relevantAssignments.addAll(preAssignments)
        relevantAssignments.addAll(notAssignments)
        relevantAssignments.addAll(condAssignments)
        relevantAssignments.addAll(constantAssignments);
        /* CHECK IF THE ASSIGNMENT IS ONLY ASSIGNED ONCE */
        val cleanedRelevantAssignments = new ArrayList<AssignmentImpl>();
        // check if an assignment is used multiple times
        relevantAssignments.forEach[
            val name = it.valuedObject.name
            val occ = assignments.filter[it.valuedObject.getName().equals(name)].size
            if(occ == 1) {
                cleanedRelevantAssignments.add(it)
            }
        ]
        /* REPLACE VARS */
        cleanedRelevantAssignments.forEach[
            findOccurrenceInNodes(nodes, it)
        ]
        /* CHECK ASSIGNMENTS */
        val endCheckAssignments = new ArrayList<AssignmentImpl>();
        val reads = new HashMap<String, Integer>()
        nodes.forEach[
            val readIterator = it.eAllContents.filter(typeof(ValuedObjectReferenceImpl))
            readIterator.forEach[
                val id = it.valuedObject.name
                if(reads.containsKey(id)) {
                    reads.replace(id, reads.get(id) + 1)
                }
                else {
                    reads.put(id, 1)
                }
            ]
        ]
        cleanedRelevantAssignments.forEach[
            val name = it.valuedObject.name
            val occ = reads.getOrDefault(name, 0)
            if(occ == 0) {
                endCheckAssignments.add(it)
            }
        ]
        /* REMOVE UNUSED ASSIGNMENTS */
        if(endCheckAssignments.size > 0) {
            var tmp = endCheckAssignments.get(0)
            while(tmp != null) {
                val nextItem = tmp.next
                val prevItems = tmp.incoming
                val changes = new ArrayList<Pair<Link, ControlFlow>>()
                prevItems.forEach[
                    changes.add(new Pair(it, nextItem))
                ]
                // remove node
                nodes.remove(tmp)
                val tmp2 = tmp
                // remove declaration
                val declChanges = new ArrayList<Pair<Declaration, ValuedObjectImpl>>()
                declarations.forEach[
                    val decl = it
                    it.valuedObjects.forEach[
                        val itN = it as ValuedObjectImpl
                        if(itN.getName().equals(tmp2.valuedObject.name)) {
                            declChanges.add(new Pair(decl, itN))
                        }
                    ]
                ]
                declChanges.forEach[
                    it.key.valuedObjects.remove(it.value)
                ]
                endCheckAssignments.remove(tmp)
                
                changes.forEach[
                    it.key.target = it.value.target
                ]
                if(endCheckAssignments.size <= 0) {
                    tmp = null
                }
                else {
                    tmp = endCheckAssignments.get(0)
                }
            }
        }
        return scg
    }
    def void findOccurrenceInNodes (EList<Node> nodes, Assignment assignment) {
        // search and replace in all nodes
        nodes.forEach[
            findOccurrenceInNode(it, assignment)
        ]
    }
    def void findOccurrenceInNode (Node node, Assignment assignment) {
        val search = assignment.valuedObject.name
        val expression = assignment.assignment
        val expressions = node.eAllContents().filter(typeof(ValuedObjectReferenceImpl))
        expressions.forEach[
            val container = it.eContainer
            // search and replace in normal assignments
            if(container instanceof AssignmentImpl) {
                val assContainer = container as AssignmentImpl
                if(assContainer.valuedObject.getName().equals(search)) {
                    assContainer.assignment = expression.copySCGExpression
                }
            }
            // search and replace in conditionals
            else if (container instanceof ConditionalImpl) {
                val condContainer = container as ConditionalImpl
                if(it.valuedObject.getName().equals(search)) {
                    condContainer.condition = expression.copySCGExpression
                }
            }
            // search and replace in complex assignments with operators
            else if (container instanceof OperatorExpressionImpl) {
                val operContainer = container as OperatorExpressionImpl
                if(!operContainer.operator.getName().equals("PRE") && it.valuedObject.getName().equals(search)) {
                    val pos = operContainer.subExpressions.indexOf(it)
                    operContainer.subExpressions.add(pos, expression.copySCGExpression)
                    operContainer.subExpressions.remove(it)
                }
            }
            // print error for unsupported nodetype. actually only the three types above are present in a scg
            else {
                System.out.println("Unsupported Nodetype")
                System.out.println(it)
            }
        ]
    }
}