package de.cau.cs.kieler.circuit.kivi

import com.google.common.collect.HashMultimap
import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Module
import de.cau.cs.kieler.core.kgraph.KGraphFactory
import de.cau.cs.kieler.core.kgraph.KNode
import de.cau.cs.kieler.core.krendering.Colors
import de.cau.cs.kieler.core.krendering.KBackground
import de.cau.cs.kieler.core.krendering.KRendering
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.core.util.Maybe

import de.cau.cs.kieler.circuit.Actor

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent
import de.cau.cs.kieler.sim.kiem.KiemExecutionException
import de.cau.cs.kieler.sim.kiem.KiemInitializationException
import java.util.Set
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PlatformUI
import org.json.JSONObject
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared
import com.google.inject.Scopes
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.core.krendering.extensions.KNodeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.core.krendering.extensions.KPortExtensions
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData
import de.cau.cs.kieler.kiml.options.LayoutOptions
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.LightDiagramServices
import de.cau.cs.kieler.core.krendering.LineStyle
import de.cau.cs.kieler.core.kgraph.KEdge
import de.cau.cs.kieler.core.krendering.KRectangle
import de.cau.cs.kieler.core.krendering.KText
import de.cau.cs.kieler.core.krendering.KRoundedRectangle

import de.cau.cs.kieler.klighd.ui.view.DiagramView



class CircuitVisualizationDataComponent extends JSONObjectDataComponent {


    
    val Module configure = [Binder binder|
        binder.bindScope(typeof(ViewSynthesisShared), Scopes.SINGLETON);
    ]
    val injector = Guice.createInjector(configure)
    
    
    extension AnnotationsExtensions = injector.getInstance(typeof(AnnotationsExtensions))
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
        
        val contexts = viewParts.map[ viewer.viewContext ].filter[ inputModel instanceof Actor ]

        val Runnable run = [|
        	
        	for(context : contexts){
        		val circuit = context.inputModel as Actor
        		if(circuit.innerActors != null ){
        			for(actor : circuit.eAllContents.filter(Actor).toList){
        				System.out.println(actor.name + "+++++++++++++++++++++++++++-----++++++++++++++++++++++++++++")
        				if(actor.name.startsWith("g")){
        					guardMapping.putAll(actor.name,context.getTargetElements(actor).filter(KRendering))
        				}
        				
        			}
        		}
        	
        	
//            for (context : contexts) {
//                val scg = context.inputModel as SCGraph
//                if (scg.hasAnnotation(SCGFeatures::SEQUENTIALIZE_ID)) {
//                    for (node : scg.nodes.filter(typeof(Assignment)).filter[valuedObject != null]) {
//                        if (node.valuedObject.name.startsWith(BasicBlockTransformation::GUARDPREFIX)) {
//                            guardMapping.putAll(node.valuedObject.name,
//                                context.getTargetElements(node).filter(typeof(KRendering)))
//                        }
//                        if (node.hasAnnotation(AbstractSequentializer::ANNOTATION_CONDITIONALASSIGNMENT)) {
//                            val guardName = node.getStringAnnotationValue(AbstractSequentializer::ANNOTATION_CONDITIONALASSIGNMENT)
//                            
//                            annotationMapping.putAll(guardName, context.getTargetElements(node).filter(typeof(KRendering)))
//                            
////                            val associatedConditional = node.incoming.filter(typeof(ControlFlow)).head.eContainer as Conditional
////                            annotationMapping.putAll(guardName, context.getTargetElements(associatedConditional).filter(typeof(KRendering)))   
//                        }
//                    }
//                }
//                if (scg.hasAnnotation(AbstractGuardCreator::ANNOTATION_GUARDCREATOR)) {
//                    for (guard : scg.guards) {
//                        val schedulingBlock = guard.schedulingBlockLink
//                        if (schedulingBlock != null) {
//                            guardMapping.putAll(guard.valuedObject.name,
//                                context.getTargetElements(schedulingBlock).filter(typeof(KRendering)))
//                        }
//                    }
//                }

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
    
    
   
    
    override step(JSONObject jSONObject) throws KiemExecutionException {
        
        val highlighting = <String> newHashSet
        for(key : jSONObject.keys.toIterable) {
            if ((key as String).startsWith("g")) {
                val object = jSONObject.get(key)
                if (object instanceof JSONObject && (object as JSONObject).has("value")) {
                    val value = (object as JSONObject).get("value")
                    if ((value as Integer) != 0) {
//                        if (key.endsWith(DepthJoinSynchronizer::SCHIZOPHRENIC_SUFFIX)) {
//                            val myKey = key.substring(0,key.length-2)
//                            highlighting += myKey                            
//                        } else {
                            highlighting += key                            
//                        }
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
                        style.setColor(Colors::RED)
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
    
     
    
    

override wrapup() throws KiemInitializationException {
	throw new UnsupportedOperationException("TODO: auto-generated method stub")
}



}