/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
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
import de.cau.cs.kieler.prom.common.PromPlugin
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
    private var boolean isImageUnchanged
    private var Visualization kvisConfig
    private var IFile kvisFile
    private var IFile svgImage
    @Accessors(PUBLIC_GETTER)
    private var DataPool lastPool
    private var boolean linkWithSimulation = true
    
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

    private def void loadFile(IFile file, boolean force) {
        // Only load the file if anything has changed
        // or we are forced to load the file no matter what.
        if(!force && isImageUnchanged) {
            return;                
        }
        try {
            if (!file.fileExtension.toLowerCase.equals(KVIS_FILE_EXTENSION)) {
                throw new Exception("Selection is not a kvis file.")
            }
            val model = ModelImporter.load(file)
            if (model != null) {
                if (model instanceof Visualization) {
                    kvisConfig = model
                    kvisFile = file
                    saveUsedKvisFile(kvisFile)
                    updateAfterRendering = true
                    isImageUnchanged = true
                    lastPool = null
                    // Load image file relative to the location of the configuration file
                    val project = file.project
                    val imagePath = file.parent.projectRelativePath.append(kvisConfig.image)
                    svgImage = project.getFile(imagePath)
                    if(!svgImage.exists) {
                        throw new IllegalArgumentException("The SVG file '"+svgImage.projectRelativePath +"' "
                                                         + "was not found in the project '"+file.project.name+"'.")
                    }
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

    public def void reload(boolean force) {
        if (kvisFile != null) {
            loadFile(kvisFile, force)
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
                loadFile(file as IFile, true)
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
        canvas.svgCanvas.enableRotateInteractor = false
    
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
            override documentLoadingCancelled(SVGDocumentLoaderEvent event) {
            }
            override documentLoadingStarted(SVGDocumentLoaderEvent event) {
            }
            override documentLoadingCompleted(SVGDocumentLoaderEvent event) {
                // Now that the document is loaded,
                // we can configure the animation and interactions from the kvis file.
                try {
                    createAnimationHandlers(kvisConfig)
                    createInteractionHandlers(kvisConfig)
                } catch(Exception ex) {
                    showError(ex)
                }
            }
            override documentLoadingFailed(SVGDocumentLoaderEvent event) {
                // Show an error that the loading failed.
                // This might be caused by flowed text created in Inkscape
                // because this feature is not yet fully supported in SVG specification.
                // (see http://wiki.inkscape.org/wiki/index.php/Frequently_asked_questions#What_about_flowed_text.3F)
                val e = new Exception("Loading of the SVG document failed.\n\n"
                                     + "This might be caused by flowed text in the SVG, which is not supported.\n"
                                     + "(http://wiki.inkscape.org/wiki/index.php/Frequently_asked_questions#What_about_flowed_text.3F)")
                showError(e)
            }
        })

        // Add load listener to update immediately in running simulation when changing visualization config.
        canvas.svgCanvas.addGVTTreeRendererListener(new GVTTreeRendererAdapter(){
            var long time
            override gvtRenderingStarted(GVTTreeRendererEvent e) {
                time = System.currentTimeMillis
//                println("Rendering started")
            }
            
            override gvtRenderingCompleted(GVTTreeRendererEvent e) {
//                println("Rendering took "+(System.currentTimeMillis-time))
                // Immediately update svg with new data pool after refresh
                if(updateAfterRendering) {
                    updateAfterRendering = false
                    if(SimulationManager.instance != null
                        && !SimulationManager.instance.isStopped
                        && SimulationManager.instance.currentPool != null
                        && SimulationManager.instance.currentPool !== lastPool) {
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
                            reload(true)
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
        
        mgr.add(new KVisViewToolbarAction("Reload", "refresh.png") {
            override run() {
                if(kvisFile != null && svgImage != null) {
                    reload(true)    
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
                        loadFile(result as IFile, true)
                    }
                }
            }
        })
        mgr.add(new KVisViewToolbarAction("Export Image", "saveFile.png") {
            override run() {
                saveSVGDocument
            }
        })
        mgr.add(new KVisViewToolbarAction("Link with simulation", "linked.png", linkWithSimulation) {
            override isChecked() {
                return linkWithSimulation
            }
            
            override run() {
                linkWithSimulation = !linkWithSimulation
                firePropertyChange(CHECKED, Boolean.valueOf(!linkWithSimulation), Boolean.valueOf(linkWithSimulation));
                if(linkWithSimulation && SimulationManager.instance != null) {
                    update(SimulationManager.instance.currentPool)    
                }
            }
        })
        mgr.add(new KVisViewToolbarAction("Show Controls", "help.png") {
            override run() {
                val title = "Controls for the Simulation Visualization View"
                val message = "Shift + Mouse Drag : Move\n"
                             + "Shift + Right Mouse Button : Zoom\n"
                             + "Ctrl + Left Mouse Button : Zoom to rectangle\n"
                             + "Ctrl + Shift + Right Mouse Button : Reset perspective\n"
                             + "Mouse Wheel : Zoom in / out\n"
                             + "Arrow Keys : Scroll\n"
                             + "Shift + Arrow Keys : Fast scroll\n"
                val dialog = new MessageDialog(canvas.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
    }

    /**
     * Updates the image with the loaded configuration.
     * This method has to be called in the UI thread.
     */
    public def void update(DataPool pool) {
        if(!linkWithSimulation || kvisFile == null || svgImage == null) {
            return
        }
        
        // If there is no pool (simulation was stopped), then return to original state
        if(pool == null) {
            reload(false)
        } else {
            isImageUnchanged = false
            // Execute interactions if needed
            for(interaction : interactionHandlers) {
                interaction.apply(pool)
            }
            
            // Update svg with data from pool
            if(pool !== lastPool) {
                // Make all changes to the svg in the update manager.
                // Otherwise the svg canvas is not updated properly.
                lastPool = pool
                val runnable = new Runnable() {
                    override run() {
                        // As this is invoked later in another thread,
                        // the pool that should be visualized might already be outdated
                        if(SimulationManager.instance != null && pool == SimulationManager.instance.currentPool) {
                            val time = System.currentTimeMillis
                            try {
                                for (animation : animationHandlers) {
                                    animation.apply(pool)
                                }    
                            } catch (Exception e) {
                                showError(e)
                            }
//                            println("KVis update took "+(System.currentTimeMillis-time))
                        }
                    }
                }
                canvas?.svgCanvas?.getUpdateManager()?.getUpdateRunnableQueue()?.invokeLater(runnable)
            }
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
                if(KVisView.instance != null && KVisView.instance.lastPool !== e.newPool) {
                    // Update the view in the UI thread
                    PromPlugin.asyncExecInUI[KVisView.instance?.update(SimulationManager.instance?.currentPool)]
                }
            }
        }
        return listener
    }
}
