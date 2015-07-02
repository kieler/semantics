/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.kivi;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.instructions.InstructionsViewPlugin;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi.StateErrorXtextVisualizationDataComponent;

/**
 * The DataComponent for visualizing S statements during simulation.
 * 
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 yellow KI-28
 */
public class SVisualizationDataComponent extends StateErrorXtextVisualizationDataComponent {

    /** The active (and selected) statements that are already executed in the selected micro tick. */
    private LinkedList<EObject> executedStatements = new LinkedList<EObject>();
    
    // -----------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    protected String getXtextEditorId() {
        return SSimKiviPlugin.S_EDITOR_ID;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected String getLanguageName() {
        return "S";
    }

    // -----------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    protected String getEncodedEObjectId(final EObject eObject) {
        if (eObject.eResource() != null) {
            String uri = eObject.eResource().getURIFragment(eObject);
            uri = (uri.hashCode() + "").replace("-", "M");
            return uri;
        }
        return null;
    }    

    // -----------------------------------------------------------------------------
    
    /**
     * Gets the executed statements.
     *
     * @return the executed statements
     */
    public List<EObject> getExecutedStatements() {
        return executedStatements;
    }
    
    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONObject doStep(final JSONObject jSONObject) throws KiemExecutionException {
        JSONObject nullReturnValue = super.doStep(jSONObject);
        
        // Reset Executed Statements
        if (this.executedStatements.size() > 0) {
            this.executedStatements.clear();
        }

        
        // Trigger an update of the InstructionsView
        InstructionsViewPlugin.getDefault().refresh();
        
        // This is just an observer component, should be null
        return nullReturnValue;
    }
    
    // -----------------------------------------------------------------------------

    
    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
        super.wrapup();
        
        // Trigger an update of the InstructionsView
        InstructionsViewPlugin.getDefault().refresh();
    }
    
    // -----------------------------------------------------------------------------

}
