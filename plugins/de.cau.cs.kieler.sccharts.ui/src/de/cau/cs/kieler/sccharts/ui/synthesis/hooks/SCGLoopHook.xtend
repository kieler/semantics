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
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingMapping
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KGraphElement
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsDiagramProperties
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.processors.analyzer.LoopAnalyzerV2
import java.util.List
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject

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
class SCGLoopHook extends SynthesisHook {

    extension KRenderingFactory = KRenderingFactory::eINSTANCE

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SCGLoopHook";
    /** Job name */
    public static final String JOB_NAME = "Calculating SCG Loops";
    /** The related synthesis option. */
    public static final SynthesisOption SHOW_SCG_LOOPS = SynthesisOption.createCheckOption("Show SCG Loops", false).
        setCategory(GeneralSynthesisOptions::DEBUGGING)
        .setUpdateStrategy(SimpleUpdateStrategy.ID)
    /** Property to mark highlighting styles. */
    private static final IProperty<Boolean> IS_HIGHLIGHTING = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.loops.highlighting", false);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SCG_LOOPS);
    }

    override finish(Scope model, KNode rootNode) {
        if (SHOW_SCG_LOOPS.booleanValue) {
            rootNode.showLoops(model);
        }
    }

    /** 
     * If necessary calculate the loops and show the highlighting.
     */
    private def showLoops(KNode rootNode, Object model) {
        if (!(model instanceof State)) {
            throw new IllegalArgumentException("Cannot perform SCG analysis on models other than states");
        }
        val scc = model as State;
        val tracker = rootNode.getProperty(SCChartsDiagramProperties::MODEL_TRACKER);
        if (tracker == null) {
            throw new IllegalArgumentException("Missing source model tracker");
        }
        val newLoopElements = calculateSCGLoopElements(rootNode, scc, tracker);
        newLoopElements.forEach[addHighlighting];
    }

    /** 
     * Calculate diagram elements related to SCG elements on loops.
     */
    private def List<KRendering> calculateSCGLoopElements(KNode rootNode, State scc, SourceModelTrackingAdapter tracking) {
        val loopElements = newLinkedList;

        val context = compileDependencies(scc);
        val scgRoot = context.result.getModel
        if (scgRoot instanceof SCGraphs) {
            val scg = scgRoot.scgs.head
            val loops = context.result.getProperty(LoopAnalyzerV2.LOOP_DATA)
            val mapping = context.startEnvironment.getProperty(Tracing.TRACING_DATA).getMapping(scgRoot, scc.eContainer as SCCharts)
    
            if (loops !== null && !loops.criticalNodes.empty && mapping !== null) {
                // Calculate equivalence classes for diagram elements
                val equivalenceClasses = new TracingMapping(null);
                for (EObject obj : scc.eAllContents.toIterable) {
                    var elements = tracking.getTargetElements(obj);
                    // If no diagram element is associated with the given model element its container is used to find an appropriate representation
                    if (elements.empty) {
                        var next = obj;
                        while (elements.empty && next != null) {
                            next = next.eContainer;
                            elements = tracking.getTargetElements(next);
                        }
                        equivalenceClasses.putAll(obj, elements);
                    }
                }
        
                // Analyze loops and tracing
                val criticalSCGElements = <Object>newArrayList();
                criticalSCGElements.addAll(loops.criticalNodes)
                for (Node node : loops.criticalNodes) {
                    criticalSCGElements.addAll(node.incoming.filter [
                        loops.criticalNodes.contains(it.eContainer)
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
     * Compiles the given SCChart with tracing to get dependencies
     */
    private def CompilationContext compileDependencies(State state) {
        val model = state.eContainer as SCCharts
        val cc = Compile.createCompilationContext("de.cau.cs.kieler.sccharts.netlist", model)
        
        cc.startEnvironment.setProperty(Environment.INPLACE, true)
        cc.startEnvironment.setProperty(Tracing.ACTIVE_TRACING, true)
        
        val dependecyAnalysis = cc.processorMap.entrySet.findFirst[
            key.id.equals("de.cau.cs.kieler.scg.processors.transformators.dependency")
        ]?.value
        if (dependecyAnalysis === null) throw new NullPointerException("Can not find dependency transformation in compilation system")
        // Stop after the dependency analysis
        dependecyAnalysis.environment.setProperty(Environment.CANCEL_COMPILATION, true) 
        
        cc.compile

        return cc
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
