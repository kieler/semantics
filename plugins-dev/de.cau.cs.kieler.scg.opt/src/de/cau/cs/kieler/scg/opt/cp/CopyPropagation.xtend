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

class CopyPropagation extends AbstractProductionTransformation {
    // Class Vars
    public static val ANNOTATION_COPY_PROPAGATION = "copy_propagation" 
    private static val DEBUG = false;
    
    // Inject  
    @Inject 
    extension SCGDeclarationExtensions
    
    override getProducedFeatureId() {
        return OptimizerFeatures::CP_ID
    }
    
    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::SEQUENTIALIZE_ID, SCGFeatureGroups::SCG_ID)
    }
    
    override getId() {
        return OptimizerFeatures::CP_ID
    }
    
    override getName() {
        return OptimizerFeatures::CP_NAME
    }
    
    // TODO: minimize cyclomatic index
    def SCGraph transform(SCGraph scg) {
        if(DEBUG) {
            System.out.println("OPTIMIZER")
        }
        // cache data
        val nodes = scg.nodes
        val assignments = nodes.filter(typeof(AssignmentImpl)).filter[
                it.operator.getName().equals("ASSIGN")
            ].filter[
                if(it.valuedObject == null) {
                    return false
                }
                return (it.valuedObject.getName().startsWith("g") || it.valuedObject.getName().startsWith("PRE_g"))
            ]
        if(DEBUG) {
            System.out.println("Assigments")
            assignments.forEach[
                System.out.println(it.valuedObject)
            ]
        }
        // X = Y
        val one2oneAssignments = assignments.filter[it.assignment.class.typeName.equals(ValuedObjectReferenceImpl.typeName)]
        if(DEBUG) {
            System.out.println("One2OneAssignment")
            one2oneAssignments.forEach[
                System.out.println(it.valuedObject)
            ]
        }
        // X = PRE_Y
        val preAssignments = assignments.filter[it.assignment.class.typeName.equals(OperatorExpressionImpl.typeName) && (it.assignment as OperatorExpressionImpl).operator.getName().equals("PRE")]
        if(DEBUG) {
            System.out.println("PreAssigments")
            preAssignments.forEach[
                System.out.println(it.valuedObject)
            ]
        }
        // X = !(Y)
        val notAssignments = assignments.filter[it.assignment.class.typeName.equals(OperatorExpressionImpl.typeName) && (it.assignment as OperatorExpressionImpl).operator.getName().equals("NOT")]
        if(DEBUG) {
            System.out.println("NotAssigments")
            notAssignments.forEach[
                System.out.println(it.valuedObject)
            ]
        }
        // merge Assignments
        val relevantAssignments = one2oneAssignments.toList()
        relevantAssignments.addAll(preAssignments)
        relevantAssignments.addAll(notAssignments)
        if(DEBUG) {
            System.out.println("RelevantAssignments")
            relevantAssignments.forEach[
                System.out.println(it.valuedObject)
            ]
        }
        if(DEBUG) {
            System.out.println("CheckOccures")
        }
        val cleanedRelevantAssignments = new ArrayList<AssignmentImpl>();
        // check if an assignment is used multiple times
        relevantAssignments.forEach[
            val name = it.valuedObject.name
            val occ = assignments.filter[it.valuedObject.getName().equals(name)].size
            if(DEBUG) {
                System.out.println(it.valuedObject + " accures " + occ.toString() + " times")
            }
            if(occ == 1) {
                cleanedRelevantAssignments.add(it)
            }
        ]
        if(DEBUG) {
            System.out.println("CleanedRelevantAssignments")
            cleanedRelevantAssignments.forEach[
                System.out.println(it.valuedObject)
            ]
        }
        // Replace read of relevant assignments
        cleanedRelevantAssignments.forEach[
            FindOccuresInNode(nodes, it)
        ]
        val endCheckAssignments = new ArrayList<AssignmentImpl>();
        val assignmentsRefresh = nodes.filter(typeof(AssignmentImpl)).filter[
                it.operator.getName().equals("ASSIGN")
            ].filter[
                if(it.valuedObject == null) {
                    return false
                }
                return (it.valuedObject.getName().startsWith("g") || it.valuedObject.getName().startsWith("PRE_g"))
            ]
        cleanedRelevantAssignments.forEach[
            val name = it.valuedObject.name
            val occ = assignmentsRefresh.filter[it.valuedObject.getName().equals(name)].size
            if(DEBUG) {
                System.out.println(it.valuedObject + " accures " + occ.toString() + " times")
            }
            if(occ == 1) {
                endCheckAssignments.add(it)
            }
        ]
        
        if(endCheckAssignments.size > 0) {
            var tmp = endCheckAssignments.get(0)
            while(tmp != null) {
                val nextItem = tmp.next
                val prevItems = tmp.incoming
                
                val changes = new ArrayList<Pair<Link, ControlFlow>>()
                prevItems.forEach[
                    changes.add(new Pair(it, nextItem))
                ]
                nodes.remove(tmp)
                endCheckAssignments.remove(tmp)
                
                changes.forEach[
                    it.key.target = it.value.target
                ]
                
                //
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
    
    def void FindOccuresInNode (EList<Node> nodes, Assignment assignment) {
        nodes.forEach[
            // TODO: get all uses of an var
            FindOccures(it, assignment)
        ]
    }
    
    def void FindOccures(Node node, Assignment assignment) {
        val search = assignment.valuedObject.name
        val expression = assignment.assignment
        if(DEBUG) {
            System.out.println("Analyse " + node + " for " + search +  " with " + expression)
        }
        val expressions = node.eAllContents().filter(typeof(ValuedObjectReferenceImpl))
        expressions.forEach[
            val container = it.eContainer
            if(container instanceof AssignmentImpl) {
                val assContainer = container as AssignmentImpl
                if(DEBUG) {
                    System.out.println("Assignment: " + assContainer.valuedObject.name)
                }
                if(assContainer.valuedObject.getName().equals(search)) {
                    assContainer.assignment = expression.copySCGExpression
                }
            }
            else if (container instanceof ConditionalImpl) {
                val condContainer = container as ConditionalImpl
                if(DEBUG) {
                    System.out.println("Conditional: " + it.valuedObject.name)
                }
                if(it.valuedObject.getName().equals(search)) {
                    condContainer.condition = expression.copySCGExpression
                }
            }
            else if (container instanceof OperatorExpressionImpl) {
                val operContainer = container as OperatorExpressionImpl
                if(DEBUG) {
                    System.out.println("Operator: " + it.valuedObject.name)
                }
                if(it.valuedObject.getName().equals(search)) {
                    val pos = operContainer.subExpressions.indexOf(it)
                    operContainer.subExpressions.add(pos, expression.copySCGExpression)
                    operContainer.subExpressions.remove(it)
                }
            }
            else {
                System.out.println(it)
            }
        ]
    }
}