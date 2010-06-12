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

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.model.transformation.ITransformationFramework;
import de.cau.cs.kieler.kiml.ui.layout.DiagramLayoutManager;
import de.cau.cs.kieler.ksbase.ui.handler.TransformationCommand;
import de.cau.cs.kieler.ksbase.ui.utils.AbstractCutCopyPasteCommandFactory;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.Transition;
import de.cau.cs.kieler.synccharts.diagram.custom.SyncchartsDiagramCustomPlugin;

/**
 * Creates the cut, copy and paste commands from ksbase.
 * 
 * @author soh
 */
public class SyncchartsCutCopyPasteCommandFactory extends
        AbstractCutCopyPasteCommandFactory {

    /** The transformation file. */
    private static final String FILE = "/transformations/feature.ext";

    /** The base package of the underlying meta model. */
    private static final String MODEL = "de.cau.cs.kieler.synccharts.SyncchartsPackage";

    /** All types that are supported by copy and paste and have to be mapped. */
    private static final Class<?>[] TYPES = { State.class, Region.class,
            Transition.class };

    /**
     * {@inheritDoc}
     */
    @Override
    protected Bundle getBundle() {
        return SyncchartsDiagramCustomPlugin.instance.getBundle();
    }

    protected Class<?>[] getTypes() {
        return TYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void performPostOperationActions(IProgressMonitor monitor) {
        SyncchartsDiagramCustomPlugin.instance.getDisplay().syncExec(
                new Runnable() {

                    public void run() {
                        IEditorPart editorPart = SyncchartsDiagramCustomPlugin.instance
                                .getActiveEditorPart();
                        if (editorPart != null) {
                            refreshEditPolicies(editorPart);

                            DiagramLayoutManager.layout(editorPart, null, true,
                                    false);
                        }
                    }

                });
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
    protected String getModel() {
        return MODEL;
    }

    @Override
    protected void initializeTransformationCommand(TransformationCommand result,
            DiagramEditor editor, List<EObject> selection, String label, String filePathParam,
            String modelParam, ITransformationFramework framework) {
        // TODO Auto-generated method stub
        
    }
}
