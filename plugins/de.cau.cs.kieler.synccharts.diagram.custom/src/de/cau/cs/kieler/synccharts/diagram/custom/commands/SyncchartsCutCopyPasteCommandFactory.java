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

import java.util.LinkedList;
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

    /**
     * {@inheritDoc}
     */
    @Override
    protected Bundle getBundle() {
        return SyncchartsDiagramCustomPlugin.instance.getBundle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void initializeTransformationCommand(
            final TransformationCommand result, final DiagramEditor editor,
            final List<EObject> selection, final String label,
            final String filePathParam, final String modelParam,
            final ITransformationFramework framework) {
        if (selection.size() > 1) {

            boolean hasStateList = false;
            boolean hasRegionList = false;
            boolean hasTransitionList = false;
            List<String> pureMapping = new LinkedList<String>();

            for (int i = 0; i < selection.size(); i++) {
                EObject obj = selection.get(i);
                if (obj instanceof State) {
                    pureMapping.add("State");
                    hasStateList = true;
                } else if (obj instanceof Region) {
                    pureMapping.add("Region");
                    hasRegionList = true;
                } else if (obj instanceof Transition) {
                    pureMapping.add("Transition");
                    hasTransitionList = true;
                }
            }

            List<String[]> possibleMappings = new LinkedList<String[]>();
            if (hasStateList) {
                String[] array = { "List[State]" };
                possibleMappings.add(array);
            } else if (hasRegionList) {
                String[] array = { "List[Region]" };
                possibleMappings.add(array);
            } else if (hasTransitionList) {
                String[] array = { "List[Transition]" };
                possibleMappings.add(array);
            }

            if (label.equals("Paste")) {
                possibleMappings.add(pureMapping.toArray(new String[pureMapping
                        .size()]));
            } else {
                String[] array = { "List[Object]" };
                possibleMappings.add(array);
            }

            for (String[] s : possibleMappings) {
                List<Object> mappedSelection = framework
                        .createParameterMapping(selection, s);
                if (mappedSelection != null
                        && result.initialize(editor, mappedSelection, label
                                .toLowerCase(), filePathParam, modelParam,
                                framework)) {
                    break;
                }
            }
        } else {
            List<Object> list = new LinkedList<Object>();
            list.add(selection.get(0));
            result.initialize(editor, list, label.toLowerCase(), filePathParam,
                    modelParam, framework);
        }
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
}
