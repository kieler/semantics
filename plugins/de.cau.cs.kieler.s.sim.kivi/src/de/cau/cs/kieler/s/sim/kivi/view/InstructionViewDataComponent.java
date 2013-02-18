package de.cau.cs.kieler.s.sim.kivi.view;

import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.json.JSONObject;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.s.s.Continuation;
import de.cau.cs.kieler.s.s.Fork;
import de.cau.cs.kieler.s.s.If;
import de.cau.cs.kieler.s.s.Instruction;
import de.cau.cs.kieler.s.s.Prio;
import de.cau.cs.kieler.s.s.State;
import de.cau.cs.kieler.s.s.Trans;
import de.cau.cs.kieler.s.sim.kivi.SVisualizationDataComponent;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi.JSONObjectXtextVisualizationDataComponent;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.KExpressionsRuntimeModule;
import de.cau.cs.kieler.core.kexpressions.serializer.KExpressionsSyntacticSequencer;

public class InstructionViewDataComponent extends SVisualizationDataComponent {

    // -----------------------------------------------------------------------------

    public InstructionViewDataComponent() {
    }

    // -----------------------------------------------------------------------------
    
    /**
     * Select micro tick by giving an active statement. All statements before this 
     * statement are put into the activeStatement2 list (and are marked green on refresh).
     *
     * @param activeStatement the active statement
     */
    public void selectMicroTick(EObject activeStatement) {
        
        LinkedList<EObject> allStatements = new LinkedList<EObject>();
        allStatements.addAll(activeStatements2);
        allStatements.addAll(activeStatements);
        
        activeStatements2.clear();
        activeStatements.clear();
        
        boolean found = false;
        for (EObject statement : allStatements) {
            if (!found) {
                activeStatements2.add(statement);
            }
            else {
                activeStatements.add(statement);
            }
            
            if (statement.equals(activeStatement)) {
                found = true;
            }
        }
    }

    // -----------------------------------------------------------------------------

    public void refreshViewSync()
            throws KiemExecutionException {
        super.refreshView(activeStatements, activeStatements2, errorStatements, false);
    }
    
    // -----------------------------------------------------------------------------

    public void refreshViewAsync()
            throws KiemExecutionException {
        super.refreshView(activeStatements, activeStatements2, errorStatements, true);
    }

    // -----------------------------------------------------------------------------

    public void refreshView(LinkedList<EObject> newActiveStatements,
            LinkedList<EObject> newActiveStatements2, LinkedList<EObject> newErrorStatements, boolean async)
            throws KiemExecutionException {
        rebuildInstructionList(newActiveStatements);

        super.refreshView(newActiveStatements, newActiveStatements2, newErrorStatements, async);
    }

    // -----------------------------------------------------------------------------
    
    public void wrapup() throws KiemInitializationException {
        SInstructionsDataList list = SInstructionsDataList.getInstance();
        list.clear();
        SInstructionsView.getInstance().refreshViewerAsync();
        super.wrapup();
    }

    // -----------------------------------------------------------------------------

    public void rebuildInstructionList(LinkedList<EObject> activeStatements) {
        SInstructionsDataList list = SInstructionsDataList.getInstance();

        list.clear();

        for (EObject activeStatement : activeStatements) {
             if (activeStatement instanceof Instruction) {
                 Instruction instruction = (Instruction) activeStatement;
                 String instructionName = instruction.eClass().getInstanceTypeName();
                 int i = instructionName.lastIndexOf('.');
                 if (i > 0) {
                     instructionName = instructionName.substring(i+1).toUpperCase();
                 }
                 
                 String label = "";
                 EObject container = instruction.eContainer();
                 if (container instanceof Continuation) {
                     label = ((Continuation) container).getName();
                 }
                 
                 
                 if (instruction instanceof Trans) {
                     instructionName += " (" + ((Trans) instruction).getContinuation().getName() + ")";
                 }

                 if (instruction instanceof Fork) {
                     instructionName += " (" + ((Fork) instruction).getThread().getName() + ")";
                 }

                 
                 if (instruction instanceof Prio) {
                     instructionName += " (" + ((Prio) instruction).getPriority() + ")";
                 }
                 
                 String prio = statementPrio.get(activeStatement);
                 
//                 if (instruction instanceof If) {
//                     Expression expression = ((If) instruction).getExpression();
//                     
//                     // Serialize with Xtext 
//                     Injector injector = Guice.createInjector(new  KExpressionsRuntimeModule());
//                     Serializer serializer = injector.getInstance(Serializer.class);
//                     
//                     Resource resource = expression.eResource();
//                     try {
//                        resource.load(null);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                     String expressionString = serializer.serialize(expression);
//                     
//                     instructionName += " (" + expressionString + ")";
//                 }
                 
                 SInstructionsData sInstructionsData = new SInstructionsData(list, instructionName, label, prio, activeStatement);
                 list.add(sInstructionsData);
             }
        }


        SInstructionsView.getInstance().refreshViewerAsync();

        return;
    }

    // -----------------------------------------------------------------------------
}
