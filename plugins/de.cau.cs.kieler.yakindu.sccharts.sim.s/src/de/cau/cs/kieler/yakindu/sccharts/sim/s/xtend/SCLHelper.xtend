package de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend

import org.eclipse.xtend.util.stdlib.CloningExtensions
import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableCollection;
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import java.util.Collections
import java.util.List
import java.util.Collection
import java.util.ArrayList
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.yakindu.sgraph.syncgraph.TransitionType
import org.yakindu.sct.model.sgraph.Statechart
//import org.yakindu.sct.model.sgraph.State
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncState

import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncgraphFactory

import de.cau.cs.kieler.yakindu.model.stext.synctext.SynctextFactory;

import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.State
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.sgraph.Region
import org.yakindu.sct.model.stext.stext.StextFactory
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.stext.stext.ReactionTrigger
import org.yakindu.sct.model.stext.stext.ReactionEffect

import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.SCChartsExpFactory
import de.cau.cs.kieler.yakindu.sccharts.model.stext.sCChartsExp.*
import org.yakindu.sct.model.sgraph.Choice

import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.SclFactory;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Program;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Instruction;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Parallel;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Goto;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Label;
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionSet
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Comment
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Scope
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Pause
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.Conditional
import de.cau.cs.kieler.yakindu.sccharts.sim.scl.scl.InstructionOrCommentSequence;

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
    
    def InstructionSet createSCLInstructionSet()
    {
        SCL.createInstructionSet();
    }
    
    def InstructionSet createSCLInstructionSet(Instruction instruction) {
        var iSet = createSCLInstructionSet();
        iSet.addInstruction(instruction);
        iSet;
    }
    
    def Goto createSCLGoto(String targetLabelName)
    {
        var goto = SCL.createGoto();
        goto.setName(targetLabelName);
        goto;
    }
    
    def Comment createSCLComment(String commentString) {
        var comment = SCL.createComment();
        comment.setComment('// '+commentString);
        comment;
    }
    
    def Label createSCLLabel(String labelName) {
        var label = SCL.createLabel();
        label.setName(labelName);
        label;
    }
    
    def Scope createSCLScope(String labelName) {
        var scope = SCL.createScope()
        var iSet  = createSCLInstructionSet()
        scope.scope = iSet
        if (!labelName.nullOrEmpty) {
//            var label = createSCLLabel(labelName);
//            scope.setLabel(label);
        }
        scope;
    }
    
    def Pause createSCLPause() {
        SCL.createPause();
    }
    
    def Conditional createSCLConditional(String expression, InstructionSet iSet) {
        var conditional = SCL.createConditional();
        conditional.setExpression(expression);
        conditional.setConditional(iSet)
        conditional;
    }
    
    // ======================================================================================================
    // ==                I N S T R U C T I O N    M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    def void addInstruction(InstructionSet iSet, Instruction instruction) {
        iSet.instructions.add(instruction);
    }
    
    def void addInstruction(Scope sSet, Instruction instruction) {
        var iSet = sSet.getScope();
        if (iSet == null) {
            iSet = createSCLInstructionSet();
        }
        iSet.instructions.add(instruction);
        sSet.scope = iSet    
    }

    def void addInstruction(InstructionSet iSet, Comment instruction) {
        iSet.instructions.add(instruction);
    }
    
    def void addInstruction(Scope sSet, Comment comment) {
        var iSet = sSet.getScope();
        if (iSet == null) {
            iSet = createSCLInstructionSet();
        }
        iSet.instructions.add(comment);
        sSet.scope = iSet    
    }
    
    def void addInstruction(InstructionSet iSet, InstructionOrCommentSequence ioc) {
        if (ioc instanceof Instruction) { iSet.addInstruction(ioc as Instruction) }
          else { iSet.addInstruction(ioc as Comment) }
    }
    
    def void addInstruction(Scope sSet, InstructionOrCommentSequence ioc) {
        if (ioc instanceof Instruction) { sSet.addInstruction(ioc as Instruction) }
          else { sSet.addInstruction(ioc as Comment) }
    }
    
    def void addInstruction(Conditional conditional, Instruction instruction) {
        var iSet = conditional.getConditional()
        if (iSet == null) {
            iSet = createSCLInstructionSet() 
        }    
        
        iSet.instructions.add(instruction)
        conditional.setConditional(iSet)
    }
    
    def void addPause(InstructionSet iSet) {
        iSet.addInstruction(createSCLPause())
    }
    
    def void addPause(Scope sSet) {
        sSet.addInstruction(createSCLPause())
    }
    
    
    // ======================================================================================================
    // ==                       S C O P E   M E T A M O D E L   E X T E N S I O N                          ==
    // ======================================================================================================
    
    def InstructionSet scopeToInstructionSet(Scope scope) {
        var iSet = SCL.createInstructionSet();
//        val label = scope.getLabel();
//        if (label!=null) {
//            iSet.instructions.add(label.copy);
//        }
        for(instruction : scope.scope.instructions) {
            iSet.instructions.add(instruction.copy);
        }
        iSet;
    }
    
    
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
 
}