/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
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
import org.eclipse.elk.core.util.Pair;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.progress.UIJob;

import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerSelection;
import de.cau.cs.kieler.kico.klighd.KiCoKlighdPlugin;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController;
import de.cau.cs.kieler.kico.klighd.KiCoModelUpdateController.ChangeEvent;
import de.cau.cs.kieler.kico.klighd.internal.model.CodePlaceHolder;
import de.cau.cs.kieler.kitt.tracing.Tracing;
import de.cau.cs.kieler.klighd.ui.view.model.ErrorModel;
import de.cau.cs.kieler.klighd.ui.view.model.MessageModel;

/**
 * This Job start an asynchronous Compilation.
 * 
 * @author als
 * @kieler.design 2014-07-30 proposed
 * @kieler.rating 2014-07-30 proposed yellow
 * 
 */ 
public class AsynchronousCompilation extends Job {

    /** ModelView which spawned this job. */
    private final KiCoModelUpdateController viewController;
    /** Model to compile. */
    private final EObject sourceModel;
    /** Name of the source file. */
    private final String sourceFile;
    /** Name of the source file without extension. */
    private final String sourceFileName;
    /** Compiler selection. */
    private final Pair<KielerCompilerSelection, Boolean> selection;
    /** Flag if additional progress information should be displayed. */
    private final boolean tracing;
    /** Flag if debug mode is active or not. */
    private final boolean debugMode;
    /** Flag if this job should update corresponding ModelView when finished compiling. */
    private boolean notifyWhenFinished = false;
    /** Model to display in ModeView depending on current compilation state. */
    private Object model;
    /** Compilation Result. */
    private CompilationResult result;
    /** Flag if compilation finished. */
    private boolean finishedCompilation = false;

    /**
     * Creates a Job which compiles given source model with transformation of given selection.
     * 
     * @param controller
     *            the view update controller
     * @param sourceModel
     *            the source model
     * @param sourceFile
     *            the source file
     * @param selection
     *            the selection
     * @param tracing
     *            tracing flag
     * @param debugMode
     *            debug mode flag
     */
    public AsynchronousCompilation(final KiCoModelUpdateController controller,
            final EObject sourceModel, final String sourceFile,
            final Pair<KielerCompilerSelection, Boolean> selection, final boolean tracing,
            final boolean debugMode) {
        super("Compiling: " + sourceFile);

        this.viewController = controller;
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
        this.debugMode = debugMode;

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
            context.setInplace(!tracing);
            context.setProgressMonitor(monitor);
            if (tracing) {
                context.setProperty(Tracing.ACTIVE_TRACING, true);
            }
            // Do turn this on ONLY if you temporary want to SEE simulation transformations in KiCo selection view
            context.setCreateDummyResource(debugMode);
            result = KielerCompiler.compile(context);

            if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }

            // check result
            if (!result.getPostponedErrors().isEmpty()) {
                model = new ErrorModel("Compilation Error!",
                        result.getPostponedErrors().get(0).getMessage(), result.getAllErrors());
                updateView();
                return new Status(Status.INFO, KiCoKlighdPlugin.PLUGIN_ID, result.getAllErrors());
            } else
                if (result == null || (result.getEObject() == null && result.getString() == null)) {
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
            updateView();
        } catch (Exception e) { // error display
            if (monitor.isCanceled()) {
                return Status.CANCEL_STATUS;
            }
            model = new ErrorModel("Compilation Error!", e);
            updateView();
            return new Status(Status.WARNING, KiCoKlighdPlugin.PLUGIN_ID, e.getMessage(),
                    e.getCause());
        }
        return Status.OK_STATUS;
    }

    /**
     * Updates view if necessary.
     */
    private void updateView() {
        if (notifyWhenFinished) {
            new UIJob("Updating ModelView [" + sourceFile + "]") {

                @Override
                public IStatus runInUIThread(final IProgressMonitor monitor) {
//                    viewController.update(ChangeEvent.COMPILATION_FINISHED,
//                            AsynchronousCompilation.this);
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
     * @param notify
     *            update flag
     */
    public void setNotifyWhenFinished(final boolean notify) {
        notifyWhenFinished = notify;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void canceling() {
        model = new ErrorModel("Compilation aborted!");
        updateView();
    }

}
