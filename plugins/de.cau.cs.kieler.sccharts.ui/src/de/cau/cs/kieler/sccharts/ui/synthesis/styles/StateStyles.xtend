/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.styles

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.ControlDependency
import de.cau.cs.kieler.kexpressions.keffects.DataDependency
import de.cau.cs.kieler.kexpressions.keffects.Dependency
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.kgraph.KPort
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KRectangle
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.Underline
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KColorExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KLabelExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.TextFormat
import java.util.EnumSet
import java.util.List
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.PortConstraints
import org.eclipse.elk.core.options.PortLabelPlacement
import org.eclipse.elk.core.options.PortSide
import org.eclipse.elk.core.options.SizeConstraint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property

import static de.cau.cs.kieler.sccharts.ui.synthesis.styles.ColorStore.Color.*

import static extension de.cau.cs.kieler.klighd.syntheses.DiagramSyntheses.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.klighd.util.KlighdProperties

/**
 * Styles for {@link State}.
 * 
 * @author als
 * @kieler.design 2015-08-13 proposed
 * @kieler.rating 2015-08-13 proposed yellow
 * 
 */
@ViewSynthesisShared
class StateStyles {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KPortExtensions
    @Inject extension KLabelExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KPolylineExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension ColorStore
    @Inject extension AnnotationsExtensions
    @Inject extension KColorExtensions
    
    /** This property is set a rendering and indicates the content container */
    public static final IProperty<Boolean> IS_CONTENT_CONTAINER = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.style.state.content", false);
    /** This property is set a rendering and indicates the redering is not visible and only present for layout purpose */
    public static final IProperty<Boolean> IS_LAYOUT_ELEMENT = new Property<Boolean>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.style.layout", false);
    /** This property is set on the content container rendering and points to the container holding the action labels */
    public static final IProperty<KContainerRendering> ACTIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.style.state.actions", null);
    /** This property is set on the content container rendering and points to the container holding the declaration labels */
    public static final IProperty<KContainerRendering> DECLARATIONS_CONTAINER = new Property<KContainerRendering>(
        "de.cau.cs.kieler.sccharts.ui.synthesis.style.state.declarations", null);

    protected var baseLineWidth = 1;
    protected var stateLabelTextSize = 11;
    
    /**
     * Adds a connector figure.
     */
    def KRoundedRectangle addConnectorFigure(KNode node) {
        node.addRoundedRectangle(7, 7, baseLineWidth) => [
            background = STATE_CONNECTOR.color;
            foreground = STATE_CONNECTOR.color;
        ]
    }

    /**
     * Adds a small state figure.
     */
    def KRoundedRectangle addDefaultFigure(KNode node) {
        node.setMinimalNodeSize(34, 34); // 2 x corner radius
        node.addRoundedRectangle(17, 17, baseLineWidth) => [
            // Mark this figure as container for further content
            setProperty(IS_CONTENT_CONTAINER, true);
            setBackgroundGradient(STATE_BACKGROUND_GRADIENT_1.color, STATE_BACKGROUND_GRADIENT_2.color, 90);
            foreground = STATE_FOREGROND.color;
        ]
    }

    /**
     * Adds a macro state figure.
     */
    def KRoundedRectangle addMacroFigure(KNode node) {
        node.setMinimalNodeSize(34, 34); // same as default figure
        node.addRoundedRectangle(8, 8, baseLineWidth) => [
            // Mark this figure as container for further content
            setProperty(IS_CONTENT_CONTAINER, true);
            setBackgroundGradient(STATE_BACKGROUND_GRADIENT_1.color, STATE_BACKGROUND_GRADIENT_2.color, 90);
            foreground = STATE_FOREGROND.color;
            setGridPlacement(1);
        ]
    }

    /**
     * Sets the style of an existing figure to immediate.
     */
    def setInitialStyle(KNode node) {
        node.getKContainerRendering => [
            lineWidth = baseLineWidth + 2;
            foreground = STATE_INITIAL_FOREGROND.color;
        ]
    }

    /**
     * Sets the style of an existing figure to final.
     */
    def setFinalStyle(KNode node) {
        // Add an additional rectangle to achieve the double line
        val outer = node.getKContainerRendering as KRoundedRectangle;
        val inner = outer.copy;
        val offset = outer.lineWidthValue + if(outer.lineWidthValue == baseLineWidth) 2 else 1;
        outer => [
            // This figure is no longer the container for content
            setProperty(IS_CONTENT_CONTAINER, false);
            setCornerSize(offset + cornerWidth, offset + cornerHeight);
            // Update minimal node size according to new corner radius (corner radius x 2)
            node.setMinimalNodeSize(cornerWidth * 2, cornerHeight * 2);
            background = STATE_FINAL_FOREGROND_BACKGROUND.color;
            foreground = STATE_FIANL_FOREGROND.color;
            // Add grid placement to correctly use offsets
            setGridPlacement(1);
            children += inner
        ]
        inner => [
            lineWidth = baseLineWidth;
            foreground = STATE_FIANL_FOREGROND.color;
            // Add surrounding space (white border)
            setGridPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
        ]
    }
    
    /**
     * Sets the style of an existing figure to violation.
     */
    def setViolationStyle(KNode node, boolean isHaltState) {
        if (isHaltState) {
            val outer = node.getKContainerRendering as KRoundedRectangle;
            val inner = outer.copy;
            val offset = outer.lineWidthValue + if(outer.lineWidthValue == baseLineWidth) 3 else 1;
            outer => [
                // This figure is no longer the container for content
                lineWidth = baseLineWidth +1
                setProperty(IS_CONTENT_CONTAINER, false);
                setCornerSize(offset + cornerWidth, offset + cornerHeight);
                // Update minimal node size according to new corner radius (corner radius x 2)
                node.setMinimalNodeSize(cornerWidth * 2, cornerHeight * 2);
                setBackgroundGradient(STATE_VIOLATION_BACKGROUND_GRADIENT_1.color, STATE_VIOLATION_BACKGROUND_GRADIENT_2.color, 90);
                foreground = STATE_FIANL_FOREGROND.color;
                // Add grid placement to correctly use offsets
                setGridPlacement(1);
                children += inner
            ]
            inner => [
                lineWidth = baseLineWidth;
                foreground = STATE_FIANL_FOREGROND.color;
                setBackgroundGradient(STATE_VIOLATION_BACKGROUND_GRADIENT_1.color, STATE_VIOLATION_BACKGROUND_GRADIENT_2.color, 90);
                // Add surrounding space (white border)
                setGridPlacementData().from(LEFT, offset, 0, TOP, offset, 0).to(RIGHT, offset, 0, BOTTOM, offset, 0);
            ]   
            return outer         
        } else {
            node.getKContainerRendering => [
                setBackgroundGradient(STATE_VIOLATION_BACKGROUND_GRADIENT_1.color, STATE_VIOLATION_BACKGROUND_GRADIENT_2.color, 90);
            ]
        }
    }    

    /**
     * Sets the style of an existing figure to referenced.
     */
    def setReferencedStyle(KNode node) {
        return node.contentContainer => [
            setBackgroundGradient(STATE_REFERENCED_BACKGROUND_GRADIENT_1.color, STATE_REFERENCED_BACKGROUND_GRADIENT_2.color, 90.0f);
        ]
    }

    /**
     * Add a shadow to an existing figure.
     */
    def setShadowStyle(KNode node) {
        node.getKContainerRendering.setShadow(STATE_SHADOW.color, 4, 4);
    }

    /**
     * Adds a title label to a simple state figure.
     */
    def KText addSimpleStateLabel(KNode node, String text) {
        node.contentContainer.addText(text) => [
            
            // Add surrounding space
            setGridPlacementData().from(LEFT, 10, 0, TOP, 8, 0).to(RIGHT, 10, 0, BOTTOM, 8, 0)
            
            fontBold = true
            fontSize = stateLabelTextSize
            suppressSelectability
            selectionTextUnderline = Underline.NONE // prevents default selection style
            setProperty(KlighdProperties.IS_NODE_TITLE, true)
        ]
    }

    /**
     * Adds a title label to a macro state figure.
     */
    def KRectangle addMacroStateLabel(KNode node, List<Pair<? extends CharSequence, TextFormat>> components) {
        node.contentContainer.addKeywordLabel(components, 0) => [
            // Add surrounding space
            setGridPlacementData().from(LEFT, 10, 0, TOP, 8, 0).to(RIGHT, 10, 0, BOTTOM, 8, 0)
            
            eAllContents.filter(KText).forEach[
                fontSize = stateLabelTextSize
                suppressSelectability
                selectionTextUnderline = Underline.NONE // prevents default selection style
            ]

            children.head => [
                setProperty(KlighdProperties.IS_NODE_TITLE, true)
                setPointPlacementData(createKPosition(LEFT, 0, 0.5f, TOP, 0, 0), H_CENTRAL, V_TOP, 0, 0, 0, 0);
            ]
        ]
    }
    
    /**
     * Adds an empty label placeholder to a state figure to fix surrounding space for following elements.
     */
    def KRectangle addEmptyStateLabel(KNode node) {
        node.contentContainer.addRectangle => [
            invisible = true
            // Add surrounding space
            setGridPlacementData().from(LEFT, 0, 0, TOP, 10, 0).to(RIGHT, 0, 0, BOTTOM, 0, 0);
        ]
    }

    /**
     * Adds a label in declaration style with the given components to a macro state.<br>
     * The first part will be highlighted as keywords.
     */
    def KRectangle addActionLabel(KNode node, List<Pair<? extends CharSequence, TextFormat>> components) {
        node.actionsContainer.addKeywordLabel(components, 0);
    }

    /**
     * Adds a label in action style with the given components to a macro state.
     */
    def KRectangle addDeclarationLabel(KNode node, List<Pair<? extends CharSequence, TextFormat>> components) {
        return node.declarationsContainer.addKeywordLabel(components, 0);
    }
    
    /**
     * Adds a label in action style with the given components to a macro state.<br>
     * The given indent level will be prepended.
     */
    def KRectangle addDeclarationLabel(KNode node, List<Pair<? extends CharSequence, TextFormat>> components, int indent) {
        return node.declarationsContainer.addKeywordLabel(components, indent);
    }

    /**
     * Creates a text with highlighted keywords.
     */
    package def addKeywordLabel(KContainerRendering container, List<Pair<? extends CharSequence, TextFormat>> components, int indent) {
        return container.addRectangle() => [
            // This additional rectangle allows left align in grid placement
            invisible = true
            setProperty(IS_LAYOUT_ELEMENT, true)
            addRectangle() => [
                invisible = true;
                // Add left alignment
                setPointPlacementData(createKPosition(LEFT, indent * 10, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                var parts = 0
                val entries = components.iterator
                val builder = new StringBuilder()
                var keyword = TextFormat.KEYWORD
                var KText ktext = null               
                while (entries.hasNext) {
                	val entry = entries.next
                	if (builder.length > 0 && keyword != entry.value) {
		                ktext = it.addText(builder.append(" ").toString) => [
                            horizontalAlignment = H_LEFT
                            selectionTextUnderline = Underline.SINGLE
                        ]
                        switch(keyword) {
                            case KEYWORD: ktext.highlightKeyword
                            case HIGHLIGHT: ktext.highlightHighlight
                            case SCHEDULE: ktext.highlightSD
                        }
		                builder.length = 0
                		parts++
                	}
                	if (builder.length > 0) {
                	    val possibleSpace = if (entry.key.equals(",")) "" else " "
                		builder.append(possibleSpace)
                	}
                	builder.append(entry.key)
                	keyword = entry.value
                }
                ktext = addText(builder.toString) => [
                    horizontalAlignment = H_LEFT
                    selectionTextUnderline = Underline.SINGLE
                ]
                switch(keyword) {
                    case KEYWORD: ktext.highlightKeyword
                    case HIGHLIGHT: ktext.highlightHighlight
                    case SCHEDULE: ktext.highlightSD
                }
                parts++
                setGridPlacement(parts)
            ]
        ]
    }
    
    package def highlightKeyword(KText ktext) {
        ktext.foreground = KEYWORD.color;
        ktext.fontBold = true;    	
    }
    
    package def highlightHighlight(KText ktext) {
        ktext.foreground = KEYWORD.color;
    }
    
    package def highlightSD(KText ktext) {
        ktext.foreground = USER_SCHEDULE_COLOR.color
    }
    
    /**
     * Sets the selection style of the state.
     */
    def setSelectionStyle(KNode node) {
        node.KContainerRendering => [
            selectionLineWidth = if (lineWidthValue > 2) 1.2f * lineWidthValue else 2 * lineWidthValue;
            selectionForeground = SELECTION.color;
        ]
    }

    /**
     * Add a child area to a macro state
     */
    def addRegionsArea(KNode node) {
        node.contentContainer.addChildArea().setGridPlacementData() => [
            from(LEFT, 5, 0, TOP, -4, 0).to(RIGHT, 5, 0, BOTTOM, 5, 0)
            minCellHeight = 5;
            minCellWidth = 5;
        ]
    }

    /**
     * Returns the content container of a state figure.
     */
    def getContentContainer(KNode node) {
        var KContainerRendering figure = node.getKContainerRendering;
        while (figure !== null) {
            if (figure.getProperty(IS_CONTENT_CONTAINER)) {
                return figure;
            } else {
                figure = figure.children.findFirst[it instanceof KContainerRendering] as KContainerRendering;
            }
        }
        return null
    }

    /**
     * Returns the actions container of a state figure.<br>
     * Creates the container if it does not exist!
     */
    private def getActionsContainer(KNode node) {
        val content = node.contentContainer;
        var container = content.getProperty(ACTIONS_CONTAINER);
        if (container === null) {
            container = content.addInvisibleContainer;
            content.setProperty(ACTIONS_CONTAINER, container);
        }
        return container;
    }

    /**
     * Returns the declarations container of a state figure.<br>
     * Creates the container if it does not exist!
     */
    private def getDeclarationsContainer(KNode node) {
        val content = node.contentContainer;
        var container = content.getProperty(DECLARATIONS_CONTAINER);
        if (container === null) {
            container = content.addInvisibleContainer;
            content.setProperty(DECLARATIONS_CONTAINER, container);
        }
        return container;
    }

    /**
     * Adds an invisible container to the given parent container, assuming grid layout.
     */
    private def addInvisibleContainer(KContainerRendering container) {
        container.addRectangle => [
            invisible = true;
            setGridPlacement(1);
            setGridPlacementData().from(LEFT, 8, 0, TOP, -4, 0).to(RIGHT, 8, 0, BOTTOM, 6, 0);
        ]
    }
    
    /**
     * Sets the base line width
     */
     def setBaseLineWidth(int width) {
         baseLineWidth = width;
     }
     
    
    def createDependencyEdge(Dependency dependency, KNode sourceNode, KNode targetNode) {
        var color = "#000".color 
        if (dependency instanceof DataDependency) {
            switch(dependency.type) {
                case WRITE_READ: color = DEPENDENCY_ABSWRITEREAD.color
                case WRITE_RELATIVEWRITE: color = DEPENDENCY_ABSWRITERELWRITE.color
                case WRITE_WRITE: color = DEPENDENCY_ABSWRITEABSWRITE.color
                default: color = "#000".color
            }
        } else if (dependency instanceof ControlDependency) {
            color = "#555".color
        }
        dependency.createDependencyEdge(sourceNode, targetNode, color)
    }
    
    def createDependencyEdge(Dependency dependency, KNode sourceNode, KNode targetNode, KColor color) {
        createNewEdge() => [ edge |
            edge.source = sourceNode
            edge.target = targetNode
            if (dependency instanceof DataDependency) {
                edge.addRoundedBendsPolyline(2, 2) => [
                    it.foreground = color
                    it.lineStyle = LineStyle::DASH
                    it.addArrowDecorator
                ]
            } else if (dependency instanceof ControlDependency) {
                edge.addRoundedBendsPolyline(2, 2) => [
                    it.foreground = color
                    it.lineStyle = LineStyle::DASH
                    it.addArrowDecorator
                ]
            }
            
            // If dependency edges are layouted, use the dependency ports to attach the edges.
            if (!dependency.hasAnnotation("nolayout")) {            
                val reference = if (dependency.reference === null) edge.hashCode.toString else dependency.reference
                val name = if (dependency === null) "" else (dependency.reference as ValuedObject).name
                  
                edge.sourcePort = sourceNode.addHelperPort(reference, "output", name, PortSide::EAST)
                edge.targetPort = targetNode.addHelperPort(reference, "input", name, PortSide::WEST)
                sourceNode.addLayoutParam(CoreOptions::PORT_CONSTRAINTS, PortConstraints::FIXED_SIDE);
                sourceNode.addLayoutParam(CoreOptions.PORT_LABELS_PLACEMENT, EnumSet.of(PortLabelPlacement.INSIDE)) 
                sourceNode.addLayoutParam(CoreOptions::NODE_SIZE_CONSTRAINTS, EnumSet.of(SizeConstraint.PORT_LABELS, SizeConstraint.PORTS))
                sourceNode.addLayoutParam(CoreOptions::PORT_LABELS_NEXT_TO_PORT_IF_POSSIBLE, true)
                targetNode.addLayoutParam(CoreOptions::PORT_LABELS_NEXT_TO_PORT_IF_POSSIBLE, true)
            } else {
                // Otherwise, add NO_LAYOUT as layout option to trigger node-to-node hierarchy-crossover
                // drawing.
                edge.addLayoutParam(CoreOptions::NO_LAYOUT, true)
            }
        ]
    }    
    
    private def KPort addHelperPort(KNode node, Object mapping, Object source, String name, PortSide side) {
        val port = node.createPort(mapping, source) => [
            it.addLayoutParam(CoreOptions::PORT_SIDE, side);
            node.ports += it
            setPortSize(4, 4)
            addLayoutParam(CoreOptions::PORT_BORDER_OFFSET, -4d)
            addLayoutParam(CoreOptions::PORT_LABELS_NEXT_TO_PORT_IF_POSSIBLE, true)
        ]
        
        if (!name.nullOrEmpty && port.labels.empty) {
            port.createLabel().configureInsidePortLabel(name, 10)
        }
        
        return port
    }
    
}
