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
package de.cau.cs.kieler.sccharts.klighd.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.kgraph.KLabel
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KCustomRendering
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.core.krendering.KPolyline
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.util.Pair
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.kitt.klighd.tracing.internal.TracingEdgeNode
import de.cau.cs.kieler.kitt.tracing.Tracing
import de.cau.cs.kieler.kitt.tracing.internal.TracingMapping
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.klighd.DiagramProperties
import de.cau.cs.kieler.sccharts.klighd.SCChartsSynthesisActionHook
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Write_Write
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.HashMap
import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.ecore.EObject
import org.eclipse.ui.progress.UIJob

import static de.cau.cs.kieler.sccharts.klighd.hooks.SCGDependencyHook.*

import static extension com.google.common.base.Predicates.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*

/**
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class SCGDependencyHook extends SCChartsSynthesisActionHook {

    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KRenderingExtensions

    @Inject
    extension KPolylineExtensions

    @Inject
    extension KContainerRenderingExtensions

    /** Action ID */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.hooks.SCGDependencyHook";
    /** Job name */
    public static final String JOB_NAME = "Calculating SCG Dependencies";
    /** The related synthesis option */
    public static final SynthesisOption SHOW_SCG_DEPENDENCIES = SynthesisOption.createCheckOption(
        "SCG Dependencies", false).setUpdateAction(SCGDependencyHook.ID); // Add this action as updater
    /** Property to store analysis results */
    private static final IProperty<List<KEdge>> DEPENDENCY_EDGES = new Property<List<KEdge>>(
        "de.cau.cs.kieler.sccharts.klighd.hooks.dependency.edges", null);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_SCG_DEPENDENCIES);
    }

    override finish(Scope model, KNode rootNode) {
        if (SHOW_SCG_DEPENDENCIES.booleanValue) {
            rootNode.showDependencies(model);
        }
    }

    override executeAction(KNode rootNode) {
        if (SHOW_SCG_DEPENDENCIES.booleanValue) {
            rootNode.showDependencies(usedContext.inputModel);
        } else {
            rootNode.hideDependencies;
        }
        return ActionResult.createResult(false);
    }

    private def showDependencies(KNode rootNode, Object model) {
        if (!(model instanceof State)) {
            throw new IllegalArgumentException("Cannot perform SCG analysis on models other than states");
        }
        val scc = model as State;
        val context = usedContext;
        val propertyHolder = rootNode.data.filter(KLayoutData).head;
        if (propertyHolder == null) {
            throw new IllegalArgumentException("Missing property holder on root element");
        }

        val edges = propertyHolder.getProperty(DEPENDENCY_EDGES);
        if (edges == null) {
            val tracker = propertyHolder.getProperty(DiagramProperties::MODEL_TRACKER);
            if (tracker == null) {
                throw new IllegalArgumentException("Missing source model tracker");
            }
            new Job(JOB_NAME) {

                override protected run(IProgressMonitor monitor) {
                    val newLoopElements = calculateSCGDependencyEdges(rootNode, scc, tracker);

                    // This part should be synchronized with the ui
                    new UIJob(JOB_NAME) {

                        override runInUIThread(IProgressMonitor monitor) {
                            if (propertyHolder.getProperty(DEPENDENCY_EDGES) == null) {
                                propertyHolder.setProperty(DEPENDENCY_EDGES, newLoopElements);
                                if (!context.getOptionValue(SHOW_SCG_DEPENDENCIES) as Boolean) {
                                    newLoopElements.forEach[initiallyHide];
                                }
                            }
                            return Status.OK_STATUS;
                        }

                    }.schedule
                    return Status.OK_STATUS;
                }

            }.schedule;
        } else {
            val viewer = context.viewer;
            edges.forEach[viewer.show(it)];
        }
    }

    private def hideDependencies(KNode rootNode) {
        val propertyHolder = rootNode.data.filter(KLayoutData).head;
        val edges = propertyHolder?.getProperty(DEPENDENCY_EDGES);
        if (edges != null) {
            val viewer = usedContext.viewer;
            edges.forEach[viewer.hide(it)];
        }
    }

    private def calculateSCGDependencyEdges(KNode rootNode, State scc, SourceModelTrackingAdapter tracking) {
        // TODO This transformation selection should be sensetive to the user selection in KiCoSelectionView regarding its editor
        val context = new KielerCompilerContext(SCGFeatures.DEPENDENCY_ID +
            ",*T_ABORT,*T_INITIALIZATION,*T_scg.basicblock.sc,*T_s.c,*T_sccharts.scg,*T_NOSIMULATIONVISUALIZATION",
            scc);
        context.setProperty(Tracing.ACTIVE_TRACING, true);
        context.advancedSelect = true;
        val result = KielerCompiler.compile(context);
        val compiledModel = result.object;
        val attachNode = rootNode.children.head;
        
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
        
        // Analyze dependencies with tracing
        val HashMap<Pair<EObject, EObject>, KEdge> edges = newHashMap;
        if (compiledModel instanceof SCGraph && attachNode != null) {
            val scg = compiledModel as SCGraph;

            val mapping = result.getAuxiliaryData(Tracing).head?.getMapping(scg, scc);
            if (mapping != null) {
                val filterDiagramPredicate = KLabel.instanceOf.or(KRectangle.instanceOf);
                val filterModelPredicate = Action.instanceOf.or(ValuedObject.instanceOf);
                for (Assignment asng : scg.nodes.filter(Assignment)) {
                    val sources = mapping.get(asng).filter(filterModelPredicate).fold(newHashSet()) [ list, item |
                        list.addAll(tracking.getTargetElements(item).filter(filterDiagramPredicate));
                        list.addAll(
                            equivalenceClasses.getTargets(item).filter(EObject).filter(filterDiagramPredicate).toList);
                        list;
                    ];
                    for (dep : asng.dependencies.filter(DataDependency)) {
                        if (!dep.confluent && dep.concurrent) {
                            val targets = mapping.get(dep.target).filter(filterModelPredicate).fold(newHashSet()) [ list, item |
                                list.addAll(tracking.getTargetElements(item).filter(filterDiagramPredicate));
                                list.addAll(equivalenceClasses.getTargets(item).filter(EObject).filter(
                                    filterDiagramPredicate));
                                list;
                            ];
                            for (EObject source : sources) {
                                for (EObject target : targets) {
                                    edges.createDependencyEdge(attachNode, source, target, dep)
                                }
                            }
                        }
                    }

                }
            }
        }
        return edges.values.toList;
    }

    private def void createDependencyEdge(HashMap<Pair<EObject, EObject>, KEdge> edges, KNode attachNode, EObject source, EObject target, Dependency dependency) {
        val sourceTargetPair = new Pair(source, target);
        val targetSourcePair = new Pair(target, source);
        var opposite = false;
        var KEdge edge;
        if (edges.containsKey(sourceTargetPair)) {
            edge = edges.get(sourceTargetPair);
        } else if (edges.containsKey(targetSourcePair)) {
            edge = edges.get(targetSourcePair);
            opposite = true;
        } else {
            edge = createEdge(source, target);
            edges.put(sourceTargetPair, edge);
            edge.getData(KLayoutData).setProperty(LayoutOptions.NO_LAYOUT, true);
            edge.data += createKCustomRendering => [
                it.figureObject = new TracingEdgeNode(source, target, attachNode);
                it.setProperty(KlighdProperties.NOT_SELECTABLE, true);
                it.addPolyline => [
                    it.lineWidth = 2
                    it.lineStyle = LineStyle::DASH
                    // Default arrow head
                    it.addHeadArrowDecorator
                    // Default green color
                    it.foreground = Colors.GREEN;
                    it.foreground.propagateToChildren = true;
                ];
            ];
            edge.source = attachNode;
            edge.target = attachNode;
        }
        val line = edge.getData(KCustomRendering).children.filter(KPolyline).head;
        if (dependency instanceof Write_Write) {
            line.foreground = Colors.RED
            line.foreground.propagateToChildren = true;
        }
        if (opposite) {
            line.addTailArrowDecorator.placementData as KDecoratorPlacementData => [
                // This fixes a weird bug in the KPolylineExtension
                it.setXOffset(-6f);
                it.setYOffset(-5f);
            ];
        }
    }
}
