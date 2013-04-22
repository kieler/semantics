package de.cau.cs.kieler.scl

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
import de.cau.cs.kieler.scl.scl.Annotation
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Instructions
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.VariableDeclaration
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2;
import org.yakindu.sct.model.sgraph.Effect
import org.yakindu.sct.model.sgraph.Event
import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.stext.stext.AssignmentExpression
import org.yakindu.sct.model.stext.stext.ElementReferenceExpression
import org.yakindu.sct.model.stext.stext.StextFactory
import de.cau.cs.kieler.yakindu.model.stext.synctext.EventDefinition
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextFactory
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Program
import org.eclipse.emf.common.util.EList

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
    
    def Instructions createSCLInstructions()
    {
        SCL.createInstructions();
    }
    
    def Instructions createSCLInstructionSet(Instruction instruction) {
        var iS = createSCLInstructions();
        iS.addInstruction(instruction);
        iS;
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
    
//    def Assignment crea
    
    // ======================================================================================================
    // ==                I N S T R U C T I O N    M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    def void addInstruction(Instructions iS, Instruction instruction) {
        iS.list.add(instruction);
    }

    def void addInstruction(Instructions iS, Instructions iL) {
        iS.list.addAll(iL.list);
    }
    
    def void addInstruction(Instructions iS, Annotation annotation) {
        iS.list.add(annotation);
    }

    def void addInstruction(Instructions iSet, Label label) {
        iSet.list.add(label);
    }
    
    def void addInstruction(Instructions iS, EObject ioc) {
        if (ioc instanceof Annotation) { iS.addInstruction(ioc as Annotation) }
        if (ioc instanceof Label) { iS.addInstruction(ioc as Label) }
          else { iS.addInstruction(ioc as Instruction) }
    }
    
    def addTo(EList<EObject> iList, Instructions iS) {
        iS.list.addAll(iList)
    }
    
    def Instructions toInstructionsClass(Program program) {
        val iS = createSCLInstructions()
        iS.list.addAll(program.instructions)
        iS.setProgram(program) 
        iS
    }

    def Instructions toInstructionsClass(Conditional conditional) {
        val iS = createSCLInstructions()
        iS.list.addAll(conditional.instructions)
        var program = EcoreUtil2::getContainerOfType(conditional, typeof(Program));
        if (program == null) program = EcoreUtil2::getContainerOfType(conditional, typeof(Instructions)).
            getProgram()
        iS.setProgram(program) 
        iS
    }
    
    def void addInstruction(Conditional conditional, Instruction instruction) {
        var Instructions iS = createSCLInstructions()
        conditional.instructions?.addTo(iS)
        iS.list.add(instruction)
        conditional.instructions.addAll(iS)
    }
    
    def void addPause(Instructions iS) {
        iS.addInstruction(createSCLPause())
    }
        
    // ======================================================================================================
    // ==                 G O T O  - L O O K U P   M E T A M O D E L   E X T E N S I O N                   ==
    // ======================================================================================================
    
    def Instruction gotoLookUp(Goto goto, Instructions iS) {
        gotoLookUp(goto.name, iS)
    }
    
    def Instruction gotoLookUp(String label, Instructions iS) {
        var boolean foundLabel = false
        for(instruction : iS.list) {
            if (instruction instanceof Label) {
                if ((instruction as Label).name == label) {
                    foundLabel = true
                }
            } else if (!(instruction instanceof Annotation)) {
                if (foundLabel) {
                    return instruction as Instruction
                } else {
                    if (instruction instanceof Parallel) {
                        for(threads : (instruction as Parallel).threads) {
                            val instrRes = gotoLookUp(label, threads as Instructions)
                            if (instrRes != null ) return instrRes
                        }
                    }
                    else if (instruction instanceof Conditional) {
                            val instrRes = gotoLookUp(label, (instruction as Conditional).toInstructionsClass)
                            if (instrRes != null ) return instrRes
                    }
                }
            }
        }
        return null
    }
    
    def boolean gotoTargetExists(Goto goto, Instructions iS) {
        gotoTargetExists(goto.name, iS)
    }
    
    def boolean gotoTargetExists(String label, Instructions iS) {
        for(instruction : iS.list) {
            if (instruction instanceof Label) {
                if ((instruction as Label).name == label) {
                    return true
                }
            } else if (!(instruction instanceof Annotation)) {
               if (instruction instanceof Parallel) {
                    for(threads : (instruction as Parallel).threads) {
                        if (gotoTargetExists(label, threads as Instructions)) return true
                    }
                }
                else if (instruction instanceof Conditional) {
                    if (gotoTargetExists(label, (instruction as Conditional).toInstructionsClass))
                        return true
                }
            }
        }
        return false
    }
    
    def Label gotoGetLabel(Goto goto, Instructions iS) {
        gotoGetLabel(goto.name, iS)
    }
    
    def Label gotoGetLabel(String label, Instructions iS) {
        for(instruction : iS.list) {
            if (instruction instanceof Label) {
                if ((instruction as Label).name == label) {
                    return (instruction as Label)
                }
            } else if (!(instruction instanceof Annotation)) {
               if (instruction instanceof Parallel) {
                    for(threads : (instruction as Parallel).threads) {
                        val ret = gotoGetLabel(label, threads as Instructions)
                        if (ret != null) { return ret }
                    }
                }
                else if (instruction instanceof Conditional) {
                    val ret = gotoGetLabel(label, (instruction as Conditional).toInstructionsClass)
                    if (ret != null) return ret     
                }
            }
        }
        return null
    }
    
    def Instructions getAncestorThreadList(Label label) {
//        var ancestor = label.eContainer
//        while (ancestor != null) {
//            if (ancestor instanceof Instructions) {
//                if (ancestor.eContainer != null) {
//                    if ((ancestor.eContainer instanceof Parallel) ||
//                        (ancestor.eContainer instanceof Program)) {
//                        return ancestor as Instructions;
//                    }
//                }
//            }
//            ancestor = ancestor.eContainer
//        }
        return null
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
}