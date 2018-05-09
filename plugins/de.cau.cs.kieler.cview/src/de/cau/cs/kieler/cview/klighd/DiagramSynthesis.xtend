package de.cau.cs.kieler.cview.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.cview.AbstractKLighDController
import de.cau.cs.kieler.cview.CViewPlugin
import de.cau.cs.kieler.cview.extensions.CViewAnalysisExtensions
import de.cau.cs.kieler.cview.extensions.CViewLanguageExtensions
import de.cau.cs.kieler.cview.hooks.AbstractCViewLanguage
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import de.cau.cs.kieler.cview.ui.FilterDialog
import de.cau.cs.kieler.klighd.KlighdConstants
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KSpline
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions
import de.cau.cs.kieler.klighd.util.KlighdProperties
import java.util.EnumSet
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedHashSet
import java.util.List
import org.eclipse.elk.core.math.KVector
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.emf.ecore.EObject
import org.eclipse.swt.widgets.Display

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.eclipse.elk.core.options.HierarchyHandling
//import org.eclipse.elk.alg.layered.properties.LayeredMetaDataProvider
//import org.eclipse.elk.alg.layered.p3order.CrossingMinimizationStrategy
//import org.eclipse.elk.alg.force.properties.StressOptions
import java.util.ArrayList
import org.eclipse.elk.core.data.LayoutAlgorithmData
import de.cau.cs.kieler.klighd.IViewChangeListener.ViewChange
//newer since 3.0: import org.eclipse.elk.alg.force.options.ForceOptions
import org.eclipse.elk.alg.force.properties.ForceOptions
//newer since 3.0: import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.alg.layered.properties.LayeredOptions

import org.eclipse.elk.alg.force.options.ForceModelStrategy

//newer since 3.0 import org.eclipse.elk.alg.layered.options.GreedySwitchType
import org.eclipse.elk.alg.layered.properties.GreedySwitchType

//newer: import org.eclipse.elk.alg.force.model.ForceModelStrategy

/* Package and import statements... */
class DiagramSynthesis extends AbstractDiagramSynthesis<CViewModel> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KColorExtensions

    @Inject extension CViewAnalysisExtensions
    @Inject extension CViewModelExtensions
    @Inject extension CViewLanguageExtensions

    public static boolean parseFiles = false;
    public static boolean parseFilesOld = false;
    public static int reparsingHashOld = -1;
    public static boolean skipFileContent = false;

    public static DiagramSynthesis instance = null;

    public static int lastThread = 0

    // extension KRenderingFactory = KRenderingFactory.eINSTANCE
    public static final String SELECTION_CONNECTION_COLOR = "Red"

    public static final int DEFAULT_EXPANDED_VALUE = 2;
    public static final int MAX_EXPANDED_VALUE = 7;
    public static final int MIN_EXPANDED_VALUE = 1;

    public static final int COMBINED_LINE_WIDTH_MAX = 10
    public static final int COMBINED_LINE_WIDTH_GAIN = 1
    public static final int COMBINED_LINE_WIDTH_MIN = 1

    // The maximum line with to draw, if this is higher than the actual line with 
    // calculated is reduced linearly.
    private int combinedLineWidthMeasuredMax = COMBINED_LINE_WIDTH_MAX;

    public static int selectedExpandLevel = DEFAULT_EXPANDED_VALUE;

    /** Option for enabling adaptive zoom */
    public static final SynthesisOption EXPANDED_SLIDER = SynthesisOption.createRangeOption("Expanded Layers",
        MIN_EXPANDED_VALUE, MAX_EXPANDED_VALUE + 1, 1, DEFAULT_EXPANDED_VALUE);
    public static int lastExpandedValue = DEFAULT_EXPANDED_VALUE;

	// Flatten Hierarchy is by default chosen as true, so the force directed layout is actually drawn
    public static final SynthesisOption FLATTEN_HIERARCHY = SynthesisOption.createCheckOption(
        "Flatten Hierarchy", false);

    public static final SynthesisOption HIERARCHY_HANDLING = SynthesisOption.createCheckOption("Hierarchy Routing",
        false);

    public static final SynthesisOption SKIP_FILE_CONTENT = SynthesisOption.createCheckOption("Skip File Content",
        false);

    public static final SynthesisOption INTERLEVEL_CONNECTIONS = SynthesisOption.createCheckOption(
        "Interlevel Connections", false);

    public static final SynthesisOption HIDE_CONNECTIONS = SynthesisOption.createCheckOption("Hide Connections", false);

    public static final SynthesisOption COMBINE_CONNECTIONS = SynthesisOption.createCheckOption("Combine Connections",
        true);
        
    public static final SynthesisOption DEV_MODE = SynthesisOption.createCheckOption("Developer Mode",
        false);

    public static final SynthesisOption HIDE_UNCONNECTED = SynthesisOption.createCheckOption("Hide Unconnected", true);

    public static final SynthesisOption SHOW_HIDDEN = SynthesisOption.createCheckOption("Show Hidden", false);

    public static final SynthesisOption ANONYMIZE = SynthesisOption.createCheckOption("Anonymize", false);
    
    public static final SynthesisOption SHOW_HIERARCHY_IN_CONNECTIONS = SynthesisOption.createCheckOption("Show Hierarchy in Connections", false)
    
    // Adds the layout algorithm option. By default, force directed is chosen.
    public static final SynthesisOption LAYOUT_ALGORITHM = SynthesisOption.createChoiceOption("Layout Algorithm", #["Layer Based", "Force Directed", "Stress Based"], "Layer Based")

    public static final float LINEWIDTH = 1.8f
    public static final float ROUNDRECT1 = 4
    public static final float ROUNDRECT2 = 4

    public static final String FOLDERCOLOR0 = "#F4F59C"
    public static final String FOLDERCOLOR1 = "#FBFC97"
    public static final String FOLDERCOLOR2 = "#E7E853"
    public static final int FOLDERCOLORANGLE = 30

    static final String COLOR_GRAYEDOUT = "#E0E0E0"

	
    val HashSet<Component> connectedComponents = new HashSet
    val HashSet<Component> connectedComponentsAdditional = new HashSet // thru hierarchy
    // needed for regarding combining of simple connections
    val HashMap<String, Integer> sourceDest2Number = newHashMap
    val HashMap<Connection, Connection> masterConnectionMap = newHashMap
    val HashMap<String, Connection> sourceDest2MasterConnection = newHashMap
    val HashMap<String, KEdge> sourceDest2Edge = newHashMap

    val ArrayList<SimpleConnection> simpleConnections = newArrayList

//    var num = 0
    // ================================================================= //
    // ==                     MAIN TRANSFORM                          == //
    // ================================================================= //
    //
    override KNode transform(CViewModel model) {
        printlnConsole("INFO: Started diagram synthesis")
        if(CViewPlugin.refreshPressed || CViewPlugin.isDiagramSynthesisActive) {
        	CViewPlugin.refreshPressed = false;
	        // Update synthesis
	        for (language : CViewPlugin.getRegisteredLanguageHooks(false)) {
	            if (language instanceof AbstractCViewLanguage) {
	                language.setLastViewContext(this.getUsedContext())
	            }
	        }
			
			
			if(CViewPlugin.isDiagramSynthesisActive && !CViewPlugin.deactivateVisualization) {
		        val reparsingHashNew = reparsingHash
		        var reparsingHashChanged = false
		        // TODO @cmot: Do not reparse on the first run
		        if(reparsingHashOld == -1) {
		        	reparsingHashOld = reparsingHashNew
		        }
		        
		        if (reparsingHashOld != reparsingHashNew) {
		            reparsingHashOld = reparsingHashNew
		            reparsingHashChanged = true
		        }
		        parseFiles = reparsingRequired
		        if (parseFiles != parseFilesOld || reparsingHashChanged) {
		            parseFilesOld = parseFiles
		            if (CViewPlugin.monitorCanceled || reparsingHashChanged) {
		            	if(CViewPlugin.isDiagramSynthesisActive) {
			                CViewPlugin.rebuildModelAndrefreshCView(CViewPlugin.monitorCanceled)            		
		            	}
		                return null;
		            } else {
		                CViewPlugin.refreshCView(false)
		            }
		        }
			}
	
	        if (skipFileContent != SKIP_FILE_CONTENT.booleanValue) {
	            skipFileContent = SKIP_FILE_CONTENT.booleanValue
	            if(CViewPlugin.isDiagramSynthesisActive) {
	            	CViewPlugin.rebuildModelAndrefreshCView(true)            	
	            }
	            return null;
	        }
	
	        instance = this
			
	        if (selectedExpandLevel != EXPANDED_SLIDER.intValue && !CViewPlugin.deactivateVisualization) {
	            selectedExpandLevel = EXPANDED_SLIDER.intValue
	            
	            // TODO @cmot: Incorporating new options and required options
	            if (!FLATTEN_HIERARCHY.booleanValue && !CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
	            		&& !(LAYOUT_ALGORITHM.objectValue == "Force Directed") && !(LAYOUT_ALGORITHM.objectValue == "Stress Based")) {
	                Display.getDefault().asyncExec(new Runnable() {
	                    override run() {
	                        lastThread++
	                        val threadId = lastThread
	                        Thread.sleep(150);
	                        if (threadId == lastThread) {
	                            // If this is still the last thread, then do
	                            // refresh again. Otherwise the last thread will
	                            // do this
	                            CViewPlugin.refreshCView(true)
	                        }
	                    }
	                });
	            // return null;            
	            }
	        }
	
	        connectedComponents.clear
	        simpleConnections.clear
	
	        // Ensure filter values are set
	        FilterDialog.loadValues
	        // Clear filter cache
	        allowedByFilterCache.clear
	
	        if (ANONYMIZE.booleanValue) {
	            printlnConsole("INFO: - Anonymization")
	            // anonymize the model
	            for (component : model.components) {
	                component.name = component.name.possiblyAnonymize(true)
	                component.location = component.location.possiblyAnonymize(true)
	                component.tooltip = component.tooltip.possiblyAnonymize(false)
	                component.rawdata = component.rawdata.possiblyAnonymize(false)
	            }
	            for (connection : model.connections) {
	                connection.label = connection.label.possiblyAnonymize(true)
	                connection.tooltip = connection.tooltip.possiblyAnonymize(false)
	            }
	        }
	
	        val root = model.createNode().associateWith(model);
	        
	        // TODO @cmot: If the force directed layout algorithm is chosen, apply force directed options to the graph
	        if(LAYOUT_ALGORITHM.objectValue == "Force Directed") {
		        root.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.force")
		        root.addLayoutParam(ForceOptions::MODEL, ForceModelStrategy.FRUCHTERMAN_REINGOLD)
		        root.addLayoutParam(ForceOptions::TEMPERATURE, 0.01)
		        root.addLayoutParam(ForceOptions::ITERATIONS, 1000)
		        root.addLayoutParam(ForceOptions::SPACING_NODE_NODE, 200.0)
	        }
	        // TODO @cmot: If the layer based layout algorithm is chosen, apply layer based options to the graph
	        if(LAYOUT_ALGORITHM.objectValue == "Layer Based") {
		        if (HIERARCHY_HANDLING.booleanValue) {
		            root.addLayoutParam(CoreOptions::HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN)
		            // root.addLayoutParam(LayeredOptions::CROSSING_MINIMIZATION_STRATEGY, LayeredMetaDataProvider.CROSSING_MINIMIZATION_HIERARCHICAL_SWEEPINESS)
		            // root.addLayoutParam(LayeredOptions.CROSSING_MINIMIZATION_STRATEGY, CrossingMinimizationStrategy.INTERACTIVE);
		            root.addLayoutParam(LayeredOptions.CROSSING_MINIMIZATION_GREEDY_SWITCH_TYPE, GreedySwitchType.OFF);
		
		        // root.addLayoutParam(CoreOptions::HIERARCHY_HANDLING, HierarchyHandling.INCLUDE_CHILDREN)
		        }
	        }
	        
	        // TODO @cmot: If the stress based layout algorithm is chosen, apply stress based options to the graph
	        if(LAYOUT_ALGORITHM.objectValue == "Stress Based") {
	        	// TODO Currently, stress based options cannot be adapted (due to cast-errors)
	    		root.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.stress")
	        }
	        
	        val depth = 1;
	        // TODO @cmot: Draws edges first to layer them below nodes and labels. Does not currently work
	        // TODO: KNOWN ISSUE!
			usedContext.setProperty(KlighdProperties.EDGES_FIRST, true)
			
	        printlnConsole("INFO: - Apply filter")
	        if (FilterDialog.valueTextFilter.nullOrEmpty || FilterDialog.valueCheckDisabled || ANONYMIZE.booleanValue) {
	            // DO NOT apply filter if (1) empty filter text, (2) disabled, (3) anonymized is on 
	            CViewPlugin.setTitle(AbstractKLighDController.CVIEW_KLIGHD_TITLE)
	            model.removeFilter
	        } else {
	            model.applyFilter
	            CViewPlugin.setTitle(AbstractKLighDController.CVIEW_KLIGHD_TITLE_FILTERED)
	        }
	
	        // FLATTEN HIERARCHY: 
	        // Add components's KNodes to the root KNode as children
	        printlnConsole("INFO: - Drawing components")
	        for (item : model.components) {
	        	// TODO @cmot: Incorporating new options and required options
	            if (item.parent == null || FLATTEN_HIERARCHY.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
	            			|| LAYOUT_ALGORITHM.objectValue == "Force Directed" || LAYOUT_ALGORITHM.objectValue == "Stress Based") {
	                var skip = false;
	                if (FLATTEN_HIERARCHY.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
	                			|| LAYOUT_ALGORITHM.objectValue == "Force Directed" || LAYOUT_ALGORITHM.objectValue == "Stress Based") {
	                    if (EXPANDED_SLIDER.intValue < MAX_EXPANDED_VALUE && item.depth > EXPANDED_SLIDER.intValue) {
	                        skip = true
	                    }
	                }
	                if (!skip) {
	                    if (item.visibleInView) {
	                        val additionalItem = item.transformItem(depth)
	                        if (additionalItem != null) {
	                            root.children.add(additionalItem)
	                        }
	                    }
	                }
	            }
	        }
	        
	        // TODO @cmot: In stress based algorithm, add hierarchical edges before creating connections so that
	        // components will not be considered unconnected by the "consider connected" option
	        if(LAYOUT_ALGORITHM.objectValue == "Stress Based") {
				addHierarchicalEdges(model)
			}
	
	        // Create connections (added by extensions)
	        if (!HIDE_CONNECTIONS.booleanValue) {
	            printlnConsole("INFO: - Drawing connections")
	            // Reset both hashmaps jere
	            sourceDest2Number.clear
	            sourceDest2Edge.clear
	            masterConnectionMap.clear
	            sourceDest2MasterConnection.clear
	            portCache.clear
	            for (connection : model.connections) {
	                // Reset size for each pass
	                connection.size = 0
	            }
	            for (connection : model.connections) {
	                if (connection.visibleInView) {
	                    var connectionColor = "Black".color
	                    if (connection.color != null) {
	                        connectionColor = connection.color.color
	                    }
	                    connection.addConnection(INTERLEVEL_CONNECTIONS.booleanValue, connectionColor)
	                }
	            }
	
	            // Update (combined) line widths
	            for (simpleConnection : simpleConnections) {
	                simpleConnection.updateSimpleConnection
	            }
	            simpleConnections.updateCombinedLineWithMeasuredMax
	            for (simpleConnection : simpleConnections) {
	                simpleConnection.updateSimpleConnectionLineWith
	            }
	        }
	
	        if (HIDE_UNCONNECTED.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_HIDE_UNCONNECTED) || LAYOUT_ALGORITHM.objectValue == "Stress Based") {
	            printlnConsole("INFO: - Removing unconnected")
	            if (!INTERLEVEL_CONNECTIONS.booleanValue || (!FLATTEN_HIERARCHY.booleanValue && !CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
	            																			&& !(LAYOUT_ALGORITHM.objectValue == "Force Directed")
	            																			&& !(LAYOUT_ALGORITHM.objectValue == "Stress Based"))) {
	                // Consider connected and their parents
	                for (item : model.components) {
	                    if (!connectedComponents.contains(item) && !connectedComponentsAdditional.contains(item)) {
	                        item.node.remove
	                    }
	                }
	            } else {
	                // Only consider connected if interlevel + flattened
	                for (item : model.components) {
	                    if (!connectedComponents.contains(item)) {
	                        item.node.remove
	                    }
	                }
	            }
	        }
	
	        printlnConsole("INFO: Done diagram synthesis")
			
			// TODO @cmot: Add Hierarchical edges
			if(SHOW_HIERARCHY_IN_CONNECTIONS.booleanValue && (FLATTEN_HIERARCHY.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
																	|| LAYOUT_ALGORITHM.objectValue == "Force Directed")) {
				addHierarchicalEdges(model)
			}
			
	        if (root == null || root.children.size < 1) {
	            if (model.components.size > 0) {
	                root.children.add(transformInfoMessage("Everything Filtered Away", "GRAY"))
	                printlnConsole("INFO: Everything filtered away")
	            } else {
	            	if(CViewPlugin.deactivateVisualization) {
	            		root.children.add(transformInfoMessage("View Deactivated", "#FA8072"))
	            		printlnConsole("INFO: Visualization deactivated")
	            	} else {
		                root.children.add(transformInfoMessage("No Components", "GRAY"))
		                printlnConsole("INFO: No components")	            		
	            	}
	            }
	        }
	        
	        // TODO @cmot: Add am invisible "clickable" canvas that deselects highlighting
	        root.addInvisibleContainerRendering.addSingleClickAction(DeselectHighlightingAction.ID)
	        
	
	        return root;
        	
        } else {
        	
        	val elements = usedContext.getTargetElements(model)
        	if(elements.empty) {
        		return model.createNode().associateWith(model)
        	} else {
	        	return elements.get(0) as KNode        		
        	}
    	}
    }

    // ================================================================= //
    // ==                         COMPONENTS                         == //
    // ================================================================= //
    //
    def KNode transformItem(Component item, int depth) {
        if (item.isFile) {
            return item.transformItemFile(depth)
        } else if (item.isDir) {
            return item.transformItemDir(depth)
        } else if (item.isCustomType) {
            return item.transformItemCustom(depth)
        }
    }

    // ---------------------------------------------------------------------
    def KNode transformItemFile(Component item, int depth) {
        var itemColor = "WHITE"
        val opensInEditor = true
        val hierarchical = item.hieararchicalView(this)
        if (!hierarchical) {
            itemColor = COLOR_GRAYEDOUT
        }
        val toolTip = item.tooltip

        return item.transformItemGeneral(depth, itemColor, opensInEditor, hierarchical, toolTip)
    }

    // ---------------------------------------------------------------------
    def KNode transformItemCustom(Component item, int depth) {
        if (!item.language.diagramIsVisible(item)) {
            return null;
        }

        val itemColor = item.language.diagramColor(item)
        val opensInEditor = item.language.diagramOpensInEditor(item)
        val hierarchical = item.language.diagramIsHierarchical(item)
        val toolTip = item.language.diagramToolTip(item)

        return item.transformItemGeneral(depth, itemColor, opensInEditor, hierarchical, toolTip)
    }

    // ---------------------------------------------------------------------
    def KNode transformItemGeneral(
        Component item,
        int depth,
        String itemColor,
        boolean opensInEditor,
        boolean hierarchical,
        String toolTip
    ) {
        val childNodeOuter = item.createNode().associateWith(item);
        val rectCol = childNodeOuter.addRoundedRectangle(ROUNDRECT1, ROUNDRECT2, LINEWIDTH);
        rectCol.background = itemColor.color
        rectCol.selectionBackground = itemColor.color
        // TODO @cmot: Add new Actions
        rectCol.addSingleClickAction(EditorLinkageAction.ID);
        rectCol.addSingleClickAction(HighlightEdgesAction.ID)
        rectCol.addSingleClickAction(CollapseExpandNoDragAction.ID) // KlighdConstants::ACTION_COLLAPSE_EXPAND
        if (opensInEditor) {
            rectCol.addDoubleClickAction(OpenEditorAction.ID);
            // TODO @cmot: Add new Actions
            rectCol.addSingleClickAction(EditorLinkageAction.ID)
            rectCol.addSingleClickAction(HighlightEdgesAction.ID)
            rectCol.addSingleClickAction(OpenEditorAction.ID, false, true, false)
        } else {
            if (hierarchical) {
            	// TODO @cmot: Add new Actions
            	rectCol.addSingleClickAction(EditorLinkageAction.ID)
            	rectCol.addSingleClickAction(HighlightEdgesAction.ID)
                rectCol.addDoubleClickAction(CollapseExpandNoDragAction.ID);
            }
        }

        val rectExp = childNodeOuter.addRoundedRectangle(ROUNDRECT1, ROUNDRECT2, LINEWIDTH);
        rectExp.background = itemColor.color
        rectExp.selectionBackground = itemColor.color
        rectExp.addSingleClickAction(CollapseExpandNoDragAction.ID) // KlighdConstants::ACTION_COLLAPSE_EXPAND
        // TODO @cmot: Add new Actions
        rectExp.addSingleClickAction(EditorLinkageAction.ID)
        rectExp.addSingleClickAction(HighlightEdgesAction.ID)
        if (opensInEditor) {
            rectExp.addDoubleClickAction(OpenEditorAction.ID);
            // TODO @cmot: Add new Actions
            rectExp.addSingleClickAction(EditorLinkageAction.ID)
            rectExp.addSingleClickAction(HighlightEdgesAction.ID)
            rectExp.addSingleClickAction(OpenEditorAction.ID, false, true, false)
        } else {
            if (hierarchical) {
                rectExp.addDoubleClickAction(CollapseExpandNoDragAction.ID);
            }
        }

        childNodeOuter.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

        val itemLabel = item.name
        val label = childNodeOuter.addInsideTopCenteredNodeLabel(itemLabel, KlighdConstants.DEFAULT_FONT_SIZE,
            KlighdConstants.DEFAULT_FONT_NAME);
        label.associateWith(item)
        label.firstText.selectionBackground = itemColor.color
        if (toolTip != null) {
            rectCol.setProperty(KlighdProperties::TOOLTIP, toolTip);
            rectExp.setProperty(KlighdProperties::TOOLTIP, toolTip);
            label.firstText.setProperty(KlighdProperties::TOOLTIP, toolTip);
        }
        if (opensInEditor) {
            label.firstText.addDoubleClickAction(OpenEditorAction.ID);
            label.firstText.addSingleClickAction(OpenEditorAction.ID, false, true, false)
        }
        // TODO @cmot: Add new Actions
        label.firstText.addSingleClickAction(EditorLinkageAction.ID)
        label.firstText.addSingleClickAction(HighlightEdgesAction.ID)

        if (hierarchical && !(FLATTEN_HIERARCHY.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
        													|| LAYOUT_ALGORITHM.objectValue == "Force Directed"
        													|| LAYOUT_ALGORITHM.objectValue == "Stress Based")) {
            // Hierarchical case
            label.firstText.addSingleClickAction(CollapseExpandNoDragAction.ID) // KlighdConstants::ACTION_COLLAPSE_EXPAND
            val childArea = item.children.createNode().associateWith(item)
            val childAreaRect = childArea.addRoundedRectangle(1, 1, 1)
            childAreaRect.background = "WHITE".color;
            childAreaRect.selectionBackground = "WHITE".color;
            childAreaRect.foreground = "GRAY".color;
            label.firstText.setAreaPlacementData().from(LEFT, -2, 0, TOP, -4, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
            childNodeOuter.children.add(childArea)
            childArea.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

            val shouldExpand = (EXPANDED_SLIDER.intValue > MAX_EXPANDED_VALUE || EXPANDED_SLIDER.intValue > depth)

            childNodeOuter.setProperty(KlighdProperties.EXPAND, shouldExpand);

            if (!FLATTEN_HIERARCHY.booleanValue && !CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
            									&& !(LAYOUT_ALGORITHM.objectValue == "Force Directed")
            									&& !(LAYOUT_ALGORITHM.objectValue == "Stress Based")) {
                for (child : item.children) {
                    if (child.visibleInView) {
                        val additionalItem = child.transformItem(depth + 1);
                        if (additionalItem != null) {
                            childArea.children += additionalItem
                        }
                    }
                }
            }
        }
        return childNodeOuter
    }

    // ---------------------------------------------------------------------
    def KNode transformItemDir(Component item, int depth) {
        val childNodeOuter = item.createNode().associateWith(item);

        val rectCol = childNodeOuter.addRoundedRectangle(3, 3, LINEWIDTH);
        rectCol.selectionBackground = FOLDERCOLOR1.color;
        rectCol.selectionForeground = "black".color;
        rectCol.background = FOLDERCOLOR1.color;
        rectCol.setBackgroundGradient(FOLDERCOLOR1.color, FOLDERCOLOR2.color, FOLDERCOLORANGLE);
        rectCol.addSingleClickAction(CollapseExpandNoDragAction.ID) // KlighdConstants::ACTION_COLLAPSE_EXPAND
        // TODO @cmot: Add new Actions
        rectCol.addSingleClickAction(EditorLinkageAction.ID)
        rectCol.addSingleClickAction(HighlightEdgesAction.ID)
        rectCol.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        val rectExp = childNodeOuter.addRoundedRectangle(3, 3, LINEWIDTH);
        rectExp.background = FOLDERCOLOR1.color;
        rectExp.setBackgroundGradient(FOLDERCOLOR1.color, FOLDERCOLOR2.color, FOLDERCOLORANGLE);
        rectExp.selectionBackground = FOLDERCOLOR1.color;
        rectExp.selectionForeground = "black".color;
        rectExp.addSingleClickAction(CollapseExpandNoDragAction.ID) // KlighdConstants::ACTION_COLLAPSE_EXPAND
        // TODO @cmot: Add new Actions
        rectExp.addSingleClickAction(EditorLinkageAction.ID)
        rectExp.addSingleClickAction(HighlightEdgesAction.ID)
        rectExp.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
        childNodeOuter.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

        val itemLabel = item.name
        val label = childNodeOuter.addInsideTopCenteredNodeLabel(itemLabel, KlighdConstants.DEFAULT_FONT_SIZE,
            KlighdConstants.DEFAULT_FONT_NAME);
        label.associateWith(item)
        label.firstText.selectionBackground = FOLDERCOLOR1.color;
        // TODO @cmot: Add new Actions
        label.firstText.addSingleClickAction(EditorLinkageAction.ID)
        label.firstText.addSingleClickAction(HighlightEdgesAction.ID)

        if (item.hieararchical && !(FLATTEN_HIERARCHY.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
        															|| LAYOUT_ALGORITHM.objectValue == "Force Directed"
        															|| LAYOUT_ALGORITHM.objectValue == "Stress Based")) {
            // Hierarchical case
            label.firstText.addSingleClickAction(CollapseExpandNoDragAction.ID) // KlighdConstants::ACTION_COLLAPSE_EXPAND
            label.firstText.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            val childArea = item.children.createNode().associateWith(item)
            val childAreaRect = childArea.addRoundedRectangle(1, 1, 1)
            childAreaRect.background = "WHITE".color;
            childAreaRect.selectionBackground = "WHITE".color;
            childAreaRect.foreground = "GRAY".color;
            label.firstText.setAreaPlacementData().from(LEFT, -2, 0, TOP, -4, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
            childNodeOuter.children.add(childArea)
            childArea.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

            val shouldExpand = (EXPANDED_SLIDER.intValue > MAX_EXPANDED_VALUE || EXPANDED_SLIDER.intValue > depth)

            childNodeOuter.setProperty(KlighdProperties.EXPAND, shouldExpand);
            
			// TODO @cmot: Incorporating new options and required options
            if (!FLATTEN_HIERARCHY.booleanValue && !CViewPlugin.isOptionRequired(CViewPlugin.OPTION_FLATTEN_HIERARCHY) 
            									&& !(LAYOUT_ALGORITHM.objectValue == "Force Directed")
            									&& !(LAYOUT_ALGORITHM.objectValue == "Stress Based")) {
                for (child : item.children) {
                    if (child.visibleInView) {
                        val additionalItem = child.transformItem(depth + 1);
                        if (additionalItem != null) {
                            childArea.children += additionalItem
                        }
                    }
                }
            }
        }

        return childNodeOuter
    }

    // ================================================================= //
    // ==                      CONNECTIONS                            == //
    // ================================================================= //
    //
    def boolean sameParent(Connection connection) {
        return (connection.src.sameParent(connection.dst))
    }

    // ---------------------------------------------------------------------
    def boolean sameParent(Component component1, Component component2) {
        if ((component1 != null) && (component2 != null)) {
            return component1.parent == component2.parent
        } else if ((component1 == null) && (component2 == null)) {
            return true
        }
        return false
    }

    // ---------------------------------------------------------------------
    def void addConnection(Connection connection, boolean interLevelConnections, KColor color) {
        if (interLevelConnections) {
            addSimpleConnectionPossiblyCombined(connection, connection.src.node, connection.dst.node, false, color,
                true);
        } else {
            if (connection.sameParent) {
                addSimpleConnectionPossiblyCombined(connection, connection.src.node, connection.dst.node, true, color,
                    true);
            } else {
                addPortbasedConnection(connection, connection.src, connection.dst, color);
            }

        }
    }

    // ---------------------------------------------------------------------
    def void addPortbasedConnection(Connection connection, Component src, Component dst, KColor color) {
        var srcComponent = src
        var dstComponent = dst
        connectedComponents.add(connection.src)
        connectedComponents.add(connection.dst)
        connection.src.addConnectedParents
        connection.dst.addConnectedParents
        if (srcComponent.sameParent(dstComponent)) {
            // Can connect on same level!
            connection.addSimpleConnectionPossiblyCombined(srcComponent.node, dstComponent.node, true, color, true)
        } else if (srcComponent.parent == dstComponent) {
            connection.addParentConnection(srcComponent, true, true, color)
        } else if (dstComponent.parent == srcComponent) {
            connection.addParentConnection(dstComponent, false, true, color)
        } else {
            val depthSrc = srcComponent.depth
            val depthDst = dstComponent.depth
            if (depthSrc != depthDst) {
                var boolean sourceDeeper = false
                if (depthSrc > depthDst) {
                    // source is deeper, connect it to its parent
                    sourceDeeper = true
                    val parentSrc = connection.addParentConnection(srcComponent, true, true, color)
                    // Continue recursion
                    if (parentSrc != null) {
                        connection.addPortbasedConnection(parentSrc, dstComponent, color)
                    }
                    return
                } else {
                    // dest is deeper, connect it to its parent
                    val parentDst = connection.addParentConnection(dstComponent, false, true, color)
                    // Continue recursion
                    if (parentDst != null) {
                        connection.addPortbasedConnection(srcComponent, parentDst, color)
                    }
                    return
                }
            } else {
                // At this point srcComponent and destComponent have same level
                // NOW go one level up until we reach the same parent, then simple connect
                // on that level
                val parentSrc = connection.addParentConnection(srcComponent, true, true, color)
                val parentDst = connection.addParentConnection(dstComponent, false, true, color)
                // Continue recursion
                if (parentSrc != null && parentDst != null) {
                    connection.addPortbasedConnection(parentSrc, parentDst, color)
                }
            }
        }
    }

    // ---------------------------------------------------------------------
    def Component addParentConnection(Connection connection, Component component, boolean directionToParent,
        boolean usePorts, KColor color) {
        if (component.parent == null) {
            return null
        }
        if (directionToParent) {
            addSimpleConnectionPossiblyCombined(connection, component.node, component.parent.node, usePorts, color,
                false)
        } else {
            addSimpleConnectionPossiblyCombined(connection, component.parent.node, component.node, usePorts, color,
                false)
        }
        return component.parent
    }

    // ---------------------------------------------------------------------
    def String getKey(Connection connection, KNode srcNode, KNode dstNode) {
        var connectionTypeHash = 0
        if (connection != null && connection.type != null) {
            connectionTypeHash = connection.type.hashCode
        }
//        dstNode.hashCode + "." + connectionTypeHash
        srcNode.hashCode + "." + dstNode.hashCode + "." + connectionTypeHash
    }

    def int getMaxSrcDstNumber(CViewModel model) {
        var int returnValue = 0;
        for (value : sourceDest2Number.values) {
            if (value > returnValue) {
                returnValue = value
            }
        }
        return returnValue
    }

    def int getSrcDstNumber(Connection connection, KNode srcNode, KNode dstNode) {
        val srcDstKey = connection.getKey(srcNode, dstNode)
        if (sourceDest2Number.containsKey(srcDstKey)) {
            return sourceDest2Number.get(srcDstKey)
        }
        return -1
    }

    // Add a simple connection or combine with an existing one
    def void addSimpleConnectionPossiblyCombined(Connection connection, KNode srcNode, KNode dstNode, boolean usePorts,
        KColor color, boolean addLabel) {

        if (!COMBINE_CONNECTIONS.booleanValue && !CViewPlugin.isOptionRequired(CViewPlugin.OPTION_COMBINE_CONNECTIONS)) {
            addSimpleConnection(connection, srcNode, dstNode, usePorts, color, addLabel)
        } else {
            // Key regarding type, src, dst    
            val srcDstKey = connection.getKey(srcNode, dstNode) // srcNode.hashCode + "." + dstNode.hashCode + "." + connection.type.hashCode
            val currentNumber = connection.getSrcDstNumber(srcNode, dstNode)
            if (currentNumber >= 0) {
                // not the first connection from src to dst
                sourceDest2Number.put(srcDstKey, currentNumber + 1)

                addSimpleConnection(connection, srcNode, dstNode)
                val masterConnection = sourceDest2MasterConnection.get(srcDstKey)
                if (masterConnection != null) {
                    masterConnectionMap.put(connection, masterConnection)
                }
            } else {
                // first connection form src to dst
                addSimpleConnection(connection, srcNode, dstNode, usePorts, color, addLabel)
                sourceDest2Number.put(srcDstKey, 0)
                // println("PUT(" + srcDstKey + ") " + " 0 : " + srcNode.toString + " --> " + dstNode.toString)
                val masterConnection = connection
                sourceDest2MasterConnection.put(srcDstKey, masterConnection)
            // masterConnectionMap.put(masterConnection, masterConnection)
            }
        }
    }

    // Calculate the relative (actual) line with linearly to the maximal number
    // and respecting the maximal line with measured.   
    def int getActualLineWidth(int relativeLineWith) {
    	// Corrected calculation TODO @cmot
        var returnLineWidth = (((relativeLineWith + 1) * COMBINED_LINE_WIDTH_GAIN) *
            COMBINED_LINE_WIDTH_MAX) / combinedLineWidthMeasuredMax
        println(relativeLineWith + " >>> " + returnLineWidth)
        if (returnLineWidth < COMBINED_LINE_WIDTH_MIN) {
            return COMBINED_LINE_WIDTH_MIN
        }
        return returnLineWidth
    }

    static class SimpleConnection {
        public Connection connection
        public int combinedNumber
        public KNode srcNode
        public KNode dstNode
        public String key
        public KEdge edge
    }

    def void addSimpleConnection(Connection connection, KNode srcNode, KNode dstNode) {
        val key = connection.getKey(srcNode, dstNode)
        val edge = sourceDest2Edge.get(key)
        if (edge != null) {
            // Remember simple connections
            var simpleConnection = new SimpleConnection
            simpleConnection.connection = connection
            simpleConnection.srcNode = srcNode
            simpleConnection.dstNode = dstNode
            simpleConnection.key = key
            simpleConnection.edge = edge
            simpleConnections.add(simpleConnection)
        }
    }

    def void updateCombinedLineWithMeasuredMax(List<SimpleConnection> simpleConnections) {
        combinedLineWidthMeasuredMax = 0
        for (simpleConnection : simpleConnections) {
            if (simpleConnection.combinedNumber > combinedLineWidthMeasuredMax) {
                combinedLineWidthMeasuredMax = simpleConnection.combinedNumber
            }
        }
        if (combinedLineWidthMeasuredMax < COMBINED_LINE_WIDTH_MAX) {
            combinedLineWidthMeasuredMax = COMBINED_LINE_WIDTH_MAX
        }
    }

    def void updateSimpleConnection(SimpleConnection simpleConnection) {
        val currentNumber = simpleConnection.connection.getSrcDstNumber(simpleConnection.srcNode, simpleConnection.dstNode)
        println("[[[ "+currentNumber+" ]]]")
        simpleConnection.combinedNumber = currentNumber
        var tooltipText = simpleConnection.connection.tooltip
        if (currentNumber > 0) {
            // Show connection size (combined)
            var connectionName = ""
            if(DEV_MODE.booleanValue) {
            	connectionName = simpleConnection.connection.type
            } else {
            	if(simpleConnection.connection.type != null) {
	            	val conHelper = simpleConnection.connection.type.split("\\.")
	            	connectionName = conHelper.last            		
            	} else {
            		if(DEV_MODE.booleanValue) {
            			connectionName = "#NO TYPE ID SPECIFIED#"
            		}
            		connectionName = "unknown"
            	}
            }
            tooltipText = (currentNumber + 1) + " connections of type " + connectionName + " combined"
        }
        simpleConnection.edge.setProperty(KlighdProperties::TOOLTIP, tooltipText);
        if (simpleConnection.edge.labels.size > 0) {
            simpleConnection.edge.labels.get(0).setProperty(KlighdProperties::TOOLTIP, tooltipText);
        }
    }

    // Update all simple connections with the correct line with (w.r.t. the maximal used line with)
    def void updateSimpleConnectionLineWith(SimpleConnection simpleConnection) {
        val combinedLinewWidth = simpleConnection.combinedNumber.getActualLineWidth
        simpleConnection.edge.line.lineWidth = combinedLinewWidth
    }

    def boolean isAnyParentFrom(KNode anyParentNode, KNode childNode) {
        if (childNode == anyParentNode) {
//            if (!childNode.incomingEdges.nullOrEmpty) {
//                childNode.incomingEdges.get(0).source.isAnyParentFrom()   
//            }
            return false
        } else if (childNode.parent != null && childNode.parent == anyParentNode) {
            return true
        } else if (childNode.parent == null) {
            return false
        } else {
            return anyParentNode.isAnyParentFrom(childNode.parent)
        }
    }

    def void addSimpleConnection(Connection connection, KNode srcNode, KNode dstNode, boolean usePorts, KColor color,
        boolean addLabel) {
        connectedComponents.add(connection.src)
        connectedComponents.add(connection.dst)
        connection.src.addConnectedParents
        connection.dst.addConnectedParents
        val connectionObject = (connection.hashCode + srcNode.hashCode)
        val edge = connectionObject.createEdge()
        val key = connection.getKey(srcNode, dstNode)
        edge.hashCode
        sourceDest2Edge.put(key, edge)
        val edgePolyline = edge.addPolyline(2)
        val arrowRendering = edgePolyline.addHeadArrowDecorator();
        arrowRendering.background = color.copy
        arrowRendering.foreground = color.copy
        edge.source = srcNode
        edge.target = dstNode
        edge.line.foreground = color.copy
        edgePolyline.addDoubleClickAction(OpenEditorForConnectionAction.ID)
        // TODO @cmot: Associate edge also with connection
        edge.associateWith(connection);
        if (addLabel) {
            // Add Label only if top-most layer for this connection
            edge.addLabel(connection.label).associateWith(connection);
        }
//        edge.addLabel("" + num++)
//        edge.setProperty(KlighdProperties::TOOLTIP, "" + num);
        if (connection.tooltip != null) {
            var tooltipText = connection.tooltip
            edge.setProperty(KlighdProperties::TOOLTIP, tooltipText);
            if (edge.labels.size > 0) {
                edge.labels.get(0).setProperty(KlighdProperties::TOOLTIP, tooltipText);
            }
        }

        if (usePorts) {
            // Add the connection
            var portId = connection.hashCode.toString
//            var portSideDest = PortSide::WEST
            if (COMBINE_CONNECTIONS.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_COMBINE_CONNECTIONS)) {
//                val srcDstKey = connection.getKey(srcNode, dstNode)
//                val currentNumber = connection.getSrcDstNumber(srcNode, dstNode)
//                println("GET("+srcDstKey+") "  + currentNumber + " : " + srcNode.toString + " --> " + dstNode.toString)
//                if (currentNumber > -1) {
//                    portId = srcDstKey
//                }
//                val masterConnection = masterConnectionMap.get(connection)
//                if (masterConnection != null) {
//                    portId = masterConnection.hashCode.toString
//                }
            }
            // Todo: if masterConnection exists, then REUSE port!!!!
            // val forward = (masterConnectionMap.get(connection) == null)
//            var sideFrom = PortSide::EAST
//            var sideTo = PortSide::WEST
//            if (!forward) {
//                sideFrom = PortSide::WEST
//                sideTo = PortSide::EAST
//            }
            // Need to detect if from inside to outside (= port right), or from outside to inside (=port left)
            //
            // [  inside  --o]o--> outside
            //
            // outside --o[o--> inside  ]
            //
            var srcSide = PortSide::EAST
            var dstSide = PortSide::WEST
            var insideToOutside = false
            var outsideToInside = false
            var DIR = "FLAT ->"
            if (COMBINE_CONNECTIONS.booleanValue || CViewPlugin.isOptionRequired(CViewPlugin.OPTION_COMBINE_CONNECTIONS)) {
                insideToOutside = dstNode.isAnyParentFrom(srcNode)
                outsideToInside = srcNode.isAnyParentFrom(dstNode)
                if (insideToOutside) {
                    DIR = "IN -> OUT"
                    srcSide = PortSide::EAST
                    dstSide = PortSide::EAST
                } else if (outsideToInside) {
                     DIR = "OUT -> IN"
                    srcSide = PortSide::WEST
                    dstSide = PortSide::WEST
                } else {
                    srcSide = PortSide::EAST
                    dstSide = PortSide::WEST
                }
            }

            var srcPortId = portId + srcNode.hashCode
            var dstPortId = portId + dstNode.hashCode
 
            val KPort srcPort = srcNode.retrievePort(connection, srcPortId, 0, 0, 8, srcSide, color, false)
            var KPort dstPort = dstNode.retrievePort(connection, dstPortId, 0, 0, 8, dstSide, color, true)
            
//            try {
//                srcPort.addOutsidePortLabel(srcNode.labels.get(0).text  + "->" + dstNode.labels.get(0).text + " [" + DIR + "] src " + srcSide.toString)
//                dstPort.addOutsidePortLabel(srcNode.labels.get(0).text + "->" + dstNode.labels.get(0).text + " [" + DIR + "] dst"  + dstSide.toString)
//            } catch(Exception e) {
//            }
            edge.sourcePort = srcPort
            edge.targetPort = dstPort
            edge.line.lineWidth = 1
            edge.line.setSelectionForeground(SELECTION_CONNECTION_COLOR.color)
            edge.line.setSelectionBackground(SELECTION_CONNECTION_COLOR.color)
            edge.line.foreground.propagateToChildren = true;
            edge.line.background.propagateToChildren = true;
        }
    		
    }

    // ---------------------------------------------------------------------
    HashMap<String, KPort> portCache = newHashMap()

    def KPort retrievePort(KNode node, Connection connection, Object mapping, float x, float y, int size, PortSide side,
        KColor color, boolean dst) {
        if (!COMBINE_CONNECTIONS.booleanValue && !CViewPlugin.isOptionRequired(CViewPlugin.OPTION_COMBINE_CONNECTIONS)) {
            return node.addPort(connection, mapping, x, y, size, side, color)
        } else {
            var portId = node.hashCode.toString + connection.dst.toString + side.hashCode + dst.hashCode
//            val masterConnection = masterConnectionMap.get(connection)
//            if (masterConnection != null) {
//                portId = node.hashCode.toString + masterConnection.hashCode
//                //portId = mapping.hashCode + ""
//            }
            if (portCache.containsKey(portId)) {
                val returnPort = portCache.get(portId)
                returnPort.addLayoutParam(CoreOptions::PORT_SIDE, side);
                return returnPort
            } else {
                val newPort = node.addPort(connection, mapping, x, y, size, side, color)
                newPort.addLayoutParam(CoreOptions::PORT_SIDE, side);
                portCache.put(portId, newPort)
                return newPort
            }
        }
    }

    def KPort addPort(KNode node, Connection connection, Object mapping, float x, float y, int size, PortSide side,
        KColor color) {
        val returnPort = node.createPort(mapping);
        // val returnPort = node.createPort(mapping);
        if (side != null) {
            node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
            returnPort.addLayoutParam(CoreOptions::PORT_SIDE, side);
        }
        val rect = returnPort.addRectangle
        node.addLayoutParam(CoreOptions::PORT_ANCHOR, new KVector(0, 100));
        rect.background = color.copy
        rect.foreground = "White".color
        rect.selectionBackground = SELECTION_CONNECTION_COLOR.color
        rect.selectionForeground = SELECTION_CONNECTION_COLOR.color
        rect.associateWith(connection)
        rect.associateWith(connection)
        returnPort.associateWith(connection)

        returnPort.setSize(size, size)
        returnPort.addRectangle.invisible = true;
        node.ports += returnPort
        return returnPort
    }

    // ---------------------------------------------------------------------
    // Remember connected connected components
    def void addConnectedParents(Component component) {
        if (component.parent != null) {
            connectedComponentsAdditional.add(component.parent)
            component.parent.addConnectedParents
        }
    }
    
    // ---------------------------------------------------------------------
    // TODO @cmot: Add hierarchical edges
    def void addHierarchicalEdges(CViewModel model) {
    	for(item : model.components) {
			val parent = item.parent
			if(parent != null) {
				val connection = item.connectTo(parent)
				connection.type = "de.cau.cs.kieler.cview.hierarchicalChild"
				connection.color = "#f0f0f0"
				connection.tooltip = "CHILD OF"
				addConnection(connection, false, connection.color.color)
			}
		}
    }

    // ================================================================= //
    // ==                    HELPER CONNECTION                        == //
    // ================================================================= //
    //
    private static val float CONNECTION_DASH_BLACK = 7;
    private static val float CONNECTION_DASH_WHITE = 3;
    private static val List<Float> CONNECTION_DASH_PATTERN = newArrayList(CONNECTION_DASH_BLACK, CONNECTION_DASH_WHITE);

    // ---------------------------------------------------------------------
    private def line(KEdge edge) {
        return edge.getKContainerRendering as KPolyline;
    }

    // ---------------------------------------------------------------------
    def setGrayStyle(KEdge edge) {
        edge.line => [
            foreground = Colors.GRAY_50
        ]
    }

    // ---------------------------------------------------------------------
    def KSpline addConnectionSpline(KEdge edge) {
        edge.addSpline => [
            lineWidth = 4;
        ]
    }

    // ---------------------------------------------------------------------
    def setDashedStyle(KEdge edge) {
        edge.line => [
            lineStyle = LineStyle::CUSTOM;
            lineStyle.dashPattern.clear;
            lineStyle.dashPattern += CONNECTION_DASH_PATTERN;
        ]
    }

    // ---------------------------------------------------------------------
    def KLabel addLabel(KEdge edge, String text) {
        val label = edge.createLabel;
        label.configureCenterEdgeLabel(text); // Add text
        label.getKRendering => [ // Configure text
            fontSize = 11;
            fontBold = true;
        ]
        return label;
    }

    // ================================================================= //
    // ==                        INFO MESSAGE                         == //
    // ================================================================= //
    //
    def KNode transformInfoMessage(String messageText, String color) {
        val childNode = messageText.createNode()
        val childRect = childNode.addRoundedRectangle(ROUNDRECT1, ROUNDRECT2, LINEWIDTH)
        val label = childNode.addInsideCenteredNodeLabel(messageText, KlighdConstants.DEFAULT_FONT_SIZE,
            KlighdConstants.DEFAULT_FONT_NAME)
        childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
            EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
        childRect.background = "WHITE".color
        childRect.selectionBackground = "WHITE".color
        childRect.foreground = color.color
        label.firstText.selectionBackground = "WHITE".color
        label.firstText.foreground = color.color
        return childNode
    }

    // ================================================================= //
    // ==                         FILTERING                          == //
    // ================================================================= //
    //
    // Speed up filtering
    val HashMap<EObject, Boolean> allowedByFilterCache 	= newHashMap
	val HashSet<Component> visited						= newHashSet

    // ---------------------------------------------------------------------
    def void applyFilter(CViewModel model) {
    	visited.clear
        for (component : model.components) {
            component.allowedByFilterComponentSearch(false)
        }
        
        // TODO @cmot: Only check for filtered out components after all components were checked. This way, 
        // all components will be considered after they were "updated" by neighbors.
        for(component : model.components) {
        	component.filtered = !(allowedByFilterCache.containsKey(component) && allowedByFilterCache.get(component))
        	// Also draw all parents, otherwise, a component will not be drawn.
        	if(!component.filtered) {
        		component.allowAlsoParent
        	}
        }
    }

    def void removeFilter(CViewModel model) {
        for (component : model.components) {
            component.filtered = false
        }
    }
    
    def void allowAlsoParent(Component component) {
    	var parent = component.parent
    	while(parent != null) {
    		parent.filtered = false
    		parent = parent.parent
    	}
    }
	
	
	
	def boolean allowedByFilterComponentSearch(Component component, boolean allowedByNeighbor) {
		if(visited.contains(component)) {
			if(allowedByFilterCache.containsKey(component)) {
				allowedByFilterCache.replace(component, allowedByFilterCache.get(component) || allowedByNeighbor)
			} else {
				allowedByFilterCache.put(component, allowedByNeighbor)				
			}
			return allowedByFilterCache.get(component)
		}
		visited.add(component)
		
		
		if(FilterDialog.valueCheckDisabled) {
			allowedByFilterCache.put(component, true)
			return true
		}
		
		if (FilterDialog.valueCheckTransitions || FilterDialog.valueTextFilter.nullOrEmpty) {
            // If connection-filter, then return here, allow all components
            allowedByFilterCache.put(component, true)
            return true
        }
        
        var allowed = false
        val level = component.depth - 1
        if(level < FilterDialog.valueLayerStart || (level > FilterDialog.valueLayerEnd &&
        											FilterDialog.valueLayerEnd < DiagramSynthesis.MAX_EXPANDED_VALUE)) {
    		// If hierarchy level is not to consider, then return
        	allowed = true
    	}
		
		if(!allowed) {
			var filter = FilterDialog.valueTextFilter
            var matching = false
            var whatToCheck = component.name
            if (!FilterDialog.valueCheckCaseSensitive) {
                whatToCheck = whatToCheck.toLowerCase
                filter = filter.toLowerCase
            }
            if (FilterDialog.valueCheckRegExp) {
                matching = whatToCheck.matches(filter);
            } else {
                matching = whatToCheck.contains(filter);
            }
            if (!FilterDialog.valueCheckNegative) {
                // non-matching items are filtered away: non-matching ==> false (not allowed)
                allowed = matching
            } else {
                // matching items are filtered away (negate options): matching ==> false (not allowed)
                allowed = !matching
            }
            // if consider connected
	        if (allowed && FilterDialog.valueCheckConnected) {
//	            val connectedComponents = component.getConnectedComponents(false, FilterDialog.valueCheckChilds, false,
//	                null)
//	            connectedComponents.addAll(
//	                component.getConnectedComponents(false, FilterDialog.valueCheckChilds, true, null))
	            // => allow also all connected
	            val connectedComponents = component.getAllImmediateConnections(true, true)
	            for (connectedComponent : connectedComponents) {
	                allowedByFilterComponentSearch(connectedComponent, true)
	            }
	        }
		}
		
		if (!allowed && FilterDialog.valueCheckChilds) {
            // Check if any child is allowed => allow this parent
            if (component.allowedByFilterAnyChild) {
                allowed = true
            }
        }
        // println("FILTER '" + component.name + "' --> " + allowed)
        allowedByFilterCache.put(component, allowed || allowedByNeighbor)
        return allowed || allowedByNeighbor;
	}
	
    // ---------------------------------------------------------------------
//    def boolean allowedByFilterComponent(Component component) {
//        if (FilterDialog.valueCheckDisabled) {
//            return true
//        }
//        if (FilterDialog.valueCheckTransitions || FilterDialog.valueTextFilter.nullOrEmpty) {
//            // If connection-filter, then return here, allow all components
//            return true
//        }
//        if (allowedByFilterCache.containsKey(component)) {
//            return allowedByFilterCache.get(component)
//        }
//        var allowed = false
//        val level = component.depth - 1
//        if (level < FilterDialog.valueLayerStart || (level > FilterDialog.valueLayerEnd &&
//            FilterDialog.valueLayerEnd < DiagramSynthesis.MAX_EXPANDED_VALUE)) {
//            // If hierarchy level is not to consider, then return
//            allowed = true
//        }
//        if (!allowed) {
//            var filter = FilterDialog.valueTextFilter
//            var matching = false
//            var whatToCheck = component.name
//            if (!FilterDialog.valueCheckCaseSensitive) {
//                whatToCheck = whatToCheck.toLowerCase
//                filter = filter.toLowerCase
//            }
//            if (FilterDialog.valueCheckRegExp) {
//                matching = whatToCheck.matches(filter);
//            } else {
//                matching = whatToCheck.contains(filter);
//            }
//            if (!FilterDialog.valueCheckNegative) {
//                // non-matching items are filtered away: non-matching ==> false (not allowed)
//                allowed = matching
//            } else {
//                // matching items are filtered away (negate options): matching ==> false (not allowed)
//                allowed = !matching
//            }
//        }
//        // if consider connected
//        if (allowed && FilterDialog.valueCheckConnected) {
//            val connectedComponents = component.getConnectedComponents(false, FilterDialog.valueCheckChilds, false,
//                null)
//            connectedComponents.addAll(
//                component.getConnectedComponents(false, FilterDialog.valueCheckChilds, true, null))
//            // => allow also all connected
//            for (connectedComponent : connectedComponents) {
//                allowedByFilterCache.put(connectedComponent, true)
//            }
//        }
//
//        if (!allowed && FilterDialog.valueCheckChilds) {
//            // Check if any child is allowed => allow this parent
//            if (component.allowedByFilterAnyChild) {
//                allowed = true
//            }
//        }
//        // println("FILTER '" + component.name + "' --> " + allowed)
//        allowedByFilterCache.put(component, allowed)
//        return allowed;
//    }

    // ---------------------------------------------------------------------
    def boolean allowedByFilterAnyChild(Component component) {
        for (childComponent : component.children) {
            if (childComponent.allowedByFilterAnyChildHelper) {
                return true
            }
        }
    }

    // ---------------------------------------------------------------------
    def boolean allowedByFilterAnyChildHelper(Component component) {
        if (component.allowedByFilterComponentSearch(false)) {
            return true
        }
        for (childComponent : component.children) {
            if (childComponent.allowedByFilterAnyChildHelper) {
                return true
            }
        }
        return false
    }

    // ---------------------------------------------------------------------
    def boolean allowedByFilterConnection(Connection connection) {
        if (FilterDialog.valueCheckDisabled) {
            return true
        }
        if (!FilterDialog.valueCheckTransitions || FilterDialog.valueTextFilter.nullOrEmpty) {
            // If component-filter, then return here, allow all connections
            return true;
        }
        if (allowedByFilterCache.containsKey(connection)) {
            return allowedByFilterCache.get(connection)
        }
        var allowed = false

        val level1 = connection.src.depth - 1
        val level2 = connection.dst.depth - 1
        val levelIgnore1 = (level1 < FilterDialog.valueLayerStart) || (level1 > FilterDialog.valueLayerEnd &&
            FilterDialog.valueLayerEnd < DiagramSynthesis.MAX_EXPANDED_VALUE)
        val levelIgnore2 = (level2 < FilterDialog.valueLayerStart) || (level2 > FilterDialog.valueLayerEnd &&
            FilterDialog.valueLayerEnd < DiagramSynthesis.MAX_EXPANDED_VALUE)

        if (levelIgnore1 || levelIgnore2) {
            // If hierarchy level is not to consider, then return
            allowed = true
        }

        if (!allowed) {
            var filter = FilterDialog.valueTextFilter
            var matching = false
            var whatToCheck = connection.label;
            if (!FilterDialog.valueCheckCaseSensitive) {
                whatToCheck = whatToCheck.toLowerCase
                filter = filter.toLowerCase
            }
            if (FilterDialog.valueCheckRegExp) {
                matching = whatToCheck.matches(filter);
            } else {
                matching = whatToCheck.contains(filter);
            }
            if (!FilterDialog.valueCheckNegative) {
                // non-matching items are filtered away: non-matching ==> false (not allowed)
                allowed = matching
            } else {
                // matching items are filtered away (negate options): matching ==> false (not allowed)
                allowed = !matching
            }
        }
        // if consider connected
        if (allowed && FilterDialog.valueCheckConnected) {
            val connectedComponents = connection.src.getConnectedComponents(false, FilterDialog.valueCheckChilds, true,
                null)
            connectedComponents.addAll(
                connection.src.getConnectedComponents(false, FilterDialog.valueCheckChilds, false, null))
            // => allow also all connected
            for (connectedComponent : connectedComponents) {
                allowedByFilterCache.put(connectedComponent, true)
            }
        }
        allowedByFilterCache.put(connection,
            allowed)
        return allowed;
    }

    // ================================================================= //
    // ==                    HELPER LOREIPSUM                         == //
    // ================================================================= //
    //
    val static LOREIPSUM = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.".
        fixId(
            false)
    val static LOREIPSUM_NOSPACE = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.".
            fixId(true)

        // ---------------------------------------------------------------------
        def String loreipsum(int start, int length, boolean nospace) {
            if (nospace) {
                return LOREIPSUM_NOSPACE.substring(start, start + length);
            } else {
                return LOREIPSUM.substring(start, start + length);
            }
        }

        // ---------------------------------------------------------------------
        def String possiblyAnonymize(String text, boolean nospace) {
            if (text != null && ANONYMIZE.booleanValue) {
                val lipsumLength = LOREIPSUM.length
                var length = text.trim.length
                if (length > lipsumLength) {
                    length = lipsumLength - 1
                }
                var div = (lipsumLength - length)
                if (div <= 0) {
                    div = 1
                }
                var startIndex = (text.hashCode % div) - length
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (startIndex + length > lipsumLength) {
                    length = lipsumLength - startIndex
                }
                var returnText = startIndex.loreipsum(length, nospace)
                return returnText.trim
            }
            return text
        }

        // ================================================================= //
        // ==                   SYNTHESIS OPTIONS                         == //
        // ================================================================= //
        //
        override getDisplayedSynthesisOptions() {
            val options = new LinkedHashSet();
            // Add general options
            options.addAll(DEV_MODE);
            options.addAll(EXPANDED_SLIDER);
            // Added layout algorithm option TODO @cmot
            options.addAll(LAYOUT_ALGORITHM);
            options.addAll(FLATTEN_HIERARCHY);
            options.addAll(SHOW_HIERARCHY_IN_CONNECTIONS);
            options.addAll(INTERLEVEL_CONNECTIONS);
            options.addAll(HIERARCHY_HANDLING)
            options.addAll(SKIP_FILE_CONTENT);
            options.addAll(HIDE_CONNECTIONS);
            options.addAll(COMBINE_CONNECTIONS);
            options.addAll(HIDE_UNCONNECTED);
            options.addAll(SHOW_HIDDEN);
            options.addAll(ANONYMIZE);
            // Add custom additional options here        
            for (language : CViewPlugin.getRegisteredLanguageHooks(false)) {
                val additionalOptions = language.diagramSynthesisOptions
                if (!additionalOptions.nullOrEmpty) {
                    options.addAll(additionalOptions)
                }
            }
            return options.toList;
        }

        // ================================================================= //
        // ==                     GENERAL HELPER                          == //
        // ================================================================= //
        //
        // Determine if the component is visible in the CView view
        def boolean visibleInView(Component component) {
            val returnValue = component.visible || (SHOW_HIDDEN.booleanValue && !component.filtered)
//            return true;
            // If it is visible anyway or if the user has choosen to show hidden
            return returnValue
        }

        def boolean visibleInView(Connection connection) {
//            return true;
            val returnValue = connection.visible || (SHOW_HIDDEN.booleanValue && !connection.filtered)
            // If it is visible anyway or if the user has choosen to show hidden
            return returnValue
        }

        //
        // The hash helps to detect if any reparsing option of any language is
        // toggled (or more).
        def int reparsingHash() {
            var returnHash = 0
            for (language : CViewPlugin.getRegisteredLanguageHooks(false)) {
                for (option : language.reparsingRequired()) {
                    returnHash = returnHash + option.booleanValue.hashCode
                }
            }
            return returnHash
        }

        // ---------------------------------------------------------------------
        // General look-up if some language wants/requires reparsing
        def boolean reparsingRequired() {
            for (language : CViewPlugin.getRegisteredLanguageHooks(false)) {
                for (option : language.reparsingRequired()) {
                    if (option.booleanValue) {
                        return true
                    }
                }
            }
            return false
        }

        // ---------------------------------------------------------------------
        def static String fixId(String name, boolean nospaces) {
            if (name == null) {
                return "Empty"
            }
            var returnName = name
            returnName = returnName.replace(".", "_")
            returnName = returnName.replace("#", "_")
            returnName = returnName.replace("&", "")
            returnName = returnName.replace(">", "")
            returnName = returnName.replace("<", "")
            returnName = returnName.replace(":", "")
            returnName = returnName.replace(";", "")
            returnName = returnName.replace(",", "_")
            if (nospaces) {
                returnName = returnName.replace(" ", "_")
            }
            returnName = returnName.replace("-", "")
            returnName = returnName.replace("*", "")
            returnName = returnName.replace("/", "")
            returnName = returnName.replace("\\", "")
            returnName = returnName.replace("\"", "")
            returnName = returnName.replace("'", "")
            returnName = returnName.replace("=", "Equals")
            return returnName
        }

    // ---------------------------------------------------------------------
	
	// TODO @cmot: Gets all children and childrens children
	def List<Component> getAllChildren(Component component) {
		val children = newArrayList
		
		for(child : component.children) {
			children.add(child)
			children.addAll(getAllChildren(child))
		}
		
		return children
	}
	
	// TODO @cmot: Returns all immediate connections of a component as well as all its parents (and parent's parents) and children
	// (and children's children) if desired
	def List<Component> getAllImmediateConnections(Component component, boolean considerChildren, boolean considerParent) {
    	val connections = newArrayList
    	for(con : component.outgoingConnections) {
    		connections.add(con.dst)
    	}
    	for(con : component.incomingConnections) {
    		connections.add(con.src)
    	}
    	
    	if(considerChildren) {
    		connections.addAll(component.getAllChildren)
    	}
    	
    	if(considerParent) {
    		var parent = component.parent
    		while(parent != null) {
    			connections.add(parent)
    			parent = parent.parent
    		}
    	}
    	
    	return connections
    }
    
}
    