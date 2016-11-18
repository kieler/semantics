/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.kivi

import com.google.common.collect.HashMultimap
import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Module
import com.google.inject.Scopes
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KBackground
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KRoundedRectangle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.LineStyle
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.synchronizer.DepthJoinSynchronizer
import de.cau.cs.kieler.scg.transformations.BasicBlockTransformation
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent
import de.cau.cs.kieler.sim.kiem.KiemExecutionException
import de.cau.cs.kieler.sim.kiem.KiemInitializationException
import java.util.Set
import org.eclipse.elk.core.klayoutdata.KLayoutData
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.core.util.Maybe
import org.eclipse.elk.graph.properties.Property
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import org.json.JSONObject

import static de.cau.cs.kieler.scg.SCGAnnotations.*

/**
 * @author ssm als cmot
 *
 */
class SCGVisualizationDataComponent extends JSONObjectDataComponent {
    
    val Module configure = [Binder binder|
        binder.bindScope(typeof(ViewSynthesisShared), Scopes.SINGLETON);
    ]
    val injector = Guice.createInjector(configure)
    
    
    extension AnnotationsExtensions = injector.getInstance(typeof(AnnotationsExtensions))
    extension SCGDeclarationExtensions = injector.getInstance(typeof(SCGDeclarationExtensions))
    extension KRenderingExtensions = injector.getInstance(typeof(KRenderingExtensions))
    extension KNodeExtensions = injector.getInstance(typeof(KNodeExtensions))
    extension KEdgeExtensions = injector.getInstance(typeof(KEdgeExtensions))
    extension KPortExtensions = injector.getInstance(typeof(KPortExtensions))
    extension KContainerRenderingExtensions = injector.getInstance(typeof(KContainerRenderingExtensions))

    val HashMultimap<String, KRendering>guardMapping =  HashMultimap.create
    val HashMultimap<String, KRendering>annotationMapping =  HashMultimap.create
    
    val annotationNodes = <KNode> newHashSet
    
    override initialize() throws KiemInitializationException {
        
        val diagramEditor = getActiveEditor();
        if (diagramEditor == null) {
            return;
        }

        val viewParts = DiagramView.getDiagramViews(diagramEditor)
        if (viewParts.empty) {
            throw new KiemInitializationException(
                    "Model visualization not shown, cannot visualize simulation.", true, null);
        }
        
        guardMapping.clear
        annotationMapping.clear
        annotationNodes.clear
        
        val contexts = viewParts.map[ viewer.viewContext ].filter[ inputModel instanceof SCGraph ]

        val Runnable run = [|
        
            for (context : contexts) {
                val scg = context.inputModel as SCGraph
                if (scg.hasAnnotation(SCGFeatures::SEQUENTIALIZE_ID)) {
                    for (node : scg.nodes.filter(typeof(Assignment)).filter[valuedObject != null]) {
                        if (node.valuedObject.name.startsWith(BasicBlockTransformation::GUARDPREFIX)) {
                            guardMapping.putAll(node.valuedObject.name,
                                context.getTargetElements(node).filter(typeof(KRendering)))
                        }
                        if (node.hasAnnotation(ANNOTATION_CONDITIONALASSIGNMENT)) {
                            val guardName = node.getStringAnnotationValue(ANNOTATION_CONDITIONALASSIGNMENT)
                            
                            annotationMapping.putAll(guardName, context.getTargetElements(node).filter(typeof(KRendering)))
                            
//                            val associatedConditional = node.incoming.filter(typeof(ControlFlow)).head.eContainer as Conditional
//                            annotationMapping.putAll(guardName, context.getTargetElements(associatedConditional).filter(typeof(KRendering)))   
                        }
                    }
                }
                if (scg.hasAnnotation(ANNOTATION_GUARDCREATOR)) {
                    for (guard : scg.guards) {
                        val schedulingBlock = guard.schedulingBlockLink
                        if (schedulingBlock != null) {
                            guardMapping.putAll(guard.valuedObject.name,
                                context.getTargetElements(schedulingBlock).filter(typeof(KRendering)))
                        }
                    }
                }
                LightDiagramServices.layoutDiagram(context)
            }
        ] 
        Display.getDefault().syncExec(run)
       
    }
    
    override isObserver() {
        true
    }
    
    override isProducer() {
        false
    }
    
    override isHistoryObserver() {
        true
    }
    
    
    override wrapup() throws KiemInitializationException {
        
        val Runnable run = [|
            for(node : annotationNodes) {
                node.parent.children.remove(node)
            }
            highlight(<String> newHashSet)
        ]
        Display.getDefault().syncExec(run)
        
    }
    
    override step(JSONObject jSONObject) throws KiemExecutionException {
        
        val highlighting = <String> newHashSet
        for(key : jSONObject.keys.toIterable) {
            if ((key as String).startsWith(BasicBlockTransformation::GUARDPREFIX)) {
                val object = jSONObject.get(key)
                if (object instanceof JSONObject && (object as JSONObject).has("value")) {
                    val value = (object as JSONObject).get("value")
                    if ((value as Integer) != 0) {
                        if (key.endsWith(DepthJoinSynchronizer::SCHIZOPHRENIC_SUFFIX)) {
                            val myKey = key.substring(0,key.length-2)
                            highlighting += myKey                            
                        } else {
                            highlighting += key                            
                        }
                    }
                }
            }
        }  
        
        highlight(highlighting)
        
        jSONObject
    }
    
    protected def IEditorPart getActiveEditor() {
        val Maybe<IEditorPart> maybe = new Maybe<IEditorPart>();
        val Runnable run = [|
            val IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            val IWorkbenchPage activePage = window.getActivePage();
            val IEditorPart editor = activePage.getActiveEditor();
            maybe.set(editor);
        ] 
        Display.getDefault().syncExec(run)
        return maybe.get();
    }
    
    
    protected static val HIGHLIGHTING_MARKER = new Property<Boolean>("de.cau.cs.kieler.scg.sim.guardHighlighting", false);
    
    protected def void highlight(Set<String> guards) {
        
        val Runnable run = [|
            for(entry : guardMapping.entries) {
                
                val highlighting = entry.value.styles.findFirst[ getProperty(HIGHLIGHTING_MARKER) ]
                
                // check if style is already present
                if (guards.contains(entry.key)) {
                    if (highlighting == null) {
                        val KBackground style = KRenderingFactory.eINSTANCE.createKBackground()
                        style.setProperty(HIGHLIGHTING_MARKER, true);
                        //style.setColor(Colors::LIGHT_SEA_GREEN)
                        style.setColor(Colors::LIGHT_SALMON)
                        entry.value.styles.add(style)
                    } 
                } else {
                    if (highlighting != null) {
                        entry.value.styles.remove(highlighting)
                    }                                            
                }
            }
            for(entry : annotationMapping.entries) {
                
                val highlighting = entry.value.styles.findFirst[ getProperty(HIGHLIGHTING_MARKER) ]
                
                // check if style is already present
                if (guards.contains(entry.key)) {
                    if (highlighting == null) {
                        val KBackground style = KRenderingFactory.eINSTANCE.createKBackground()
                        style.setProperty(HIGHLIGHTING_MARKER, true);
                        style.setColor(Colors::LIGHT_SALMON)
                        entry.value.styles.add(style)
                    } 
                } else {
                    if (highlighting != null) {
                        entry.value.styles.remove(highlighting)
                    }                                            
                }
            }
        ]
        Display.getDefault().syncExec(run)
        
    }
    
    private def KNode synthesizeConditionalAssignmentAnnotation(KNode sourceNode, Assignment assignment, SCGraph scg) {
        val VOName = assignment.getStringAnnotationValue(ANNOTATION_CONDITIONALASSIGNMENT)
        val VO = scg.findValuedObjectByName(VOName)
        val kNode = assignment.createNode(VO) => [ node |
            node.setProperty(CoreOptions.COMMENT_BOX, true)
//            node.setNodeSize(75.0f, 20.0f)
        ]
//            node.setMinimalNodeSize(MINIMALWIDTH, MINIMALHEIGHT) 
        val figure = kNode.addRectangle().setLineWidth(1.0f).background = Colors::YELLOW;
        val assignmentStr = sourceNode.getData(typeof(KRoundedRectangle)).children.filter(typeof(KText)).head.text
        figure.addText(assignmentStr).setSurroundingSpace(4, 0, 2, 0).fontSize = 8
        
        sourceNode.parent.children += kNode
       
        kNode 
    }    
    
    private def KEdge synthesizeConditionalAssignmentLink(KNode aNode, KNode bNode) {
        val kEdge = createNewEdge() => [ edge |
            // Get and set source and target information.
            var sourceNode = aNode
            var targetNode = bNode
            edge.source = sourceNode
            edge.target = targetNode
            edge.sourcePort = aNode.getPort("DEBUGPORT")
            edge.targetPort = bNode.getPort("DEBUGPORT")            

            edge.addPolyline(1.0f) => [
                it.lineStyle = LineStyle::DOT
                it.foreground = Colors::GRAY
            ]
            
        ]
        
        kEdge
    }       
    
}