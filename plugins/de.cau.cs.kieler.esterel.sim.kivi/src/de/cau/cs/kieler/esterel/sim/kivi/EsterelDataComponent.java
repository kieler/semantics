/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.sim.kivi;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.esterel.sim.EsterelSimPlugin;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.kivi.StateErrorXtextVisualizationDataComponent;

/**
 * The DataComponent for visualizing Esterel simulation.
 *
 * @author cmot
 * @kieler.design 2012-10-08 proposed cmot
 * @kieler.rating 2012-10-08 proposed yellow
 */
public class EsterelDataComponent extends StateErrorXtextVisualizationDataComponent {

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getXtextEditorId() {
        return EsterelCECSimPlugin.ESTEREL_EDITOR_ID;
    }

    // -----------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getLanguageName() {
        return "Esterel";
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
