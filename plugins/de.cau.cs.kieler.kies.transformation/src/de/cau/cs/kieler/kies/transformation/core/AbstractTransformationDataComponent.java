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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.json.JSONObject;

import com.google.common.collect.Maps;

import de.cau.cs.kieler.kies.transformation.Activator;
import de.cau.cs.kieler.kies.transformation.kivi.TransformationTrigger;
import de.cau.cs.kieler.kies.transformation.util.TransformationUtil;
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

    private static final int STEP_TIMEOUT = 2;
    private Semaphore semaphore;

    protected XtendFacade facade;
    protected Map<String, Variable> globalVars;

    private int skipSteps = 0;

    /**
     * Any extending class has to provide a map with global Variables.
     * 
     * @param globVars
     *            Map with global Variables for the XtendFacade.
     */
    public AbstractTransformationDataComponent(final Map<String, Variable> globVars) {
        if (globVars != null) {
            globalVars = globVars;
        } else {
            globalVars = Collections.emptyMap();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
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

        try {
            boolean aquired = semaphore.tryAcquire(STEP_TIMEOUT, TimeUnit.SECONDS);
            System.out.println("Aquire");
            if (!aquired) {
                System.out.println("Problem occured");
                return null;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // do next transformation
        TransformationDescriptor descriptor = getNextTransformation();
        if (descriptor != null) {
            System.out.println("Trigger");
            if (TransformationTrigger.getInstance() != null) {
                if (facade == null) {
                    Status status = new Status(Status.ERROR, Activator.PLUGIN_ID,
                            "XtendFacade has not been initialized properly!");
                    StatusManager.getManager().handle(status);
                    return null;
                }
                // else execute Transformation
                TransformationTrigger.getInstance().step(facade,
                        descriptor.getTransformationName(), descriptor.getParameters(), domain,
                        semaphore);
            }
        } else {
            doPostTransformation();
            PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
                public void run() {
                    MessageDialog.openInformation(shell, "Done",
                            "Transformation finished. No further elements to process.");
                }
            });
            throw new KiemExecutionException("No Further Transformations", true, false, true, null);
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
        facade = AbstractTransformationDataComponent.initializeFacade(getTransformationFile(),
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
     * initializes an XtendFacade and returns the instance.
     * 
     * @param extentionFile
     *            file containing the extentions.
     * @param basePackages
     *            emf packages needed within the transformation.
     * @return XtendFacade
     */
    public static XtendFacade initializeFacade(final String extentionFile,
            final String[] basePackages) {
        return initializeFacade(extentionFile, basePackages, null);
    }

    /**
     * initializes an XtendFacade and returns the instance.
     * 
     * @param extentionFile
     *            file containing the extentions.
     * @param basePackages
     *            emf packages needed within the transformation.
     * @param globalVars
     *            map with global variables
     * @return XtendFacade
     */
    public static XtendFacade initializeFacade(final String extentionFile,
            final String[] basePackages, final Map<String, Variable> globalVars) {
        String extentionWithout = extentionFile;
        // cut off file extention
        if (extentionWithout.contains("." + XtendFile.FILE_EXTENSION)) {
            extentionWithout = extentionWithout.substring(0,
                    extentionWithout.indexOf("." + XtendFile.FILE_EXTENSION));
        }

        XtendFacade xtendFacade = null;
        if (globalVars != null) {
            ExecutionContextImpl exec = new ExecutionContextImpl(globalVars);
            xtendFacade = XtendFacade.create(exec, extentionWithout);
        } else {
            xtendFacade = XtendFacade.create(extentionWithout);
        }

        registerEPackages(xtendFacade, basePackages);

        return xtendFacade;
    }

    private static void registerEPackages(final XtendFacade xtendFacade, final String[] basePackages) {
        // Register all meta models
        for (String basePackage : basePackages) {
            try {
                EPackage pack = EcoreUtil2.getEPackageByClassName(basePackage);

                // create EMFMetaModel with the given EPackage
                EmfMetaModel metaModel = new EmfMetaModel(pack);
                xtendFacade.registerMetaModel(metaModel);
            } catch (ConfigurationException ce) {
                // package class could not be found
                // this is bad and should not happen.
                Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                        "A problem occured while registering MetaModel "
                                + "(maybe the package name was misspelled).", ce);
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                return;
            }
        }
    }

    /**
     * @return the editing domain
     */
    public TransactionalEditingDomain getDomain() {
        return domain;
    }

}
