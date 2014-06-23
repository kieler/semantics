/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico.klighd;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.progress.UIJob;

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.klighd.KiCoModelView.ChangeEvent;
import de.cau.cs.kieler.kico.klighd.model.KiCoCodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.model.KiCoErrorModel;
import de.cau.cs.kieler.kico.klighd.model.KiCoMessageModel;
import de.cau.cs.kieler.kico.ui.KiCoSelection;
import de.cau.cs.kieler.klighd.KlighdConstants;

/**
 * This Job start an asynchronous Compilation
 * 
 * @author als
 * 
 */
public class KiCoAsynchronousCompilation extends Job {

    /** ModelView which spawned this job */
    private final KiCoModelView modelView;
    /** Model to compile */
    private final EObject sourceModel;
    /** Name of the source file */
    private final String sourceFile;
    /** Name of the source file without extension */
    private final String sourceFileName;
    /** Compiler selection */
    private final KiCoSelection transformations;
    /** Flag if additional progress information should be displayed */
    private boolean showsProgress = false;
    /** Flag if this job should update corresponding ModelView when finished compiling */
    private boolean updateModelView = false;
    /** Model to display in ModeView depending on current compilation state */
    private Object model;
    /** Compilation Result */
    private CompilationResult result;
    /** Flag if compilation finished */
    private boolean finishedCompilation = false;

    /**
     * Creates a Job which compiles given source model with transformation of given selection.
     * 
     * @param modelView
     * @param sourceModel
     * @param sourceFile
     * @param transformations
     */
    public KiCoAsynchronousCompilation(KiCoModelView modelView, EObject sourceModel,
            String sourceFile, KiCoSelection transformations) {
        super("Compiling: " + sourceFile);

        this.modelView = modelView;
        this.sourceFile = sourceFile;
        // remove file extension
        if (sourceFile.contains(".")) {
            this.sourceFileName = sourceFile.substring(0, sourceFile.lastIndexOf('.'));
        } else {
            this.sourceFileName = sourceFile;
        }

        this.sourceModel = sourceModel;
        this.transformations = transformations;

        // compilation placeholder
        this.model = new KiCoMessageModel("Compilation in progress...");
    }

    /**
     * {@inheritDoc}
     */
    protected IStatus run(final IProgressMonitor monitor) {
        try {
            monitor.beginTask("whoop", 5000);
            for (int i = 0; i < 5000; i++) {
                Thread.sleep(1);
                monitor.worked(1);
            }

            // compile
            result =
                    KielerCompiler.compile(transformations.getSelectionString(),
                            (EObject) sourceModel, transformations.isAdvanced(), false);

            if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }

            // TODO when cmot finished error piping
            // check result
            // if (result.getLastError()) {
            // throw lastException;
            // } else
            if (result == null || (result.getEObject() == null && result.getString() == null)) {
                throw new NullPointerException(
                        "Compilation produced no result. Internal compilation error.");
            }

            // set result model to either ecore model or code
            if (result.getEObject() != null) {
                model = result.getEObject();
            } else if (result.getString() != null) {
                model = new KiCoCodePlaceHolder(sourceFileName, result.getString());
            }

            // abort if canceled
            if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }

            finishedCompilation = true;
            updateModelView();
        } catch (Exception e) {// error display
            if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }
            model = new KiCoErrorModel("Compilation Error!", e);
            updateModelView();
            return new Status(Status.ERROR, KiCoKLighDPlugin.PLUGIN_ID, e.getMessage(),
                    e.getCause());
        }
        // TODO hide progress
        return Status.OK_STATUS;
    }

    /**
     * Updates ModelView if necessary
     */
    private void updateModelView() {
        if (updateModelView) {
            new UIJob("Updating ModelView [" + sourceFile + "]") {

                @Override
                public IStatus runInUIThread(IProgressMonitor monitor) {
                    modelView.updateModel(ChangeEvent.COMPILATION_FINISHED,
                            KiCoAsynchronousCompilation.this);
                    return Status.OK_STATUS;
                }
            }.schedule();
        }
    }

    /**
     * @return the compilation result or null if compilation not finished or failed
     */
    public CompilationResult getCompilationResult() {
        return result;
    }

    /**
     * Return a model representing current state of compilation. This may be a placeholder of
     * resulting model or even error model.
     * 
     * @return the model
     */
    public Object getModel() {
        return model;
    }

    /**
     * @return if compilation finished
     */
    public boolean hasFinishedCompilation() {
        return finishedCompilation || this.getResult() != null;
    }

    /**
     * Set if this job should update corresponding ModelView when compilation finished.
     * 
     * @param do update flag
     */
    public void setUpdateModelView(boolean doUpdate) {
        updateModelView = doUpdate;
    }

    /**
     * Causes additional progressbars to show up ion model view.
     */
    public void showProgress(Composite parent) {
        if (!showsProgress && !hasFinishedCompilation()) {
            Composite progressContainer = new Composite(parent, SWT.NONE);
            addProgressComponents(progressContainer);
            progressContainer.pack();
            parent.layout(true, true);
            showsProgress = true;
        }
    }

    /**
     * @param progressContainer
     */
    private void addProgressComponents(Composite parent) {
        final Color white = new Color(parent.getDisplay(), KlighdConstants.WHITE);
        parent.setBackground(white);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void canceling() {
        if (showsProgress) {
            // TODO hide progress
        }
        model = new KiCoErrorModel("Compilation aborted!");
        updateModelView();
    }

}
