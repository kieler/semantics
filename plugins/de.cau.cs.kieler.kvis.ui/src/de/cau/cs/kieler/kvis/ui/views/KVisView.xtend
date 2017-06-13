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

import com.google.common.io.Files
import de.cau.cs.kieler.kvis.kvis.Visualization
import de.cau.cs.kieler.kvis.ui.animations.AnimationHandler
import de.cau.cs.kieler.kvis.ui.animations.ColorAnimation
import de.cau.cs.kieler.kvis.ui.animations.MoveAnimation
import de.cau.cs.kieler.kvis.ui.animations.RotateAnimation
import de.cau.cs.kieler.kvis.ui.animations.TextAnimation
import de.cau.cs.kieler.kvis.ui.animations.WalkPathAnimation
import de.cau.cs.kieler.kvis.ui.svg.KVisCanvas
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import java.awt.event.MouseListener
import java.awt.event.MouseWheelEvent
import java.awt.geom.AffineTransform
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
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
import org.eclipse.swt.events.MouseEvent
import org.eclipse.swt.events.MouseWheelListener
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.part.ViewPart
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors
import org.apache.batik.swing.JSVGCanvas.AffineAction
import org.eclipse.jface.dialogs.MessageDialog

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
    private var IFile kvisFile
    private var IFile svgImage
    private var DataPool lastPool
    var double scale = 1
    
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
                    kvisFile = file
                    updateAfterRendering = true
                    // Load image
                    val project = file.project
                    val imagePath = model.image
                    svgImage = project.getFile(imagePath)
                    canvas.setSVGFile(svgImage)
    
                    // Load animations
                    createAnimationHandlers(model)    
                    // Register resource change listener for the files
                    registerResourceChangeListener(file, svgImage)
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
                    case "move": {
                        handler = new MoveAnimation(element.name, animation)
                    }
                    case "rotate": {
                        handler = new RotateAnimation(element.name, animation)
                    }
                    case "text": {
                        handler = new TextAnimation(element.name, animation)
                    }
                    default: {
                        throw new Exception("No animation handler was found for '"+animation.type + "'\n"
                                            + "Available animation handlers are:\n"
                                            + "color, move, rotate, walkPath, text")
                    }
                }
                if(animation != null) {
                    animationHandlers.add(handler)
                }
            }
        }
    }

    public def void reload() {
        if (kvisFile != null) {
            println("Reloading KVis View")
            loadFile(kvisFile)
        }
    }

    private def void saveSVGDocument() {
        // If no image was loaded then there is no image to be saved
        if(kvisFile == null || svgImage == null) {
            return
        }
        // Open file dialog
        val dialog = new FileDialog(canvas.shell, SWT.SAVE)
        dialog.filterExtensions = #{"*.svg"}
        if(kvisFile != null && svgImage != null) {
            dialog.filterPath = kvisFile.location.removeLastSegments(1).toOSString
            val suffix = "_export"
            val fileExtension = ".svg"
            dialog.fileName = Files.getNameWithoutExtension(svgImage.name) + suffix + fileExtension
        }
        val result = dialog.open()
        // Save svg image to selected file
        if(result != null) {
            // Remove old file
            val file = new File(result)
            if(file.exists) {
                file.delete()    
            }
            // Create new file with svg image
            canvas.saveSVGDocument(file.absolutePath)
        }
    }    

    private def void createCanvas(Composite parent) {
        canvas = new KVisCanvas(parent, SWT.NONE, false)
        
        // Zoom in/out via mouse wheel
        canvas.svgCanvas.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            override mouseWheelMoved(MouseWheelEvent e) {
                val at = canvas.svgCanvas.renderingTransform
                val direction = Math.signum(e.wheelRotation)
                if(direction > 0) {
                    at.scale(0.9, 0.9)
                } else if(direction < 0) {
                    at.scale(1.1, 1.1)
                }
                canvas.svgCanvas.setRenderingTransform(at, true)
            }
        })

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

    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
    }

    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager();
        mgr.add(new Action("Show Controls") {
            override run() {
                val title = "Controls for the Simulation Visualization View"
                val message = "Shift + Mouse Drag : Move\n"
                             + "Ctrl + Left Mouse Button : Zoom to rectangle\n"
                             + "Ctrl + Right Mouse Button : Rotate\n"
                             + "Mouse Wheel : Zoom in / out\n"
                val dialog = new MessageDialog(canvas.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
        mgr.add(new Action("Save Image") {
            override run() {
                saveSVGDocument
            }
        })
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
        // Show stack trace to user
        val sw = new StringWriter();
        val pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        sw.toString();
        var stackTrace = sw.toString
        if(stackTrace.length > 500) {
            stackTrace = stackTrace.substring(0, 500)+"..."
        }
        val s = new Status(IStatus.ERROR, "de.cau.cs.kieler.kvis.ui", e.message + "\n\n" + stackTrace, e);
        StatusManager.getManager().handle(s, StatusManager.SHOW);
    }
}
