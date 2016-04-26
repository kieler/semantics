package de.cau.cs.kieler.scg.opt.cp

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.opt.features.OptimizerFeatures
import de.cau.cs.kieler.scg.features.SCGFeatureGroups
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import com.google.inject.Inject
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsCreateExtensions
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.impl.AssignmentImpl
import java.util.ArrayList
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl
import de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectReferenceImpl
import de.cau.cs.kieler.core.kexpressions.impl.OperatorExpressionImpl
import de.cau.cs.kieler.scg.impl.ConditionalImpl
import org.eclipse.emf.ecore.util.EObjectContainmentEList
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.Expression
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage
import java.util.HashMap

class CopyPropagation extends AbstractProductionTransformation {
    // Class Varas
    public static val ANNOTATION_COPY_PROPAGATION = "copy_propagation" 
    private static val DEBUG = true;
    
    // Inject
    @Inject
    extension SCGCoreExtensions
    
    @Inject 
    extension SCGDeclarationExtensions
         
    @Inject 
    extension KExpressionsDeclarationExtensions 
    
    @Inject 
    extension KExpressionsValuedObjectExtensions     
    
    @Inject 
    extension KExpressionsCreateExtensions 

    @Inject
    extension AnnotationsExtensions
    
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
        val assignments = nodes.filter(typeof(AssignmentImpl)).filter[it.operator.getName().equals("ASSIGN")].filter[it.valuedObject.getName().startsWith("g") || it.valuedObject.getName().startsWith("PRE_g")]
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
        val varOccures = new HashMap<AssignmentImpl, ArrayList<Expression>>()
        // Replace read of relevant assignments
        cleanedRelevantAssignments.forEach[
            varOccures.put(it, ReplaceOccuresInNode(nodes, it))
        ]
        return scg
    }
    
    def ArrayList<Expression> ReplaceOccuresInNode (EList<Node> nodes, AssignmentImpl assignment) {
        val varOccures = new ArrayList<Expression>() 
        nodes.forEach[
            // TODO: get all uses of an var
            varOccures.addAll(ReplaceOccures(it, assignment))
        ]
        return varOccures
    }
    
    def ArrayList<Expression> ReplaceOccures (Node node, AssignmentImpl assignment) {
        val outList = new ArrayList<Expression>();
        if(node instanceof AssignmentImpl) {
            val item = node as AssignmentImpl
            if(item.valuedObject.name.equals(assignment.valuedObject.name))
                return outList;
            if(item.assignment instanceof ValuedObjectReferenceImpl) {
                // replace
                if(DEBUG) {
                    System.out.println("Replace: " + item.valuedObject.name + " with " + assignment);
                }
                var ass = item.assignment as ValuedObjectReferenceImpl
                if(ass.valuedObject.getName().equals(assignment.valuedObject.getName())) {
                    //item.assignment = assignment.assignment
                    outList.add(item.assignment)
                } 
            }
            else if (item.assignment instanceof OperatorExpressionImpl) {
                var ass = item.assignment as OperatorExpressionImpl
                //val newSubExpressions = new EObjectContainmentEList<Expression>(typeof(Expression), ass, KExpressionsPackage.OPERATOR_EXPRESSION__SUB_EXPRESSIONS);
                ass.subExpressions.forEach[
                    var tmp = ReplaceInSubExpression(it/*.copySCGExpression*/, assignment)
                    if(tmp != null) {
                        outList.addAll(tmp)
                    }
                ]
                //ass.subExpressions = newSubExpressions
            }
        }
        else if (node instanceof ConditionalImpl) {
                        
        }
        return outList
    }
    
    def ArrayList<Expression> ReplaceInSubExpression (Expression exp, AssignmentImpl assignment) {
        val outList = new ArrayList<Expression>();
        if (exp instanceof OperatorExpressionImpl) {
            //val newSubExpressions = new EObjectContainmentEList<Expression>(typeof(Expression), exp, KExpressionsPackage.OPERATOR_EXPRESSION__SUB_EXPRESSIONS);
            exp.subExpressions.forEach[
                var tmp = ReplaceInSubExpression(it.copySCGExpression, assignment)
                if(tmp != null) {
                    outList.addAll(tmp)
                }
            ]
            //exp.subExpressions = newSubExpressions
        }
        else if (exp instanceof ValuedObjectReferenceImpl) {
            val ass = exp as ValuedObjectReferenceImpl
            if(ass.valuedObject.getName().equals(assignment.valuedObject.getName())) {
                if(assignment.assignment instanceof ValuedObjectReferenceImpl) {
                    val ass_ass = assignment.assignment as ValuedObjectReferenceImpl
                    ass.valuedObject = ass_ass.valuedObject
                }
                else if (assignment.assignment instanceof OperatorExpressionImpl) {
                    val ass_ass = assignment.assignment as OperatorExpressionImpl
                    if(DEBUG) {
                        System.out.println("Replace: " + exp.valuedObject.name + " with " + ass_ass);
                    }
                    outList.add(ass_ass)
                }
            }
        }
        return outList
    }
}