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
package de.cau.cs.kieler.kico.klighd.internal;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.progress.UIJob;

import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.klighd.KiCoKLighDPlugin;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController.ChangeEvent;
import de.cau.cs.kieler.kico.klighd.view.model.CodePlaceHolder;
import de.cau.cs.kieler.kico.klighd.view.model.ErrorModel;
import de.cau.cs.kieler.kico.klighd.view.model.MessageModel;
import de.cau.cs.kieler.kitt.tracing.Tracing;

/**
 * This Job start an asynchronous Compilation.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */
public class AsynchronousCompilation extends Job {

    /** ModelView which spawned this job */
    private final KiCoModelUpdateController modelView;
    /** Model to compile */
    private final EObject sourceModel;
    /** Name of the source file */
    private final String sourceFile;
    /** Name of the source file without extension */
    private final String sourceFileName;
    /** Compiler selection */
    private final Pair<KielerCompilerSelection, Boolean> selection;
    /** Flag if additional progress information should be displayed */
    private final boolean tracing;
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
    public AsynchronousCompilation(KiCoModelUpdateController modelView, EObject sourceModel,
            String sourceFile, Pair<KielerCompilerSelection, Boolean> selection, boolean tracing) {
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
        this.selection = selection;
        this.tracing = tracing;

        // compilation placeholder
        this.model = new MessageModel("Compilation in progress...");
    }

    /**
     * {@inheritDoc}
     */
    protected IStatus run(final IProgressMonitor monitor) {
        try {
            // compile with progress monitor
            KielerCompilerContext context =
                    new KielerCompilerContext(selection.getFirst(), (EObject) sourceModel);
            context.setAdvancedSelect(selection.getSecond());
            context.setInplace(false);
            context.setProgressMonitor(monitor);
            if (tracing) {
                context.setProperty(Tracing.ACTIVE_TRACING, true);
            }
            // ONLY turn this on if you temporary want to SEE simulation transformations in KiCo
            // selection view
            context.setCreateDummyResource(false);
            result = KielerCompiler.compile(context);

            if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }

            // check result
            if (!result.getPostponedErrors().isEmpty()) {
                model =
                        new ErrorModel("Compilation Error!", result.getPostponedErrors().get(0)
                                .getMessage(), result.getAllErrors());
                updateModelView();
                return new Status(Status.INFO, KiCoKLighDPlugin.PLUGIN_ID, result.getAllErrors());
            } else if (result == null
                    || (result.getEObject() == null && result.getString() == null)) {
                throw new NullPointerException(
                        "Compilation produced no result. Internal compilation error.");
            }

            // set result model to either ecore model or code
            if (result.getEObject() != null) {
                model = result.getEObject();
            } else if (result.getString() != null) {
                model = new CodePlaceHolder(sourceFileName, result.getString());
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
            model = new ErrorModel("Compilation Error!", e);
            updateModelView();
            return new Status(Status.WARNING, KiCoKLighDPlugin.PLUGIN_ID, e.getMessage(),
                    e.getCause());
        }
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
                    modelView
                            .update(ChangeEvent.COMPILATION_FINISHED, AsynchronousCompilation.this);
                    return Status.OK_STATUS;
                }
            }.schedule();
        }
    }

    /**
     * Returns the result of the compilation.
     * 
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
     * {@inheritDoc}
     */
    @Override
    protected void canceling() {
        model = new ErrorModel("Compilation aborted!");
        updateModelView();
    }

}
