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
package de.cau.cs.kieler.kitt.klighd.tracing.internal;

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

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption.TracingMode;
import de.cau.cs.kieler.kitt.klighd.tracing.internal.TracingVisualizerUtil;
import de.cau.cs.kieler.klighd.IKlighdSelection;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.viewers.ContextViewer;

/**
 * @author als
 * 
 */
public class TracingVisualizer {

    private static WeakHashMap<ContextViewer, TracingSynthesisOption.TracingMode> enabledContextViewer =
            new WeakHashMap<ContextViewer, TracingSynthesisOption.TracingMode>();

    private static TracingVisualizerUtil tracingVisualizerUtil = Guice.createInjector(new Module() {
        // This Module is created to satisfy ViewSynthesisShared scope of used synthesis-extensions
        public void configure(Binder binder) {
            binder.bindScope(ViewSynthesisShared.class, Scopes.SINGLETON);
        }
    }).getInstance(TracingVisualizerUtil.class);

    private static ISelectionChangedListener selectionListener = new ISelectionChangedListener() {

        public void selectionChanged(SelectionChangedEvent event) {
            IKlighdSelection selection = (IKlighdSelection) event.getSelection();
            ViewContext viewContext = selection.getViewContext();
            visualizeTracing(enabledContextViewer.get(viewContext.getViewer().getContextViewer()), viewContext.getViewModel(),
                    viewContext, Lists.newArrayList(selection.diagramElementsIterator()));
        }
    };

    /**
     * @param mode
     * @param inputModel
     * @param viewModel
     */
    public static void enableVisualization(final TracingMode mode, final KNode viewModel,
            final ViewContext viewContext) {
        Object sourceModel = viewContext.getInputModel();
        ContextViewer contextViewer = viewContext.getViewer().getContextViewer();
        boolean hasTracingInformation = tracingVisualizerUtil.hasTracingInformation(sourceModel, viewModel, viewContext);
        if (hasTracingInformation) {
            enabledContextViewer.put(contextViewer, mode);
            visualizeTracing(mode, viewModel, viewContext, null);
            if (mode == TracingMode.ELEMENT_TRACING) {
                contextViewer.addSelectionChangedListener(selectionListener);
            } else if (hasTracingInformation) {
                contextViewer.removeSelectionChangedListener(selectionListener);
            }
        } else {
            contextViewer.removeSelectionChangedListener(selectionListener);
            enabledContextViewer.put(contextViewer, TracingMode.NO_TRACING);
            visualizeTracing(TracingMode.NO_TRACING, viewModel, viewContext, null);
        }

    }

    private static void visualizeTracing(TracingMode mode, final KNode viewModel,
            final ViewContext viewContext, List<EObject> selection) {
        if (viewModel != null) {
            switch (mode) {
            case NO_TRACING:
                tracingVisualizerUtil.clearTracing(viewModel);
                break;
            case MODEL_TRACING:
                tracingVisualizerUtil.traceAll(viewModel, viewContext, false);
                break;
            case ELEMENT_TRACING:
                tracingVisualizerUtil.traceElements(viewModel, viewContext,
                        selection, false);
                break;
            default:
                throw new IllegalArgumentException("Illegal tracing mode: " + mode);
            }
        }
    }
}
