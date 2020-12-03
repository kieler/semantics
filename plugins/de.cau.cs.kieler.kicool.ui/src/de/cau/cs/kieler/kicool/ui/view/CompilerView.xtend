/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.view

import de.cau.cs.kieler.kicool.ide.view.IdeCompilerView
import de.cau.cs.kieler.kicool.ui.InstallSystemsHandler
import de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis
import de.cau.cs.kieler.kicool.ui.view.actions.AbstractAction
import de.cau.cs.kieler.kicool.ui.view.actions.AutoCompileToggle
import de.cau.cs.kieler.kicool.ui.view.actions.CompilationAction
import de.cau.cs.kieler.kicool.ui.view.actions.CompileInplaceToggle
import de.cau.cs.kieler.kicool.ui.view.actions.CompileTracingToggle
import de.cau.cs.kieler.kicool.ui.view.actions.DebugEnvironmentModelsToggle
import de.cau.cs.kieler.kicool.ui.view.actions.DeveloperToggle
import de.cau.cs.kieler.kicool.ui.view.actions.FlattenSystemViewToggle
import de.cau.cs.kieler.kicool.ui.view.actions.ForwardResultToggle
import de.cau.cs.kieler.kicool.ui.view.actions.OnOffButtonsToggle
import de.cau.cs.kieler.kicool.ui.view.actions.ShowPrivateSystemsToggle
import de.cau.cs.kieler.kicool.ui.view.actions.VisualLayoutFeedbackToggle
import de.cau.cs.kieler.klighd.LightDiagramLayoutConfig
import de.cau.cs.kieler.klighd.ZoomStyle
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import de.cau.cs.kieler.klighd.ui.parts.DiagramViewPart
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties.ZoomConfigButtonsHandling
import java.util.List
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Status
import org.eclipse.jface.action.IMenuManager
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.Separator
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.FillLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.IMemento
import org.eclipse.ui.IViewSite
import org.eclipse.ui.progress.UIJob
import org.eclipse.xtend.lib.annotations.Accessors

import static de.cau.cs.kieler.kicool.ui.InstallSystemsHandler.*

/**
 * The Kieler Compiler View, formerly knownas IMB Compiler View
 * 
 * @author ssm
 * @kieler.design 2016-11-04 proposed
 * @kieler.rating 2016-11-04 proposed yellow 
 */
class CompilerView extends DiagramViewPart {

    public static val ID = "de.cau.cs.kieler.kicool.ui.view.compiler"

    @Accessors private static val List<CompilerView> VIEWS = newLinkedList

    @Accessors private CompilerViewPartListener partListener
    @Accessors private IMemento memento
    @Accessors private EditPartSystemManager editPartSystemManager = null

    private var addButtonsDelay = true

    // Must be initialized in the view contributions. Hence, maybe null!
    @Accessors private var SystemSelectionManager systemSelectionManager = null
    @Accessors private var DeveloperToggle developerToggle = null
    @Accessors private var OnOffButtonsToggle onOffButtonsToggle = null
    @Accessors private var FlattenSystemViewToggle flattenSystemViewToggle = null
    @Accessors private var ForwardResultToggle forwardResultToggle = null
    @Accessors private var AutoCompileToggle autoCompileToggle = null
    @Accessors private var VisualLayoutFeedbackToggle visualLayoutFeedbackToggle = null
    @Accessors private var CompileInplaceToggle compileInplaceToggle = null
    @Accessors private var CompileTracingToggle compileTracingToggle = null
    @Accessors private var DebugEnvironmentModelsToggle debugEnvironmentModelsToggle = null
    @Accessors private var ShowPrivateSystemsToggle showPrivateSystemsToggle = null

    @Accessors private var CompilationAction compilationAction = null

    new() {
        InstallSystemsHandler.view = this
    }
    /**
     * {@inheritDoc}
     */
    override createPartControl(Composite parent) {
        editPartSystemManager = new EditPartSystemManager(this)
        systemSelectionManager = new SystemSelectionManager(this)

        super.createPartControl(parent)

        val toolBarManager = getViewSite.getActionBars.getToolBarManager
        val menuManager = getViewSite.getActionBars.getMenuManager

        addContributions(toolBarManager, menuManager)
        addButtons()

        partListener = new CompilerViewPartListener(this, parent)
        VIEWS.add(this)
    }

    /**
     * {@inheritDoc}
     */
    override dispose() {
        VIEWS.remove(this)
    }

    /* Workaround for the creation order of the DiagramViewPart */
    protected override addButtons() {
        if (addButtonsDelay) {
            addButtonsDelay = false
        } else {
            super.addButtons();
        }
    }

    /**
     * {@inheritDoc}
     */
    protected def void addContributions(IToolBarManager toolBar, IMenuManager menu) {

        // Compile
        compilationAction = new CompilationAction(this)
        toolBar.add(compilationAction.action)
        toolBar.add(systemSelectionManager.contribution)
        toolBar.add(new Separator)

        forwardResultToggle = new ForwardResultToggle(this)
        autoCompileToggle = new AutoCompileToggle(this)
        compileInplaceToggle = new CompileInplaceToggle(this)
        compileTracingToggle = new CompileTracingToggle(this)
        onOffButtonsToggle = new OnOffButtonsToggle(this)

        developerToggle = new DeveloperToggle(this)
        flattenSystemViewToggle = new FlattenSystemViewToggle(this)
        // flattenSystemViewToggle will be added inside developerToggle to have correct visibility
        developerToggle.addContributions(toolBar, menu)
        debugEnvironmentModelsToggle = new DebugEnvironmentModelsToggle(this)
        showPrivateSystemsToggle = new ShowPrivateSystemsToggle(this)
        visualLayoutFeedbackToggle = new VisualLayoutFeedbackToggle(this)

        toolBar.add(flattenSystemViewToggle.action)
        toolBar.add(new Separator)
        // The standard klighd view part menu entries will be inserted after this separator.    
        menu.add(autoCompileToggle.action)
        menu.add(compileInplaceToggle.action)
        menu.add(compileTracingToggle.action)
        menu.add(new Separator)
        menu.add(visualLayoutFeedbackToggle.action)
        menu.add(forwardResultToggle.action)
        menu.add(new Separator)
        menu.add(developerToggle.action)
        menu.add(showPrivateSystemsToggle.action)
        menu.add(onOffButtonsToggle.action)
        menu.add(debugEnvironmentModelsToggle.action)

        if (memento !== null) {
            memento.loadCheckedValue(forwardResultToggle)
            memento.loadCheckedValue(autoCompileToggle)
            memento.loadCheckedValue(visualLayoutFeedbackToggle)
            memento.loadCheckedValue(developerToggle)
            memento.loadCheckedValue(onOffButtonsToggle)
            memento.loadCheckedValue(flattenSystemViewToggle)
            memento.loadCheckedValue(compileInplaceToggle)
            memento.loadCheckedValue(compileTracingToggle)
            memento.loadCheckedValue(debugEnvironmentModelsToggle)
            memento.loadCheckedValue(showPrivateSystemsToggle)
        }

        menu.add(new Separator)
    // The standard klighd view part menu entries will be inserted after this separator.    
    }

    override init(IViewSite site, IMemento memento) {
        super.init(site, memento)
        this.memento = memento
    }

    override saveState(IMemento memento) {
        super.saveState(memento)
        memento.saveCheckedValue(forwardResultToggle)
        memento.saveCheckedValue(autoCompileToggle)
        memento.saveCheckedValue(visualLayoutFeedbackToggle)
        memento.saveCheckedValue(developerToggle)
        memento.saveCheckedValue(onOffButtonsToggle)
        memento.saveCheckedValue(flattenSystemViewToggle)
        memento.saveCheckedValue(compileInplaceToggle)
        memento.saveCheckedValue(compileTracingToggle)
        memento.saveCheckedValue(debugEnvironmentModelsToggle)
        memento.saveCheckedValue(showPrivateSystemsToggle)
    }

    def void updateView() {
        if(editPartSystemManager.activeSystemId === null) return

        val properties = new KlighdSynthesisProperties
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis")
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
            ZoomConfigButtonsHandling.HIDE)
        properties.setProperty(KlighdSynthesisProperties.SYNTHESIS_OPTION_CONFIG, #{
            KiCoolSynthesis.FLATTEN_SYSTEM -> ((flattenSystemViewToggle.checked) as Object),
            KiCoolSynthesis.ON_OFF_BUTTONS -> ((onOffButtonsToggle.checked) as Object)
        })
        updateDiagram(editPartSystemManager.activeSystem, properties)
    }

    def void updateToolbar() {
        viewSite.actionBars.updateActionBars
    }

    private def void updateDiagram(Object model, KlighdSynthesisProperties properties) {
        if (this.getViewer() === null || this.getViewer().getViewContext() === null) {
            val instance = this
            new UIJob("Init" + this.getClass.getName()) {

                @SuppressWarnings("deprecation")
                public override IStatus runInUIThread(IProgressMonitor monitor) {
                    DiagramViewManager.initializeView(instance, model, null, properties);

                    val canvas = viewer.getControl() as Composite

                    val container = new Composite(canvas, SWT.BORDER) => [
                        setSize(400, 100)
                    ]
                    container.setLayout(new FillLayout())
                    container.visible = false

                    val text = new Text(container, SWT.WRAP)
                    text.setText("This is a longer text.")
//                    container.pack
                    canvas.layout(true, true)
                    return Status.OK_STATUS;
                }
            }.schedule
        } else {
            // update case
            val viewContext = this.getViewer.getViewContext
            viewContext.configure(properties)
            DiagramViewManager.updateView(viewContext, model)
            val layoutConfig = new LightDiagramLayoutConfig(viewContext)
            layoutConfig.zoomStyle(ZoomStyle.NONE)
            layoutConfig.performUpdate()// this line my look like a unneeded update but without it it doesn't work anymore
        }
    }

    def void reinitializeDiagram(Object model) {
        val properties = new KlighdSynthesisProperties
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
            "de.cau.cs.kieler.kicool.ui.synthesis.KiCoolSynthesis")
        properties.setProperty(KlighdSynthesisProperties.REQUESTED_ZOOM_CONFIG_BUTTONS_HANDLING,
            ZoomConfigButtonsHandling.HIDE)

//        updateDiagram(model, properties)
        // Run in the actual thread.
        DiagramViewManager.initializeView(this, model, null, properties);
    }

    def void doLayout(boolean zoomToFit) {
        val layoutConfig = new LightDiagramLayoutConfig(viewContext)
        layoutConfig.zoomStyle(if(zoomToFit) ZoomStyle.ZOOM_TO_FIT else ZoomStyle.NONE)
        layoutConfig.performLayout()
    }

    private def void loadCheckedValue(IMemento memento, AbstractAction action) {
        val setting = memento.getString(action.action.id)
        if (setting !== null) {
            action.action.checked = Boolean.parseBoolean(setting)
            action.invoke
        }
    }

    private def void loadCheckedValues(IMemento memento, List<? extends AbstractAction> actions) {
        for (action : actions) {
            if(action !== null) memento?.loadCheckedValue(action)
        }
    }

    private def void saveCheckedValue(IMemento memento, AbstractAction action) {
        if(action !== null) memento?.putString(action.action.id, action.action.checked.toString)
    }

    private def void saveCheckedValues(IMemento memento, List<? extends AbstractAction> actions) {
        for (action : actions) {
            if(action !== null) memento?.putString(action.action.id, action.action.checked.toString)
        }
    }

}
