/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies;

import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.Variable;
import org.json.JSONObject;

import com.google.common.collect.Maps;

import de.cau.cs.kieler.core.model.effects.TransformationEffect;
import de.cau.cs.kieler.core.model.gmf.effects.RefreshGMFEditPoliciesEffect;
import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.util.XtendTransformationUtil;
import de.cau.cs.kieler.kies.kivi.KiesTransformationContext;
import de.cau.cs.kieler.kies.util.TransformationUtil;
import de.cau.cs.kieler.kiml.ui.diagram.LayoutEffect;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * Abstract implementation of a TransformationDataComponent.
 * 
 * @author uru
 * 
 */
public abstract class AbstractTransformationDataComponent extends JSONObjectDataComponent {
    // JSON needed?

    private TransactionalEditingDomain domain;
    private Shell shell;

    // CHECKSTYLEOFF VisibilityModifier - convenient use in extending classes
    /** currently used facade. */
    protected XtendFacade facade;

    /** global variables for the certain transformation. */
    protected Map<String, Variable> globalVars;

    /** is the transformation executed by KiVi? */
    protected boolean kiviMode;
    /** the current transformation context. */
    protected ITransformationContext currentContext;
    /** the current transformation descriptor. */
    protected TransformationDescriptor currentDescriptor;

    /** headless execution omits checks for an opened editor. */
    protected boolean headless = false;
    /** root state of the current resource. */
    protected State rootState;
    /** root region of the current resource. */
    protected Region rootRegion;
    // CHECKSTYLEON VisibilityModifier

    private boolean finished = false;

    // private long lastHistoryStep = -1;
    // private long lastStep = 0;

    /**
     * Any extending class has to provide a map with global Variables.
     * 
     * @param globVars
     *            Map with global Variables for the XtendFacade.
     * @param abusemode
     *            pass {@code true} if this data component is used in a way that does not use KIEM.
     */
    public AbstractTransformationDataComponent(final Map<String, Variable> globVars,
            final boolean abusemode) {
        if (globVars != null) {
            globalVars = globVars;
        } else {
            globalVars = Collections.emptyMap();
        }
        this.kiviMode = abusemode;
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        finished = false;
        currentContext = null;
        currentDescriptor = null;
        // lastStep = 0;
        // lastHistoryStep = -1;
        domain = getActiveEditorEditingDomain();
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {
                IWorkbench wb = PlatformUI.getWorkbench();
                shell = wb.getActiveWorkbenchWindow().getShell();
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject arg0) throws KiemExecutionException {

        if (isHistoryStep()) {
            Status status = new Status(Status.WARNING, Activator.PLUGIN_ID,
                    "History steps are not supported! Use the respective control "
                            + "buttons in order to gain the possibility to perform back steps.");
            StatusManager.getManager().handle(status, StatusManager.SHOW);
            return null;
        }
        // TODO proper undo
        // TransformationUtil.logger.info("in dc: " + Thread.currentThread());
        // boolean test = false;
        // System.out.println("fooo: " + lastStep + " "
        // + KiemPlugin.getDefault().getExecution().getSteps());
        // if (lastHistoryStep != -1
        // && lastHistoryStep < KiemPlugin.getDefault().getExecution().getSteps()) {
        // System.out.println("keine history mehr !");
        // KiemPlugin.getDefault().getExecution().stepExecutionPause(lastStep + 1);
        // test = true;
        // }
        // // if undo ...
        // if (isHistoryStep() && !test) {
        //
        // lastHistoryStep = (int) KiemPlugin.getDefault().getExecution().getSteps();
        //
        // TransformationUtil.logger.info("History");
        // IEditorPart editor = TransformationUtil.getActiveEditor();
        // if (editor instanceof SyncchartsDiagramEditor) {
        // CommandStack stack = ((SyncchartsDiagramEditor) editor).getEditingDomain()
        // .getCommandStack();
        // if (stack.canUndo()) {
        // // System.out.println(stack.getMostRecentCommand().getLabel());
        // stack.undo();
        // processLayout((SyncchartsDiagramEditor) editor);
        // }
        // }
        // return null;
        // }
        //
        // lastHistoryStep = -1;
        // lastStep++;
        // TransformationUtil.logger.info("Non History ");
        // System.out.println("currentsteps " + KiemPlugin.getDefault().getExecution().getSteps());

        // check if root region was already selected
        if (rootRegion == null || rootState == null) {
            fetchRootRegionAndState();
        }

        // perform next transformation
        currentDescriptor = getNextTransformation();
        currentContext = null;
        if (currentDescriptor != null) {
            TransformationUtil.logger.info("Trigger");
            if (facade == null) {
                Status status = new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "XtendFacade has not been initialized properly!");
                StatusManager.getManager().handle(status);
                return null;
            }

            // execute Transformation
            ITransformationContext context = new KiesTransformationContext(facade, domain);
            currentContext = context;

            // if normally used by KIEM, execute the transformation
            if (!kiviMode) {
                TransformationUtil.logger.info("Transformation in KIEM mode");
                processTransformation();
            }
        } else {
            if (!kiviMode) {
                // stop the transformation if it is finished
                finished();
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isHistoryObserver() {
        return true;
    }

    /**
     * set the value of a global variable. As identifier for {@code globalVar} only use the GLOBVAR
     * constants defined by the specific transformation data component.
     * 
     * @param globalVar
     *            variable to change
     * @param value
     *            new value
     * @return true if successful
     */
    public boolean setGlobalVariable(final String globalVar, final boolean value) {
        Variable var = globalVars.get(globalVar);
        if (var == null) {
            return false;
        }
        var.setValue(value);
        // make sure the facade is set properly
        facade = XtendTransformationUtil.initializeFacade(getTransformationFile(),
                getBasePackages(), Maps.newHashMap(globalVars));
        return true;
    }

    /**
     * @return the current {@link XtendFacade}
     */
    public XtendFacade getXtendFacade() {
        return facade;
    }

    /**
     * @return all base packages needed for the transformations planned.
     */
    public abstract String[] getBasePackages();

    /**
     * @return the actual transformation file (.ext)
     */
    public abstract String getTransformationFile();

    /**
     * @return either the next transformation or <code>null</code> if nothing can be transformed
     *         anymore.
     */
    public abstract TransformationDescriptor getNextTransformation();

    /**
     * this method is called if there are no further steps to do and the transformation will
     * terminate.
     */
    public abstract void doPostTransformation();

    /**
     * mark this transformation finished and throw a new {@link KiemExecutionException} in order to
     * terminate the current execution.
     * 
     * @throws KiemExecutionException
     *             a exception letting the user know that the current execution finished.
     */
    protected void finished() throws KiemExecutionException {
        finished = true;
        doPostTransformation();
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
            public void run() {
                MessageDialog.openInformation(shell, "Done",
                        "Transformation finished. No further elements to process.");
            }
        });
        throw new KiemExecutionException("No Further Transformations", true, false, true, null);
    }

    /**
     * @return currently active editor's editing domain
     */
    protected TransactionalEditingDomain getActiveEditorEditingDomain() {
        IEditorPart activeEditor = TransformationUtil.getActiveEditor();
        if (activeEditor != null && activeEditor instanceof DiagramEditor) {
            return ((DiagramEditor) activeEditor).getEditingDomain();
        }
        return null;
    }

    /**
     * 
     * @param rs
     *            some resource set.
     * @return an editing domain for this resource set.
     */
    protected TransactionalEditingDomain getEditingDomainForResourceSet(final ResourceSet rs) {
        return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
    }

    /**
     * fetches the root region and root state of the currently active synccharts editor.
     */
    protected void fetchRootRegionAndState() {
        // fetch the root model elements
        IEditorPart editor = TransformationUtil.getActiveEditor();
        if (editor instanceof SyncchartsDiagramEditor) {
            EditPart rootEditPart = ((DiagramEditor) editor).getDiagramEditPart();

            Object selView = rootEditPart.getModel();
            EObject selModel = ((View) selView).getElement();
            rootRegion = (Region) selModel;
            if (rootRegion != null && rootRegion.getStates().size() > 0) {
                State root = rootRegion.getStates().get(0);
                rootState = root;
            }
        }
    }

    /**
     * @return the editing domain
     */
    public TransactionalEditingDomain getDomain() {
        return domain;
    }

    /**
     * @return the finished
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * @return the currentContext
     */
    public ITransformationContext getCurrentContext() {
        return currentContext;
    }

    /**
     * @return the currentDescriptor
     */
    public TransformationDescriptor getCurrentDescriptor() {
        return currentDescriptor;
    }

    /**
     * @param headless
     *            the headless to set
     */
    public void setHeadless(final boolean headless) {
        this.headless = headless;
    }

    /**
     * @param rootState
     *            the rootState to set
     */
    public void setRootState(final State rootState) {
        this.rootState = rootState;
    }
    
    /**
     * @return the rootState
     */
    public State getRootState() {
        return rootState;
    }

    /**
     * processes a transformation directly within the data component. A {@link TransformationEffect}
     * is used to execute the transformation properly in order to support undo.
     */
    private void processTransformation() {
        TransformationEffect effect = new TransformationEffect(currentContext, currentDescriptor);
        effect.execute();
        effect.getResult();
        final IEditorPart currentlyActiveEditor = TransformationUtil.getActiveEditor();
        if (currentlyActiveEditor instanceof SyncchartsDiagramEditor) {
            RefreshGMFEditPoliciesEffect gmfEffect = new RefreshGMFEditPoliciesEffect(
                    (SyncchartsDiagramEditor) currentlyActiveEditor, true);
            gmfEffect.execute();

            processLayout((SyncchartsDiagramEditor) currentlyActiveEditor);
        }
    }

    private void processLayout(final SyncchartsDiagramEditor activeEditor) {
        // apply automatic layout by triggering the trigger (null layouts whole diagram)
        LayoutEffect layoutEffect = new LayoutEffect(activeEditor, null);
        layoutEffect.execute();
    }
}
