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
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import de.cau.cs.kieler.core.kgraph.KGraphElement
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kitt.tracing.Tracing
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping
import de.cau.cs.kieler.klighd.IAction.ActionResult
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.analyzer.PotentialInstantaneousLoopResult
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.progress.UIJob

import static de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.SCGLoopHook.*
import de.cau.cs.kieler.sccharts.klighd.SCChartsDiagramProperties
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisActionHook

/**
 * Highlights the SCCharts elements lying on a illegal loop in SCG.
 * 
 * TODO Move this class to de.cau.cs.kieler.sccharts.scg
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class SCGLoopHook extends SynthesisActionHook {

    extension KRenderingFactory = KRenderingFactory::eINSTANCE

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.SCGLoopHook";
    /** Job name */
    public static final String JOB_NAME = "Calculating SCG Loops";
    /** The related synthesis option. */
    public static final SynthesisOption SHOW_SCG_LOOPS = SynthesisOption.createCheckOption("SCG Loops", false).
        setUpdateAction(SCGLoopHook.ID); // Add this action as updater
    /** Property to store analysis results. */
    private static final IProperty<List<KRendering>> LOOP_ELEMENTS = new Property<List<KRendering>>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.loops.elements", null);
    /** Property to mark highlighting styles. */
    private static final IProperty<Boolean> IS_HIGHLIGHTING = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.klighd.synthesis.hooks.loops.highlighting", false);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SCG_LOOPS);
    }

    override finish(Scope model, KNode rootNode) {
        if (SHOW_SCG_LOOPS.booleanValue) {
            rootNode.showLoops(model);
        }
    }

    override executeAction(KNode rootNode) {
        if (SHOW_SCG_LOOPS.booleanValue) {
            rootNode.showLoops(usedContext.inputModel);
        } else {
            rootNode.hideLoops;
        }
        return ActionResult.createResult(false);
    }

    /** 
     * If necessary calculate the loops and show the highlighting.
     */
    private def showLoops(KNode rootNode, Object model) {
        if (!(model instanceof State)) {
            throw new IllegalArgumentException("Cannot perform SCG analysis on models other than states");
        }
        val scc = model as State;
        val context = usedContext;
        val propertyHolder = rootNode.data.filter(KLayoutData).head;
        if (propertyHolder == null) {
            throw new IllegalArgumentException("Missing property holder on root element");
        }

        val loopElements = propertyHolder.getProperty(LOOP_ELEMENTS);
        // If not already calculated
        if (loopElements == null) {
            val tracker = propertyHolder.getProperty(SCChartsDiagramProperties::MODEL_TRACKER);
            if (tracker == null) {
                throw new IllegalArgumentException("Missing source model tracker");
            }

            // Create and start background job for compiling
            new Job(JOB_NAME) {

                override protected run(IProgressMonitor monitor) {
                    val newLoopElements = calculateSCGLoopElements(rootNode, scc, tracker);

                    // This part should be synchronized with the ui
                    new UIJob(JOB_NAME) {

                        override runInUIThread(IProgressMonitor monitor) {
                            if (propertyHolder.getProperty(LOOP_ELEMENTS) == null) {
                                propertyHolder.setProperty(LOOP_ELEMENTS, newLoopElements);
                                if (context.getOptionValue(SHOW_SCG_LOOPS) as Boolean) {
                                    newLoopElements.forEach[addHighlighting];
                                }
                            }
                            return Status.OK_STATUS;
                        }

                    }.schedule
                    return Status.OK_STATUS;
                }

            }.schedule;
        } else {
            loopElements.forEach[addHighlighting];
        }
    }

    /** 
     * Hide the loop highlighting.
     */
    private def hideLoops(KNode rootNode) {
        val propertyHolder = rootNode.data.filter(KLayoutData).head;
        val loopElements = propertyHolder?.getProperty(LOOP_ELEMENTS);
        if (loopElements != null) {
            rootNode.eAllContents.filter(KRendering).forEach[removeHighlighting];
        }
    }

    /** 
     * Calculate diagram elements related to SCG elements on loops.
     */
    private def List<KRendering> calculateSCGLoopElements(KNode rootNode, State scc,
        SourceModelTrackingAdapter tracking) {

        // TODO This transformation selection should be sensitive to the user selection in KiCoSelectionView regarding its editor
        val context = new KielerCompilerContext(SCGFeatures.GUARD_ID +
            ",*T_ABORT,*T_INITIALIZATION,*T_scg.basicblock.sc,*T_s.c,*T_sccharts.scg,*T_NOSIMULATIONVISUALIZATION",
            scc);
        context.setProperty(Tracing.ACTIVE_TRACING, true);
        context.advancedSelect = true;
        val result = KielerCompiler.compile(context);
        val compiledModel = result.object;
        val scg = compiledModel as SCGraph;

        val loops = result.getAuxiliaryData(PotentialInstantaneousLoopResult)
        val mapping = result.getAuxiliaryData(Tracing).head?.getMapping(scg, scc);

        // Calculate equivalence classes for diagram elements
        val equivalenceClasses = new TracingMapping(null);
        scc.eAllContents.forEach [
            var elements = tracking.getTargetElements(it);
            // If no diagram element is associated with the given model element its container is used to find an appropriate representation
            if (elements.empty && it instanceof EObject) {
                var next = (it as EObject)
                while (elements.empty && next != null) {
                    next = next.eContainer;
                    elements = tracking.getTargetElements(next);
                }
                equivalenceClasses.putAll(it, elements);
            }
        ];

        // Analyze loops and tracing
        val loopElements = newLinkedList;
        if (mapping != null) {
            for (PotentialInstantaneousLoopResult loop : loops) {
                val criticalSCGElements = <Object>newArrayList();
                criticalSCGElements.addAll(loop.criticalNodes)
                for (Node node : loop.criticalNodes) {
                    criticalSCGElements.addAll(node.incoming.filter [
                        loop.criticalNodes.contains(it.eContainer)
                    ]);
                }
                // Get diagram elements form tracing
                for (Object crit : criticalSCGElements) {
                    for (Object source : mapping.get(crit)) {
                        val elements = newArrayList();
                        elements.addAll(tracking.getTargetElements(source))
                        elements.addAll(equivalenceClasses.getTargets(source).filter(EObject))
                        for (EObject element : elements) {
                            if (element instanceof KRendering) {
                                loopElements.add(element as KRendering);
                            } else if (element instanceof KGraphElement) {
                                loopElements.addAll((element as KGraphElement).data.filter(KRendering));
                            }
                        }
                    }
                }
            }
        }
        return loopElements;
    }

    /** 
     * Adds the highlighting style to the given rendering.
     */
    private def void addHighlighting(KRendering rendering) {
        rendering.styles += createKForeground() => [
            setColor(Colors.RED);
            if (rendering instanceof KPolyline) {
                propagateToChildren = true;
            }
            setProperty(IS_HIGHLIGHTING, true);
        ]
    }

    /** 
     * Removed the highlighting style from the given rendering if present.
     */
    private def void removeHighlighting(KRendering rendering) {
        rendering.styles.removeIf[getProperty(IS_HIGHLIGHTING)];
    }
}
