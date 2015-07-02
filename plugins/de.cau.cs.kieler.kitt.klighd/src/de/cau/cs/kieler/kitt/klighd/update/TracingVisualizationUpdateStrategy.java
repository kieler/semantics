/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.update;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.progress.UIJob;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Module;
import com.google.inject.Scopes;

import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingVisualizationProperties;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption.TracingMode;
import de.cau.cs.kieler.kitt.klighd.tracing.internal.InternalTracingProperties;
import de.cau.cs.kieler.kitt.klighd.tracing.internal.TracingVisualizer;
import de.cau.cs.kieler.klighd.IKlighdSelection;
import de.cau.cs.kieler.klighd.IUpdateStrategy;
import de.cau.cs.kieler.klighd.IViewChangeListener;
import de.cau.cs.kieler.klighd.SynthesisOption;
import de.cau.cs.kieler.klighd.ViewChangeType;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy;
import de.cau.cs.kieler.klighd.viewers.ContextViewer;

/**
 * 
 * UpdateStrategy to support tracing visualization in KlighdViews.
 * 
 * @author als
 * @kieler.design 2014-08-19 proposed
 * @kieler.rating 2014-08-19 proposed yellow
 * 
 */
public class TracingVisualizationUpdateStrategy implements IUpdateStrategy {

    /** Map of diagram viewers and their status which have active tracing capabilities. */
    private static WeakHashMap<ContextViewer, TracingSynthesisOption.TracingMode> enabledContextViewer =
            new WeakHashMap<ContextViewer, TracingSynthesisOption.TracingMode>();

    /** TracingVisualizer to apply tracing visualization to diagrams */
    private static TracingVisualizer tracingVisualizer = Guice.createInjector(new Module() {
        // This Module is created to satisfy ViewSynthesisShared scope of used synthesis-extensions
        public void configure(Binder binder) {
            binder.bindScope(ViewSynthesisShared.class, Scopes.SINGLETON);
        }
    }).getInstance(TracingVisualizer.class);

    /** Global selection listener which invokes tracing visualization for element selection tracing */
    private static ISelectionChangedListener selectionListener = new ISelectionChangedListener() {

        public void selectionChanged(SelectionChangedEvent event) {
            IKlighdSelection selection = (IKlighdSelection) event.getSelection();
            // Klighd does not select KLabels when its KText is selected, so this the KLabel are
            // added here
            ArrayList<EObject> selectionList =
                    Lists.newArrayList(selection.diagramElementsIterator());
            for (Iterator<EObject> iterator = selection.diagramElementsIterator(); iterator
                    .hasNext();) {
                EObject eObject = (EObject) iterator.next();
                if (eObject instanceof KText && eObject.eContainer() instanceof KLabel) {
                    selectionList.add(eObject.eContainer());
                }
            }

            ViewContext viewContext = selection.getViewContext();
            visualizeTracing(enabledContextViewer.get(viewContext.getViewer().getContextViewer()),
                    viewContext.getViewModel(), viewContext, selectionList, false);
        }
    };

    /**
     * Global listener on collapse expand actions which invokes tracing visualization for
     * intermediate model tracing
     */
    private static IViewChangeListener collapseExpandListener = new IViewChangeListener() {

        public void viewChanged(ViewChange change) {
            KGraphElement affectedElement = change.getAffectedElement();
            if (affectedElement instanceof KNode
                    && affectedElement.getData(KLayoutData.class).getProperty(
                            TracingVisualizationProperties.TRACED_MODEL_ROOT_NODE)) {
                ViewContext viewContext = change.getViewContext();
                Set<Object> tracedModels =
                        viewContext.getProperty(InternalTracingProperties.VISIBLE_TRACED_MODELS);
                if (tracedModels != null) {
                    Set<Object> currentModels =
                            tracingVisualizer.getTracedModelMap(viewContext.getViewModel(),
                                    viewContext).keySet();
                    if (!Sets.symmetricDifference(tracedModels, currentModels).isEmpty()) {
                        // force recalculation of tracing edges because displayed models have
                        // changed
                        visualizeTracing(
                                enabledContextViewer.get(change.getViewer().getContextViewer()),
                                viewContext.getViewModel(), viewContext, new ArrayList(0), true);
                    }
                }
            }
        }
    };

    /** Delegate update strategy to perform normal behavior */
    private SimpleUpdateStrategy simpleDelegate = new SimpleUpdateStrategy();

    /**
     * {@inheritDoc}
     */
    public int getPriority() {
        return 100;
    }

    /**
     * {@inheritDoc}
     */
    public boolean requiresDiagramSynthesisReRun(ViewContext viewContext) {
        SynthesisOption option = TracingSynthesisOption.getSynthesisOption();
        // Assumption: DisplayedSynthesisOptions are already loaded into ViewContext on configuring
        if (viewContext.getDisplayedSynthesisOptions().contains(option)) {
            // Assumption: SynthesisOptions are preset earlier and there is at most one option
            // changed to its previous state
            TracingMode mode = TracingMode.getTracingMode(viewContext.getOptionValue(option));
            if (mode != viewContext.getProperty(InternalTracingProperties.VISUALIZATION_MODE)) {
                // omit a new synthesis run when only tracing mode were changed
                return false;
            } else {
                return true;
            }
        } else {
            return simpleDelegate.requiresDiagramSynthesisReRun(viewContext);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void update(KNode baseModel, KNode newModel, ViewContext viewContext) {
        // Normal behavior
        if (baseModel != newModel) {
            // Assumption: KGraphElement References stay valid (no copy)
            simpleDelegate.update(baseModel, newModel, viewContext);
        }

        if (baseModel != null && !baseModel.getChildren().isEmpty()) {
            SynthesisOption option = TracingSynthesisOption.getSynthesisOption();
            // Assumption: DisplayedSynthesisOptions are already loaded into ViewContext on
            // configuring
            if (viewContext.getDisplayedSynthesisOptions().contains(option)) {
                // Assumption: SynthesisOptions are preset earlier and there is at most one option
                // Activate tracing in currrent mode
                TracingMode mode = TracingMode.getTracingMode(viewContext.getOptionValue(option));
                enableVisualization(mode, baseModel, viewContext);
                viewContext.setProperty(InternalTracingProperties.VISUALIZATION_MODE, mode);
            } else {
                // disable tracing when a diagram without tracing options is present
                viewContext.setProperty(InternalTracingProperties.VISUALIZATION_MODE,
                        TracingMode.NO_TRACING);
                viewContext.setProperty(InternalTracingProperties.MAPPING, null);
                viewContext
                        .setProperty(InternalTracingProperties.DIAGRAM_EQUIVALENCE_CLASSES, null);
            }
        }
    }

    /**
     * Activates tracing visualization in the given mode for the given diagram.
     * 
     * @param mode
     *            tracing mode
     * @param inputModel
     *            the diagram
     * @param viewModel
     *            view context of the diagram
     */
    private static void enableVisualization(final TracingMode mode, final KNode viewModel,
            final ViewContext viewContext) {
        Object sourceModel = viewContext.getInputModel();
        ContextViewer contextViewer = viewContext.getViewer().getContextViewer();
        // if modl has tracing information to visualize
        if (tracingVisualizer.hasTracingInformation(sourceModel, viewModel, viewContext)) {
            enabledContextViewer.put(contextViewer, mode);
            visualizeTracing(mode, viewModel, viewContext, null, false);
            // add or remove selection listener according to element tracing mode
            if (mode == TracingMode.ELEMENT_TRACING) {
                contextViewer.addSelectionChangedListener(selectionListener);
            } else {
                contextViewer.removeSelectionChangedListener(selectionListener);
            }
            viewContext.getViewer().addViewChangedListener(collapseExpandListener,
                    ViewChangeType.COLLAPSE, ViewChangeType.EXPAND);
        } else {
            // disable visualization
            contextViewer.removeSelectionChangedListener(selectionListener);
            viewContext.getViewer().removeViewChangedEventListener(collapseExpandListener);
            enabledContextViewer.put(contextViewer, TracingMode.NO_TRACING);
            visualizeTracing(TracingMode.NO_TRACING, viewModel, viewContext, null, false);
        }

    }

    /**
     * 
     * Applies tracing visualization to diagram according to tracing mode.
     * 
     * @param mode
     *            tracing mode
     * @param viewModel
     *            the diagram
     * @param viewContext
     *            view context of the diagram
     * @param selection
     *            list of selected elements in the diagram
     * @param force
     *            flag to indicate force reevaluation of tracing data
     */
    public static void visualizeTracing(final TracingMode mode, final KNode viewModel,
            final ViewContext viewContext, final List<EObject> selection, final boolean force) {
        if (viewModel != null) {
            switch (mode) {
            case NO_TRACING:
                tracingVisualizer.hideTracing(viewModel, viewContext.getViewer());
                break;
            case MODEL_TRACING:
                tracingVisualizer.showTracing(viewModel, viewContext, force);
                break;
            case ELEMENT_TRACING:
                tracingVisualizer.showSelectiveTracing(viewModel, viewContext, selection, force);
                break;
            default:
                throw new IllegalArgumentException("Illegal tracing mode: " + mode);
            }
        }
    }
}
