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
package de.cau.cs.kieler.kivis.ui.views

import com.google.common.io.Files
import de.cau.cs.kieler.kivis.kivis.VisualizationConfiguration
import de.cau.cs.kieler.kivis.ui.KiVisUiModule
import de.cau.cs.kieler.kivis.ui.animations.AnimationHandler
import de.cau.cs.kieler.kivis.ui.animations.ColorAnimation
import de.cau.cs.kieler.kivis.ui.animations.MoveAnimation
import de.cau.cs.kieler.kivis.ui.animations.RotateAnimation
import de.cau.cs.kieler.kivis.ui.animations.TextAnimation
import de.cau.cs.kieler.kivis.ui.animations.WalkPathAnimation
import de.cau.cs.kieler.kivis.ui.interactions.InteractionHandler
import de.cau.cs.kieler.kivis.ui.svg.KiVisCanvas
import de.cau.cs.kieler.kivis.ui.svg.SVGExtensions
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.prom.ui.views.LabelContribution
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationEvent
import de.cau.cs.kieler.simulation.core.SimulationEventType
import de.cau.cs.kieler.simulation.core.SimulationListener
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import java.awt.event.MouseWheelEvent
import java.awt.event.MouseWheelListener
import java.awt.geom.AffineTransform
import java.io.File
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
import org.eclipse.core.runtime.preferences.InstanceScope
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.events.DisposeEvent
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.events.MouseAdapter
import org.eclipse.swt.events.MouseEvent
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.Point
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.layout.RowLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Label
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtend.lib.annotations.Accessors
import org.w3c.dom.Element
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventListener

/**
 * @author aas
 * 
 */
class KiVisView extends ViewPart {

    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"

    public static val KIVIS_FILE_EXTENSION = "kivis"

    public static val simulationListener = createSimulationListener

    private static extension SVGExtensions svgExtensions = new SVGExtensions

    @Accessors(PUBLIC_GETTER)
    private static var KiVisView instance

    @Accessors(PUBLIC_GETTER)
    private KiVisCanvas canvas

    private var List<AnimationHandler> animationHandlers = newArrayList()
    private var List<InteractionHandler> interactionHandlers = newArrayList()

    private var IResourceChangeListener resourceChangeListener
    private var boolean updateAfterRendering
    private var boolean isImageUnchanged
    private var VisualizationConfiguration kivisConfig
    private var IFile kivisFile
    private var IFile svgImage
    @Accessors(PUBLIC_GETTER)
    private var DataPool lastPool
    private var boolean linkWithSimulation = true
    private var AffineTransform lastRenderingTransform
    
    private var LabelContribution currentFileLabel
    
    private Composite control
    
    /** The icon for closing the message container. */
    val CLOSE_ICON = PromUIPlugin.imageDescriptorFromPlugin(KiVisUiModule.PLUGIN_ID, "icons/close.png")
    /** Container for displaying warings and errors. */
    private Composite messageContainer
    
    private var interactionsForEvent = <String, List<InteractionHandler>> newHashMap
    private var listenerForEvent = <String, EventListener> newHashMap
    
    /**
     * Flag to ignore variable change events from the simulation.
     * Used to batch a lot of events, e.g., when performing actions from interactions.
     */
    private var boolean ignoreVariableEvents 
    
    /**
     * Flag to remember if the animations and interactions have been loaded already.
     * The loading has to be delayed until the first rendering is done.
     * Otherwise the document may not be loaded completely.
     */
    private boolean initialized
    
    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
        // Remember the parent composite
        control = new Composite(parent, SWT.NONE)
        control.layout = new GridLayout(1, true)
        // Create canvas
        createCanvas(control)
        // TODO: Set size of canvas to fill the view
        canvas.size = new Point(300,300)
        canvas.layoutData = new GridData(GridData.FILL_BOTH)
        // Create menu and toolbars.
        createMenu
        createToolbar
        // Create status line
        createStatusLine
        
        // Add simulation listener
        SimulationManager.addListener(simulationListener)
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
            // Clear messages
            PromUIPlugin.asyncExecInUI[disposeMessageComposite]
            // Check if the file is a configuration file
            if (!file.fileExtension.toLowerCase.equals(KIVIS_FILE_EXTENSION)) {
                throw new IllegalArgumentException("Selection is not a kivis file.")
            }
            // Load the configuration
            PromUIPlugin.asyncExecInUI[currentFileLabel.text = "loading " + file.name]
            val loadConfigStart = System.currentTimeMillis
            val model = ModelImporter.load(file)
            val loadConfigDuration = System.currentTimeMillis-loadConfigStart
            
            if (model != null && model instanceof VisualizationConfiguration) {
                kivisConfig = model as VisualizationConfiguration
                kivisFile = file
                saveUsedKiVisFile(kivisFile)
                initialized = false
                updateAfterRendering = true
                isImageUnchanged = true
                lastPool = null
                // Load image file relative to the location of the configuration file
                val project = file.project
                val imagePath = file.parent.projectRelativePath.append(kivisConfig.image)
                svgImage = project.getFile(imagePath)
                if(!svgImage.exists) {
                    throw new IllegalArgumentException("The SVG file '"+svgImage.projectRelativePath +"' "
                                                     + "was not found in the project '"+file.project.name+"'.")
                }
                canvas.setSVGFile(svgImage)
                
                // Register resource change listener for the files
                registerResourceChangeListener(file, svgImage)
                
                // Set label of currently loaded file
                PromUIPlugin.asyncExecInUI[currentFileLabel.text = "Loaded '"+kivisFile.name+"' in "+loadConfigDuration+" ms"]
            } else {
                throw new IllegalArgumentException("Could not load kivis file. Please check if the file contains errors.")
            }
        } catch(Exception e) {
            showError(e)
        }
    }
    
    private def void createInteractionHandlers(VisualizationConfiguration model) {
        interactionHandlers = newArrayList
        interactionsForEvent = newHashMap
        listenerForEvent = newHashMap
        for(interaction : model.interactions) {
            val interactionHandler = new InteractionHandler(interaction)
            interactionHandlers.add(interactionHandler)
        }
    }
    
    public def void createListenerForInteraction(InteractionHandler handler, Element elem, String elemId, String eventType) {
        val eventId = elemId+"."+eventType
        var interactionsForThisEvent = interactionsForEvent.getOrDefault(eventId, null)
        if(interactionsForThisEvent.isNullOrEmpty) {
            interactionsForThisEvent = newArrayList
        }
        var listener = listenerForEvent.getOrDefault(eventId, null)
        if(listener == null) {
            listener = new EventListener() {
                override handleEvent(Event evt) {
                    val pool = lastPool
                    if(pool == null) {
                        return
                    }
                    try {
                        // Update all variable changes from the interactions at once when done
                        ignoreVariableEvents = true
                        // Perform all actions of active interactions that listen to this event.
                        var interactionsForThisEvent = interactionsForEvent.getOrDefault(eventId, null)
                        if(!interactionsForThisEvent.isNullOrEmpty) {
                            // First get all active interactions, then apply the actions.
                            // Otherwise the state of the data pool may change because of some interaction,
                            // which can alter the active state of other interactions
    
                            // NOTE: Without the toList at the end,
                            // the iterator is messed up and iterates over more elements than it should 
                            val activeInteractionsForThisEvent = interactionsForThisEvent.filter[it.isActive(pool)].toList
                            for(activeInteraction : activeInteractionsForThisEvent) {
                                activeInteraction.performActions
                            }
                        }
                    } catch(Exception e) {
                        showError(e)
                    } finally {
                        ignoreVariableEvents = false
                        update(pool, true)
                    }
                }
            }
        }
        elem.addListener(eventType, listener)
        interactionsForThisEvent.add(handler)
        interactionsForEvent.put(eventId, interactionsForThisEvent)
        listenerForEvent.put(eventId, listener)
    }
    
    private def void createAnimationHandlers(VisualizationConfiguration model) {
        animationHandlers = newArrayList
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
        if (kivisFile != null) {
            // Remember current perspective on image
            lastRenderingTransform = canvas.svgCanvas.renderingTransform
            // Change document
            loadFile(kivisFile, force)
        }
    }

    private def void saveUsedKiVisFile(IFile file) {
        val prefs = InstanceScope.INSTANCE.getNode(KiVisUiModule.PLUGIN_ID)
        prefs.put(KiVisUiModule.LAST_KIVIS_FILE, file?.fullPath.toOSString)
    }

    public def void loadLastKiVisFile() {
        val prefs = InstanceScope.INSTANCE.getNode(KiVisUiModule.PLUGIN_ID)
        val path = prefs.get(KiVisUiModule.LAST_KIVIS_FILE, "")
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
        if(kivisFile == null || svgImage == null) {
            return
        }
        // Open file dialog
        val dialog = new FileDialog(canvas.shell, SWT.SAVE)
        dialog.filterExtensions = #{"*.svg"}
        if(kivisFile != null && svgImage != null) {
            dialog.filterPath = kivisFile.location.removeLastSegments(1).toOSString
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
        canvas = new KiVisCanvas(parent, SWT.EMBEDDED.bitwiseOr(SWT.NO_BACKGROUND), false)
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
                setStatusBarMessage("Rendering started")
            }
            
            override gvtRenderingCompleted(GVTTreeRendererEvent e) {
                // Now that the document is loaded,
                // we can configure the animations and interactions from the kivis file.
                initializeHandlers()
                
                // update the visualization if needed
                val duration = (System.currentTimeMillis-time)
                setStatusBarMessage("Rendering took " + duration + "ms")
                // Immediately update svg with new data pool after refresh
                if(updateAfterRendering) {
                    updateAfterRendering = false
                    //Reset perspective on image
                    if(lastRenderingTransform != null) {
                        canvas.svgCanvas.setRenderingTransform(lastRenderingTransform, true)
                    }
                    // Update visualization with running simulation
                    if(SimulationManager.instance != null
                        && !SimulationManager.instance.isStopped
                        && SimulationManager.instance.currentPool != null
                        && SimulationManager.instance.currentPool !== lastPool) {
                        update(SimulationManager.instance.currentPool, false)
                    }
                }
            }
        })
    }
    
    private def void initializeHandlers() {
        if(!initialized) {
            try {
                createAnimationHandlers(kivisConfig)
                createInteractionHandlers(kivisConfig)
                initialized = true
            } catch(Exception ex) {
                showError(ex)
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
//        val mgr = getViewSite().getActionBars().getMenuManager();
    }

    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager();
        
        mgr.add(new KiVisViewToolbarAction("Reload", "refresh.png") {
            override run() {
                if(kivisFile != null && svgImage != null) {
                    reload(true)    
                } else {
                    loadLastKiVisFile()
                }
            }
        })
        mgr.add(new KiVisViewToolbarAction("Open KiVis File", "openFile.png") {
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
        mgr.add(new KiVisViewToolbarAction("Export Image", "saveFile.png") {
            override run() {
                saveSVGDocument
            }
        })
        mgr.add(new KiVisViewToolbarAction("Link with simulation", "linked.png", linkWithSimulation) {
            override isChecked() {
                return linkWithSimulation
            }
            
            override run() {
                linkWithSimulation = !linkWithSimulation
                firePropertyChange(CHECKED, Boolean.valueOf(!linkWithSimulation), Boolean.valueOf(linkWithSimulation));
                if(linkWithSimulation && SimulationManager.instance != null) {
                    update(SimulationManager.instance?.currentPool, true)    
                }
            }
        })
        mgr.add(new KiVisViewToolbarAction("Show Controls", "help.png") {
            override run() {
                val title = "Controls for the Simulation Visualization View"
                val message = "Left Mouse Button : Move\n"
                             + "Right Mouse Button : Zoom\n"
                             + "\n"
                             + "Ctrl + Left Mouse Button : Zoom to rectangle\n"
                             + "Ctrl + Right Mouse Button : Reset perspective\n"
                             + "\n"
                             + "Ctrl + Arrow Keys : Scroll\n"
                             + "Shift + Arrow Keys : Fast scroll\n"
                             + "\n"
                             + "Escape : Reset perspective\n"
                             + "\n"
                             + "Right Arrow : Step simulation\n"
                val dialog = new MessageDialog(canvas.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
    }
    
    private def void createStatusLine() {
        val bars = getViewSite().getActionBars()
        if(bars != null) {
            val statusLineManager = bars.getStatusLineManager()
            // Add name of currently loaded document to status line
            currentFileLabel = new LabelContribution("de.cau.cs.kieler.kivis.ui.currentFileLabel",
                                                     "",
                                                     "Currently loaded visualization")
            statusLineManager.add(currentFileLabel)
        }
    }

    /**
     * Updates the image with the loaded configuration.
     * This method has to be called in the UI thread.
     */
    public def void update(DataPool pool, boolean force) {
        if(!linkWithSimulation || kivisFile == null || svgImage == null) {
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
            
            // Only update the view with the state of the pool, when the pool changed
            // and the data pool contains valid data, i.e., all variables have been initialized in the first macro tick
            var poolChanged = (pool != lastPool)
            var afterInitialization = (SimulationManager.instance != null
                                       && SimulationManager.instance.currentMacroTickNumber > 0)
            if(force
               || poolChanged && afterInitialization) {
                lastPool = pool
                
                // Update svg with data from pool
                // Make all changes to the svg in the update manager.
                // Otherwise the svg canvas is not updated properly.
                val runnable = new Runnable() {
                    override run() {
                        if(!initialized) {
                            return
                        }
                        
                        // As this is invoked later in another thread,
                        // the pool that should be visualized might already be outdated
                        if(SimulationManager.instance != null && pool == SimulationManager.instance.currentPool) {
                            val time = System.currentTimeMillis
                            try {
                                // Safe reference to animation handlers in case the reference changes concurrently
                                val handlers = animationHandlers
                                for (animation : handlers) {
                                    animation.apply(pool)
                                }
                            } catch (Exception e) {
                                showError(e)
                            }
                            val duration = (System.currentTimeMillis-time)
                            setStatusBarMessage("Update took " + duration + "ms")
                        }
                    }
                }
                canvas?.svgCanvas?.updateManager?.updateRunnableQueue?.invokeLater(runnable)
            }
        }
    }
    
    /**
     * Updates the image with the loaded configuration.
     * This method has to be called in the UI thread.
     */
    public def void update(Variable variable) {
        if(variable == null) {
            return
        }
        
        val runnable = new Runnable() {
            override run() {
                // As this is invoked later in another thread,
                // the pool that should be visualized might already be outdated
                if(SimulationManager.instance != null) {
                    val time = System.currentTimeMillis
                    try {
                        // Safe reference to animation handlers in case the reference changes concurrently
                        val handlers = animationHandlers
                        for (animation : handlers) {
                            // Apply animations for the changed variable
                            if(animation.variable == variable) {
                                animation.apply(SimulationManager.instance.currentPool)
                            }
                        }
                    } catch (Exception e) {
                        showError(e)
                    }
                    val duration = (System.currentTimeMillis-time)
                    setStatusBarMessage("Update took " + duration + "ms")
                }
            }
        }
        canvas?.svgCanvas?.updateManager?.updateRunnableQueue?.invokeLater(runnable)
    }
    
    private def void setStatusBarMessage(String message) {
        val bars = getViewSite().getActionBars()
        if(bars != null) {
            val statusLineManager = bars.getStatusLineManager()
            PromUIPlugin.asyncExecInUI[statusLineManager.message = message]
        }
    }
    
    private def void showError(Exception e) {
        PromUIPlugin.asyncExecInUI[addMessageComposite(control, e.toString)]
        e.printStackTrace
    }
    
    private static def SimulationListener createSimulationListener() {
        val listener = new SimulationListener() {
            override update(SimulationEvent e) {
                val kiVisView = KiVisView.instance 
                if(kiVisView != null) {
                    if(e.type == SimulationEventType.VARIABLE_CHANGE
                        && !kiVisView.ignoreVariableEvents) {
                        PromUIPlugin.asyncExecInUI[kiVisView.update(e.variable)]
                    } else if(e.type != SimulationEventType.TRACE
                           && e.type != SimulationEventType.INITIALIZED) {
                        // Update the view in the UI thread
                        PromUIPlugin.asyncExecInUI[kiVisView.update(SimulationManager.instance?.currentPool, false)]
                    }
                }
            }
        }
        return listener
    }
    
    
    /**
     * Shows text in the view.
     * 
     * @param parent
     * @param message
     */
    private def void addMessageComposite(Composite parent, String message) {
        disposeMessageComposite()
        messageContainer = new Composite(parent, SWT.NONE)
        // Ignore the message container when layouting the view.
        // This way it will be positioned above the svg component
        val gridData = new GridData
        gridData.exclude = true
        messageContainer.layoutData = gridData
        // Position the composite above the canvas, so it is visible
        messageContainer.moveAbove(canvas)
        
        val orange = new Color(canvas.getDisplay(), new RGB(255, 165, 0));
        messageContainer.setBackground(orange);
        val close = new Label(messageContainer, SWT.NONE);
        val closeImage = CLOSE_ICON.createImage();
        close.setBackground(orange);
        close.setImage(closeImage);
        close.setToolTipText("Close");
        // close action
        close.addMouseListener(new MouseAdapter() {
            override mouseUp(MouseEvent event) {
                messageContainer.dispose();
            }
        });

        val warningLabel = new Label(messageContainer, SWT.NO_BACKGROUND);
        warningLabel.setBackground(orange);
        warningLabel.setText(message);

        messageContainer.setLocation(10, 10);
        messageContainer.setLayout(new RowLayout());

        // update composite
        messageContainer.pack();
        parent.layout(true, true);
        // cleanup on dispose
        messageContainer.addDisposeListener(new DisposeListener() {
            override widgetDisposed(DisposeEvent e) {
                orange.dispose();
                closeImage.dispose();
            }
        });
    }
    
    private def void disposeMessageComposite() {
        if(messageContainer != null) {
            if(!messageContainer.isDisposed) {
                messageContainer.dispose
            }
        }
    }
}
