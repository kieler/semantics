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
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
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
 * @author als
 * @kieler.design 2014-08-19 proposed
 * @kieler.rating 2014-08-19 proposed yellow
 * 
 */
public class TracingVisualizationUpdateStrategy implements IUpdateStrategy {
    
    private static WeakHashMap<ContextViewer, TracingSynthesisOption.TracingMode> enabledContextViewer =
            new WeakHashMap<ContextViewer, TracingSynthesisOption.TracingMode>();

    private static TracingVisualizer tracingVisualizer = Guice.createInjector(new Module() {
        // This Module is created to satisfy ViewSynthesisShared scope of used synthesis-extensions
        public void configure(Binder binder) {
            binder.bindScope(ViewSynthesisShared.class, Scopes.SINGLETON);
        }
    }).getInstance(TracingVisualizer.class);

    private static ISelectionChangedListener selectionListener = new ISelectionChangedListener() {

        public void selectionChanged(SelectionChangedEvent event) {
            IKlighdSelection selection = (IKlighdSelection) event.getSelection();
            ViewContext viewContext = selection.getViewContext();
            visualizeTracing(enabledContextViewer.get(viewContext.getViewer().getContextViewer()), viewContext.getViewModel(),
                    viewContext, Lists.newArrayList(selection.diagramElementsIterator()), false);
        }
    };
    
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
            TracingMode mode =
                    TracingSynthesisOption.getOptionMode(viewContext.getOptionValue(option));
            if (mode != viewContext.getProperty(TracingProperties.TRACING_VISUALAIZATION_MODE)) {
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
        //Normal behavior
        if (baseModel != newModel) {
            simpleDelegate.update(baseModel, newModel, viewContext);
        }
        
        SynthesisOption option = TracingSynthesisOption.getSynthesisOption();
        // Assumption: DisplayedSynthesisOptions are already loaded into ViewContext on configuring
        if (viewContext.getDisplayedSynthesisOptions().contains(option)) {
            // Assumption: SynthesisOptions are preset earlier and there is at most one option
            // changed to its previous state
            TracingMode mode =
                    TracingSynthesisOption.getOptionMode(viewContext.getOptionValue(option));
            enableVisualization(mode, baseModel, viewContext);
            viewContext.setProperty(TracingProperties.TRACING_VISUALAIZATION_MODE, mode);           
        } else {
            viewContext.setProperty(TracingProperties.TRACING_VISUALAIZATION_MODE, TracingMode.NO_TRACING);            
            viewContext.setProperty(TracingProperties.TRACING_MAP, null);
        }
    }
    
    /**
     * @param mode
     * @param inputModel
     * @param viewModel
     */
    private static void enableVisualization(final TracingMode mode, final KNode viewModel,
            final ViewContext viewContext) {
        Object sourceModel = viewContext.getInputModel();
        ContextViewer contextViewer = viewContext.getViewer().getContextViewer();
        if (tracingVisualizer.hasTracingInformation(sourceModel, viewModel, viewContext)) {
            enabledContextViewer.put(contextViewer, mode);
            visualizeTracing(mode, viewModel, viewContext, null, false);
            if (mode == TracingMode.ELEMENT_TRACING) {
                contextViewer.addSelectionChangedListener(selectionListener);
            } else {
                contextViewer.removeSelectionChangedListener(selectionListener);
            }
        } else {
            contextViewer.removeSelectionChangedListener(selectionListener);
            enabledContextViewer.put(contextViewer, TracingMode.NO_TRACING);
            visualizeTracing(TracingMode.NO_TRACING, viewModel, viewContext, null, false);
        }

    }

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
                tracingVisualizer.traceElements(viewModel, viewContext,
                        selection, force);
                break;
            default:
                throw new IllegalArgumentException("Illegal tracing mode: " + mode);
            }
        }
    }
}
