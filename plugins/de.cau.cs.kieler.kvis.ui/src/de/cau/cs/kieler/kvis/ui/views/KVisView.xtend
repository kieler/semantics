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
import de.cau.cs.kieler.kvis.ui.KVisUiModule
import de.cau.cs.kieler.kvis.ui.animations.AnimationHandler
import de.cau.cs.kieler.kvis.ui.animations.ColorAnimation
import de.cau.cs.kieler.kvis.ui.animations.MoveAnimation
import de.cau.cs.kieler.kvis.ui.animations.RotateAnimation
import de.cau.cs.kieler.kvis.ui.animations.TextAnimation
import de.cau.cs.kieler.kvis.ui.animations.WalkPathAnimation
import de.cau.cs.kieler.kvis.ui.interactions.InteractionHandler
import de.cau.cs.kieler.kvis.ui.svg.KVisCanvas
import de.cau.cs.kieler.prom.common.ModelImporter
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationEvent
import de.cau.cs.kieler.simulation.core.SimulationListener
import de.cau.cs.kieler.simulation.core.SimulationManager
import java.awt.event.MouseWheelEvent
import java.awt.event.MouseWheelListener
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.util.List
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter
import org.apache.batik.swing.gvt.GVTTreeRendererEvent
import org.apache.batik.swing.svg.SVGDocumentLoaderEvent
import org.apache.batik.swing.svg.SVGDocumentLoaderListener
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceChangeEvent
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.preferences.InstanceScope
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.part.ViewPart
import org.eclipse.ui.statushandlers.StatusManager
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * @author aas
 * 
 */
class KVisView extends ViewPart {

    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"

    public static val KVIS_FILE_EXTENSION = "kvis"

    public static val simulationListener = createSimulationListener

    @Accessors(PUBLIC_GETTER)
    private static var KVisView instance

    @Accessors(PUBLIC_GETTER)
    private KVisCanvas canvas

    private val List<AnimationHandler> animationHandlers = newArrayList()
    private val List<InteractionHandler> interactionHandlers = newArrayList()

    private var IResourceChangeListener resourceChangeListener
    private var boolean updateAfterRendering
    private var Visualization kvisConfig
    private var IFile kvisFile
    private var IFile svgImage
    private var DataPool lastPool
    
    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
        SimulationManager.addListener(simulationListener)
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
                    kvisConfig = model
                    lastPool = null
                    kvisFile = file
                    saveUsedKvisFile(kvisFile)
                    updateAfterRendering = true
                    // Load image
                    val project = file.project
                    val imagePath = kvisConfig.image
                    svgImage = project.getFile(imagePath)
                    canvas.setSVGFile(svgImage)
    
                    // Register resource change listener for the files
                    registerResourceChangeListener(file, svgImage)
                }
            }
        } catch(Exception e) {
            showError(e)
        }
    }
    
    private def void createInteractionHandlers(Visualization model) {
        interactionHandlers.clear
        for(interaction : model.interactions) {
            val interactionHandler = new InteractionHandler(interaction)
            interactionHandlers.add(interactionHandler)
        }
    }
    
    private def void createAnimationHandlers(Visualization model) {
        animationHandlers.clear
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
            loadFile(kvisFile)
        }
    }

    private def void saveUsedKvisFile(IFile file) {
        val prefs = InstanceScope.INSTANCE.getNode(KVisUiModule.PLUGIN_ID)
        prefs.put(KVisUiModule.LAST_KVIS_FILE, file?.fullPath.toOSString)
    }

    public def void loadLastKvisFile() {
        val prefs = InstanceScope.INSTANCE.getNode(KVisUiModule.PLUGIN_ID)
        val path = prefs.get(KVisUiModule.LAST_KVIS_FILE, "")
        if(!path.isNullOrEmpty) {
            val workspaceRoot = ResourcesPlugin.workspace.root
            val file = workspaceRoot.findMember(path)
            if(file != null && file.exists && file.type == IResource.FILE){
                loadFile(file as IFile)
            }            
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
        canvas.svgCanvas.addMouseWheelListener(new MouseWheelListener() {
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

        canvas.svgCanvas.addSVGDocumentLoaderListener(new SVGDocumentLoaderListener() {
            
            override documentLoadingCancelled(SVGDocumentLoaderEvent e) {
            }
            
            override documentLoadingCompleted(SVGDocumentLoaderEvent e) {
                // Now that the document is loaded,
                // we can configure the animation and interactions from the kvis file.
                createAnimationHandlers(kvisConfig)
                createInteractionHandlers(kvisConfig)
            }
            
            override documentLoadingFailed(SVGDocumentLoaderEvent e) {
            }
            
            override documentLoadingStarted(SVGDocumentLoaderEvent e) {
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
        mgr.add(new KVisViewToolbarAction("Show Controls", "help.png") {
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
        mgr.add(new KVisViewToolbarAction("Export Image", "saveFile.png") {
            override run() {
                saveSVGDocument
            }
        })
        mgr.add(new KVisViewToolbarAction("Reload", "refresh.png") {
            override run() {
                if(kvisFile != null && svgImage != null) {
                    reload()    
                } else {
                    loadLastKvisFile()
                }
            }
        })
        mgr.add(new KVisViewToolbarAction("Open KVis File", "openFile.png") {
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
        if(kvisFile == null && svgImage == null) {
            return
        }
        
        // If there is no pool (simulation was stopped), then return to original state
        if(pool == null) {
            reload
        } else {
            // Execute interactions if needed
            for(interaction : interactionHandlers) {
                interaction.apply(pool)
            }
            
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
    
    private static def SimulationListener createSimulationListener() {
        val listener = new SimulationListener() {
            override update(SimulationEvent e) {
                // Execute in UI thread
                Display.getDefault().asyncExec(new Runnable() {
                    override void run() {
                        KVisView.instance?.update(SimulationManager.instance?.currentPool)
                    }
                });
            }
        }
        return listener
    }
}
