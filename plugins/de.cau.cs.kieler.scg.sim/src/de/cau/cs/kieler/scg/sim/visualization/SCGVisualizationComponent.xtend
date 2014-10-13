/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.sim.visualization

import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent
import de.cau.cs.kieler.sim.kiem.KiemInitializationException
import org.json.JSONObject
import de.cau.cs.kieler.sim.kiem.KiemExecutionException
import org.eclipse.ui.IEditorPart
import de.cau.cs.kieler.core.util.Maybe
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.PlatformUI
import de.cau.cs.kieler.kico.klighd.KiCoModelViewManager
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.core.krendering.KRendering
import com.google.common.collect.HashMultimap
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.scg.guardCreation.AbstractGuardCreator
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.transformations.BasicBlockTransformation
import java.util.Set
import de.cau.cs.kieler.core.properties.IProperty
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.core.krendering.KBackground
import de.cau.cs.kieler.core.krendering.KRenderingFactory
import de.cau.cs.kieler.core.krendering.Colors

/**
 * @author ssm als
 *
 */
class SCGVisualizationComponent extends JSONObjectDataComponent {
    
    val AnnotationsExtensions = Guice.createInjector.getInstance(typeof(AnnotationsExtensions))
    
    val HashMultimap<String, KRendering>guardMapping =  HashMultimap.create
    
    override initialize() throws KiemInitializationException {
        
        val diagramEditor = getActiveEditor();
        if (diagramEditor == null) {
            return;
        }

        val viewParts = KiCoModelViewManager.getInstance().getModelViews(diagramEditor)
        if (viewParts.empty) {
            throw new KiemInitializationException(
                    "Model visualization not shown, cannot visualize simulation.", true, null);
        }
        
        guardMapping.clear
        
        val contexts = viewParts.map[ viewer.viewContext ].filter[ inputModel instanceof SCGraph ]
        
        for(context : contexts) {
            val scg = context.inputModel as SCGraph
            if (AnnotationsExtensions.hasAnnotation(scg, AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)) {
                for(node : scg.nodes.filter(typeof(Assignment)).filter[ valuedObject != null && valuedObject.name.startsWith(BasicBlockTransformation::GUARDPREFIX)]) {
                    guardMapping.putAll(node.valuedObject.name, context.getTargetElements(node).filter(typeof(KRendering)))
                }                
            }
            if (AnnotationsExtensions.hasAnnotation(scg, AbstractGuardCreator::ANNOTATION_GUARDCREATOR)) {
                for(guard : scg.guards) {
                    val schedulingBlock = guard.schedulingBlockLink
                    if (schedulingBlock != null) {
                        guardMapping.putAll(guard.valuedObject.name, context.getTargetElements(schedulingBlock).filter(typeof(KRendering)))
                    }
                }
            }
        }
       
    }
    
    override isObserver() {
        true
    }
    
    override isProducer() {
        false
    }
    
    override wrapup() throws KiemInitializationException {
        
    }
    
    override step(JSONObject jSONObject) throws KiemExecutionException {
        highlight(<String> newHashSet ("g1", "g2"))
        
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
                        style.setColor(Colors::LIGHT_SEA_GREEN)
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
    
}