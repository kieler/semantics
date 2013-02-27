package de.cau.cs.kieler.s.sim.kivi.view;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.RGB;
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
import de.cau.cs.kieler.s.sim.kivi.SSimKiviPlugin;
import de.cau.cs.kieler.s.sim.kivi.SVisualizationDataComponent;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi.JSONObjectXtextVisualizationDataComponent;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi.StateErrorXtextVisualizationDataComponent;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.KExpressionsRuntimeModule;
import de.cau.cs.kieler.core.kexpressions.serializer.KExpressionsSyntacticSequencer;

/**
 * The Class InstructionViewDataComponent.
 */
public class InstructionViewDataComponent extends SVisualizationDataComponent {

    /** The active (and selected) statements that are already executed in the selected micro tick. */
    private LinkedList<EObject> executedActiveStatements = new LinkedList<EObject>();
    
    /** The last computed selection. */
    private HashMap<EObject, RGB> lastComputedSelection = new HashMap<EObject, RGB>(); 

    /** The Constant COLOR_HIGH. */
    protected static final int COLOR_HIGH = 255;

    /** The Constant COLOR_MED. */
    protected static final int COLOR_MED = 180;

    /** The default highlight background color. */
    protected static final RGB DEFAULT_EXECUTED_BACKGROUND_COLOR = new RGB(COLOR_MED, COLOR_HIGH,
            COLOR_MED); // light green

    // -----------------------------------------------------------------------------

    /**
     * Instantiates a new instruction view data component.
     */
    public InstructionViewDataComponent() {
    }

    // -----------------------------------------------------------------------------

    /**
     * Select micro tick by giving an active statement. All statements before this statement are put
     * into the executedActiveStatements list (and are marked green on refresh).
     * 
     * @param activeStatement
     *            the active statement
     */
    public void selectMicroTick(final EObject activeStatement) {
        LinkedList<EObject> allStatements = new LinkedList<EObject>();
        allStatements.addAll(getActiveStatements());

        executedActiveStatements.clear();

        boolean found = false;
        for (EObject statement : allStatements) {
            if (!found) {
                executedActiveStatements.add(statement);
            }
            if (statement.equals(activeStatement)) {
                found = true;
            }
        }
        
        // Update the selection
        updateMicroTickSelection();
    }

    // -----------------------------------------------------------------------------
    
    /**
     * Update micro tick selection.
     */
    public void updateMicroTickSelection() {
        for (EObject statement : lastComputedSelection.keySet()) {
            if (executedActiveStatements.contains(statement)) {
                // Update the color to green (executed) in this case
                lastComputedSelection.put(statement, DEFAULT_EXECUTED_BACKGROUND_COLOR);
            } else {
                lastComputedSelection.put(statement, super.DEFAULT_HIGHLIGHT_BACKGROUND_COLOR);
            }
        }
        
    }

    // -----------------------------------------------------------------------------

    /**
     * Compute selection.
     * 
     * @param jSONObject
     *            the j son object
     * @return the hash map
     */
    public HashMap<EObject, RGB> computeSelection(final JSONObject jSONObject) {
        HashMap<EObject, RGB> newSelection = super.computeSelection(jSONObject);

        for (EObject statement : newSelection.keySet()) {
            if (executedActiveStatements.contains(statement)) {
                // Update the color to green (executed) in this case
                newSelection.put(statement, DEFAULT_EXECUTED_BACKGROUND_COLOR);
            }
        }
        
        // Save this for refresh
        lastComputedSelection = newSelection;

        return newSelection;
    }

    // -----------------------------------------------------------------------------

    /**
     * Refresh view. <BR><BR> This method must be called from GUI thread!
     *
     * @throws KiemExecutionException the kiem execution exception
     */
    public void refreshView() throws KiemExecutionException {
        // Refresh the Xtext editor with the last computed selection
        super.refreshView(lastComputedSelection, false);
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void refreshView(final HashMap<EObject, RGB> newSelection, final boolean async)
            throws KiemExecutionException {
        // Refresh the instruction list
        rebuildInstructionList(getActiveStatements());

        // Do NOT refresh the xtext editor at this time
        super.refreshView(newSelection, async);
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        SInstructionsDataList list = SInstructionsDataList.getInstance();
        list.clear();
        SInstructionsView.getInstance().refreshViewerAsync();
        super.wrapup();
    }

    // -----------------------------------------------------------------------------

    /**
     * Rebuild instruction list.
     *
     * @param activeStatements the active statements
     */
    public void rebuildInstructionList(final LinkedList<EObject> activeStatements) {
        SInstructionsDataList list = SInstructionsDataList.getInstance();

        list.clear();

        for (EObject activeStatement : activeStatements) {
            if (activeStatement instanceof Instruction) {
                Instruction instruction = (Instruction) activeStatement;
                String instructionName = instruction.eClass().getInstanceTypeName();
                int i = instructionName.lastIndexOf('.');
                if (i > 0) {
                    instructionName = instructionName.substring(i + 1).toUpperCase();
                }

                String label = "";
                EObject container = instruction.eContainer();
                if (container instanceof Continuation) {
                    label = ((Continuation) container).getName();
                }

                if (instruction instanceof Trans) {
                    instructionName += " (" + ((Trans) instruction).getContinuation().getName()
                            + ")";
                }

                if (instruction instanceof Fork) {
                    instructionName += " (" + ((Fork) instruction).getThread().getName() + ")";
                }

                if (instruction instanceof Prio) {
                    instructionName += " (" + ((Prio) instruction).getPriority() + ")";
                }

                String prio = getStatementPrio().get(activeStatement);

                // if (instruction instanceof If) {
                // Expression expression = ((If) instruction).getExpression();
                //
                // // Serialize with Xtext
                // Injector injector = Guice.createInjector(new KExpressionsRuntimeModule());
                // Serializer serializer = injector.getInstance(Serializer.class);
                //
                // Resource resource = expression.eResource();
                // try {
                // resource.load(null);
                // } catch (IOException e) {
                // e.printStackTrace();
                // }
                // String expressionString = serializer.serialize(expression);
                //
                // instructionName += " (" + expressionString + ")";
                // }

                SInstructionsData sInstructionsData = new SInstructionsData(list, instructionName,
                        label, prio, activeStatement);
                list.add(sInstructionsData);
            }
        }

        SInstructionsView.getInstance().refreshViewerAsync();

        return;
    }

    // -----------------------------------------------------------------------------
}
