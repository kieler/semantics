/*  * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.annotations.extensions.PragmaExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsAccessVisibilityExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.kicool.ide.klighd.KiCoDiagramViewProperties
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPolylineExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsInheritanceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsSerializeHRExtensions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.StateStyles
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.TransitionStyles
import org.eclipse.elk.alg.layered.options.LayeredOptions
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.options.Direction

import static extension de.cau.cs.kieler.annotations.ide.klighd.CommonSynthesisUtil.*

/**
 * SCCharts Synthesis as flat class diagrams.
 * 
 * @author als
 */
@ViewSynthesisShared
class SCChartsClassDiagramSynthesis extends AbstractDiagramSynthesis<SCCharts> {

    @Inject extension KNodeExtensions
    @Inject extension KEdgeExtensions
    @Inject extension KRenderingExtensions
    @Inject extension KContainerRenderingExtensions
    @Inject extension AnnotationsExtensions
    @Inject extension SCChartsSerializeHRExtensions
    @Inject extension SCChartsInheritanceExtensions
    @Inject extension SCChartsReferenceExtensions
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsAccessVisibilityExtensions
    @Inject extension SCChartsScopeExtensions
    @Inject extension PragmaExtensions
    @Inject extension TransitionStyles
    @Inject extension StateStyles
    @Inject extension KPolylineExtensions
    @Inject extension CommentSynthesis
    
    static val PRAGMA_FONT = "font"        
    static val PRAGMA_HIDE_IMPORTED_SCCHARTS = "HideImportedSCCharts"
          
    public static val ID = "de.cau.cs.kieler.sccharts.ui.synthesis.SCChartsClassDiagramSynthesis"
    
    public static final SynthesisOption SHOW_INHERITANCE = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Generalization Relations", true)
    public static final SynthesisOption SHOW_AGGREGATION = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Aggregation Relations", true)
    public static final SynthesisOption SHOW_IO = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "IO Parameter", true)
    public static final SynthesisOption SHOW_ATTRIBUTES = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Attributes", true)
    public static final SynthesisOption SHOW_METHODS = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Methods", true)
    public static final SynthesisOption SHOW_COMMENTS = SynthesisOption.createCheckOption(GeneralSynthesisOptions, "Comments", true)
    
       
    override getDisplayedSynthesisOptions() {
        return #[
            SHOW_INHERITANCE,
            SHOW_AGGREGATION,
            SHOW_IO,
            SHOW_ATTRIBUTES,
            SHOW_METHODS,
            SHOW_COMMENTS
        ]
    }

    override transform(SCCharts sccharts) {
        val startTime = System.currentTimeMillis
        
        val scc = sccharts
        val rootNode = createNode
        
        val rootStateNodes = <State, KNode> newHashMap
        val rootStates = newLinkedHashSet
        rootStates += scc.rootStates
        if (!sccharts.hasPragma(PRAGMA_HIDE_IMPORTED_SCCHARTS)) {
            val rs = sccharts.eResource?.resourceSet
            if (rs !== null) {
                for (res : rs.resources.filterNull) {
                    for (impored : res.contents.filter(SCCharts)) {
                        rootStates += impored.rootStates
                    }
                }
            }
        }
        for(rootState : rootStates) {
            val synthesizedState = transform(rootState).head
            rootStateNodes.put(rootState, synthesizedState)
            rootNode.children += rootStateNodes.get(rootState)
        }
        rootNode.children.addAll(rootStateNodes.values)
        
        if (SHOW_INHERITANCE.booleanValue) {
            rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.UP)
            rootNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 20.0)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 28.0)
            rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 28.0)
            for(state : rootStates) {
                for (base : state.baseStates) {
                    val edge = createEdge
                    edge.source = rootStateNodes.get(state)
                    edge.target = rootStateNodes.get(base)
                    edge.addPolyline => [
                        lineWidth = 1
                        addInheritanceTriangleArrowDecorator
                    ]
                }
            }
        }
        
        if (SHOW_AGGREGATION.booleanValue) {
            rootNode.setLayoutOption(CoreOptions::DIRECTION, Direction.UP)
            rootNode.setLayoutOption(CoreOptions::SPACING_NODE_NODE, 20.0)
            rootNode.setLayoutOption(LayeredOptions::SPACING_EDGE_NODE_BETWEEN_LAYERS, 28.0)
            rootNode.setLayoutOption(LayeredOptions::SPACING_NODE_NODE_BETWEEN_LAYERS, 28.0)
            for(state : rootStates) {
                val aggregation = newHashSet
                for (ref : state.declarations.filter(ReferenceDeclaration)) {
                    if (ref.reference instanceof State) {
                        aggregation += ref.reference as State
                    }
                }
                for (inner : state.allScopes.toIterable) {
                    if (inner !== state) {
                        if (inner instanceof State) {
                            if (!inner.baseStateReferences.nullOrEmpty) {
                                aggregation += inner.baseStates
                            }
                            if (inner.isReferencing && inner.reference.target instanceof State) {
                                aggregation += inner.reference.target as State
                            }
                        }
                        for (ref : state.declarations.filter(ReferenceDeclaration)) {
                            if (ref.reference instanceof State) {
                                aggregation += ref.reference as State
                            }
                        }
                    }
                }
                for (agg : aggregation) {
                    val edge = createEdge
                    edge.source = rootStateNodes.get(state)
                    edge.target = rootStateNodes.get(agg)
                    edge.addPolyline => [
                        lineWidth = 1
                        addAggregationArrowDecorator
                    ]
                }
            }
        }
        
        val pragmaFont = scc.getStringPragmas(PRAGMA_FONT).last
        if (pragmaFont !== null) {
            rootNode.eAllContents.filter(KText).forEach[ fontName = pragmaFont.values.head ]
        }
        
        // Report elapsed time
        usedContext?.setProperty(KiCoDiagramViewProperties.SYNTHESIS_TIME, System.currentTimeMillis - startTime)
		
        return rootNode
    }
    
    def transform(State state) {
        val returnNodes = newArrayList
        val node = state.createNode().associateWith(state)
        returnNodes += node

        // Set KIdentifier for use with incremental update
        if (!state.name.nullOrEmpty) {
            node.KID = state.name
        }
        
        val box = node.addRectangle
        box.setGridPlacement(1)
        node.setSelectionStyle
        
        // name
        box.addText(state.label.nullOrEmpty ? state.name : state.label) => [
            fontBold = true
            fontItalic = state.hasAnnotation("interface")
            setGridPlacementData.from(LEFT, 6, 0, TOP, 6, 0).to(RIGHT, 6, 0, BOTTOM, 6, 0)
        ]
        
        // IO Interface
        if (SHOW_IO.booleanValue) {
            val i = state.declarations.filter[it.input].toList
            val o = state.declarations.filter[it.output].toList
            if (!i.empty || !o.empty) {
                box.addHorizontalLine(1) => [
                    setGridPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
                ]
            }
            if (!i.empty) {
                box.addText("Input") => [
                    fontItalic = true
                    fontSize = 8
                ]
                for (d : i) {
                    box.addLeftAlignedText(d.toText)
                }
            }
            if (!o.empty) {
                box.addText("Output") => [
                    fontItalic = true
                    fontSize = 8
                ]
                for (d : o) {
                    box.addLeftAlignedText(d.toText)
                }
            }
        }
        
        // Attributes
        if (SHOW_ATTRIBUTES.booleanValue) {
            val attr = state.declarations.filter[!(it.input || it.output || it.isMethod)].toList
            if (!attr.empty) {
                box.addHorizontalLine(1) => [
                    setGridPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
                ]
            }
            for (d : attr) {
                box.addLeftAlignedText(d.toText)
            }
        }
        
        // Methods
        if (SHOW_METHODS.booleanValue) {
            val attr = state.declarations.filter[it.isMethod].toList
            if (!attr.empty) {
                box.addHorizontalLine(1) => [
                    setGridPlacementData.from(LEFT, 0, 0, TOP, 0, 0).to(RIGHT, 0, 0, BOTTOM, 4, 0)
                ]
            }
            for (d : attr) {
                box.addLeftAlignedText(d.toText)
            }
        }
        
        if (SHOW_COMMENTS.booleanValue) {
            state.getCommentAnnotations.forEach[
                returnNodes += it.transform                
            ] 
        }

        return returnNodes
    }
    
    def addLeftAlignedText(KContainerRendering parent, String text) {
        return parent.addRectangle() => [
            // This additional rectangle allows left align in grid placement
            invisible = true
            setGridPlacementData.from(LEFT, 4, 0, TOP, 0, 0).to(RIGHT, 4, 0, BOTTOM, 4, 0)
            addRectangle() => [
                invisible = true;
                // Add left alignment
                setPointPlacementData(createKPosition(LEFT, 0, 0, TOP, 0, 0), H_LEFT, V_TOP, 0, 0, 0, 0);
                addText(text)
            ]
        ]
    }
    
    def String toText(Declaration d) {
        val s = new StringBuilder
        
        if (!(d.eContainer instanceof MethodDeclaration)) { // Not a parameter
            // Visibility
            if (d.isProtected) {
                s.append("# ")
            } else if (d.isPublic) {
                s.append("+ ")
            } else {
                s.append("- ")
            }
        }
        
        s.append(d.valuedObjects.map[name].join(", "))
        
        if (d instanceof MethodDeclaration) {
            s.append("(")
            s.append(d.parameterDeclarations.map[toText].join(", "))
            s.append(")")
            if (d.returnType !== ValueType.VOID && d.returnType !== ValueType.PURE) {
                s.append(": ")
                s.append(d.returnType.serialize)
            }
        } else if (d instanceof VariableDeclaration) {
            s.append(": ")
            if (d.isClass || d.isStruct || d.isEnum) {
                s.append((d as ClassDeclaration).name)
            } if (d.type === ValueType.HOST) {
                s.append(d.hostType)
            } else {
                s.append(d.type.serialize)
            }
            if (d.signal) {
                 s.append(" signal")
            }
        } else if (d instanceof ReferenceDeclaration) {
            if (d.extern.nullOrEmpty) {
                s.append(": ")
                s.append((d.reference as NamedObject).name)
            }
        }

        return s.toString
    }
}
