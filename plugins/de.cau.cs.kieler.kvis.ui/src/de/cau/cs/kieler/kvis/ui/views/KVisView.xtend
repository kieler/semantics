/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kvis.ui.views

import de.cau.cs.kieler.kvis.kvis.Visualization
import de.cau.cs.kieler.kvis.ui.animations.AnimationHandler
import de.cau.cs.kieler.kvis.ui.animations.ColorAnimation
import de.cau.cs.kieler.kvis.ui.svg.KVisCanvas
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import java.util.List
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter
import org.apache.batik.swing.gvt.GVTTreeRendererEvent
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceChangeEvent
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.Action
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.part.ViewPart
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kvis.ui.animations.WalkPathAnimation

/**
 * @author aas
 * 
 */
class KVisView extends ViewPart {

    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"

    public static val KVIS_FILE_EXTENSION = "kvis"

    @Accessors(PUBLIC_GETTER)
    private static var KVisView instance

    @Accessors(PUBLIC_GETTER)
    private KVisCanvas canvas

    private val List<AnimationHandler> animationHandlers = newArrayList()

    private var IResourceChangeListener resourceChangeListener
    private var boolean updateAfterRendering
    private var IFile lastFile
    private var DataPool lastPool

    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this

        // Create canvas
        createCanvas(parent)

        // Create menu and toolbars.
        createMenu()
        createToolbar()
    }

    /**
     * Dispose and clear reference to singleton instance.
     */
    override dispose() {
        super.dispose()
        instance = null
    }

    /**
     * {@inheritDoc}
     */
    override setFocus() {
    }

    private def void loadFile(IFile file) {
        try {
            if (!file.fileExtension.toLowerCase.equals(KVIS_FILE_EXTENSION)) {
                throw new Exception("Selection is not a kvis file.")
            }
            val model = ModelImporter.load(file)
            if (model != null) {
                if (model instanceof Visualization) {
                    lastPool = null
                    lastFile = file
                    updateAfterRendering = true
                    // Load image
                    val project = file.project
                    val imagePath = model.image
                    val imageFile = project.getFile(imagePath)
                    canvas.setSVGFile(imageFile)
    
                    // Load animations
                    createAnimationHandlers(model)    
                    // Register resource change listener for the files
                    registerResourceChangeListener(file, imageFile)
                }
            }
        } catch(Exception e) {
            showError(e)
        }
    }
    
    private def void createAnimationHandlers(Visualization model) {
        animationHandlers.clear()
        for (element : model.elements) {
            for (animation : element.animations) {
                var AnimationHandler handler
                switch(animation.type) {
                    case "color": {
                        handler = new ColorAnimation(element.name, animation)
                    }
                    case "walkPath": {
                        handler = new WalkPathAnimation(element.name, animation)
                    }
                    default: {
                        throw new Exception("No animation handler was found for "+animation.type)
                    }
                }
                if(animation != null) {
                    animationHandlers.add(handler)
                }
            }
        }
    }

    private def void registerResourceChangeListener(IFile... files) {
        // Remove old listener
        if(resourceChangeListener != null) {
            ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener)    
        }
        // Create new listener
        resourceChangeListener = new IResourceChangeListener() {
            override resourceChanged(IResourceChangeEvent event) {
                val rootDelta = event.getDelta();
                if (rootDelta != null) {
                    for(file : files) {
                        val fileDelta = rootDelta.findMember(file.fullPath);
                        if (fileDelta != null) {
                            reload()
                        }
                    }
                }
            }
        };
        // Add new listener
        ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
    }

    public def void reload() {
        if (lastFile != null) {
            println("Reloading KVis View")
            loadFile(lastFile)
        }
    }

    private def void createCanvas(Composite parent) {
        canvas = new KVisCanvas(parent, SWT.NONE, false)
        
        // Add load listener to update immediately in running simulation when changing visualization config.
        canvas.svgCanvas.addGVTTreeRendererListener(new GVTTreeRendererAdapter(){
            
            override gvtRenderingCompleted(GVTTreeRendererEvent e) {
                // Immediately update svg with new data pool after refresh
                if(updateAfterRendering) {
                    updateAfterRendering = false
                    if(SimulationManager.instance != null
                        && !SimulationManager.instance.isStopped
                        && SimulationManager.instance.currentPool != lastPool) {
                        update(SimulationManager.instance.currentPool)
                    }
                }
            }
        })
    }

    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
    }

    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager();
        mgr.add(new Action("Refresh") {
            override run() {
                reload()
            }
        })
        mgr.add(new Action("Open KVis File") {
            override run() {
                val rootElement = ResourcesPlugin.getWorkspace().getRoot()

                val dialog = new ResourceSelectionDialog(canvas.shell, rootElement, "")
                dialog.open()

                val results = dialog.result
                if (results != null && results.size > 0) {
                    val result = results.get(0) as IResource
                    if (result.type == IResource.FILE) {
                        loadFile(result as IFile)
                    }
                }
            }
        })
    }

    public def void update(DataPool pool) {
        // Make all changes to the svg in the update manager.
        // Otherwise the svg canvas is not updated properly.
        lastPool = pool
        canvas.svgCanvas.getUpdateManager().getUpdateRunnableQueue().invokeLater(new Runnable() {
            override run() {
                try {
                    for (animation : animationHandlers) {
                        animation.apply(pool)
                    }    
                } catch (Exception e) {
                    showError(e)
                }
            }
        })
    }
    
    private def void showError(Exception e) {
        e.printStackTrace
        val s = new Status(IStatus.ERROR, "de.cau.cs.kieler.kvis.ui", e.getMessage(), e);
        StatusManager.getManager().handle(s, StatusManager.SHOW);
    }
}
