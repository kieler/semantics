package de.cau.cs.kieler.cview.klighd

import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.kgraph.KNode
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.KlighdConstants
import java.util.EnumSet
import org.eclipse.elk.core.options.SizeConstraint
import de.cau.cs.kieler.klighd.syntheses.DiagramLayoutOptions
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.Colors
import org.eclipse.emf.ecore.EObject
import java.lang.Object
import org.eclipse.ui.texteditor.AbstractMarkerAnnotationModel
import de.cau.cs.kieler.cview.model.cViewModel.CViewModel
import java.util.HashMap
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.util.KlighdProperties
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.microlayout.Bounds

import static extension de.cau.cs.kieler.klighd.microlayout.PlacementUtil.*
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KNodeAbstractNode
import org.eclipse.emf.common.util.EList
import java.util.List
import de.cau.cs.kieler.klighd.piccolo.internal.nodes.KChildAreaNode
import de.cau.cs.kieler.klighd.SynthesisOption
import java.util.LinkedHashSet
import de.cau.cs.kieler.cview.model.cViewModel.Component
import de.cau.cs.kieler.cview.model.extensions.CViewModelExtensions
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.cview.model.cViewModel.Connection
import de.cau.cs.kieler.klighd.krendering.KSpline
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.kgraph.KLabel
import de.cau.cs.kieler.klighd.kgraph.KPort
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.alg.layered.properties.LayeredOptions
import de.cau.cs.kieler.klighd.krendering.LineCap
import de.cau.cs.kieler.klighd.krendering.LineJoin
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.EdgeRouting
import org.eclipse.elk.core.options.PortConstraints
import de.cau.cs.kieler.klighd.krendering.KStyle

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.eclipse.elk.core.options.Direction
import org.eclipse.elk.core.math.KVector
import java.util.HashSet
import de.cau.cs.kieler.cview.ui.FilterDialog
import de.cau.cs.kieler.cview.klighd.ExpandCollapseNoMouseMoveAction 
import de.cau.cs.kieler.cview.klighd.OpenEditorAction 

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
    @Inject extension CViewModelExtensions

    public static int selectedExpandLevel = 1;

    public static DiagramSynthesis instance = null;

    extension KRenderingFactory = KRenderingFactory.eINSTANCE

    public static final String SELECTION_CONNECTION_COLOR = "Red"

    public static final int DEFAULT_EXPANDED_VALUE = 2;
    public static final int MAX_EXPANDED_VALUE = 7;
    public static final int MIN_EXPANDED_VALUE = 1;

    /** Option for enabling adaptive zoom */
    public static final SynthesisOption EXPANDED_SLIDER = SynthesisOption.createRangeOption("Expanded Layers",
        MIN_EXPANDED_VALUE, MAX_EXPANDED_VALUE + 1, DEFAULT_EXPANDED_VALUE);
    public static int lastExpandedValue = DEFAULT_EXPANDED_VALUE;

    public static final SynthesisOption FLATTEN_HIERARCHY = SynthesisOption.createCheckOption(
        "Flatten Hierarchy", false);

    public static final SynthesisOption SHOW_FUNCTIONS = SynthesisOption.createCheckOption("Show Functions", false);

    public static final SynthesisOption INTERLEVEL_CONNECTIONS = SynthesisOption.createCheckOption(
        "Interlevel Connections", false);

    public static final SynthesisOption HIDE_CONNECTIONS = SynthesisOption.createCheckOption("Hide Connections", false);

    public static final SynthesisOption HIDE_UNCONNECTED = SynthesisOption.createCheckOption("Hide Unconnected", false);

    public static final SynthesisOption ANONYMIZE = SynthesisOption.createCheckOption("Anonymize", false);

    // public static final SynthesisOption FILTER_FILES = SynthesisOption.create RangeOption("Expanded Layers", MIN_EXPANDED_VALUE, MAX_EXPANDED_VALUE+1, DEFAULT_EXPANDED_VALUE);
    override getDisplayedSynthesisOptions() {
        val options = new LinkedHashSet();
        // Add general options
        options.addAll(EXPANDED_SLIDER);
        options.addAll(FLATTEN_HIERARCHY);
        options.addAll(SHOW_FUNCTIONS);
        options.addAll(INTERLEVEL_CONNECTIONS);
        options.addAll(HIDE_CONNECTIONS);
        options.addAll(HIDE_UNCONNECTED);
        options.addAll(ANONYMIZE);
        return options.toList;
    }

    val HashSet<Component> connectedComponents = new HashSet
    val HashSet<Component> connectedComponentsAdditional = new HashSet // thru hierarchy
    // val HashMap<Component, KNode> knodes = new HashMap
    val HashMap<EObject, Boolean> allowedByFilterCache = new HashMap

    def boolean allowedByFilterComponent(Component component) {
        if (FilterDialog.valueCheckTransitions || FilterDialog.valueTextFilter.nullOrEmpty) {
            // If connection-filter, then return here, allow all components
            return true
        }
        if (allowedByFilterCache.containsKey(component)) {
            return allowedByFilterCache.get(component)
        }
        var allowed = false
        val level = component.depth - 1
        if (level < FilterDialog.valueLayerStart || (level > FilterDialog.valueLayerEnd &&
            FilterDialog.valueLayerEnd < DiagramSynthesis.MAX_EXPANDED_VALUE)) {
            // If hierarchy level is not to consider, then return
            allowed = true
        }

        if (!allowed) {
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
        }
        if (!allowed && FilterDialog.valueCheckChilds) {
            // Check if any child is allowed => allow this parent
            if (component.allowedByFilterAnyChild) {
                allowed = true
            }
        }
        //println("FILTER '" + component.name + "' --> " + allowed)
        allowedByFilterCache.put(component, allowed)
        return allowed;
    }

    def boolean allowedByFilterAnyChild(Component component) {
        for (childComponent : component.children) {
            if (childComponent.allowedByFilterAnyChildHelper) {
                return true
            }
        }
    }

    def boolean allowedByFilterAnyChildHelper(Component component) {
        if (component.allowedByFilterComponent) {
            return true
        }
        for (childComponent : component.children) {
            if (childComponent.allowedByFilterAnyChildHelper) {
                return true
            }
        }
        return false
    }

    def boolean allowedByFilterConnection(Connection connection) {
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
        allowedByFilterCache.put(connection, allowed)
        return allowed;
    }

    def addConnectedParents(Component component) {
        if (component.parent != null) {
            connectedComponentsAdditional.add(component.parent)
            component.parent.addConnectedParents
        }
    }

    override KNode transform(CViewModel model) {
        instance = this
        connectedComponents.clear

        // Ensure filter values are set
        FilterDialog.loadValues
        // Clear filter cache
        allowedByFilterCache.clear

        if (ANONYMIZE.booleanValue) {
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

        selectedExpandLevel = EXPANDED_SLIDER.intValue

        val root = model.createNode().associateWith(model);
        val depth = 1;

        for (item : model.components) {
            if (item.parent == null || FLATTEN_HIERARCHY.booleanValue) {
                var skip = false;
                if (FLATTEN_HIERARCHY.booleanValue) {
                    if (EXPANDED_SLIDER.intValue < MAX_EXPANDED_VALUE && item.depth > EXPANDED_SLIDER.intValue) {
                        skip = true
                    }
                }
                if (!skip) {
                    if (item.allowedByFilterComponent) {
                        root.children.add(item.transformItem(depth))
                    }
                }
            }
        }

        // Create connections (added by extensions)
        if (!HIDE_CONNECTIONS.booleanValue) {
            for (connection : model.connections) {
                if (connection.allowedByFilterConnection) {
                    var connectionColor = "Black".color
                    if (connection.color != null) {
                        connectionColor = connection.color.color
                    }
                    connection.addConnection(INTERLEVEL_CONNECTIONS.booleanValue, connectionColor)
                }
            }
        }

        if (HIDE_UNCONNECTED.booleanValue) {
            if (!INTERLEVEL_CONNECTIONS.booleanValue) {
                // Consider connected and their parents
                for (item : model.components) {
                    if (!connectedComponents.contains(item) && !connectedComponentsAdditional.contains(item)) {
                        item.node.remove
                    }
                }
            } else {
                // Only consider connected
                for (item : model.components) {
                    if (!connectedComponents.contains(item)) {
                        item.node.remove
                    }
                }
            }
        }

        return root;
    }

    def boolean sameParent(Connection connection) {
        return (connection.src.sameParent(connection.dst))
    }

    def boolean sameParent(Component component1, Component component2) {
        if ((component1 != null) && (component2 != null)) {
            return component1.parent == component2.parent
        } else if ((component1 == null) && (component2 == null)) {
            return true
        }
        return false
    }

    def void addConnection(Connection connection, boolean interLevelConnections, KColor color) {
        if (interLevelConnections) {
            addSimpleConnection(connection, connection.src.node, connection.dst.node, false, color, true);
        } else {
            if (connection.sameParent) {
                addSimpleConnection(connection, connection.src.node, connection.dst.node, false, color, true);
            } else {
                addPortbasedConnection(connection, connection.src, connection.dst, color);
            }

        }
    }

    def void addPortbasedConnection(Connection connection, Component src, Component dst, KColor color) {

        var srcComponent = src
        var dstComponent = dst
        connectedComponents.add(connection.src)
        connectedComponents.add(connection.dst)
        connection.src.addConnectedParents
        connection.dst.addConnectedParents

        if (srcComponent.sameParent(dstComponent)) {
            // Can connect on same level!
            connection.addSimpleConnection(srcComponent.node, dstComponent.node, true, color, true)
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

    def Component addParentConnection(Connection connection, Component component, boolean directionToParent,
        boolean usePorts, KColor color) {
        if (component.parent == null) {
            return null
        }
        if (directionToParent) {
            addSimpleConnection(connection, component.node, component.parent.node, usePorts, color, false)
        } else {
            addSimpleConnection(connection, component.parent.node, component.node, usePorts, color, false)
        }
        return component.parent
    }

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
        returnName = returnName.replace("=",
            "Equals")
        return returnName
    }

    val static LOREIPSUM = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.".
        fixId(
            false)
    val static LOREIPSUM_NOSPACE = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.".
            fixId(true)

        def String loreipsum(int start, int length, boolean nospace) {
            if (nospace) {
                return LOREIPSUM_NOSPACE.substring(start, start + length);
            } else {
                return LOREIPSUM.substring(start, start + length);
            }
        }

        def String possiblyAnonymize(String text, boolean nospace) {
            if (text != null && ANONYMIZE.booleanValue) {
//                println("START ---------------------------------------------------")
//                println(text)
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
//                println("DONE ---------------------------------------------------")
                return returnText.trim
            }
            return text
        }

        def void addSimpleConnection(Connection connection, KNode srcNode, KNode dstNode, boolean usePorts,
            KColor color, boolean addLabel) {
            connectedComponents.add(connection.src)
            connectedComponents.add(connection.dst)
            connection.src.addConnectedParents
            connection.dst.addConnectedParents
            val connectionObject = (connection.hashCode + srcNode.hashCode)
            val edge = connectionObject.createEdge()
//        edge.associateWith(connection)
            val arrowRendering = edge.addPolyline(2).addHeadArrowDecorator();
            arrowRendering.background = color.copy
            arrowRendering.foreground = color.copy
            edge.source = srcNode
            edge.target = dstNode
            // Basic spline
            edge.addConnectionSpline();
            edge.line.foreground = color.copy
            // if (connection.src == null && connection.dst == null) 
            if (addLabel) {
                // Add Label only if top-most layer for this connection
                edge.addLabel(connection.label).associateWith(connection);
            }
            if (connection.tooltip != null) {
                val tooltipText = connection.tooltip
                edge.setProperty(KlighdProperties::TOOLTIP, tooltipText);
                if (edge.labels.size > 0) {
                    edge.labels.get(0).setProperty(KlighdProperties::TOOLTIP, tooltipText);
                }
            }

            connection.src.rootComponent.node.addLayoutParam(CoreOptions::EDGE_ROUTING, EdgeRouting::ORTHOGONAL)
            connection.src.rootComponent.node.addLayoutParam(CoreOptions::ALGORITHM, "org.eclipse.elk.layered")
            connection.src.rootComponent.node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FREE);
            connection.src.rootComponent.node.addLayoutParam(CoreOptions::DIRECTION, Direction::RIGHT);

            if (usePorts) {
                // Add the connection
                val portId = connection.hashCode.toString
                // val portId = (connection.hashCode + srcNode.hashCode).toString
                val srcPort = srcNode.addPort(connection, portId, 0, 0, 8, PortSide::EAST, color)
                val dstPort = dstNode.addPort(connection, portId, 0, 0, 8, PortSide::WEST, color)
                edge.sourcePort = srcPort
                edge.targetPort = dstPort
                edge.line.setSelectionForeground(SELECTION_CONNECTION_COLOR.color)
                edge.line.setSelectionBackground(SELECTION_CONNECTION_COLOR.color)
                edge.line.foreground.propagateToChildren = true;
                edge.line.background.propagateToChildren = true;
            }
        }

        def KPort addPort(KNode node, Connection connection, Object mapping, float x, float y, int size, PortSide side,
            KColor color) {
            val returnPort = node.createPort(mapping);
//        val returnPort = mapping.createPort(node);
            if (side != null) {
                node.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
                returnPort.addLayoutParam(CoreOptions::PORT_SIDE, side);
            }
            val rect = returnPort.addRectangle
            node.addLayoutParam(CoreOptions::PORT_ANCHOR, new KVector(0, 100));
            // returnPort.addLayoutParam(CoreOptions::PORT_ANCHOR, new KVector(0,0) );
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

//    def void addSimpleConnection(Connection connection, KNode srcNode, KNode dstNode) {
//        val edge = createEdge().associateWith(connection)
//        edge.addPolyline(2).addHeadArrowDecorator();
//        edge.source = srcNode
//        edge.target = dstNode
//        // Basic spline
//        edge.addConnectionSpline();
//        edge.setGrayStyle
//        // Add Label
//        edge.addLabel(connection.label).associateWith(connection);
//
//        // Add the connection
//        srcNode.outgoingEdges.add(edge)
//    // srcNode.port.edges.add(edge)
//    }
        def KNode transformItem(Component item, int depth) {
            if (item.isFile) {
                if (SHOW_FUNCTIONS.booleanValue) {
                    return item.transformItemFileWithFunctions(depth)
                } else {
                    return item.transformItemFile(depth)
                }
            } else if (item.isDir) {
                return item.transformItemDir(depth)
            } else if (item.isFunc) {
                return item.transformItemFunc(depth)
            }
        }

        def KNode transformItemFunc(Component item, int depth) {
            val childNode = item.createNode().associateWith(item);
            val childRect = childNode.addRoundedRectangle(4, 4, 2);
            val label = childNode.addInsideCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE,
                KlighdConstants.DEFAULT_FONT_NAME);
            childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
            childRect.background = "LIGHTBLUE".color;
            childRect.selectionBackground = "LIGHTBLUE".color;
            childRect.addDoubleClickAction(OpenEditorAction.ID);
            label.getFirstText.addDoubleClickAction(OpenEditorAction.ID);
            label.firstText.selectionBackground = "LIGHTBLUE".color;

            return childNode
        }

        def KNode transformItemFile(Component item, int depth) {
            val childNode = item.createNode().associateWith(item);
            val childRect = childNode.addRoundedRectangle(4, 4, 2);
            val label = childNode.addInsideCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE,
                KlighdConstants.DEFAULT_FONT_NAME);
            childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
            childRect.background = item.getFileColor
            childRect.selectionBackground = item.getFileColor
            childRect.addDoubleClickAction(OpenEditorAction.ID);
            label.getFirstText.addDoubleClickAction(OpenEditorAction.ID);
            label.firstText.selectionBackground = item.getFileColor

            if (item.tooltip != null) {
                val tooltipText = item.tooltip
                childRect.setProperty(KlighdProperties::TOOLTIP, tooltipText);
                label.firstText.setProperty(KlighdProperties::TOOLTIP, tooltipText);
            }

            return childNode
        }

        def KColor getFileColor(Component item) {
            if (item.hieararchical) {
                return "WHITE".color;
            } else {
                return "LIGHTGRAY".color;
            }
        }

        def KNode transformItemFileWithFunctions(Component item, int depth) {
            val childNodeOuter = item.createNode().associateWith(item);

            val rectCol = childNodeOuter.addRoundedRectangle(4, 4, 2);
            rectCol.background = item.getFileColor
            rectCol.selectionBackground = item.getFileColor
            rectCol.addSingleClickAction(ExpandCollapseNoMouseMoveAction.ID) //KlighdConstants::ACTION_COLLAPSE_EXPAND
            
            // rectCol.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            rectCol.addDoubleClickAction(OpenEditorAction.ID);
            val rectExp = childNodeOuter.addRoundedRectangle(4, 4, 2);
            rectExp.background = item.getFileColor
            rectExp.selectionBackground = item.getFileColor
            //rectExp.addSingleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            rectExp.addSingleClickAction(ExpandCollapseNoMouseMoveAction.ID)
            
            // rectExp.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            rectExp.addDoubleClickAction(OpenEditorAction.ID);
            childNodeOuter.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

            val itemLabel = item.name
            val label = childNodeOuter.addInsideTopCenteredNodeLabel(itemLabel, KlighdConstants.DEFAULT_FONT_SIZE,
                KlighdConstants.DEFAULT_FONT_NAME);
            label.associateWith(item)

            if (item.tooltip != null) {
                val tooltipText = item.tooltip
                rectCol.setProperty(KlighdProperties::TOOLTIP, tooltipText);
                rectExp.setProperty(KlighdProperties::TOOLTIP, tooltipText);
                label.firstText.setProperty(KlighdProperties::TOOLTIP, tooltipText);
            }

            label.firstText.addDoubleClickAction(OpenEditorAction.ID);

            if (item.hieararchical) {
                // Hierarchical case
                label.firstText.addSingleClickAction(ExpandCollapseNoMouseMoveAction.ID) //KlighdConstants::ACTION_COLLAPSE_EXPAND
                // label.firstText.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                label.firstText.selectionBackground = item.getFileColor
            }

            if (item.hieararchical && !FLATTEN_HIERARCHY.booleanValue) {
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

                if (!FLATTEN_HIERARCHY.booleanValue) {
                    for (child : item.children) {
                        if (child.allowedByFilterComponent) {
                            childArea.children += child.transformItem(depth + 1);
                        }
                    }
                }
            }

            return childNodeOuter
        }

        def KNode transformItemDir(Component item, int depth) {
            val childNodeOuter = item.createNode().associateWith(item);

            val rectCol = childNodeOuter.addRoundedRectangle(4, 4, 2);
            rectCol.background = "YELLOW".color;
            rectCol.selectionBackground = "YELLOW".color;
            rectCol.addSingleClickAction(ExpandCollapseNoMouseMoveAction.ID) //KlighdConstants::ACTION_COLLAPSE_EXPAND
            rectCol.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            // rectCol.addDoubleClickAction(OpenEditorAction.ID);
            val rectExp = childNodeOuter.addRoundedRectangle(4, 4, 2);
            rectExp.background = "YELLOW".color;
            rectExp.selectionBackground = "YELLOW".color;
            rectExp.addSingleClickAction(ExpandCollapseNoMouseMoveAction.ID) //KlighdConstants::ACTION_COLLAPSE_EXPAND
            rectExp.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
            // rectExp.addDoubleClickAction(OpenEditorAction.ID);
            childNodeOuter.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));

            val itemLabel = item.name
            val label = childNodeOuter.addInsideTopCenteredNodeLabel(itemLabel, KlighdConstants.DEFAULT_FONT_SIZE,
                KlighdConstants.DEFAULT_FONT_NAME);
            label.associateWith(item)
            label.firstText.selectionBackground = "YELLOW".color;

            if (item.hieararchical && !FLATTEN_HIERARCHY.booleanValue) {
                // Hierarchical case
                label.firstText.addSingleClickAction(ExpandCollapseNoMouseMoveAction.ID) //KlighdConstants::ACTION_COLLAPSE_EXPAND
                label.firstText.addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
                // label.firstText.addDoubleClickAction(OpenEditorAction.ID);
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

                if (!FLATTEN_HIERARCHY.booleanValue) {
                    for (child : item.children) {
                        if (child.allowedByFilterComponent) {
                            childArea.children += child.transformItem(depth + 1);
                        }
                    }
                }
            }

            return childNodeOuter
        }

        private def line(KEdge edge) {
            return edge.getKContainerRendering as KPolyline;
        }

        def setGrayStyle(KEdge edge) {
            edge.line => [
                foreground = Colors.GRAY_50
            ]
        }

        def KSpline addConnectionSpline(KEdge edge) {
            edge.addSpline => [
                lineWidth = 2;
            ]
        }

        private static val float CONNECTION_DASH_BLACK = 7;
        private static val float CONNECTION_DASH_WHITE = 3;
        private static val List<Float> CONNECTION_DASH_PATTERN = newArrayList(CONNECTION_DASH_BLACK,
            CONNECTION_DASH_WHITE);

        def setDashedStyle(KEdge edge) {
            edge.line => [
                lineStyle = LineStyle::CUSTOM;
                lineStyle.dashPattern.clear;
                lineStyle.dashPattern += CONNECTION_DASH_PATTERN;
            ]
        }

        def KLabel addLabel(KEdge edge, String text) {
            val label = edge.createLabel;
            label.configureCenterEdgeLabel(text); // Add text
            label.getKRendering => [ // Configure text
                fontSize = 11;
                fontBold = true;
            ]
            return label;
        }

//        val poly = kPort.addPolygon()
//        poly.addKPosition(LEFT, 0.5f, 0, TOP, 4, 0)
//        poly.addKPosition(RIGHT, -5, 0, TOP, 0, 0.5f)
//        poly.addKPosition(LEFT, 0.5f, 0, BOTTOM, 4, 0)
//        poly.background = "black".color;
//        poly.lineWidth = 2
//        poly.lineCap = LineCap.CAP_ROUND;
//        poly.lineJoin = LineJoin.JOIN_ROUND;
//        poly.selectionBackground = "gray".color;
//        srcNode.ports.add(kPort)
//        kPort.edges.add(edge)
//        kPort.setLayoutOption(LayeredOptions.PORT_SIDE, PortSide.WEST)
// var Component deeperComponent = null
//          var Component deeperSrc = null
//          var Component deeperDst = null
//          var boolean sourceDeeper = false
//          var int depthToReach = 0
//          if (depthSrc > depthDst) { // source is deeper
//              deeperComponent = src
//              depthToReach = depthDst
//              deeperSrc = connection.src
//              deeperDst = connection.dst
//              sourceDeeper = true
//          } else { // dst is deeper
//              deeperComponent = dst
//              depthToReach = depthSrc
//              deeperSrc = connection.dst
//              deeperDst = connection.src
//          }
//          while (deeperComponent.depth > depthToReach) {
//              // Connect deeperComponent's parent to deeperComponent
//              val parentDepperComponent = deeperComponent.parent
//              val port = deeperComponent.getPort(deeperSrc)
//              val pport = parentDepperComponent.getPort(deeperDst)
//              
//              var srcNode = port
//              var dstNode = pport
//              if (!sourceDeeper) {
//                  srcNode = pport
//                  dstNode = port
//              }
//              addSimpleConnection(connection, srcNode.node, dstNode.node)
//              
//              deeperComponent = parentDepperComponent
//              if (sourceDeeper) {
//                  srcComponent = deeperComponent
//              } else {
//                  dstComponent = deeperComponent
//              }
//          }
// public static int lastExpandedValue = DEFAULT_EXPANDED_VALUE;
// public static boolean changedExpandedValue = false;
//        label.getFirstText.setAsExpandedView
//        val labelCollapsed = childNodeOuter.addInsideTopCenteredNodeLabel(itemLabel, KlighdConstants.DEFAULT_FONT_SIZE,
//            KlighdConstants.DEFAULT_FONT_NAME);
//        labelCollapsed.associateWith(item)
//        labelCollapsed.getFirstText.setAsCollapsedView
//    def static <T extends KRendering> T setAsExpandedView(T krendering) {
//        krendering.getProperties().removeKey(KlighdProperties.COLLAPSED_RENDERING);
//        krendering.setProperty(KlighdProperties.EXPANDED_RENDERING, true);
//        return krendering;
//    }
//
//    def static <T extends KRendering> T setAsCollapsedView(T krendering) {
//        krendering.getProperties().removeKey(KlighdProperties.EXPANDED_RENDERING);
//        krendering.setProperty(KlighdProperties.COLLAPSED_RENDERING, true);
//        return krendering;
//    }
//        (childNodeOuter.class.getMethod("setExpanded", boolean).invoke(childNodeOuter, false))
//        DiagramController.
//        allNodes.add(childNodeOuter)
//            val childArea = item.createNode().associateWith(item)
//            val areaRect = childArea.addRoundedRectangle(4, 4, 1)
//            childNode.children.add(childArea)
//            childArea.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
//                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//            childArea.addInsideTopCenteredNodeLabel("child area", KlighdConstants.DEFAULT_FONT_SIZE,
//                KlighdConstants.DEFAULT_FONT_NAME).associateWith(item);
//            areaRect.background = "WHITE".color;
//            (item as Folder).children.forEach[s|childArea.children += transformItem(s)]
//            // Expanded
//            childNode.addMacroFigure => [
//                setAsExpandedView
//                associateWith(item)
//                it.addRegionFigure.addChildArea(itemLabel.nullOrEmpty)
//                addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
//            ]
//
//            // Collapsed
//            childNode.addDefaultFigure => [
//                //.getNode().addRegionFigure
//                setAsCollapsedView
//                associateWith(item)
//                addDoubleClickAction(KlighdConstants::ACTION_COLLAPSE_EXPAND);
//            ]
//        val childNodeInner = item.children.createNode().associateWith(item);
//        val rect2 = childNodeInner.addRoundedRectangle(4, 4, 1);
//        rect2.foreground =  "BLUE".color;
//        if (!item.hieararchical) {
//            
//            // Hierarchy
//            childNode.addMacroFigure
////            childNode.addInsideTopCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE,
////                KlighdConstants.DEFAULT_FONT_NAME).associateWith(item);
//        } else {
//            // No further files
//            childNode.addDefaultFigure
////            val label = childNode.addInsideCenteredNodeLabel(item.name, KlighdConstants.DEFAULT_FONT_SIZE,
////                KlighdConstants.DEFAULT_FONT_NAME);
////            childNode.addLayoutParam(DiagramLayoutOptions.SIZE_CONSTRAINT,
////                EnumSet.of(SizeConstraint.MINIMUM_SIZE, SizeConstraint.NODE_LABELS));
//        }
//        rect.background = "YELLOW".color
//        for (subitem : item.children) {
//            if (subitem.parent == null) {
//            }
//        }
//    def KRectangle addRegionFigure(KNode node) {
//        node.addRectangle() => [
//            background = "WHITE".color;
//            foreground = "GRAY".color;
//            lineWidth = 1;
//            setSurroundingSpace(2, 0);
//        ]
//    }
//
//    def addChildArea(KContainerRendering container, boolean useHeaderSpace) {
//        container.addChildArea() => [
//            if (useHeaderSpace) {
//                setAreaPlacementData().from(LEFT, -2, 0, TOP, -2, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
//            } else {
//                setAreaPlacementData().from(LEFT, -2, 0, TOP, 8, 0).to(RIGHT, -2, 0, BOTTOM, -2, 0);
//            }
//        ]
//    }
//    def KText addButtonTop(KContainerRendering container, String text) {
//        container.addText(text) => [
//            foreground = "BLACK".color;
//            fontSize = 10;
//            val size = estimateTextSize;
//            setPointPlacementData(LEFT, 3, 0, TOP, 1, 0, H_CENTRAL, V_TOP, 8, 8, size.width, size.height);
//        ]
//    }
//
//    def KText addButtonCenter(KContainerRendering container, String text) {
//        container.addText(text) => [
//            foreground = "BLACK".color;
//            fontSize = 10;
//            val size = estimateTextSize;
//            setPointPlacementData(LEFT, 3, 0, TOP, 1, 0, H_CENTRAL, V_CENTRAL, 8, 8, size.width, size.height);
//        ]
//    }
//        /**
//     * Adds a button with text.
//     */
//    def KText addButton(KContainerRendering container, String text) {
//        container.addText(text) => [
//            foreground = "BLACK".color;
//            fontSize = 10;
//            val size = estimateTextSize;
//            setPointPlacementData(LEFT, 3, 0, TOP, 1, 0, H_LEFT, V_TOP, 8, 8, size.width, size.height);
//        ]
//    }
//    
//    def KRoundedRectangle addMacroFigure(KNode node) {
//        node.setMinimalNodeSize(34, 34); // same as default figure
//        node.addRoundedRectangle(8, 8, 2) => [
//            // Mark this figure as container for further content
//            //setProperty(IS_CONTENT_CONTAINER, true);
//            //setBackgroundGradient(STATE_BACKGROUND_GRADIENT_1.color, STATE_BACKGROUND_GRADIENT_2.color, 90);
//            //not? setBackground("YELLOW".color);
//            foreground = "BLACK".color;
//            background = "YELLOW".color;
//            setGridPlacement(1);
//        ]
//    }    
//    
//    def KRoundedRectangle addDefaultFigure(KNode node) {
//        node.setMinimalNodeSize(34, 34); // 2 x corner radius
//        node.addRoundedRectangle(17, 17, 2) => [
//            // Mark this figure as container for further content
//            //setProperty(IS_CONTENT_CONTAINER, true);
//            foreground = "BLACK".color;
//            background = "YELLOW".color;
//        ]
//    }    
//    val static Bounds estimateTextSize(KText kText) {
//        return estimateTextSize(kText, kText.getText());
//    }
//    public static val List<KNode> allNodes = newArrayList
//    public static val List<KChildAreaNode> allChildAreas = newArrayList
    }
    