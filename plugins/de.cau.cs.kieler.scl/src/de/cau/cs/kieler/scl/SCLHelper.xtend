package de.cau.cs.kieler.scl

import de.cau.cs.kieler.scl.scl.Annotation
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Instruction
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
import java.util.HashMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.yakindu.sct.model.sgraph.Effect
import org.yakindu.sct.model.sgraph.Event
import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.StextFactory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Thread
import java.util.List
import de.cau.cs.kieler.scl.scl.InstructionScope

//import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSequence

// import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Instruction;

class SCLHelper {
    
    // ======================================================================================================
    // ==                       B A S I C   M E T A M O D E L   E X T E N S I O N                          ==
    // ======================================================================================================
    
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
    
    def createNewInstructionList()
    {
        new ArrayList<EObject>
    }
    
    def createNewInstructionList(Instruction instruction) {
        createNewInstructionList.add(instruction)
    }
    
    def Goto createSCLGoto(String targetLabelName)
    {
        var goto = SCL.createGoto();
        goto.setName(targetLabelName);
        goto;
    }
    
    def Annotation createSCLComment(String commentString) {
        var comment = SCL.createAnnotation();
        comment.setComment('// '+commentString);
        comment;
    }
    
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
    
    def Pause createSCLPause() {
        SCL.createPause();
    }
    
   
    def VariableDeclaration createSCLVariableDeclaration() {
        var varDef = SCL.createVariableDeclaration();
        varDef;
    }
    
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
    
    def Assignment createSCLAssignment(Effect effect) {
        var assignment = SCL.createAssignment();
        if (effect instanceof ReactionEffect) {
                assignment.assignment = (effect as ReactionEffect).actions.head.copy;
                assignment.eAllContents.filter(typeof(AssignmentExpression)).forEach [
                    val varRef = (it.varRef as ElementReferenceExpression);
                    varRef.reference = (varRef.reference as Event).createVariableDeclaration();
                ]
        }
        
        assignment;    
    }
    
    def Conditional createSCLConditional() {
        var conditional = SCL.createConditional();
        conditional;
    }
    
    def Conditional createSCLConditional(Trigger trigger) {
        var conditional = SCL.createConditional();
        if (trigger instanceof ReactionTrigger) {
            val reactionTrigger = trigger as ReactionTrigger;
            if (reactionTrigger.guardExpression != null) {
                conditional.expression = reactionTrigger.guardExpression.copy;
                conditional.eAllContents.filter(typeof(ElementReferenceExpression)).forEach [ e |
                    e.reference = (e.reference as Event).createVariableDeclaration;  
                ]
            }
        }
        conditional;
    }    
    
    def Thread createSCLThread() {
        SCL.createThread();
    }
    
    def Thread createSCLThread(List<EObject> iList) {
        val thread = createSCLThread()
        thread.instructions.addAll(iList)
        thread
    }
    
    // ======================================================================================================
    // ==                I N S T R U C T I O N    M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    def void addInstruction(List<EObject> iList, EObject instruction) {
        if (instruction instanceof Instruction ||
            instruction instanceof Label ||
            instruction instanceof Annotation)
            iList.add(instruction)
    }

    def void addInstruction(Program program, EObject instruction) {
        program.instructions.addInstruction(instruction)
    }
    
    def void addInstruction(Conditional conditional, EObject instruction) {
        conditional.instructions.addInstruction(instruction)
    }

    def void addInstruction(Thread thread, EObject instruction) {
        thread.instructions.addInstruction(instruction)
    }
    
//    def void addInstruction(List<EObject> list, EObject instruction) {
//        if (instruction instanceof Instruction ||
//            instruction instanceof Label ||
//            instruction instanceof Annotation)
//        list.add(instruction)
//    }
    
    def void addInstructions(List<EObject> list, List<EObject> addition) {
        list.addAll(addition)
    }
    
    def void addTo(EList<EObject> iListFrom, EList<EObject> iListTo) {
        iListTo.addAll(iListFrom)
    }
    
    def void addPause(List<EObject> iList) {
        iList.addInstruction(createSCLPause())
    }
    
    def ArrayList<EObject> allContents(List<EObject> iList) {
        var rList = createNewInstructionList()
        for(instruction : iList) {
            if (instruction instanceof Parallel) {
                for(thread : (instruction as Parallel).threads) {
                    rList.addAll(thread.instructions.allContents)
                }
            } 
            else if (instruction instanceof Conditional) 
                rList.addAll((instruction as Conditional).instructions.allContents)
            else if (instruction instanceof InstructionScope) 
                rList.addAll((instruction as InstructionScope).instructions.allContents)
            else 
                rList.addInstruction(instruction)
        }
        rList
    }
        
    // ======================================================================================================
    // ==                 G O T O  - L O O K U P   M E T A M O D E L   E X T E N S I O N                   ==
    // ======================================================================================================
    
    def Instruction gotoLookUp(Goto goto, EList<EObject> iList) {
        gotoLookUp(goto.name, iList)
    }
    
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
    
    def boolean gotoTargetExists(Goto goto, EList<EObject> iList) {
        gotoTargetExists(goto.name, iList)
    }
    
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
    
    def Label gotoGetLabel(Goto goto, EList<EObject> iList) {
        gotoGetLabel(goto.name, iList)
    }
    
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
    
    def EList<EObject> getAncestorThread(Label label) {
        var ancestor = label.eContainer
        while (ancestor != null) {
            if (ancestor instanceof Thread) return (ancestor as Thread).instructions
            if (ancestor instanceof Program) return (ancestor as Program).instructions 
            ancestor = ancestor.eContainer
        }
        return null
    }
    
    def EList<EObject> getThread(EObject instruction) {
        var container = instruction.eContainer
        while (container != null) {
            if (container instanceof Thread) return (container as Thread).instructions
            if (container instanceof Program) return (container as Program).instructions 
            container = container.eContainer
        }
        return null
    }
    
    def boolean inSameThreadAs(EObject instruction, EObject secondInstruction) {
        getThread(instruction) == getThread(secondInstruction)
    }
    
    def boolean isInMainThread(EObject instruction) {
        var container = instruction.eContainer
        while (container != null) {
            if (container instanceof Thread) return false
            if (container instanceof Program) return true 
            container = container.eContainer
        }
        return false
    }
    
    // ======================================================================================================
    // ==                       S C O P E   M E T A M O D E L   E X T E N S I O N                          ==
    // ======================================================================================================
    
    
    // ======================================================================================================
    // ==                    ID  &  N A M I N G   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
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
    
    
    // ======================================================================================================
    // ==                       O R D E R I N G   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    def int compareSCLRegionStateOrder(SyncState e1, SyncState e2) {
        var order = 1;
        if (e1.isInitial) {order = -1}
        if (e2.isFinal) {order = -1}
        order;
    }
    
    
    // ======================================================================================================
    // ==                   D E P E N D E N C Y   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
//CONDITIONAL
//LogicalRelationExpressionImpl
//    ElementReferenceExpressionImpl
//        VariableDeclarationImpl
//            Name
//    operator = RelationalOperator
//        == >=
//    PrimitiveValueExpressionImpl
//        value = BoolLiteralImpl
//
//    ParenthesizedExpressionImpl
//        NumericalAddSubtractExpressionImpl
//        ...
//
//ASSIGNMENT
//AssignmentExpression
//    expression = PrimitiveValueExpressionImpl
//    operator = AssignmentOperator
//    varRef = ElementReferenceExpressionImpl
//   

    def ArrayList<ElementReferenceExpression> dependencyReferences(EObject instruction) {
        if (instruction instanceof Assignment) return dependencyReferences(instruction as Assignment) 
        return new ArrayList<ElementReferenceExpression>
    }
 
    def ArrayList<ElementReferenceExpression> dependencyReferences(Assignment instruction) {
        var resList = new ArrayList<ElementReferenceExpression>
        if (!(instruction.assignment instanceof AssignmentExpression)) return resList
        val AssignmentExpression aExp = instruction.assignment as AssignmentExpression
        
        resList.add(aExp.varRef as ElementReferenceExpression)
                
        resList 
    }
    
    def ArrayList<EObject> dependencyInstructions(List<EObject> iList, ElementReferenceExpression varRef) {
        val iS = createNewInstructionList()
        
        iList.allContents.forEach([ e |
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
    
    def ArrayList<EObject> dependencyInstructions(EObject instruction, List<EObject> iList) {
        val iS = createNewInstructionList()
        val references = instruction.dependencyReferences
        if (references == null) return iS
        
        for(reference : references) {
            iS.addAll(iList.dependencyInstructions(reference).filter([it!=instruction]))
        }
        
        iS
    }
    
    def boolean isInThread(EObject instruction, List<EObject> iList) {
        iList.contains(instruction)
    }
}