/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.commands;

import java.util.ArrayList;
import java.util.List;

import org.osgi.framework.Bundle;

import de.cau.cs.kieler.ksbase.ui.utils.AbstractCutCopyPasteCommandFactory;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.custom.SyncchartsDiagramCustomPlugin;

/**
 * Creates the cut, copy and paste commands from ksbase.
 * 
 * @author soh
 * @kieler.design 2010-06-15 msp, cmot
 * @kieler.ignore (excluded from review process)
 */
public class SyncchartsCutCopyPasteCommandFactory extends AbstractCutCopyPasteCommandFactory {

    /** The transformation file. */
    private static final String FILE = "/transformations/copyPaste.ext";

    /** The base packages of the underlying meta model. */
    private static final String[] MODEL = { "de.cau.cs.kieler.synccharts.SyncchartsPackage",
            "org.eclipse.emf.ecore.EcorePackage" };

    /** All types that are supported by copy and paste and have to be mapped. */
    private static final Class<?>[] TYPES = { State.class, Region.class, Transition.class };

    /**
     * {@inheritDoc}
     */
    @Override
    protected Bundle getBundle() {
        return SyncchartsDiagramCustomPlugin.getInstance().getBundle();
    }

    @Override
    protected Class<?>[] getTypes() {
        return TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getFile() {
        return FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<String> getModel() {
        List<String> modelsList = new ArrayList<String>(MODEL.length);
        for (String s : MODEL) {
            modelsList.add(s);
        }
        return modelsList;
    }
}
