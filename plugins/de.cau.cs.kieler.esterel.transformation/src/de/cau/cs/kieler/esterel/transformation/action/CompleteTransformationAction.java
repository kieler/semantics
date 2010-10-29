/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.transformation.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.expressions.ExpressionsFactory;
import de.cau.cs.kieler.core.expressions.TextualCode;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.esterel.transformation.core.AbstractTransformationDataComponent;
import de.cau.cs.kieler.esterel.transformation.core.AbstractTransformationStatement;
import de.cau.cs.kieler.esterel.transformation.impl.DummyDataComponent;
import de.cau.cs.kieler.esterel.transformation.impl.QueueStatement;
import de.cau.cs.kieler.esterel.transformation.kivi.TransformationTrigger;
import de.cau.cs.kieler.esterel.transformation.util.TransformationUtil;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;

/**
 * @author uru
 * 
 */
public class CompleteTransformationAction extends InitialTransformationAction {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void doInitialEsterelTransformation() {
        try {

            ResourceSet resourceSet = new ResourceSetImpl();
            final URI strlURI = URI.createPlatformResourceURI(getCurrentFile().getFullPath()
                    .toString(), true);
            final URI kixsURI = URI.createPlatformResourceURI(getCurrentFile().getFullPath()
                    .removeFileExtension().addFileExtension("kixs").toString(), false);
            // System.out.println(currentFile.getLocationURI().getPath() + "  "+
            // currentFile.getFullPath().toString());

            State rootState;

            System.out.println("Creating initial SyncCharts contents.");
            resource = resourceSet.getResource(kixsURI, true);
            SyncchartsFactory sf = SyncchartsFactory.eINSTANCE;
            Region rootRegion = (Region) resource.getContents().get(0);
            rootState = sf.createState();
            rootRegion.getStates().add(rootState);
            rootState.setLabel("EsterelState");
            rootState.setType(StateType.TEXTUAL);

            System.out.println("Parsing Esterel Source Code.");
            // ResourceSet resourceSet = new ResourceSetImpl();
            Resource xtextResource = resourceSet.getResource(strlURI, true);
            EObject esterelModule = xtextResource.getContents().get(0);

            System.out.println("Reading Esterel Source Code - Setting Body Contents.");
            TextualCode code = ExpressionsFactory.eINSTANCE.createTextualCode();
            rootState.getBodyText().add(code);
            code.setCode(TransformationUtil.getSerializedString(esterelModule));

            System.out.println("Attaching Esterel Model to SyncChart");
            rootState.setBodyReference(esterelModule);

            // start
            resource = resourceSet.getResource(kixsURI, true);
            State root = rootRegion.getStates().get(0);

            TransactionalEditingDomain ted = TransactionalEditingDomain.Factory.INSTANCE
                    .createEditingDomain(resourceSet);

            DummyDataComponent dataComp = new DummyDataComponent();

            dataComp.initialize();
            dataComp.getRunner().setEditDomain(ted);
            // initializing first statement
            QueueStatement qs = new QueueStatement(DummyDataComponent.INITIAL_TRANSFORMATION, root,
                    root.getBodyReference());
            dataComp.getQueue().add(qs);

            try {
                while (true) {
                    dataComp.step(null);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            dataComp.wrapup();
            dataComp = null;
            if (TransformationTrigger.getInstance() != null) {
                TransformationTrigger.getInstance().step(null, getActiveEditor());
            }
            // appendToQueue(qs);
            // System.out.println("Added First Statement");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    protected DiagramEditor getActiveEditor() {

        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IEditorPart editor = EditorUtils.getLastActiveEditor();
                if (editor instanceof DiagramEditor) {
                    maybe.set((DiagramEditor) editor);
                }
            }
        });
        return maybe.get();
    }
}
