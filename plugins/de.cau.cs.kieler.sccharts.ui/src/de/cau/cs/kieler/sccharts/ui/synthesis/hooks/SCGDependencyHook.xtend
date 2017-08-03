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

import com.google.common.collect.HashMultimap
import com.google.common.collect.Iterators
import com.google.common.collect.Maps
import com.google.common.collect.Multimap
import com.google.common.collect.Sets
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kicool.ui.kitt.tracing.internal.TracingEdgeNode
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.kicool.kitt.tracing.internal.TracingMapping
import de.cau.cs.kieler.klighd.IKlighdSelection
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.internal.util.SourceModelTrackingAdapter
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KLayoutData
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KCustomRendering
import de.cau.cs.kieler.klighd.krendering.KDecoratorPlacementData
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.SimpleUpdateStrategy
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsDiagramProperties
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisActionHook
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SCGDependencyHook.DepType
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.DataDependencyType
import de.cau.cs.kieler.scg.Dependency
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.Collection
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.ui.progress.UIJob

import static extension com.google.common.base.Predicates.*
import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import de.cau.cs.kieler.kicool.compilation.Compile
import de.cau.cs.kieler.kicool.environments.Environment
import de.cau.cs.kieler.kicool.compilation.CompilationContext
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.scg.SCGraphs

/**
 * Adds the SCG dependencies into the SCChart.
 * 
 * TODO Move this class to de.cau.cs.kieler.sccharts.scg
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
class SCGDependencyHook extends SynthesisActionHook {

	extension KRenderingFactory = KRenderingFactory.eINSTANCE

    @Inject
    extension KEdgeExtensions

    @Inject
    extension KPortExtensions

    @Inject
    extension KLabelExtensions

	@Inject
	extension KRenderingExtensions

	@Inject
	extension KPolylineExtensions

	@Inject
	extension KContainerRenderingExtensions

	/** Action ID */
	public static final String ID = "de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SCGDependencyHook";
	/** Job name */
	public static final String JOB_NAME = "Calculating SCG Dependencies";
	/** The related synthesis option */
	public static final SynthesisOption SHOW_SCG_DEPENDENCIES = SynthesisOption.createCheckOption(
		"Show SCG Dependencies", false).setCategory(GeneralSynthesisOptions::DEBUGGING)
		.setUpdateStrategy(SimpleUpdateStrategy.ID)
		// Deactivated to force Simple Update Strategy
		//.setUpdateAction(SCGDependencyHook.ID); // Add this action as updater
	/** The related synthesis option for regions */
    public static final SynthesisOption SCG_DEPENDENCY_TYPES = SynthesisOption.createChoiceOption("Dependency Types",
        newArrayList(DepType.Elements, DepType.Regions, DepType.DataflowOneEdge, DepType.DataflowHyperedge),
        DepType.Elements).setCategory(GeneralSynthesisOptions::DEBUGGING).setUpdateStrategy(SimpleUpdateStrategy.ID)
        // Deactivated to force Simple Update Strategy
        //.setUpdateAction(SCGDependencyHook.ID); // Add this action as updater
    /** Option to show only dependencies of selected elements */
	public static final SynthesisOption SHOW_SELECTED_DEPENDENCIES = SynthesisOption.createCheckOption(
		"Show only Dependencies of selected Elements", false)
		.setCategory(GeneralSynthesisOptions::DEBUGGING)
        .setUpdateAction(SCGDependencyHook.ID); // Add this action as updater
	/** Property to store analysis results */
	private static final IProperty<HashMultimap<DepType, KEdge>> DEPENDENCY_EDGES = new Property<HashMultimap<DepType, KEdge>>(
		"de.cau.cs.kieler.sccharts.ui.synthesis.hooks.dependency.edges", null);
	
	/**
     * Global selection listener which dependencies for element selection.
     */
    private static final ISelectionChangedListener selectionListener = new ISelectionChangedListener() {

        override void selectionChanged(SelectionChangedEvent event) {
            val selection = event.getSelection() as IKlighdSelection
            // Klighd does not select KLabels when its KText is selected, so this the KLabel are
            // added here
            val selectionList = newArrayList()
            selection.diagramElementsIterator().forall[selectionList.add(it)]
            for (eObject : selection.diagramElementsIterator().filter(EObject).toIterable ){
                if (eObject instanceof KText && eObject.eContainer() instanceof KLabel) {
                    selectionList.add(eObject.eContainer());
                }
            }

            val viewContext = selection.getViewContext();
            if(viewContext.getOptionValue(SHOW_SCG_DEPENDENCIES) as Boolean && viewContext.getOptionValue(SHOW_SELECTED_DEPENDENCIES) as Boolean) {
				val rootNode = viewContext.viewModel
				val propertyHolder = rootNode.data.filter(KLayoutData).head;
				val edges = propertyHolder?.getProperty(DEPENDENCY_EDGES);
				if (edges !== null) {
					val viewer = viewContext.viewer
					edges.get(viewContext.getOptionValue(SCG_DEPENDENCY_TYPES) as DepType).forEach[
						val edgeNode = it.getData(KCustomRendering).figureObject as TracingEdgeNode
						if (selectionList.contains(edgeNode.source) || selectionList.contains(edgeNode.target)) {
							viewer.show(it)
						}else{
							viewer.hide(it)
						}
						// TODO Implement selection based on variable usage
					];
				}
            }
        }
    };
    
	/** The different type of dependency filter */
	private enum DepType {
		Elements, Regions, DataflowOneEdge, DataflowHyperedge;
	}
	
	override getDisplayedSynthesisOptions() {
		return newLinkedList(SHOW_SCG_DEPENDENCIES, SCG_DEPENDENCY_TYPES); // SHOW_SELECTED_DEPENDENCIES
	}

	override finish(Scope model, KNode rootNode) {
		if (SHOW_SCG_DEPENDENCIES.booleanValue) {
			rootNode.showDependencies(model);
			val contextViewer = usedContext.getViewer()?.getContextViewer();
			if (SHOW_SELECTED_DEPENDENCIES.booleanValue) {
				rootNode.hideDependencies
				contextViewer?.addSelectionChangedListener(selectionListener);
            } else {
                contextViewer?.removeSelectionChangedListener(selectionListener);
			}
		} else {
			val contextViewer = usedContext.getViewer()?.getContextViewer();
            contextViewer?.removeSelectionChangedListener(selectionListener);
		}
	}

	override executeAction(KNode rootNode) {
	    var boolean relayout = false
		if (SHOW_SCG_DEPENDENCIES.booleanValue) {
			relayout = rootNode.showDependencies(usedContext.inputModel);
		} else {
			rootNode.hideDependencies;
		}
		val contextViewer = usedContext.getViewer().getContextViewer();
		if (SHOW_SELECTED_DEPENDENCIES.booleanValue) {
			rootNode.hideDependencies
			contextViewer.addSelectionChangedListener(selectionListener);
        } else {
            contextViewer.removeSelectionChangedListener(selectionListener);
		}
		return ActionResult.createResult(relayout);
	}

	/** 
	 * If necessary create the dependency edges and show them.
	 */
	private def boolean showDependencies(KNode rootNode, Object model) {
		if (!(model instanceof State)) {
			throw new IllegalArgumentException("Cannot perform SCG analysis on models other than states");
		}
		val scc = model as State;
		val context = usedContext;
		val edges = rootNode.getProperty(DEPENDENCY_EDGES);
		// If not already created
		if (edges === null) {
			val tracker = rootNode.getProperty(SCChartsDiagramProperties::MODEL_TRACKER);
			if (tracker === null) {
				throw new IllegalArgumentException("Missing source model tracker");
			}
			val attachNode = rootNode.children.head;
			if (attachNode === null) {
				return false;
			}

			val type = context.getOptionValue(SCG_DEPENDENCY_TYPES) as DepType;
            if (type == DepType.Elements || type == DepType.Regions) {
    			// Create and start background job for compiling
    			new Job(JOB_NAME) {
    
    				override protected run(IProgressMonitor monitor) {
    					val newLoopElements = calculateSCGDependencyEdges(rootNode, scc, tracker, attachNode);
    
    					// This part should be synchronized with the ui
    					new UIJob(JOB_NAME) {
    
    						override runInUIThread(IProgressMonitor monitor) {
    							if (rootNode.getProperty(DEPENDENCY_EDGES) === null) {
    								rootNode.setProperty(DEPENDENCY_EDGES, newLoopElements);
    								val viewer = context.viewer;
    								newLoopElements.entries.forEach [
        									it.value.source = attachNode
        									it.value.target = attachNode
    									if (it.key != type) {
    										it.value.initiallyHide;
    										viewer?.hide(it.value);
    									}
    								];
    								// Re layout to place edges correctly
    								new LightDiagramLayoutConfig(context).performLayout
    							}
    							return Status.OK_STATUS;
    						}
    
    					}.schedule
    					return Status.OK_STATUS;
    				}
    
    			}.schedule;
    			return false;
            } else if (type == DepType.DataflowOneEdge || type == DepType.DataflowHyperedge) {
                // Show the dependencies as dataflow edges between concurrent regions
                // This is not done asynchronously because it needs a true layout run in the end.
                addDataflowDependencyEdges(rootNode, scc, tracker);
                return true;
            } else {
                return false;
            }
        } else {
            val viewer = context.viewer;
			rootNode.hideDependencies;
			edges.get(context.getOptionValue(SCG_DEPENDENCY_TYPES) as DepType).forEach[viewer.show(it)];
			return false;
		}
	}
    
	/** 
	 * Hide the dependency edges
	 */
	private def hideDependencies(KNode rootNode) {
		val propertyHolder = rootNode.data.filter(KLayoutData).head;
		val edges = propertyHolder?.getProperty(DEPENDENCY_EDGES);
		if (edges !== null) {
			val viewer = usedContext.viewer;
			edges.values.forEach[viewer.hide(it)];
		}
	}

    /**
     * Compiles the given SCChart with tracing to get dependencies
     */
    private def CompilationContext compileDependencies(State state) {
        val model = state.eContainer as SCCharts
        val cc = Compile.createCompilationContext("de.cau.cs.kieler.scg.dependency", model)
        
        cc.startEnvironment.setProperty(Environment.INPLACE, true)
        cc.startEnvironment.setProperty(Tracing.ACTIVE_TRACING, true)
        
        cc.compile

        return cc
    }

	/** 
	 * Calculate and create the dependency edges
	 */
	private def calculateSCGDependencyEdges(KNode rootNode, State scc, SourceModelTrackingAdapter tracking,
		KNode attachNode) {

		val context = compileDependencies(scc);
		val compiledModel = context.result.getModel

		// Calculate equivalence classes for diagram elements
		val equivalenceClasses = new TracingMapping(null);
		for (EObject obj : scc.eAllContents.toIterable) {
			var elements = tracking.getTargetElements(obj);
			// If no diagram element is associated with the given model element its container
			// is used to find an appropriate representation
			if (elements.empty) {
				var next = obj;
				while (elements.empty && next !== null) {
					next = next.eContainer;
					elements = tracking.getTargetElements(next);
				}
				equivalenceClasses.putAll(obj, elements);
			}
		};

		// Find the label of the root SCChart
		val rootLabel = tracking.getTargetElements(scc).filter(KText).head;

		// Analyze dependencies and tracing
		val HashMap<Pair<EObject, EObject>, KEdge> elementEdges = newHashMap;
		val HashMap<Pair<EObject, EObject>, KEdge> regionEdges = newHashMap;
        
		if (compiledModel instanceof SCGraph) {
			val scg = compiledModel as SCGraph;

//			val mapping = result.getAuxiliaryData(Tracing).head?.getMapping(scg, scc);
            val mapping = context.startEnvironment.getProperty(Tracing.TRACING_DATA).getMapping(scg, scc)      
			if (mapping !== null) {
				val filterDiagramPredicate = KLabel.instanceOf.or([
					return it instanceof KRectangle && !(it as KRectangle).getProperty(StateStyles.IS_LAYOUT_ELEMENT)
				]);
				val filterModelPredicate = or(Action.instanceOf, ValuedObject.instanceOf);
				for (Assignment asgn : scg.nodes.filter(Assignment)) {
					val sources = mapping.get(asgn).filter(filterModelPredicate).fold(newHashSet()) [ list, item |
						list.addAll(tracking.getTargetElements(item).filter(filterDiagramPredicate));
						list.addAll(
							equivalenceClasses.getTargets(item).filter(EObject).filter(filterDiagramPredicate).toList);
						list;
					];
					for (dep : asgn.dependencies.filter(DataDependency)) {
						if (!dep.confluent && dep.concurrent) {
							val targets = mapping.get(dep.target).filter(filterModelPredicate).fold(newHashSet()) [ list, item |
								list.addAll(tracking.getTargetElements(item).filter(filterDiagramPredicate));
								list.addAll(
									equivalenceClasses.getTargets(item).filter(EObject).filter(filterDiagramPredicate));
								list;
							];
							for (EObject source : sources) {
								for (EObject target : targets) {
									// Element Edges
									elementEdges.createDependencyEdge(attachNode, source, target, dep, false)
									// Region Edges
									var sourceRegion = source
									while (sourceRegion !== null &&
										!(tracking.getSourceElement(sourceRegion) instanceof Region)) {
										sourceRegion = sourceRegion.eContainer
									}
									val newsources = newLinkedList(rootLabel)
									if (sourceRegion !== null) {
										newsources.clear
										newsources.addAll((sourceRegion as KNode).data.filter(KRectangle).map[it.children.filter(KText).head])
									}
									var targetRegion = target
									while (targetRegion !== null &&
										!(tracking.getSourceElement(targetRegion) instanceof Region)) {
										targetRegion = targetRegion.eContainer
									}
									val newtargets = newLinkedList(rootLabel)
									 if (targetRegion !== null) {
									 	newtargets.clear
										newtargets.addAll((targetRegion as KNode).data.filter(KRectangle).map[it.children.filter(KText).head])
									}
									for (EObject newsource : newsources) {
										for (EObject newtarget : newtargets) {
											if (newsource != newtarget) {
												regionEdges.createDependencyEdge(attachNode, newsource, newtarget, dep, true)
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		val edges = HashMultimap.create(2,newArrayList(elementEdges.size, regionEdges.size).max);
		edges.putAll(DepType.Elements, elementEdges.values)
        edges.putAll(DepType.Regions, regionEdges.values)
		return edges;
	}

    /** 
     * Create and configure the edge for the given dependency
     */
    private def void createDependencyEdge(HashMap<Pair<EObject, EObject>, KEdge> edges, KNode attachNode,
        EObject source, EObject target, Dependency dependency, boolean ignoreFirstCollapsibleParent) {
        val sourceTargetPair = new Pair(source, target);
        val targetSourcePair = new Pair(target, source);
        var opposite = false;
        var KEdge edge;
        // If the is a mutual dependency use the already crested edge
        if (edges.containsKey(sourceTargetPair)) {
            edge = edges.get(sourceTargetPair);
        } else if (edges.containsKey(targetSourcePair)) {
            edge = edges.get(targetSourcePair);
            opposite = true;
        } else {
            // Create edge
            edge = createEdge(source, target);
            edges.put(sourceTargetPair, edge);
            edge.setProperty(CoreOptions.NO_LAYOUT, true);
            edge.data += createKCustomRendering => [
                val edgeNode = new TracingEdgeNode(source, target, attachNode);
                edgeNode.setIgnoreFirstCollapsibleParent(ignoreFirstCollapsibleParent, ignoreFirstCollapsibleParent)
                it.figureObject = edgeNode
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
        }
        val line = edge.getData(KCustomRendering).children.filter(KPolyline).head;
        // Configure mutual dependency with additional arrow
        if (dependency instanceof DataDependency) {
            if (dependency.type == DataDependencyType.WRITE_WRITE) {
                line.foreground = Colors.RED
                line.foreground.propagateToChildren = true;
            }
        }
        if (opposite) {
            line.addTailArrowDecorator.placementData as KDecoratorPlacementData => [
                // This fixes a weird bug in the KPolylineExtension
                it.setXOffset(-6f);
                it.setYOffset(-5f);
            ];
        }
    }

    /**
     * Calculate and show the data dependencies between parallel regions as dataflow edges in the diagram. 
     */
    private def addDataflowDependencyEdges(KNode rootNode, State scc, SourceModelTrackingAdapter tracking) {
        // PHASE 1: Yodeling Yeti (Preparation)
        // Compile the SCChart with Tracing up until dependency analysis
        val context = compileDependencies(scc)
        val compiledModel = context.result.getModel

        // Ensure that the compilation returned an SCG
        if (!(compiledModel instanceof SCGraphs)) {
            return
        }

        // Take the compiled model as SCG
        val scg = (compiledModel as SCGraphs).scgs.head

        // Get the tracing mapping from the dependency scg to the source model
//        val mapping = result.getAuxiliaryData(Tracing).head?.getMapping(scg, scc);
        val sccContainer = scc.eContainer
        val scgContainer = scg.eContainer
        val tracing = context.startEnvironment.getProperty(Tracing.TRACING_DATA)
        val mapping = tracing.getMapping(scgContainer, sccContainer)      
        if (mapping === null) {
            return;
        }

        // Calculate equivalence classes for diagram elements
        val equivalenceClasses = new TracingMapping(null);
        for (EObject obj : scc.eAllContents.toIterable) {
            var elements = tracking.getTargetElements(obj);
            // If no diagram element is associated with the given model element its container 
            // is used to find an appropriate representation
            if (elements.empty) {
                var next = obj;
                while (elements.empty && next !== null) {
                    next = next.eContainer;
                    elements = tracking.getTargetElements(next);
                }
                equivalenceClasses.putAll(obj, elements);
            }
        };

        // PHASE 2: Happy Hippogryph (Gathering dependencies)
        // I want all data dependencies gathered in one room, as soon as possible!!
        val List<DataDependency> dependencies = newLinkedList();
        // Grab all the assignments from the SCG
        val assingments = scg.nodes.filter(Assignment);
        for (Assignment asgn : assingments) {
            dependencies.addAll(
                asgn.dependencies.filter(DataDependency).filter([!isConfluent && isConcurrent])
            )
        }

        // PHASE 3: Eager Eagle (Mapping dependencies to incoming/outgoing signals of regions)
        val HashMultimap<Region, ValuedObject> outgoingRegionDependencies = HashMultimap.create
        val HashMultimap<Region, ValuedObject> incomingRegionDependencies = HashMultimap.create

        for (DataDependency dependency : dependencies) {
            // The source of the dependency is always an assignment in the SCG
            val scgSource = dependency.eContainer as Assignment;
            // The assingment might map to multiple SCChart objects. For us only Actions or ValuedObjects are relevant.
            val scChartSources = mapping.get(scgSource).filter(EObject).filter(
                or(Action.instanceOf, ValuedObject.instanceOf));
            val scChartTargets = mapping.get(dependency.getTarget).filter(EObject).filter(
                or(Action.instanceOf, ValuedObject.instanceOf));

            // For source and target we need the containing region to map the dataflow between these.
            // Traverse the containment upwards until we either find a region (good case) 
            // or reach the root object (bad case)
            var Region scChartSourceRegion = findContainingRegion(scChartSources);
            var Region scChartTargetRegion = findContainingRegion(scChartTargets);

            // We should now have a proper regions for this, add the Valued Object of the dependency to outgoing 
            // and incoming dependencies of the regions
            if (scChartSourceRegion !== null) {
                outgoingRegionDependencies.put(scChartSourceRegion, scgSource.valuedObject);
            }
            if (scChartTargetRegion !== null) {
                incomingRegionDependencies.put(scChartTargetRegion, scgSource.valuedObject);
            }
        }

        // PHASE 4: Pretty Platypus (Escalate production and consumption upwards)
        // To show all the dataflow we propagate the produced and consumed signals upwards to the parent regions.
        propagateDependencies(incomingRegionDependencies);
        propagateDependencies(outgoingRegionDependencies);

        // PHASE 5: Dancing Dromedar (Add dependency edges for adjacient regions)
        // Finally we create the edges in the diagram

        val depType = getUsedContext().getOptionValue(SCG_DEPENDENCY_TYPES) as DepType;
        if (depType == DepType.DataflowOneEdge) {
            // PHASE 5a: Drunk Dancing Dromedar (Draw one edge for each pair of regions)
            // If we want to create one edge for each pair of relevant regions,
            // we can just iterate through all outgoing dependencies and store which edge has already been created.
            createPairwiseDataflowEdges(outgoingRegionDependencies, incomingRegionDependencies, tracking, mapping);   
        } else if (depType == DepType.DataflowHyperedge) {
            // PHASE 5b: Delirious Dancing Dromedar (Draw a hyperedge for each flowing signal)
            // If we want to create a hyperedge we need to create ports for each region for each flowing signal and 
            // create an from the port to all the other involved regions.
            createDataflowHyperedges(scc, outgoingRegionDependencies, incomingRegionDependencies, tracking, mapping);
        }
    }
    
    /**
     * Create a dataflow hyperedge for each signal flowing between concurrent regions. All the "producing" and the 
     * "consuming" regions are attached to that hyperedge. 
     */
    def createDataflowHyperedges(State scc, HashMultimap<Region, ValuedObject> outgoingRegionDependencies,
        HashMultimap<Region, ValuedObject> incomingRegionDependencies, SourceModelTrackingAdapter tracking,
        Multimap<Object, Object> mapping) {
        // We need to assemble all the relevant valued objects in one region. 
        // Relevant valued objects are these that are incoming in one region 
        // and outgoing in another concurrent region.
        // Find all states that have more than one region
        val concurrencyStates = Iterators.concat(Iterators.singletonIterator(scc), scc.eAllContents)
            .filter(State).filter[regions.size > 1].toIterable;
        for (State state : concurrencyStates) {
            // Assemble all the signals used in this region and divide the usages for 
            // incoming and outgoing dependencies
            val Map<ValuedObject, Pair<Set<Region>,Set<Region>>> regionSignals = Maps.newHashMap;
            state.regions.forEach[ region |
                outgoingRegionDependencies.get(region).forEach[ vo |
                    if (!regionSignals.containsKey(vo)) {
                        regionSignals.put(vo, new Pair(Sets.newHashSet, Sets.newHashSet));
                    }
                    regionSignals.get(vo).key.add(region);
                ]
                incomingRegionDependencies.get(region).forEach[ vo |
                    if (!regionSignals.containsKey(vo)) {
                        regionSignals.put(vo, new Pair(Sets.newHashSet, Sets.newHashSet));
                    }
                    regionSignals.get(vo).value.add(region);
                ]
            ]

            // Filter the Map for all elements that are incoming as well as outgoing in this state
            regionSignals.filter[ vo, pair | 
                !pair.key.empty && !pair.value.empty &&
                !Sets.difference(pair.key, pair.value).empty
            ].forEach [ vo, regions |
                // Store the target points for reuse with more sources
                val Map<Region, KPort> targetPorts = Maps.newHashMap;
                regions.key.forEach [ outregion |
                    // Create a source port that is reused for every edge from here
                    val KPort sourcePort = createPort => [
                        node = tracking.getTargetElements(outregion).filter(KNode).head;
                    ]
                    
                    // Add a port label to the source port instead of every edge
                    sourcePort.addOutsidePortLabel(
                        // Trace objects back to their source object to show proper names
                        mapping.get(vo).filter(ValuedObject).head.name
                    );                    
                    
                    regions.value.forEach[ inregion |
                        // Create a target port if needed and store it for other sources
                        if (!targetPorts.containsKey(inregion)) {
                            targetPorts.put(inregion, createPort => [
                                node = tracking.getTargetElements(inregion).filter(KNode).head;
                            ])
                        }
                        // Create an edge for this dependency
                        val KEdge edge = createEdge => [
                            it.sourcePort = sourcePort;
                            it.source = sourcePort.node;
                            it.targetPort = targetPorts.get(inregion);
                            it.target = it.targetPort.node;
                            it.addPolyline => [
                                it.lineWidth = 2
                                it.lineStyle = LineStyle::DOT
                                // Default arrow head
                                it.addHeadArrowDecorator
                                // Junction points because of hyperedges
                                it.addJunctionPointDecorator
                            ];                            
                        ]
                        // Set layout on the parent state
                        val parentNode = edge.source.parent;
                        parentNode.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                        parentNode.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FREE)
                        if (edge.source.getProperty(CoreOptions::DIRECTION) == Direction.DOWN) {
                            parentNode.setLayoutOption(CoreOptions::DIRECTION, Direction.LEFT)
                        } else {
                            parentNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
                        }
                        // Configure source and target layout constraints
                        edge.source.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FREE)
                        edge.target.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FREE)                        
                        edge.source.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
                        edge.target.setLayoutOption(CoreOptions::NODE_SIZE_CONSTRAINTS, SizeConstraint.free)
                    ]
                ]
            ]
        }
    }

    /**
     * Create a dataflow edge between two concurrent regions when there is at least one signal
     * flowing from the first region to the second. If there are also signals flowing in the
     * other direction, a second edge is created.
     */
    def createPairwiseDataflowEdges(HashMultimap<Region, ValuedObject> outgoingRegionDependencies,
        HashMultimap<Region, ValuedObject> incomingRegionDependencies, SourceModelTrackingAdapter tracking,
        Multimap<Object, Object> mapping) {
        for (Region region : outgoingRegionDependencies.keySet) {
            // Grab regions next to this one by fetching the regions of the parent state
            val adjacientRegions = (region.eContainer as State).regions.filter[!it.equals(region)];
            val outgoingDependencies = outgoingRegionDependencies.get(region);
            for (Region otherRegion : adjacientRegions) {
                // We now have two regions, so intersect the two sets of ValuedObjects and add these to the edge. 
                val incomingDependencies = incomingRegionDependencies.get(otherRegion);
                val commonDependencies = Sets.intersection(outgoingDependencies, incomingDependencies);
                // Ensure that we have some signals before creating the edge
                if (!commonDependencies.empty) {
                    val KEdge edge = createEdge => [
                        it.source = tracking.getTargetElements(region).filter(KNode).head;
                        it.target = tracking.getTargetElements(otherRegion).filter(KNode).head;
                        it.addPolyline => [
                            it.lineWidth = 2
                            it.lineStyle = LineStyle::DOT
                            // Default arrow head
                            it.addHeadArrowDecorator
                        ];
                    ];
                    edge.addCenterEdgeLabel(commonDependencies.join("\n", [
                        // Trace objects back to their source object to show proper names
                        mapping.get(it).filter(ValuedObject).head.name
                    ]));
                    // Set layout on the parent state
                    val parentNode = edge.source.parent;
                    parentNode.setLayoutOption(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
                    parentNode.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FREE)
                    if (edge.source.getProperty(CoreOptions::DIRECTION) == Direction.DOWN) {
                        parentNode.setLayoutOption(CoreOptions::DIRECTION, Direction.LEFT)
                    } else {
                        parentNode.setLayoutOption(CoreOptions::DIRECTION, Direction.DOWN)
                    }
                    edge.source.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FREE)
                    edge.target.setLayoutOption(CoreOptions::PORT_CONSTRAINTS, PortConstraints.FREE)
                }
            }
        }
    }

    /**
     * Find the common containing region of a group of SCChart objects. Common in this case means that 
     * we want all objects to be contained in the same region.
     */
    private def Region findContainingRegion(Iterable<EObject> objects) {
        var Region result;
        for (EObject source : objects) {
            var EObject obj = source;
            while (obj !== null && !(obj instanceof Region)) {
                obj = obj.eContainer;
            }
            if (obj !== null) {
                // See if the region is consistent for all mapped actions.
                // Usually this is not required because there should only be one Action or Valued Object
                // mapped to the Assignment. If for some unknown reason there are multiple sources of the
                // assignment, we at least want them to be in the same region.
                // Turns out this breaks with strong aborts which sometimes lead to an assignment being traced to
                // the the real assignment in the SCChart as well as the abort action on the surrounding state. 
                if (result !== null) {
                    if (!result.equals(obj)) {
                        // System.err.println("Different parent regions found for dependency")
                    }
                } else {
                    result = obj as Region;
                }
            }
        }
        return result;
    }

    /**
     * For each given dependency ensure that all parent regions also contain the same dependency.
     */    
    def propagateDependencies(HashMultimap<Region, ValuedObject> dependencies) {
        // Iterate over immutableCopy of the original set to separate iterator and modification
        for (Region region : dependencies.keySet?.immutableCopy) {
            val Collection<ValuedObject> deps = dependencies.get(region)
            var EObject obj = region;
            // Traverse the complete containing hierarchy 
            while (obj !== null) {
                if (obj instanceof Region) {
                    dependencies.putAll(obj as Region, deps);
                }
                obj = obj.eContainer;
            }
        }    
    }
}