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
import de.cau.cs.kieler.kivis.ui.interactions.InteractionHandler
import de.cau.cs.kieler.kivis.ui.svg.KiVisCanvas
import de.cau.cs.kieler.kivis.ui.svg.SVGExtensions
import de.cau.cs.kieler.prom.ExtensionLookupUtil
import de.cau.cs.kieler.prom.ModelImporter
import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.console.ConsoleStyle
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.prom.ui.views.LabelContribution
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.core.events.SimulationAdapter
import de.cau.cs.kieler.simulation.core.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.core.events.SimulationEvent
import de.cau.cs.kieler.simulation.core.events.SimulationListener
import de.cau.cs.kieler.simulation.core.events.SimulationOperation
import de.cau.cs.kieler.simulation.core.events.VariableUserValueEvent
import java.awt.event.MouseWheelEvent
import java.awt.event.MouseWheelListener
import java.awt.geom.AffineTransform
import java.io.File
import java.util.List
import java.util.Map
import org.apache.batik.swing.gvt.GVTTreeRendererAdapter
import org.apache.batik.swing.gvt.GVTTreeRendererEvent
import org.apache.batik.swing.svg.SVGDocumentLoaderEvent
import org.apache.batik.swing.svg.SVGDocumentLoaderListener
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceChangeEvent
import org.eclipse.core.resources.IResourceChangeListener
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.preferences.IEclipsePreferences
import org.eclipse.core.runtime.preferences.InstanceScope
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.SWT
import org.eclipse.swt.dnd.DND
import org.eclipse.swt.dnd.DropTarget
import org.eclipse.swt.dnd.DropTargetAdapter
import org.eclipse.swt.dnd.DropTargetEvent
import org.eclipse.swt.dnd.FileTransfer
import org.eclipse.swt.events.DisposeEvent
import org.eclipse.swt.events.DisposeListener
import org.eclipse.swt.events.FocusAdapter
import org.eclipse.swt.events.FocusEvent
import org.eclipse.swt.events.MouseAdapter
import org.eclipse.swt.events.MouseEvent
import org.eclipse.swt.graphics.Color
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.layout.RowLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.MessageBox
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.dialogs.ResourceSelectionDialog
import org.eclipse.ui.part.ResourceTransfer
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtend.lib.annotations.Accessors
import org.w3c.dom.Element
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventListener
import org.w3c.dom.svg.SVGDocument

/**
 * The KiVis View.
 * Keeps track of all animations and interactions.
 * 
 * @author aas
 * 
 */
class KiVisView extends ViewPart {

    /**
     * The id of the view, that is set in the plugin.xml
     */
    public static val VIEW_ID = "de.cau.cs.kieler.kivis.ui.kivisView"

    /**
     * The file extension of configuration files for simulation visualization. 
     */
    public static val KIVIS_FILE_EXTENSION = "kivis"
    
    /**
     * Attribute to store the corresponding flag
     */
    private static val String SHOW_SIMULATION_STOPPED_DIALOG_ATTR = "showSimulationStoppedDialog"

    /**
     * The simulation listener that updates this view.
     */
    public static val simulationListener = createSimulationListener

    /**
     * All registered animation handlers.
     */
    private static var Map<String, IConfigurationElement> animationHandlerConfigurationElements
     
    /**
     * Extension methods to work with SVG Documents. 
     */
    private static extension SVGExtensions svgExtensions = new SVGExtensions

    /**
     * The last instance of this view
     */
    @Accessors(PUBLIC_GETTER)
    private static var KiVisView instance

    /**
     * Determines if user values should be animated, or always the current value of variables.
     */
    @Accessors(PUBLIC_GETTER)
    private var boolean animateUserValues = true
    
    /**
     * The main control of this view
     */
    private Composite control
    /**
     * A label to show the currently loaded file
     */
    private var LabelContribution currentFileLabel
    
    /**
     * The canvas that holds the SVG document.
     */
    @Accessors(PUBLIC_GETTER)
    private KiVisCanvas canvas
    
    /**
     * List of all loaded animation handlers
     */
    private var List<AnimationHandler> animationHandlers = newArrayList()
    /**
     * List of all loaded interaction handlers
     */
    private var List<InteractionHandler> interactionHandlers = newArrayList()
    
    /**
     * Interaction handlers can listen to events in the SVG.
     * This map keeps track of the interactions that need to be performed
     * when a specifig event occurs (e.g. onclick on some SVG element).
     * 
     * The key of the map is the unique id of an event as defined in getEventId(...)
     */
    private var interactionsForEvent = <String, List<InteractionHandler>> newHashMap
    /**
     * Interaction handlers can listen to events in the SVG.
     * This map keeps track of the listeners that are registers for a specifig event occurs.
     * 
     * The key of the map is the unique id of an event as defined in getEventId(...)
     */
    private var listenerForEvent = <String, EventListener> newHashMap

    /**
     * Flag to remember if the animations and interactions have been loaded already.
     * The loading has to be delayed until the first rendering is done.
     * Otherwise the document may not be loaded completely and finding SVG elements may fail.
     */
    private boolean initialized
    
    /**
     * Determines if the visualization is updated when the simulation changes  
     */
    @Accessors(PUBLIC_GETTER)
    private var boolean linkWithSimulation = true
    
    /**
     * Flag to ignore variable change events from the simulation.
     * Used to batch a lot of events, e.g., when performing actions from interactions.
     */
    private var boolean ignoreVariableEvents 
    
    /**
     * The loaded configuration
     */
    private var VisualizationConfiguration kivisConfig
    /**
     * The configuration file that was loaded
     */
    @Accessors(PUBLIC_GETTER)
    private var IFile kivisFile
    /**
     * The image file that was loaded
     */
    @Accessors(PUBLIC_GETTER)
    private var IFile svgFile
    
    /**
     * Resource listener to update the image and animations if the configuration or the svg file changes. 
     */
    private var IResourceChangeListener resourceChangeListener
    
    /**
     * If true, an update of the animations is performed after the current rendering is completed.
     * This is used to update all animations directly after the configuration is loaded.
     */
    private var boolean updateAfterRendering
    
    /**
     * The last pool that has been animated.
     */
    private var DataPool lastPool
    
    /**
     * The affine transform that was used for rendering before a reload occured.
     */
    private var AffineTransform lastRenderingTransform
    
    /**
     * Container for displaying warings and errors.
     */
    private Composite messageContainer
    /**
     * Icon for closing the message container.
     */
    private val CLOSE_ICON = PromUIPlugin.imageDescriptorFromPlugin(KiVisUiModule.PLUGIN_ID, "icons/close.png")
    
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
        canvas.layoutData = new GridData(GridData.FILL_BOTH)
        // Show focus events to fix KISEMA-1266
        canvas.addFocusListener(new FocusAdapter() {
            override focusGained(FocusEvent e) {
                PromConsole.debugConsole.info("kivis canvas received focus")
            }
            override focusLost(FocusEvent e) {
                PromConsole.debugConsole.info("kivis canvas lost focus")
            }
        })
        canvas.svgCanvas.addFocusListener(new java.awt.event.FocusAdapter() {
            override focusGained(java.awt.event.FocusEvent e) {
                PromConsole.debugConsole.info("kivis svg canvas received focus")
            }
            override focusLost(java.awt.event.FocusEvent e) {
                PromConsole.debugConsole.info("kivis svg canvas lost focus")
            }
        })
        
        // Create menu and toolbars.
        createMenu
        createToolbar
        // Create status line
        createStatusLine
        
        // Add simulation listener
        SimulationManager.add(simulationListener)
    }

    /**
     * Dispose and clear reference to singleton instance.
     */
    override dispose() {
        super.dispose()
        SimulationManager.remove(simulationListener)
        instance = null
    }

    /**
     * {@inheritDoc}
     */
    override setFocus() {
        canvas.setFocus
    }

    public def void updateInteractions(boolean beforeTick) {
        // Execute interactions that are not triggered by an event.
        try {
            for(interaction : interactionHandlers) {
                if(!interaction.isEventTriggered
                    && (interaction.isFiredBeforeTick && beforeTick
                        || interaction.isFiredAfterTick && !beforeTick)) {
                    interaction.performActions
                }   
            }
        } catch (Exception e) {
            showError(e)
        }
    }

    /**
     * Updates all animations for the given pool.
     * This method has to be called in the UI thread.
     */
    public def void update(DataPool pool, boolean force) {
        if(kivisFile == null || svgFile == null) {
            return
        }
        
        // If there is no pool (simulation was stopped), then return to original state
        if(pool == null) {
            reload()
        } else {
            // Only update the view with the state of the pool, when the pool changed
            // and the data pool contains valid data, i.e., all variables have been initialized in the first macro tick
            val sim = SimulationManager.instance
            var poolChanged = (pool != lastPool)
            var afterFirstTick = (sim != null && sim.currentMacroTickNumber > 0)
            if(force || (poolChanged && afterFirstTick)) {
                lastPool = pool
                updateInteractions(false)
                
                // Update svg with data from the pool.
                // Make all changes to the svg in the update manager.
                // Otherwise the svg canvas is not updated properly.
                asyncExecSvgUpdate [
                    if(!initialized) {
                        return
                    }
                    updateAnimations(pool, force, null)
                ]
            }
        }
    }
    
    /**
     * Updates all animation handlers to reflect the state of the pool.
     * If the variable is provided, only animation handlers for which the variable is relevant are animated.
     * 
     * @param pool The pool to be animated
     * @param force Determines if the pool should be animated even though it is not the current simulation pool
     * @param variable The variable that changes and requires re-animation
     */
    private def void updateAnimations(DataPool pool, boolean force, Variable variable) {
        val startTime = System.currentTimeMillis
        // As this is invoked later in another thread,
        // the pool that should be visualized might already be outdated.
        // In this case we don't animate anything here.
        if(force || pool == SimulationManager.instance.currentPool) {
            try {
                // Safe reference to animation handlers in case the reference changes concurrently
                val handlers = animationHandlers
                for (animation : handlers) {
                    if(variable == null || animation.usedVariables.contains(variable)) {
                        animation.apply(pool)
                    }
                }
            } catch (Exception e) {
                showError(e)
            }
            val duration = (System.currentTimeMillis-startTime)
            setStatusBarMessage("Animation update took " + duration + "ms")
        }
    }
    
    /**
     * Updates animations for which the given variable is relevant.
     * 
     * @param variable The variable that changes and requires re-animation
     */
    public def void update(Variable variable) {
        if(variable == null) {
            return
        }
        
        asyncExecSvgUpdate [
            val sim = SimulationManager.instance
            if(!initialized || sim == null) {
                return
            }
            updateAnimations(variable.model.pool, false, variable)
        ]
    }
    
    /**
     * Executes a runnable in the update queue of the SVG canvas.
     * 
     * @param runnable The runnable
     */
    private def void asyncExecSvgUpdate(Runnable runnable) {
        canvas?.svgCanvas?.updateManager?.updateRunnableQueue?.invokeLater(runnable)
    }
    
    /**
     * Creates a listener for an interaction such that the interaction is performed when the event occurs on the given SVG element.
     * 
     * @param handler The interaction handler
     * @param elem The SVG element to listen for
     * @param elemId The id of the SVG element
     * @param eventType The event type to listen for
     */
    public def void createListenerForInteraction(InteractionHandler handler, Element elem, String elemId, String eventType) {
        // Get event id and get other interactions that listen for this event
        val eventId = getEventId(elemId, eventType)
        var interactionsForThisEvent = interactionsForEvent.getOrDefault(eventId, null)
        if(interactionsForThisEvent.isNullOrEmpty) {
            interactionsForThisEvent = newArrayList
        }
        // Get listener for this event
        var listener = listenerForEvent.getOrDefault(eventId, null)
        // If there is no listener yet, create new one
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
        // Add SVG DOM listener to the element
        elem.addListener(eventType, listener)
        // Book keeping for the event listeners
        interactionsForThisEvent.add(handler)
        interactionsForEvent.put(eventId, interactionsForThisEvent)
        listenerForEvent.put(eventId, listener)
    }
    
    /**
     * Getter for the loaded SVG document
     * 
     * @return the loaded SVG document
     */
    public def SVGDocument getSVGDocument() {
        return canvas?.svgCanvas?.getSVGDocument();
    }
    
    /**
     * Reloads the last configuration file.
     */
    private def void reload() {
        if (kivisFile != null) {
            // Remember current perspective on image
            lastRenderingTransform = canvas.svgCanvas.renderingTransform
            // Change document
            loadFile(kivisFile)
        }
    }
    
    /**
     * Loads a configuration file.
     * 
     * @param file The file containing a visualization configuration
     */
    private def void loadFile(IFile file) {
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
                // Remember / reset configuration
                kivisConfig = model as VisualizationConfiguration
                kivisFile = file
                saveUsedKiVisFile(kivisFile)
                updateAfterRendering = true
                initialized = false
                lastPool = null
                
                // Load image file relative to the location of the configuration file
                val project = file.project
                val imagePath = file.parent.projectRelativePath.append(kivisConfig.image)
                svgFile = project.getFile(imagePath)
                if(!svgFile.exists) {
                    throw new IllegalArgumentException("The SVG file '"+svgFile.projectRelativePath +"' "
                                                     + "was not found in the project '"+file.project.name+"'.")
                }
                canvas.setSVGFile(svgFile)
                
                // Register resource change listener for the files
                registerResourceChangeListener(file, svgFile)
                
                // Set label of currently loaded file
                PromUIPlugin.asyncExecInUI[currentFileLabel.text = "Loaded '"+kivisFile.name+"' in "+loadConfigDuration+" ms"]
            } else {
                throw new IllegalArgumentException("Could not load kivis file. Please check if the file contains errors.")
            }
        } catch(Exception e) {
            showError(e)
        }
    }
    
    /**
     * Creates interaction handlers corresponding to the given visualization configuration.
     * 
     * @param model The configuration
     */
    private def void createInteractionHandlers(VisualizationConfiguration model) {
        interactionHandlers = newArrayList
        interactionsForEvent = newHashMap
        listenerForEvent = newHashMap
        for(interaction : model.interactions) {
            val interactionHandler = new InteractionHandler(interaction)
            interactionHandlers.add(interactionHandler)
        }
    }
    
    /**
     * Creates the corresponding animations for the given configuration.
     */
    private def void createAnimationHandlers(VisualizationConfiguration model) {
        // Get all animation handlers that are registered in the platform
        if(animationHandlerConfigurationElements == null) {
            animationHandlerConfigurationElements = newHashMap
            val configElements = ExtensionLookupUtil.getConfigurationElements("de.cau.cs.kieler.kivis.animationHandler")
            for(configElement: configElements) {
                val name = configElement.getAttribute("name")
                animationHandlerConfigurationElements.put(name, configElement)
            }
        }
        // Instantiate the required animation handlers
        animationHandlers = newArrayList
        for (element : model.elements) {
            for (animation : element.animations) {
                var AnimationHandler handler
                val animationName = animation.type
                // Find the element for this animation and instantiate it
                val configElem = animationHandlerConfigurationElements.getOrDefault(animationName, null) 
                if(configElem != null) {
                    handler = ExtensionLookupUtil.instantiateClassFromConfiguration(configElem) as AnimationHandler
                    handler.initialize(element.name, animation)
                } else {
                    val animationHandlerNames = animationHandlerConfigurationElements.keySet.join(", ")
                    throw new Exception("No animation handler was found with name '"+animation.type + "'\n"
                                      + "Available animation handlers are: "+animationHandlerNames)
                }
                if(handler != null) {
                    handler.animateUserValues = animateUserValues
                    animationHandlers.add(handler)
                }
            }
        }
    }

    /**
     * Saves the used kivis file to the preferences,
     * such that is can easily be reloaded even after a restart of the workbench.
     * 
     * @param file The file handle to be saved in the preferences
     */
    private def void saveUsedKiVisFile(IFile file) {
        preferences.put(KiVisUiModule.LAST_KIVIS_FILE, file?.fullPath.toOSString)
    }

    /**
     * Loads the last used kivis file.
     */
    private def void loadLastKiVisFile() {
        val prefs = InstanceScope.INSTANCE.getNode(KiVisUiModule.PLUGIN_ID)
        val path = prefs.get(KiVisUiModule.LAST_KIVIS_FILE, "")
        if(!path.isNullOrEmpty) {
            val workspaceRoot = ResourcesPlugin.workspace.root
            val file = workspaceRoot.findMember(path)
            if(file != null && file.exists && file.type == IResource.FILE){
                loadFile(file as IFile)
            }            
        }
    }

    /**
     * Saves the currently displayed SVG image including all modifications from animations.
     */
    private def void saveSVGDocument() {
        // If no image was loaded then there is no image to be saved
        if(kivisFile == null || svgFile == null) {
            return
        }
        // Open file dialog
        val dialog = new FileDialog(canvas.shell, SWT.SAVE)
        dialog.filterExtensions = #{"*.svg"}
        if(kivisFile != null && svgFile != null) {
            dialog.filterPath = kivisFile.location.removeLastSegments(1).toOSString
            val suffix = "_export"
            val fileExtension = ".svg"
            dialog.fileName = Files.getNameWithoutExtension(svgFile.name) + suffix + fileExtension
        }
        val result = dialog.open()
        // Save svg image to selected file
        if(result != null) {
            val file = new File(result)
            // Remove old file
            if(file.exists) {
                file.delete()    
            }
            // Create new file with svg image
            canvas.saveSVGDocument(file.absolutePath)
        }
    }
    
    /**
     * Initializes the animation and interaction handlers if not done yet.
     */
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
    
    /**
     * Registers a resource change listener for the given files.
     * If any of the files changes, a reload is performed to reflect possible changes in the files.
     */
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
                            return;
                        }
                    }
                }
            }
        };
        // Add new listener
        ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
    }

    /**
     * Creates the simulation listener to update this view.
     * 
     * @return The simulation listener
     */
    private static def SimulationListener createSimulationListener() {
        val listener = new SimulationAdapter("KiVis View") {
            var KiVisView kiVisView 
            override update(SimulationEvent e) {
                kiVisView = KiVisView.instance
                if(kiVisView == null || !kiVisView.linkWithSimulation) {
                    return
                }
                super.update(e)
            }
            
            override onUserValueChanged(VariableUserValueEvent e) {
                if(!kiVisView.ignoreVariableEvents) {
                    kiVisView.update(e.variable)
                }
            }
            
            override onSimulationControlEvent(SimulationControlEvent e) {
                val simMan = SimulationManager.instance
                if(simMan == null || kiVisView == null) {
                    return
                }
                
                switch(e.operation) {
                    case BEFORE_STEPPING : {
                        kiVisView.updateInteractions(true)
                    }
                    default : {
                        kiVisView.update(simMan.currentPool, false)
                        if(e.operation == SimulationOperation.STOP) {
                            // Move focus away as workaround for KISEMA-1266
                            // TODO: Remove if not needed anymore
                            PromUIPlugin.asyncExecInUI[
                                if(kiVisView.showSimulationStoppedDialog) {
                                    val dialog = new MessageBox(kiVisView.control.shell)
                                    dialog.message = "Simulation stopped.\nReleasing focus of Simulation Visualization View."
                                    dialog.open
                                }
                            ]
                        }    
                    }
                }
            }
        }
        return listener
    }
    
    /**
     * Creates the SVG canvas.
     * 
     * @param parent The parent composite
     */
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

        // Add document loader to be notified when loading fails.
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

        // Add renderer listener
        canvas.svgCanvas.addGVTTreeRendererListener(new GVTTreeRendererAdapter(){
            var long time
            override gvtRenderingStarted(GVTTreeRendererEvent e) {
                time = System.currentTimeMillis
                setStatusBarMessage("Rendering started...")
            }
            
            /**
             * Initialize the animation and interaction handlers after the rendering is finished.
             * Also perform an update if needed such that animations etc. show the simulation state again.
             */
            override gvtRenderingCompleted(GVTTreeRendererEvent e) {
                val duration = (System.currentTimeMillis-time)
                setStatusBarMessage("Rendering took " + duration + "ms")
                // Now that the document is loaded,
                // we can configure the animations and interactions from the kivis file.
                initializeHandlers()
                
                // Update the visualization if needed
                if(updateAfterRendering) {
                    updateAfterRendering = false
                    //Reset perspective on image
                    if(lastRenderingTransform != null) {
                        canvas.svgCanvas.setRenderingTransform(lastRenderingTransform, true)
                        lastRenderingTransform = null
                    }
                    // Update visualization with running simulation
                    if(SimulationManager.instance != null
                        && !SimulationManager.instance.isStopped
                        && SimulationManager.instance.currentPool != null) {
                        update(SimulationManager.instance.currentPool, false)
                    }
                }
            }
        })
        
        // Add drag and drop support to open kivis files
        addDragAndDropSupport(canvas)
    }
    
    /**
     * Adds drag and drop support to the control to open kivis files.
     * 
     * @param control The control that should receive kivis files.
     */
    private def void addDragAndDropSupport(Control control) {
        // Allow data to be copied to the drop target
        val operations = PromPlugin.createBitmask(DND.DROP_COPY, DND.DROP_DEFAULT)
        val target = new DropTarget(control, operations);
   
        // Receive data in Resource or File format
        val resTransfer = ResourceTransfer.getInstance()
        val fileTransfer = FileTransfer.getInstance()
        val types = #[fileTransfer, resTransfer]
        target.setTransfer(types);
        
        target.addDropListener(new DropTargetAdapter() {
            override void dragEnter(DropTargetEvent event){
                // Change drop event to copy.
                if(event.detail == DND.DROP_DEFAULT) {
                    event.detail = DND.DROP_COPY
                }
            }
            
            override void drop(DropTargetEvent event) {
                var IFile file
                // Open file from Resource
                if (resTransfer.isSupportedType(event.currentDataType)) {
                    val resources = event.data as IResource[]
                    if(!resources.isNullOrEmpty) {
                        val res = resources.get(0)
                        if(res.type == IResource.FILE) {
                            file = res as IFile
                        }
                    }
                }
                // Open file from File transfer
                if (fileTransfer.isSupportedType(event.currentDataType)){
                    val filePaths = event.data as String[]
                    if(!filePaths.isNullOrEmpty) {
                        val filePath = filePaths.get(0)
                        file = PromPlugin.findFile(filePath)
                    }
                }
                if(file !== null) {
                    loadFile(file)
                }
            }
        })
    }
    
    /**
     * Creates the menu of this view.
     */
    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager()
        mgr.add(new Action("Disable user values") {
            override run() {
                animateUserValues = !animateUserValues
                // Propagate the change to all handlers
                for(handler : animationHandlers) {
                    handler.animateUserValues = animateUserValues
                }
                
                if(animateUserValues) {
                    text = "Disable user values"
                } else {
                    text = "Enable user values"
                }
            }
        });
        mgr.add(new Action("Release Focus") {
            override run() {
                // Show a dialog that will catch the focus as workaround for KISEMA-1266
                // TODO: Remove if not needed anymore
                val dialog = new MessageBox(control.shell)
                dialog.message = "Focus released"
                dialog.open
            }
        });
        val action = new Action("Show Simulation Stopped Dialog", IAction.AS_CHECK_BOX) {
            override run() {
                showSimulationStoppedDialog = !showSimulationStoppedDialog
            }
        }
        action.checked = showSimulationStoppedDialog
        mgr.add(action)
    }

    /**
     * Creates the toolbar of this view.
     */
    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager();
        
        mgr.add(new KiVisViewToolbarAction("Reload", "refresh.png") {
            override run() {
                if(kivisFile != null && svgFile != null) {
                    reload()    
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
                        loadFile(result as IFile)
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
                             + "Space : Play / pause simulation\n"
                             +"\n"
                             +"You can drag and drop KiVis files into this view to open them."
                val dialog = new MessageDialog(canvas.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
    }
    
    /**
     * Creates the status line of this view.
     */
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
     * Sets the text on the status line.
     */
    private def void setStatusBarMessage(String message) {
        val bars = getViewSite().getActionBars()
        if(bars != null) {
            val statusLineManager = bars.getStatusLineManager()
            PromUIPlugin.asyncExecInUI[statusLineManager.message = message]
        }
    }
    
    /**
     * Shows an exception to the user.
     * 
     * @param e The exception
     */
    private def void showError(Exception e) {
        PromUIPlugin.asyncExecInUI[addMessageComposite(control, e.toString)]
        e.printStackTrace
    }
    
    /**
     * Create a composite on top of the SVG Canvas to show messages and errors to the user.
     * 
     * @param parent The parent composite
     * @param message The message to be shown
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
    
    /**
     * Destroys all message composites.
     */
    private def void disposeMessageComposite() {
        if(messageContainer != null) {
            if(!messageContainer.isDisposed) {
                messageContainer.dispose
            }
        }
    }
    
    /**
     * Returns the unique id for a specific event.
     * 
     * @param svgElementId SVG element that may fire the event
     * @param eventType The event type
     */
    private def String getEventId(String svgElementId, String eventType) {
        return svgElementId+"."+eventType
    }
    
    /**
     * Returns the flag to indicate if a dialog should be shown when the simulation is stopped.
     * This is a workaround for KISEMA-1266
     */
    private def boolean getShowSimulationStoppedDialog() {
        // TODO: Remove if not needed anymore
        return preferences.getBoolean(SHOW_SIMULATION_STOPPED_DIALOG_ATTR, false)
    }
    
    /**
     * Sets the flag to indicate if a dialog should be shown when the simulation is stopped.
     * This is a workaround for KISEMA-1266
     */
    private def void setShowSimulationStoppedDialog(boolean value) {
        // TODO: Remove if not needed anymore
        preferences.putBoolean(SHOW_SIMULATION_STOPPED_DIALOG_ATTR, value)
    }
    
    /**
     * Returns the preferences for this view.
     */
    private def IEclipsePreferences getPreferences() {
        InstanceScope.INSTANCE.getNode(KiVisUiModule.PLUGIN_ID)
    }
}
