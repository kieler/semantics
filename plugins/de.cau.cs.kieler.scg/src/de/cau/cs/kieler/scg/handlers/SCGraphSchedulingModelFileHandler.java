/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;
import de.cau.cs.kieler.scg.SCGPlugin;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.schedulers.AbstractScheduler;
import de.cau.cs.kieler.scg.schedulers.ClusterScheduler;
import de.cau.cs.kieler.scg.schedulers.HybridScheduler;
import de.cau.cs.kieler.scg.schedulers.SimpleScheduler;

/**
 * Handler for menu contributions
 * 
 * @author ssm
 * @kieler.design 2014-01-08 proposed
 * @kieler.rating 2014-01-08 proposed yellow
 */
public class SCGraphSchedulingModelFileHandler extends AbstractConvertModelHandler {

    public static final String SCGSCHED_TRANSFORMATION =
            "de.cau.cs.kieler.scg.commands.SCGBBTToSCGSCHEDSCGraphTransformation";
    public static final String SCGSCHED_TRANSFORMATION_CLUSTERSCHEDULER =
            "de.cau.cs.kieler.scg.commands.SCGBBTToSCGSCHEDSCGraphTransformation.ClusterScheduler";
    public static final String SCGSCHED_TRANSFORMATION_HYBRIDSCHEDULER =
            "de.cau.cs.kieler.scg.commands.SCGBBTToSCGSCHEDSCGraphTransformation.HybridScheduler";

    private static Injector injector = new SctStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return "scgsched";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return injector;
    }

    public String getDiagramEditorID() {
        return SCGPlugin.EDITOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        EObject transformed = null;

        transformed = model;
        if (commandString.equals(SCGSCHED_TRANSFORMATION)) {
            AbstractScheduler scheduler = Guice.createInjector().getInstance(SimpleScheduler.class);
            // TODO: remove file handler
            transformed = scheduler.schedule((SCGraph) model, null);
        }
        if (commandString.equals(SCGSCHED_TRANSFORMATION_CLUSTERSCHEDULER)) {
            AbstractScheduler scheduler =
                    Guice.createInjector().getInstance(ClusterScheduler.class);
            // TODO: remove file handler
            transformed = scheduler.schedule((SCGraph) model, null);
        }
        if (commandString.equals(SCGSCHED_TRANSFORMATION_HYBRIDSCHEDULER)) {
            AbstractScheduler scheduler = Guice.createInjector().getInstance(HybridScheduler.class);
            // TODO: remove file handler
            transformed = scheduler.schedule((SCGraph) model, null);
        }
        return transformed;
    }

}
