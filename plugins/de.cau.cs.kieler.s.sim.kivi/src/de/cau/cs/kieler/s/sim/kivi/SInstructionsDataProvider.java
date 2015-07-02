/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.kivi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.RGB;

import de.cau.cs.kieler.s.s.Instruction;
import de.cau.cs.kieler.s.s.State;
import de.cau.cs.kieler.s.s.Fork;
import de.cau.cs.kieler.sim.instructions.IInstructionsDataProvider;
import de.cau.cs.kieler.sim.instructions.InstructionsData;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.s.s.Prio;
import de.cau.cs.kieler.s.s.Trans;

/**
 * The Class SInstructionsDataProvider. A provider of the S visualization data for the Instruction
 * View.
 * 
 * @author cmot
 * @kieler.design 2013-02-28 proposed cmot
 * @kieler.rating 2013-02-28 proposed yellow 
 */
public class SInstructionsDataProvider implements IInstructionsDataProvider {

    /** The Constant COLOR_HIGH. */
    protected static final int COLOR_HIGH = 255;

    /** The Constant COLOR_MED. */
    protected static final int COLOR_MED = 180;

    /** The default highlight background color. */
    protected static final RGB DEFAULT_EXECUTED_BACKGROUND_COLOR = new RGB(COLOR_MED, COLOR_HIGH,
            COLOR_MED); // light green

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new s instructions data provider.
     */
    public SInstructionsDataProvider() {
        // nothing to do
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public InstructionsData getInstructionsData(final EObject statement) {
        if (statement instanceof Instruction) {
            Instruction instruction = (Instruction) statement;
            String instructionName = instruction.eClass().getInstanceTypeName();
            int i = instructionName.lastIndexOf('.');
            if (i > 0) {
                instructionName = instructionName.substring(i + 1).toUpperCase();
            }

            String label = "";
            EObject container = instruction.eContainer();
            if (container instanceof State) {
                label = ((State) container).getName();
            }

            if (instruction instanceof Trans) {
                instructionName += " (" + ((Trans) instruction).getContinuation().getName() + ")";
            }

            if (instruction instanceof Fork) {
                instructionName += " (" + ((Fork) instruction).getContinuation().getName() + ")";
            }

            if (instruction instanceof Prio) {
                instructionName += " (" + ((Prio) instruction).getPriority() + ")";
            }

            SVisualizationDataComponent sVisualizationDataComponent = getVisualizationDataComponent();
            String prio = sVisualizationDataComponent.getStatementPrio().get(statement);

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

            InstructionsData instructionsData = new InstructionsData(instructionName, label, prio,
                    statement);

            return instructionsData;
        }

        // If this EObject is not found, return null
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public LinkedList<EObject> getMarkedStatements() {
        return getVisualizationDataComponent().getActiveStatements();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public List<EObject> getHighlightedStatements() {
        return getVisualizationDataComponent().getExecutedStatements();
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void selectStatement(final EObject selectedStatement) {
        LinkedList<EObject> allStatements = new LinkedList<EObject>();
        allStatements.addAll(getVisualizationDataComponent().getActiveStatements());

        List<EObject> executedStatements = getVisualizationDataComponent().getExecutedStatements();
        executedStatements.clear();

        boolean found = false;
        for (EObject statement : allStatements) {
            if (!found) {
                executedStatements.add(statement);
            }
            if (statement.equals(selectedStatement)) {
                found = true;
            }
        }

        try {
            // Update colors for executed statements
            HashMap<EObject, RGB> newSelection = getVisualizationDataComponent()
                    .getCurrentHighlighted();
            for (EObject statement : newSelection.keySet()) {
                if (newSelection.containsKey(statement)) {
                    if (executedStatements.contains(statement)) {
                        // Update the color to green (executed) in this case
                        newSelection.put(statement, getMarkedColor());
                    } else {
                        // Restore red color (active)
                        newSelection.put(statement, getHighlightedColor());
                    }
                } else {
                    // Restore default color
                    newSelection.put(statement, getDefaultColor());
                }
            }
            // Trigger a refresh of the xtext editor markers
            getVisualizationDataComponent()
                    .refreshView(newSelection, true, true, selectedStatement);
        } catch (Exception e) {
            // ignore errors
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public RGB getDefaultColor() {
        return SVisualizationDataComponent.DEFAULT_ERROR_BACKGROUND_COLOR;
    }

    /**
     * {@inheritDoc}
     */
    public RGB getMarkedColor() {
        return DEFAULT_EXECUTED_BACKGROUND_COLOR;
    }

    /**
     * {@inheritDoc}
     */
    public RGB getHighlightedColor() {
        return SVisualizationDataComponent.DEFAULT_HIGHLIGHT_BACKGROUND_COLOR;
    }

    // -------------------------------------------------------------------------

    /**
     * Retrieves the single instance of an S visualization data component or null if in the current
     * execution such a data component not exists.
     * 
     * @return the visualization data component
     */
    public SVisualizationDataComponent getVisualizationDataComponent() {
        // InstructionViewDataComponent
        KiemPlugin kiem = KiemPlugin.getDefault();
        if (kiem != null) {
            Execution execution = kiem.getExecution();
            if (execution != null) {
                List<DataComponentWrapper> dataComponentWrapperList = kiem
                        .getDataComponentWrapperList();
                for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
                    if (dataComponentWrapper.getDataComponent() instanceof SVisualizationDataComponent) {
                        return (SVisualizationDataComponent) dataComponentWrapper
                                .getDataComponent();
                    }
                }
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------
}
