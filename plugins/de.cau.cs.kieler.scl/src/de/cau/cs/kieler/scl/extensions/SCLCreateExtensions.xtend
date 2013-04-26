package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.StatementScope
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.VariableDeclaration
import org.yakindu.sct.model.sgraph.Event
import de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition
import de.cau.cs.kieler.scl.scl.Assignment
import org.yakindu.sct.model.sgraph.Effect
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import de.cau.cs.kieler.scl.scl.Conditional
import org.yakindu.sct.model.sgraph.Trigger
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

class SCLCreateExtensions {
  
    @Inject
    extension SCLFactoryExtensions
    
    @Inject
    extension SCLExpressionExtensions
    
    // ======================================================================================================
    // ==                       C R E A T E   M E T A M O D E L   E X T E N S I O N                        ==
    // ======================================================================================================
    
    /*
     * Methods for easy object creation
     */
    
    // Create a new list of EObjects
    def createNewInstructionList()
    {
        new ArrayList<Statement>
    }
    
    // Create a new list of EObjects and insert the first instruction
    def createNewInstructionList(Statement statement) {
        createNewInstructionList.add(statement)
    }
    
    def createNewInstructionList(Instruction instruction) {
        val statement = SCL.createInstructionStatement()
        statement.instruction = instruction
        createNewInstructionList(statement)
    }
    
    // Create a goto statement with target string
    def Goto createSCLGoto(String targetLabelName)
    {
        var goto = SCL.createGoto()
        goto.setTargetLabel(targetLabelName)
        goto
    }
    
    // Create a SCL comment 
//    def Annotation createSCLComment(String commentString) {
//        var comment = SCL.createAnnotation();
//        comment.setComment('// '+commentString);
//        comment;
//    }
    
    // Create a SCL label
    def Statement createSCLEmptyStatement(String labelName) {
        val statement = SCL.createEmptyStatement()
        statement.setLabel(labelName)
        statement
    }
    
    def StatementScope createSCLStatementScope() {
        SCL.createStatementScope()
    }
    
    // Create a SCL pause
    def Pause createSCLPause() {
        SCL.createPause()
    }
    
   
   // Create a new VariableDeclaration object
    def VariableDeclaration createSCLVariableDeclaration() {
        SCL.createVariableDeclaration()
    }
    
    // Create a new VariableDeclaration or return an old one, if it already exists in the given context
    def VariableDeclaration create varDef: SCL.createVariableDeclaration()
        createVariableDeclaration(Event definition) {

        varDef.setName(definition.getName());
        if (definition instanceof EventDefinition) {
            val eventDefinition = definition as EventDefinition;
            varDef.setInput(eventDefinition.isInput());
            varDef.setOutput(eventDefinition.isOutput());
            if (eventDefinition.varInitialValue != null) varDef.setInitialValue(eventDefinition.varInitialValue)
            
            if (eventDefinition.getType() != null) {
                varDef.setType(eventDefinition.getType());
            }
        }
    }
    
    // Create a new SCL assignment statement and copy the first action in the given stext effect as 
    // expression.
    def ArrayList<Assignment> createSCLAssignment(Effect effect) {
        val assignments = new ArrayList<Assignment>
        if (effect instanceof ReactionEffect) {
            for(action : (effect as ReactionEffect).actions) {
                val assignment = SCL.createAssignment();
                assignment.assignment = action.copy
                assignment.eAllContents.filter(typeof(AssignmentExpression)).forEach [
                    val varRef = (it.varRef as ElementReferenceExpression);
                    varRef.reference = (varRef.reference as Event).createVariableDeclaration();
                ]
                assignments.add(assignment)
            }
        }
        
        assignments;    
    }
    
    // Create a new scl conditional statement
    def Conditional createSCLConditional() {
        SCL.createConditional()
    }
    
    // Create a new scl conditional and take the given stext trigger as true trigger for the conditional. 
    def Conditional createSCLConditional(Trigger trigger) {
        var conditional = SCL.createConditional();
        if (trigger instanceof ReactionTrigger) {
            val reactionTrigger = trigger as ReactionTrigger;
            if (reactionTrigger.guardExpression != null) {
                conditional.expression = reactionTrigger.guardExpression.copy;
                conditional.eAllContents.filter(typeof(ElementReferenceExpression)).forEach [ e |
                    e.reference = (e.reference as Event).createVariableDeclaration;  
                ]
            } else 
            if (reactionTrigger.trigger != null) {
                conditional.expression = reactionTrigger.trigger.copy.toExpression;
                conditional.eAllContents.filter(typeof(ElementReferenceExpression)).forEach [ e |
                    e.reference = (e.reference as Event).createVariableDeclaration;  ]
            }
        }
        
        conditional
    }    
    
    // Create a new SCL thread
    def Thread createSCLThread() {
        SCL.createThread()
    }
    
    // Create a new SCL thread and copy the given instruction list
    def Thread createSCLThread(List<Statement> statements) {
        val thread = createSCLThread()
        thread.statements.addAll(statements)
        thread
    }
    
}