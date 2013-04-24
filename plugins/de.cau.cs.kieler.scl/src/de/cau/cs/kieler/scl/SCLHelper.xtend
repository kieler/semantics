package de.cau.cs.kieler.scl

import de.cau.cs.kieler.scl.scl.Annotation
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionScope
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.VariableDeclaration
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.yakindu.sct.model.sgraph.Effect
import org.yakindu.sct.model.sgraph.Event
import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.StextFactory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.yakindu.sct.model.stext.stext.RegularEventSpec
import org.yakindu.sct.model.stext.stext.RelationalOperator

/*
 * This class provides many useful methods to help to handle a lot of general scl  tasks.
 * It is divided in several categories. Maybe it's a good idea to split this categories in different
 * classes in the future.
 */
class SCLHelper {
    
    // ======================================================================================================
    // ==                       B A S I C   M E T A M O D E L   E X T E N S I O N                          ==
    // ======================================================================================================
    
    /*
     * Methods for easy factory access 
     */
    
    def void Debug(String debugString) { System::out.println(debugString) }
 
    def SGraph() { SGraphFactory::eINSTANCE }
    
    def SText() { StextFactory::eINSTANCE }
    
    def SyncGraph() { SyncgraphFactory::eINSTANCE }
    
    def SyncText() { SynctextFactory::eINSTANCE }
    
    def SCCExp() { SCChartsExpFactory::eINSTANCE }
 
    def SCL() { SclFactory::eINSTANCE }
    
    // ======================================================================================================
    // ==                       C R E A T E   M E T A M O D E L   E X T E N S I O N                        ==
    // ======================================================================================================
    
    /*
     * Methods for easy object creation
     */
    
    // Create a new list of EObjects
    def createNewInstructionList()
    {
        new ArrayList<EObject>
    }
    
    // Create a new list of EObjects and insert the first instruction
    def createNewInstructionList(Instruction instruction) {
        createNewInstructionList.add(instruction)
    }
    
    // Create a goto statement with target string
    def Goto createSCLGoto(String targetLabelName)
    {
        var goto = SCL.createGoto();
        goto.setName(targetLabelName);
        goto;
    }
    
    // Create a SCL comment 
    def Annotation createSCLComment(String commentString) {
        var comment = SCL.createAnnotation();
        comment.setComment('// '+commentString);
        comment;
    }
    
    // Create a SCL label
    def Label createSCLLabel(String labelName) {
        var label = SCL.createLabel();
        label.setName(labelName);
        label;
    }
    
//    def Scope createSCLScope(String labelName) {
//        var scope = SCL.createScope()
//        var iSet  = createSCLInstructionSet()
//        scope.scope = iSet
//        if (!labelName.nullOrEmpty) {
//            var label = createSCLLabel(labelName);
//            scope.setLabel(label);
//        }
//        scope;
//    }
    
    // Create a SCL pause
    def Pause createSCLPause() {
        SCL.createPause();
    }
    
   
   // Create a new VariableDeclaration object
    def VariableDeclaration createSCLVariableDeclaration() {
        var varDef = SCL.createVariableDeclaration();
        varDef;
    }
    
    // Create a new VariableDeclaration or return an old one, if it already exists in the given context
    def VariableDeclaration create varDef: SCL.createVariableDeclaration()
        createVariableDeclaration(Event definition) {

        varDef.setName(definition.getName());
        if (definition instanceof EventDefinition) {
            val eventDefinition = definition as EventDefinition;
            varDef.setInput(eventDefinition.isInput());
            varDef.setOutput(eventDefinition.isOutput());
            
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
        SCL.createConditional();
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
                conditional.expression = reactionTrigger.trigger.event.toExpression.copy;
                conditional.eAllContents.filter(typeof(ElementReferenceExpression)).forEach [ e |
                    e.reference = (e.reference as Event).createVariableDeclaration;  ]
            }
        }
        conditional;
    }    
    
    // Create a new SCL thread
    def Thread createSCLThread() {
        SCL.createThread();
    }
    
    // Create a new SCL thread and copy the given instruction list
    def Thread createSCLThread(List<EObject> iList) {
        val thread = createSCLThread()
        thread.instructions.addAll(iList)
        thread
    }
    
    // ======================================================================================================
    // ==                I N S T R U C T I O N    M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    /*
     * These methods easy the handling of instructions and lists of instructions
     */
    
    // Add an instruction to an list of instructions. Make sure it is a valid instruction.
    def void addInstruction(List<EObject> iList, EObject instruction) {
        if (instruction instanceof Instruction ||
            instruction instanceof Label ||
            instruction instanceof Annotation)
            iList.add(instruction)
    }

    // Add an instruction to the EList of a SCL program.
    def void addInstruction(Program program, EObject instruction) {
        program.instructions.addInstruction(instruction)
    }
    
    // Add an instruction to the EList of a SCL conditional
    def void addInstruction(Conditional conditional, EObject instruction) {
        conditional.instructions.addInstruction(instruction)
    }

    // Add an instruction to the EList of a SCL thread
    def void addInstruction(Thread thread, EObject instruction) {
        thread.instructions.addInstruction(instruction)
    }
    
    // Add all instructions of one instruction list to another instruction list
    def void addInstructions(List<EObject> list, List<EObject> addition) {
        list.addAll(addition)
    }
    
//    def void addTo(EList<EObject> iListFrom, EList<EObject> iListTo) {
//        iListTo.addAll(iListFrom)
//    }
    
    // Add a pause statement to an instruction list
    def void addPause(List<EObject> iList) {
        iList.addInstruction(createSCLPause())
    }
    
    // Flatten an instruction list
    def ArrayList<EObject> flatten(List<EObject> iList) {
        var rList = createNewInstructionList()
        for(instruction : iList) {
            if (instruction instanceof Parallel) {
                rList.add(instruction)
                for(thread : (instruction as Parallel).threads) {
                    rList.addAll(thread.instructions.flatten)
                }
            } 
            else if (instruction instanceof Conditional) {
                rList.add(instruction)
                rList.addAll((instruction as Conditional).instructions.flatten)
            }
            else if (instruction instanceof InstructionScope) {
                rList.add(instruction) 
                rList.addAll((instruction as InstructionScope).instructions.flatten)
            }
            else 
                rList.addInstruction(instruction)
        }
        rList
    }
        
    // ======================================================================================================
    // ==                 G O T O  - L O O K U P   M E T A M O D E L   E X T E N S I O N                   ==
    // ======================================================================================================
    
    /*
     * These methods help to find goto targets and successor instructions of labels.
     */
    
    // Retrieves the target instruction of a goto statement.
    // This is the first valid instruction which succeeds the target label.
    // REMARK: Because the target may not exit or there is no valid instruction after the target label
    // this function may return null! 
    def Instruction gotoLookUp(Goto goto, EList<EObject> iList) {
        gotoLookUp(goto.name, iList)
    }
    
    // Retrieves the first valid instruction which succeeds the label identified by its name.
    // REMARK: Because the target may not exit or there is no valid instruction after the target label
    // this function may return null! 
    def Instruction gotoLookUp(String label, EList<EObject> iList) {
        var boolean foundLabel = false
        for(instruction : iList) {
            if (instruction instanceof Label) {
                if ((instruction as Label).name == label) {
                    foundLabel = true
                }
            } else if (!(instruction instanceof Annotation)) {
                if (foundLabel) {
                    return instruction as Instruction
                } else {
                    if (instruction instanceof Parallel) {
                        for(thread : (instruction as Parallel).threads) {
                            val instrRes = gotoLookUp(label, thread.instructions)
                            if (instrRes != null ) return instrRes
                        }
                    }
                    else if (instruction instanceof Conditional) {
                            val instrRes = gotoLookUp(label, (instruction as Conditional).instructions)
                            if (instrRes != null ) return instrRes
                    }
                }
            }
        }
        return null
    }
    
    // Checks weather or not a specified goto target exists in the instruction list
    def boolean gotoTargetExists(Goto goto, EList<EObject> iList) {
        gotoTargetExists(goto.name, iList)
    }
    
    // Checks weather or not a specified label ID exists in the instruction list
    def boolean gotoTargetExists(String label, EList<EObject> iList) {
        for(instruction : iList) {
            if (instruction instanceof Label) {
                if ((instruction as Label).name == label) {
                    return true
                }
            } else if (!(instruction instanceof Annotation)) {
               if (instruction instanceof Parallel) {
                    for(thread : (instruction as Parallel).threads) {
                        if (gotoTargetExists(label, thread.instructions)) return true
                    }
                }
                else if (instruction instanceof Conditional) {
                    if (gotoTargetExists(label, (instruction as Conditional).instructions))
                        return true
                }
            }
        }
        return false
    }

    // Retrieves the target label of a goto statement, if it exists    
    def Label gotoGetLabel(Goto goto, EList<EObject> iList) {
        gotoGetLabel(goto.name, iList)
    }
    
    // Retrieves the label statement identified by its name, if it exists
    def Label gotoGetLabel(String label, EList<EObject> iList) {
        for(instruction : iList) {
            if (instruction instanceof Label) {
                if ((instruction as Label).name == label) {
                    return (instruction as Label)
                }
            } else if (!(instruction instanceof Annotation)) {
               if (instruction instanceof Parallel) {
                    for(thread : (instruction as Parallel).threads) {
                        val ret = gotoGetLabel(label, thread.instructions)
                        if (ret != null) { return ret }
                    }
                }
                else if (instruction instanceof Conditional) {
                    val ret = gotoGetLabel(label, (instruction as Conditional).instructions)
                    if (ret != null) return ret     
                }
            }
        }
        return null
    }
    
    // ======================================================================================================
    // ==                   S C L T H R E A D   M E T A M O D E L   E X T E N S I O N                      ==
    // ======================================================================================================
    
    /*
     * Methods for scl threads and instructions in this context 
     */
    
    // Retrieve the thread instruction list of the parent object of a given label
    def EList<EObject> getAncestorThread(Label label) {
        var ancestor = label.eContainer
        while (ancestor != null) {
            if (ancestor instanceof Thread) return (ancestor as Thread).instructions
            if (ancestor instanceof Program) return (ancestor as Program).instructions 
            ancestor = ancestor.eContainer
        }
        return null
    }
    
    // Retrieve the thread list of a given instruction
    def EList<EObject> getThread(EObject instruction) {
        var container = instruction.eContainer
        while (container != null) {
            if (container instanceof Thread) return (container as Thread).instructions
            if (container instanceof Program) return (container as Program).instructions 
            container = container.eContainer
        }
        return null
    }
    
    // Checks if two instructions are in the same thread instruction list 
    def boolean inSameThreadAs(EObject instruction, EObject secondInstruction) {
        getThread(instruction) == getThread(secondInstruction)
    }
    
    // Checks if an instruction is in the main thread list (program.instructions)
    def boolean isInMainThread(EObject instruction) {
        var container = instruction.eContainer
        while (container != null) {
            if (container instanceof Thread) return false
            if (container instanceof Program) return true 
            container = container.eContainer
        }
        return false
    }

    // Checks if an instruction is in the given instruction list
    def boolean isInThread(EObject instruction, List<EObject> iList) {
        iList.contains(instruction)
    }    
    // ======================================================================================================
    // ==                       S C O P E   M E T A M O D E L   E X T E N S I O N                          ==
    // ======================================================================================================
    
    
    // ======================================================================================================
    // ==                    ID  &  N A M I N G   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    // Since yakindu does not make use of the EObject ID field, one can use this method to 
    // make every ID in a statechart unique.
    def void distributeStateIDs(Statechart statechart) {
        var states = statechart.eAllContents().toIterable().filter(typeof(SyncState)).toList();

        var HashMap stateMap = new HashMap<String, Integer>;
        for(state : states) {
            if (state.getID().nullOrEmpty) {
                var stateID = state.getName();
                if (stateMap.containsKey(stateID)) {
                    var stateIDNum = (stateMap.get(stateID) as Integer + new Integer(1)).toString();
                    stateMap.put(stateID, stateIDNum);
                    stateID = stateID + stateIDNum;
                } else {
                    stateMap.put(stateID, 1);
                }
                state.setID(stateID);
            }
        }        
    } 
    
    // Remove chars we do not want in our naming scheme.
    def String removeSpecialCharacters(String string) {
        if (string == null) {
            return null;
        }
        return string.replace("-","").replace("_","").replace(" ","").replace("+","")
               .replace("#","").replace("$","").replace("?","")
               .replace("!","").replace("%","").replace("&","")
               .replace("[","").replace("]","").replace("<","")
               .replace(">","").replace(".","").replace(",","")
               .replace(":","").replace(";","").replace("=","");
    }
    
    // Generate a name for a state.
    // This name consists of his name and the names of hierarchical regions and states.
    // If one sub name is null, the elements hash code is used.
    def String getHierarchicalName(SyncState state, String StartSymbol) {
        if (state.parentRegion != null) {
            if (state.parentRegion.eContainer != null && state.parentRegion.eContainer instanceof SyncState) {
                var higherHierarchyReturnedName = (state.parentRegion.eContainer as SyncState).getHierarchicalName(StartSymbol);
                var regionId = state.parentRegion.getName().removeSpecialCharacters();
                var stateId = state.getName().removeSpecialCharacters();
                if (stateId.nullOrEmpty) {
                    stateId = state.hashCode + "";
                }
                if (regionId.nullOrEmpty) {
                    regionId = state.parentRegion.hashCode + "";
                }
                if (!higherHierarchyReturnedName.nullOrEmpty) {
                    higherHierarchyReturnedName = higherHierarchyReturnedName + "_";
                }
                if ((state.parentRegion.eContainer as SyncState).regions.size > 1) {
                    return higherHierarchyReturnedName 
                           + regionId  + "_" +  stateId;
                }
                else {
                    // this is the simplified case, where there is just one region and we can
                    // omit the region id
                    return higherHierarchyReturnedName  
                           + stateId;
                }
            }
        }
        return StartSymbol + "_";
    }
    
    // Because expression serialization, serializes ALL text until the preceding ";",
    // one needs to filter this maybe wrongly serialized text away. 
    def String correctSerialization(String text) {
        val i1 = text.lastIndexOf("\r");
        val i2 = text.lastIndexOf("\n");
        val i3 = text.lastIndexOf("\t");
        val i4 = text.lastIndexOf("*/")+1;
        
        if ((i1 > 0) || (i2 > 0) || (i3 > 0) || (i4 > 1)) {
            var i = i4;
            if ((i1 > i2) && (i1 > i3)  && (i1 > i4)) {
                i = i1;
            }
            else if ((i2 > i1) && (i2 > i3)  && (i2 > i4)) {
                i = i2;
            }
            else if ((i3 > i1) && (i3 > i2)  && (i3 > i4)) {
                i = i3;
            }
            return text.substring(i+1);
        }
        text;
    }    
    
    
    // ======================================================================================================
    // ==                       O R D E R I N G   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    /*
     * Methods used in the xtend.sort scheme
     */
    
    // Order states according to their type.
    // initial < normal < final
    def int compareSCLRegionStateOrder(SyncState e1, SyncState e2) {
        var order = 1;
        if (e1.isInitial) {order = -1}
        if (e2.isFinal) {order = -1}
        order;
    }

    
    // ======================================================================================================
    // ==                  E X P R E S S I O N    M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================

     def dispatch Expression toExpression(RegularEventSpec spec) {
      val rel = SText.createLogicalRelationExpression()
      val elref = SText.createElementReferenceExpression()
      val primval = SText.createPrimitiveValueExpression()
      val bval = SText.createBoolLiteral()
      
      elref.setReference(spec.event)
      bval.setValue(true)
      primval.setValue(bval)
      
      rel.setLeftOperand(elref) 
      rel.setOperator(RelationalOperator::EQUALS)
      rel.setRightOperand(primval)
        
      rel
    }
    
    def dispatch Expression toExpression(Expression exp) {
        exp
    }

    def dispatch Expression negate(Expression exp) {
        var not = SText.createLogicalNotExpression()
        var par = SText.createParenthesizedExpression()
        par.setExpression(exp)
        not.setOperand(par)
        not
    }
    
    def dispatch Expression negate(RegularEventSpec spec) {
        val not = SText.createLogicalNotExpression()
        val par = SText.createParenthesizedExpression()
        par.setExpression(spec.toExpression)   
        not.setOperand(par);
        not  
    }
       
    // ======================================================================================================
    // ==                   D E P E N D E N C Y   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================

/* ----------------------------------------------------
 * SText expression example structure
 *     
 * CONDITIONAL
 * LogicalRelationExpressionImpl
 *     ElementReferenceExpressionImpl
 *         VariableDeclarationImpl
 *             Name
 *     operator = RelationalOperator
 *         == >=
 *     PrimitiveValueExpressionImpl
 *         value = BoolLiteralImpl
 * 
 *     ParenthesizedExpressionImpl
 *         NumericalAddSubtractExpressionImpl
 *         ...
 * 
 * ASSIGNMENT
 * AssignmentExpression
 *     expression = PrimitiveValueExpressionImpl
 *     operator = AssignmentOperator
 *     varRef = ElementReferenceExpressionImpl
 * ----------------------------------------------------
 */   

    // Checks if the given instruction is an assignment or a conditional statement and retrieves a list
    // of ElementReferenceExpressions on which this statement depends on. 
    def ArrayList<ElementReferenceExpression> dependencyReferences(EObject instruction) {
        if (instruction instanceof Assignment) return dependencyReferences(instruction as Assignment) 
        if (instruction instanceof Conditional) return dependencyReferences(instruction as Conditional)
        return new ArrayList<ElementReferenceExpression>
    }
 
    // Retrieve the list of ElementReferenceExpressions for an assignment statement.
    def ArrayList<ElementReferenceExpression> dependencyReferences(Assignment instruction) {
        val resList = new ArrayList<ElementReferenceExpression>
        val AssignmentExpression aExp = instruction.assignment as AssignmentExpression
        
        resList.add(aExp.varRef as ElementReferenceExpression)
        aExp.expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).forEach([
            resList.add(it)
        ])
                
        resList 
    }
    
    // Shortcut for conditionals
    def ArrayList<ElementReferenceExpression> dependencyReferences(Conditional instruction) {
        return dependencyReferences(instruction.expression)
    }

    // Retrieve the list of ElementReferenceExpressions for a conditional statement.
    def ArrayList<ElementReferenceExpression> dependencyReferences(Expression expression) {
        val resList = new ArrayList<ElementReferenceExpression>
        expression.eAllContents.toIterable.filter(typeof(ElementReferenceExpression)).forEach([
            resList.add(it)
        ])
        resList
    }
    
    // Retrieves a list of all instructions in a given instruction list which depend on the given 
    // ElementReferenceExpression.
    def ArrayList<EObject> dependencyInstructions(List<EObject> iList, ElementReferenceExpression varRef) {
        val iS = createNewInstructionList()
        
        iList.flatten.forEach([ e |
            if (e instanceof Assignment) {
                val references = (e as EObject).dependencyReferences 
                for (reference : references) {
                    if (reference.reference.equals(varRef.reference))
                        if (!iS.contains(e)) iS.add(e as EObject);
                }
            }    
        ]);
        
        iS
    }
    
    // Retrieves a list of all instructions in a given instruction list which depend on a 
    // ElementReferenceExpression which is also a dependency for a given instruction.
    def ArrayList<EObject> dependencyInstructions(EObject instruction, List<EObject> iList) {
        val iS = createNewInstructionList()
        val references = instruction.dependencyReferences
        if (references == null) return iS
        
        for(reference : references) {
            iS.addAll(iList.dependencyInstructions(reference).filter([it!=instruction]))
        }
        
        iS
    }
    
}