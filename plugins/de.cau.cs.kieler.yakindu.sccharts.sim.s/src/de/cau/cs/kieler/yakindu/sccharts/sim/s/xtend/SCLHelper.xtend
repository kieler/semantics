package de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Annotation
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Assignment
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionList
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclFactory
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.VariableDeclaration
import java.util.HashMap
import org.eclipse.emf.ecore.EObject
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
    
//    def SCG() { ScgFactory::eINSTANCE }
    
    
    // ======================================================================================================
    // ==                       C R E A T E   M E T A M O D E L   E X T E N S I O N                        ==
    // ======================================================================================================
    
    def InstructionList createSCLInstructionList()
    {
        SCL.createInstructionList();
    }
    
    def InstructionList createSCLInstructionSet(Instruction instruction) {
        var iSet = createSCLInstructionList();
        iSet.addInstruction(instruction);
        iSet;
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
    
    def void addInstruction(InstructionList iSet, Instruction instruction) {
        iSet.instructions.add(instruction);
    }
    
//    def void addInstruction(Scope sSet, Instruction instruction) {
/*         var iSet = sSet.getScope();
        if (iSet == null) {
            iSet = createSCLInstructionSet();
        }
        iSet.instructions.add(instruction);
        sSet.scope = iSet*/    
//    }

    def void addInstruction(InstructionList iSet, Annotation annotation) {
        iSet.instructions.add(annotation);
    }
    
//    def void addInstruction(Scope sSet, Annotation annotation) {
/*         var iSet = sSet.getScope();
        if (iSet == null) {
            iSet = createSCLInstructionSet();
        }
        iSet.instructions.add(comment);
        sSet.scope = iSet*/    
//    }
    
//    def void addInstruction(InstructionList iSet, InstructionSequence ioc) {
//        if (ioc instanceof Instruction) { iSet.addInstruction(ioc as Instruction) }
//          else { iSet.addInstruction(ioc as Annotation) }
//    }
    
    def void addInstruction(InstructionList iSet, EObject ioc) {
        if (ioc instanceof Instruction) { iSet.addInstruction(ioc as Instruction) }
          else { iSet.addInstruction(ioc as Annotation) }
    }
    
//    def void addInstruction(Scope sSet, InstructionSequence ioc) {
//        if (ioc instanceof Instruction) { sSet.addInstruction(ioc as Instruction) }
//          else { sSet.addInstruction(ioc as Annotation) }
//    }
    
    def void addInstruction(Conditional conditional, Instruction instruction) {
        var iSet = conditional.getConditional()
        if (iSet == null) {
            iSet = createSCLInstructionList() 
        }    
        
        iSet.instructions.add(instruction)
        conditional.setConditional(iSet)
    }
    
    def void addPause(InstructionList iSet) {
        iSet.addInstruction(createSCLPause())
    }
    
//    def void addPause(Scope sSet) {
//        sSet.addInstruction(createSCLPause())
//    }
    
    
    // ======================================================================================================
    // ==                       S C O P E   M E T A M O D E L   E X T E N S I O N                          ==
    // ======================================================================================================
    
/*     def InstructionSet scopeToInstructionSet(Scope scope) {
        var iSet = SCL.createInstructionSet();
//        val label = scope.getLabel();
//        if (label!=null) {
//            iSet.instructions.add(label.copy);
//        }
        for(instruction : scope.scope.instructions) {
            iSet.instructions.add(instruction.copy);
        }
        iSet;
    }*/
    
    
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
    
    
    def int compareSCLRegionStateOrder(SyncState e1, SyncState e2) {
        var order = 1;
        if (e1.isInitial) {order = -1}
        if (e2.isFinal) {order = -1}
        order;
    }
    
    

    // ======================================================================================================
    // ==                         S C L  T O  S C G  T R A N S F O R M A T I O N                           ==
    // ======================================================================================================
    
    def createSCGInstruction() {
//      SCG.createInstruction();  
    }
 
}