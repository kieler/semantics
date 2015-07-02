/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.sim.s;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.sim.s.xtend.SyncCharts2Simulation;

/**
 * SyncChartsTransformation offers all transformation used in the SyncCharts S Simulation
 * DataComponent to be called separately on a SyncCharts kixs file.
 * 
 * @author cmot
 * @kieler.design 2012-11-26 proposed cmot
 * @kieler.rating 2012-11-26 proposed yellow
 */
@SuppressWarnings("restriction")
public class SyncChartsTransformation implements IHandler {

    /** The Constant COMMAND_ABORT. */
    public static final String COMMAND_ABORT 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsAbortTransformation";

    /** The Constant COMMAND_SURFACEDEPTH. */
    public static final String COMMAND_SURFACEDEPTH 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsSurfaceDepthTransformation";

    /** The Constant COMMAND_SPLITTRANSITION. */
    public static final String COMMAND_SPLITTRANSITION 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsSplitTransitionTransformation";

    /** The Constant COMMAND_FINALSTATETRANSITION. */
    public static final String COMMAND_FINALSTATETRANSITION 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsFinalStateTransitionTransformation";

    /** The Constant COMMAND_NORMALTERMINATION. */
    public static final String COMMAND_NORMALTERMINATION 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsNormalTerminationTransformation";

    /** The Constant COMMAND_COUNTDELAY. */
    public static final String COMMAND_COUNTDELAY 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsCountDelayTransformation";

    /** The Constant COMMAND_SUSPEND. */
    public static final String COMMAND_SUSPEND 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsSuspendTransformation";

    /** The Constant COMMAND_HISTORY. */
    public static final String COMMAND_HISTORY 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsHistoryTransformation";

    /** The Constant COMMAND_ENTRY. */
    public static final String COMMAND_ENTRY
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsEntryActionTransformation";

    /** The Constant COMMAND_DURING. */
    public static final String COMMAND_DURING 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsDuringActionTransformation";

    /** The Constant COMMAND_EXIT. */
    public static final String COMMAND_EXIT 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsExitActionTransformation";

    /** The Constant COMMAND_PRE. */
    public static final String COMMAND_PRE 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsPreTransformation";

    /** The Constant COMMAND_EXPOSELOCALSIGNALS. */
    public static final String COMMAND_EXPOSELOCALSIGNALS 
    = "de.cau.cs.kieler.synccharts.sim.s.SyncChartsExposeLocalSignalsTransformation";

    /**
     * {@inheritDoc}
     */
    public void addHandlerListener(final IHandlerListener handlerListener) {
        // Do nothing
    }

    /**
     * {@inheritDoc}
     */
    public void dispose() {
        // Do nothing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {

        // Get input model from currently selected file in Explorer
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        File file = (File) ((TreeSelection) selection).getFirstElement();
        URI input = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        URI output = URI.createURI("");

        // Try to load SyncCharts model
        XMIResourceImpl inputResource = new XMIResourceImpl(input);
        try {
            // Load SyncCharts model
            inputResource.load(null);
            Region rootRegion = (Region) inputResource.getContents().get(0);

            // Apply the selected transformation
            String command = event.getCommand().getId().toString();
            Region transformedModel = rootRegion;
            if (command.equals(COMMAND_ABORT)) {
                transformedModel = (new SyncCharts2Simulation()).transformSCCAborts(rootRegion);
            } else if (command.equals(COMMAND_SURFACEDEPTH)) {
                transformedModel = (new SyncCharts2Simulation())
                        .transformSurfaceDepth(rootRegion);
            } else if (command.equals(COMMAND_SPLITTRANSITION)) {
                transformedModel = (new SyncCharts2Simulation())
                        .transformSplitTransition(rootRegion);
            } else if (command.equals(COMMAND_FINALSTATETRANSITION)) {
                transformedModel = (new SyncCharts2Simulation())
                        .transformFinalStateTransition(rootRegion);
            } else if (command.equals(COMMAND_NORMALTERMINATION)) {
                transformedModel = (new SyncCharts2Simulation())
                        .transformNormalTermination(rootRegion);
            } else if (command.equals(COMMAND_COUNTDELAY)) {
                transformedModel = (new SyncCharts2Simulation()).transformCountDelay(rootRegion);
            } else if (command.equals(COMMAND_SUSPEND)) {
                transformedModel = (new SyncCharts2Simulation()).transformSuspend(rootRegion);
            } else if (command.equals(COMMAND_HISTORY)) {
                transformedModel = (new SyncCharts2Simulation()).transformHistory(rootRegion);
            } else if (command.equals(COMMAND_ENTRY)) {
                transformedModel = (new SyncCharts2Simulation()).transformEntryAction(rootRegion);
            } else if (command.equals(COMMAND_DURING)) {
                transformedModel = (new SyncCharts2Simulation()).transformDuringAction(rootRegion);
            } else if (command.equals(COMMAND_EXIT)) {
                transformedModel = (new SyncCharts2Simulation()).transformExitAction(rootRegion);
            } else if (command.equals(COMMAND_PRE)) {
                transformedModel = (new SyncCharts2Simulation()).transformPreOperator(rootRegion);
            } else if (command.equals(COMMAND_EXPOSELOCALSIGNALS)) {
                transformedModel = (new SyncCharts2Simulation())
                        .transformExposeLocalSignal(rootRegion);
            }

            // Calculate output path
            output = URI.createURI(input.toString());
            output = output.trimFragment();
            output = output.trimFileExtension().appendFileExtension("transformed.kixs");

            try {
                // Write out copy/transformation of SyncChart
                Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
                Map<String, Object> m = reg.getExtensionToFactoryMap();
                m.put("daform", new XMIResourceFactoryImpl());
                ResourceSet resSet = new ResourceSetImpl();
                Resource resource = resSet.createResource(output);
                resource.getContents().add(transformedModel);
                resource.save(Collections.EMPTY_MAP);
            } catch (IOException e) {
                throw new ExecutionException("Cannot write output SyncChart file.");
            }

        } catch (IOException e) {
            throw new ExecutionException("Cannot read input file.");
        }

        // Refresh the file explorer
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e2) {
            e2.printStackTrace();
        }

        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isEnabled() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isHandled() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void removeHandlerListener(final IHandlerListener handlerListener) {
        // Do nothing
    }

    // -------------------------------------------------------------------------

}
