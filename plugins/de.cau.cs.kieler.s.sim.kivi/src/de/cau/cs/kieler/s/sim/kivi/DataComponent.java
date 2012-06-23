/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sim.kivi;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi.JSONObjectXtextVisualizationDataComponent;

/**
 * The DataComponent for visualizing S statements during simulation.
 * 
 * @author cmot
 */
public class DataComponent extends JSONObjectXtextVisualizationDataComponent {

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getXtextEditorId() {
        return SSimKiviPlugin.S_EDITOR_ID;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
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
    
}
