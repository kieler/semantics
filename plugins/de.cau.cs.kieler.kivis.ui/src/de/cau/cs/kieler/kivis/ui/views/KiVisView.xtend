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

import com.google.gson.JsonElement
import com.google.gson.JsonNull
import com.google.gson.JsonParser
import de.cau.cs.kieler.kicool.KiCoolFactory
import de.cau.cs.kieler.kicool.ProcessorGroup
import de.cau.cs.kieler.kivis.KiVisConstants
import de.cau.cs.kieler.kivis.ui.processor.SimulationVisualizationValues
import de.cau.cs.kieler.simulation.DataPool
import de.cau.cs.kieler.simulation.SimulationContext
import de.cau.cs.kieler.simulation.events.ISimulationListener
import de.cau.cs.kieler.simulation.events.SimulationControlEvent
import de.cau.cs.kieler.simulation.events.SimulationControlEvent.SimulationOperation
import de.cau.cs.kieler.simulation.events.SimulationEvent
import de.cau.cs.kieler.simulation.ide.CentralSimulation
import de.cau.cs.kieler.simulation.ide.server.SimulationServer
import de.cau.cs.kieler.simulation.ui.SimulationUI
import java.io.File
import java.net.URL
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.IAction
import org.eclipse.jface.action.Separator
import org.eclipse.jface.resource.JFaceResources
import org.eclipse.swt.SWT
import org.eclipse.swt.SWTError
import org.eclipse.swt.browser.Browser
import org.eclipse.swt.browser.BrowserFunction
import org.eclipse.swt.browser.ProgressEvent
import org.eclipse.swt.browser.ProgressListener
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.internal.browser.WebBrowserUIPlugin
import org.eclipse.ui.internal.browser.WebBrowserUtil
import org.eclipse.ui.part.ViewPart
import org.eclipse.ui.progress.UIJob
import org.eclipse.xtend.lib.annotations.Accessors

/**
 * The KiVis View.
 * 
 * @author als
 * 
 */
class KiVisView extends ViewPart implements ISimulationListener {

    /**
     * The id of the view, that is set in the plugin.xml
     */
    public static val VIEW_ID = "de.cau.cs.kieler.kivis.ui.kivisView"

    /**
     * The last instance of this view
     */
    @Accessors(PUBLIC_GETTER)
    static var KiVisView instance;

    /**
     * The browser.
     */
    Browser browser;

    /**
     * Indicates if visulaization is ready (svg loaded)
     */
    var isReady = false;
    
    /**
     * Indicates if visulaization is loaded (svg loaded)
     */
    var isLoaded = false;
    
    /**
     * Indicates that external browser is used.
     */
    var externalMode = false;

    /**
     * Callback for simulation control
     */
    static class SimulationControlFunction extends BrowserFunction {

        new(Browser browser) {
            super(browser, KiVisConstants.SIMULATION_CONTROL_CALLBACK);
        }

        override function(Object[] arguments) {
            val command = if(arguments.length === 1) arguments.head;
            val sim = SimulationUI.currentSimulation
            if (sim !== null) {
                new UIJob("Simulation - Visualization Action") {
                    
                    override runInUIThread(IProgressMonitor monitor) {
                        switch (command) {
                            case "step": sim.step
                            case "play": sim.play
                            case "pause": sim.pause
                            case "stop": sim.stop
                        }
                        return Status.OK_STATUS
                    }
                    
                }.schedule
            }
            return null;
        }
    }
    
    /**
     * Callback for action indicator
     */
    static class ActionIndicatorFunction extends BrowserFunction {
        
        val parser = new JsonParser

        new(Browser browser) {
            super(browser, KiVisConstants.ACTION_SETTER_CALLBACK);
        }

        override function(Object[] arguments) {
            val variable = if(arguments.length >= 1) arguments.get(0)
            val JsonElement value = if(arguments.length >= 2) {
                try {
                    parser.parse(arguments.get(1) as String)
                } catch (Exception e) {
                    JsonNull.INSTANCE
                }
            } else {
                JsonNull.INSTANCE
            }
            if (variable instanceof String) {
                val sim = SimulationUI.currentSimulation
                if (sim !== null) {
                    val patch = sim.startEnvironment.getProperty(SimulationVisualizationValues.VALUES)
                    synchronized (patch) {
                        patch.put(variable, value)
                    }
                }
            } 
            return null;
        }
    }

    new() {
        CentralSimulation.addListener(this)
    }

    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
    override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
        
        getViewSite().getActionBars().getToolBarManager() => [
            add(new Action("Open in external Browser", IAction.AS_PUSH_BUTTON) {
                override run() {
                    SimulationServer.start
                    val browserSupport = WebBrowserUIPlugin.getInstance().getWorkbench().getBrowserSupport()
                    browserSupport.externalBrowser?.openURL(new URL("http://localhost:" + SimulationServer.PORT + "/visualization"))
                }
            })
            add(new Separator)
            add(new Action("Use internal Browser", IAction.AS_CHECK_BOX) {
                override run() {
                    browser.visible = this.checked
                    externalMode = !this.checked
                }
            } => [checked = !externalMode])
        ]

        try {
            browser = new Browser(parent, SWT.NONE)
            browser.javascriptEnabled = true;
            // println(browser.browserType)
    
            browser.addProgressListener(new ProgressListener() {
    
                override changed(ProgressEvent event) {
                }
    
                override completed(ProgressEvent event) {
                    isReady = true;
                    // Register callback
                    new SimulationControlFunction(browser);
                    new ActionIndicatorFunction(browser);
                    // Initialize Vizualization
                    if (SimulationUI.currentSimulation !== null) {
                        updateView(SimulationUI.currentSimulation);
                    }
                }
    
            });
        } catch (SWTError err) {
            if (err.code != SWT.ERROR_NO_HANDLES) {
                err.printStackTrace
                WebBrowserUtil.openError("Could not initialize SWT brow");
                return;
            } else {
                val bg = parent.getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
                val layout = new GridLayout();
                layout.verticalSpacing = 10;
                parent.setLayout(layout);
                parent.setBackground(bg);
                val exTitle = new Label(parent, SWT.NULL);
                exTitle.setBackground(bg);
                exTitle.setFont(JFaceResources.getBannerFont());
                exTitle.setText("Embedded browser not available!");
                exTitle.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                val text = new Text(parent, SWT.WRAP);
                text.setText("The embedded browser widget cannot be created. It is either not available for your operating system or the system needs to be configured in order to support the embedded browser. (See: http://www.eclipse.org/swt/faq.php#whatisbrowser)");
                text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                text.setBackground(bg);
                val exception = new Text(parent, SWT.WRAP);
                exception.setText(err.message);
            }
        }
        
        // Late start
        if (SimulationUI.currentSimulation !== null && SimulationUI.currentSimulation.running) {
            // Reemit missed start
            this.update(SimulationUI.currentSimulation, new SimulationControlEvent(SimulationUI.currentSimulation, SimulationOperation.START))
        }
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
        browser?.setFocus
    }

    override update(SimulationContext ctx, SimulationEvent e) {
        if (e instanceof SimulationControlEvent) {
            if (!externalMode) {
                SimulationUI.updateUI [
                    switch (e.operation) {
                        case START: {
                            // Add visualization value processor
                            val root = ctx.system.processors as ProcessorGroup
                            if (!root.processors.exists[SimulationVisualizationValues.ID.equals(id)]) {
                                root.processors.add(0, KiCoolFactory.eINSTANCE.createProcessorReference => [
                                    id = SimulationVisualizationValues.ID
                                ])
                            }
                            ctx.startEnvironment.setProperty(SimulationVisualizationValues.VALUES, <String, JsonElement>newHashMap);
                            SimulationUI.updateUI[loadVisualization(ctx)]
                        }
                        case STEP: {
                            if (!isLoaded) {
                                SimulationUI.updateUI[loadVisualization(ctx)]
                            }
                            updateView(ctx)
                        } 
                        case STOP: {
                            isReady = false
                            isLoaded = false
                        }
                        default: {
                        }
                    }
                ]
            }
        }
    }

    override getName() {
        this.class.simpleName
    }

    def updateView(SimulationContext context) {
        if (isLoaded && isReady && !browser.isDisposed && context.dataPool !== null) {
            try {
                val json = DataPool.serializeJSON(context.dataPool.rawData)
                val resultJson = browser.evaluate("return " + KiVisConstants.VISUALIZATION_FUNCTION + "(" + json + ");", true);
                if (resultJson instanceof String) {
                    val patch = context.startEnvironment.getProperty(SimulationVisualizationValues.VALUES)
                    synchronized (patch) {
                        val newPatch = context.dataPool.createPatch(DataPool.parseJSON(resultJson))
                        newPatch.entrySet.removeIf[patch.containsKey(it.key)] // Don reset unprocessed action indicators
                        patch.putAll(newPatch);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace
            }
        }
    }

    def loadVisualization(SimulationContext context) {
        if (context !== null) {
            val cc = context.sourceCompilationContext
            if (cc !== null) {
                val vizURL = cc.result.getProperty(KiVisConstants.VISUALIZATION);
                if (vizURL !== null) {
                    val url = new URL(vizURL)
                    if (url.protocol.equals("file")) {
                        // Ecliplse cannot load file urls properly
                        try {
                            isLoaded = browser.setText(new String(Files.readAllBytes(new File(new URL(vizURL).toURI).toPath), StandardCharsets.UTF_8))
                        } catch (Exception e) {
                            e.printStackTrace
                        }
                    } else {
                        isLoaded = browser.setUrl(vizURL);
                    }
                }
            }
        }
    }

}