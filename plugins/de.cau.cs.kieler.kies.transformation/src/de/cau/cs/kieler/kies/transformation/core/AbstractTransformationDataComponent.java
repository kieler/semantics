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
package de.cau.cs.kieler.kies.transformation.core;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.Variable;
import org.json.JSONObject;

import com.google.common.collect.Maps;

import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.core.kivi.RefreshGMFElementsEffect;
import de.cau.cs.kieler.kies.transformation.core.kivi.TransformationEffect;
import de.cau.cs.kieler.kies.transformation.core.kivi.TransformationTrigger;
import de.cau.cs.kieler.kies.transformation.impl.XtendTransformationContext;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
import de.cau.cs.kieler.kiml.ui.layout.LayoutEffect;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditor;

/**
 * Abstract implementation of a TransformationDataComponent.
 * 
 * @author uru
 * 
 */
public abstract class AbstractTransformationDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private TransactionalEditingDomain domain;
    private Shell shell;

    private static final int STEP_TIMEOUT = 10;
    private Semaphore semaphore;

    protected XtendFacade facade;
    protected Map<String, Variable> globalVars;

    private int skipSteps = 0;

    private boolean finished = false;

    private TransformationContext currentContext;

    private boolean kiviMode;

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
        domain = getActiveEditorEditingDomain();
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {
                IWorkbench wb = PlatformUI.getWorkbench();
                shell = wb.getActiveWorkbenchWindow().getShell();
            }
        });
        semaphore = new Semaphore(1);
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject arg0) throws KiemExecutionException {

        if (skipSteps > 0) {
            skipSteps--;
            return null;
        }

        System.out.println("in dc: " + Thread.currentThread());
        // if undo ...
        if (isHistoryStep()) {
            System.out.println("History");
            IEditorPart editor = TransformationUtil.getActiveEditor();
            if (editor instanceof SyncchartsDiagramEditor) {
                CommandStack stack = ((SyncchartsDiagramEditor) editor).getEditingDomain()
                        .getCommandStack();
                if (stack.canUndo()) {
                    // System.out.println(stack.getMostRecentCommand().getLabel());
                    stack.undo();
                }
                if (!stack.canUndo()) {
                    // TODO deactivate back button
                }
            }
            return null;
        }
        System.out.println("Non History");

        // if used normally by kiem
        // if(!abuseMode){
        // try {
        // boolean aquired = semaphore.tryAcquire(STEP_TIMEOUT, TimeUnit.SECONDS);
        // if (!aquired) {
        // throw new KiemExecutionException("Timeout, could not aquire semaphore.", true,
        // false, true, null);
        // }
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }}

        // do next transformation
        TransformationDescriptor descriptor = getNextTransformation();
        currentContext = null;
        if (descriptor != null) {
            System.out.println("Trigger");

            if (facade == null) {
                Status status = new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "XtendFacade has not been initialized properly!");
                StatusManager.getManager().handle(status);
                return null;
            }
            // else execute Transformation
            TransformationContext context = new XtendTransformationContext(facade, descriptor,
                    domain, semaphore);
            currentContext = context;
            semaphore.release();

            // if normally used by kiem execute the transformation
            if (!kiviMode) {
                System.out.println("NO ABUSEEEEEEEEEEEEEEEEEEEEEEEE");
                processTransformation();
            }
            // TransformationTrigger.getInstance().step(context);
        }

        // TODO stop the transformation if finished
        // else {
        // finished = true;
        // doPostTransformation();
        // PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
        // public void run() {
        // MessageDialog.openInformation(shell, "Done",
        // "Transformation finished. No further elements to process.");
        // }
        // });
        // semaphore.release();
        // throw new KiemExecutionException("No Further Transformations", true, false, true, null);
        // }
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
     * @param skipSteps
     *            the skipSteps to set
     */
    public void setSkipSteps(int skipSteps) {
        this.skipSteps = skipSteps;
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
        facade = TransformationUtil.initializeFacade(getTransformationFile(), getBasePackages(),
                Maps.newHashMap(globalVars));
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
     * @return either the next transformation or <code>null</code>.
     */
    public abstract TransformationDescriptor getNextTransformation();

    /**
     * this method is called if there are no further steps to do and the transformation will
     * terminate.
     */
    public abstract void doPostTransformation();

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
    public TransformationContext getCurrentContext() {
        return currentContext;
    }

    private void processTransformation() {
        TransformationEffect effect = new TransformationEffect(currentContext);
        effect.execute();
        effect.getResult();
        IWorkbenchPart currentlyActiveEditor = TransformationUtil.getActiveEditor();
        RefreshGMFElementsEffect gmfEffect = new RefreshGMFElementsEffect(
                (SyncchartsDiagramEditor) currentlyActiveEditor);
        gmfEffect.execute();

        // apply automatic layout by triggering the trigger (null layouts whole diagram)
        LayoutEffect layoutEffect = new LayoutEffect(currentlyActiveEditor, null);
        layoutEffect.execute();
    }
}
