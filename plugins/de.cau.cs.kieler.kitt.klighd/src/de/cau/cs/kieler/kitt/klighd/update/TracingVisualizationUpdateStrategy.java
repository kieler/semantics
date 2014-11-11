/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
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
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;

import com.google.common.collect.Lists;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Module;
import com.google.inject.Scopes;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingProperties;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption.TracingMode;
import de.cau.cs.kieler.kitt.klighd.tracing.internal.TracingVisualizer;
import de.cau.cs.kieler.klighd.IKlighdSelection;
import de.cau.cs.kieler.klighd.IUpdateStrategy;
import de.cau.cs.kieler.klighd.SynthesisOption;
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
            if (mode != viewContext.getProperty(TracingProperties.TRACING_VISUALIZATION_MODE)) {
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

        SynthesisOption option = TracingSynthesisOption.getSynthesisOption();
        // Assumption: DisplayedSynthesisOptions are already loaded into ViewContext on configuring
        if (viewContext.getDisplayedSynthesisOptions().contains(option)) {
            // Assumption: SynthesisOptions are preset earlier and there is at most one option
            // Activate tracing in currrent mode
            TracingMode mode = TracingMode.getTracingMode(viewContext.getOptionValue(option));
            enableVisualization(mode, baseModel, viewContext);
            viewContext.setProperty(TracingProperties.TRACING_VISUALIZATION_MODE, mode);
        } else {
            // disable tracing when a diagram without tracing options is present
            viewContext.setProperty(TracingProperties.TRACING_VISUALIZATION_MODE,
                    TracingMode.NO_TRACING);
            viewContext.setProperty(TracingProperties.TRACING_MAP, null);
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
        } else {
            // disable visualization
            contextViewer.removeSelectionChangedListener(selectionListener);
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
    public static void visualizeTracing(TracingMode mode, final KNode viewModel,
            final ViewContext viewContext, List<EObject> selection, boolean force) {
        if (viewModel != null) {
            switch (mode) {
            case NO_TRACING:
                tracingVisualizer.clearTracing(viewModel);
                break;
            case MODEL_TRACING:
                tracingVisualizer.traceAll(viewModel, viewContext, force);
                break;
            case ELEMENT_TRACING:
                tracingVisualizer.traceElements(viewModel, viewContext, selection, force);
                break;
            default:
                throw new IllegalArgumentException("Illegal tracing mode: " + mode);
            }
        }
    }
}
