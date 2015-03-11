/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * This class implements the context of a KielerCompiler call.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 */
public class KielerCompilerContext {

    /** The (intermediate) compilation result. */
    CompilationResult compilationResult = null;

    /** The user selection for interactive compilation. */
    private KielerCompilerSelection selection = new KielerCompilerSelection();

    /**
     * The flag to automatically select transformations based on the selected features (defining the
     * target) and the model features (defining the requirements).
     */
    private boolean autoSelect = false;

    /** The global verbose mode. */
    private boolean verboseMode = false;

    /** The resource set of all models for a compile run. */
    private ResourceSet modelResourceSet = null;

    /** The main resource for a compile run. */
    private Resource mainResource = null;

    /** Further included models can be searched by a scoper. */
    private ArrayList<EObject> includedModels = new ArrayList<EObject>();

    /** The calculated transformation chain used for compilation. */
    private List<Transformation> compilationChain = new ArrayList<Transformation>();

    /**
     * The flag to create a dummy resource if no resource is present (e.g. because inplace ==
     * false).
     */
    private boolean dummyResource = false;

    /** The progress monitor. A progress monitor is optional and by default is set to null. */
    private IProgressMonitor monitor = null;

    /** The progress monitor for the currently called transformation. */
    private KielerCompilerProgressMonitor currentTransformationProgressMonitor = null;

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context with an original source model and calculates the
     * transformation chain.
     * 
     * @param stringArguments
     *            the string arguments
     * @param eObject
     *            the e object
     */
    public KielerCompilerContext(String stringArguments, EObject eObject) {
        compilationResult = new CompilationResult(eObject);
        selection = new KielerCompilerSelection(stringArguments);
        recalculateTransformationChain();
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context with an original source model and calculates the
     * transformation chain.
     * 
     * @param selectedTransformationIds
     *            the selected feature and transformation IDs
     * @param disabledTransformationIds
     *            the disabled transformation IDs
     * @param eObject
     *            the e object
     */
    public KielerCompilerContext(List<String> selectedTransformationIds,
            List<String> disabledTransformationIds, EObject eObject) {
        compilationResult = new CompilationResult(eObject);
        selection.clear();
        selection.setSelectedFeatureAndTransformationIds(selectedTransformationIds);
        selection.setDisabledTransformationIds(disabledTransformationIds);
        recalculateTransformationChain();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Reset included models.
     */
    public void resetIncludedModels() {
        includedModels.clear();
    }

    // -------------------------------------------------------------------------

    /**
     * Sets additionally included models that can be searched by a scoper.
     * 
     * @param includedModel
     *            the included model
     */
    public void addIncludedModel(EObject includedModel) {
        this.includedModels.add(includedModel);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the included model resource.
     * 
     * @return the included model resource
     */
    public ResourceSet getModelResourceSet() {
        return this.modelResourceSet;
    }

    // -------------------------------------------------------------------------
    /**
     * Sets the included model resource.
     * 
     * @param resourceSet
     *            the new model resource set
     * @return the included model resource
     */
    public void setModelResourceSet(ResourceSet resourceSet) {
        this.modelResourceSet = resourceSet;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the main model resource if one exists.
     * 
     * @return the main model resource
     */
    public Resource getMainResource() {
        return this.mainResource;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the included model resource.
     * 
     * @param resource
     *            the new main resource
     * @return the included model resource
     */
    public void setMainResource(Resource resource) {
        this.mainResource = resource;
    }

    // -------------------------------------------------------------------------

    /**
     * Get additionally included models that can be searched by a scoper.
     * 
     * @return the included models
     */
    public ArrayList<EObject> getIncludedModels() {
        return this.includedModels;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is verbose mode.
     * 
     * @return true, if is verbose mode
     */
    public boolean isVerboseMode() {
        return this.verboseMode;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the verbose mode.
     * 
     * @param verboseMode
     *            the new verbose mode
     */
    public void setVerboseMode(boolean verboseMode) {
        this.verboseMode = verboseMode;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the current compilation result.
     * 
     * @return the compilation result
     */
    public CompilationResult getCompilationResult() {
        return compilationResult;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the user selection for interactive compilation.
     * 
     * @return the selection
     */
    public KielerCompilerSelection getSelection() {
        return selection;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the user selection for interactive compilation.
     * 
     * @param selection
     *            the new selection
     */
    public void setSelection(KielerCompilerSelection selection) {
        this.selection = selection;
        recalculateTransformationChain();
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the transformation chain as it was calculated, derived by the selection .
     * 
     * @return the transformation chain
     */
    public List<Transformation> getTransformationChain() {
        return compilationChain;
    }

    // -------------------------------------------------------------------------

    /**
     * Recalculate transformation chain as based on the current selection and the registered
     * features, transformations and processors.
     */
    public void recalculateTransformationChain() {
        // TODO: Main work of calculating the transformation chain :-)
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * The flag to automatically select transformations based on the selected features (defining the
     * target) and the model features (defining the requirements). Note that if switched off no
     * dependencies are considered and only the current feature or transformation selection is
     * processed. Then features and transformations will be applied straight forward in the order
     * defined by the transformationIds list. If auto select is switched on, the selected features
     * and transformations are possibly re-ordered and may also be filtered if not present in the
     * model.
     * 
     * @return true, if is autoSelect
     */
    public boolean isAutoSelect() {
        return this.autoSelect;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the autoSelect flag to automatically select transformations based on the selected
     * features (defining the target) and the model features (defining the requirements). Note that
     * if switched off no dependencies are considered. The transformations will be applied straight
     * forward in the order defined by the transformationIds list.
     * 
     * @param autoSelect
     *            the new autoSelect
     */
    public void setAutoSelect(boolean autoSelect) {
        this.autoSelect = autoSelect;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if dummy resource flag is set to true.
     * 
     * @return true, if is inplace
     */
    public boolean isCreateDummyResource() {
        return this.dummyResource;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the dummy resource flag to true or false.
     * 
     * @param dummyResource
     *            the new dummyResource flag
     */
    public void setCreateDummyResource(boolean dummyResource) {
        this.dummyResource = dummyResource;
    }

    // -------------------------------------------------------------------------

    /**
     * Retrieves the set of features for the transformation object (the main source model).
     * 
     * @param model
     *            the model
     * @return the transformation object features
     */
    public Set<Feature> getTransformationObjectFeatures() {
        EObject mainModel = getTransformationObject();
        if (mainModel != null) {
            return KiCoUtil.getModelFeatures(mainModel, false, false);
        }
        throw new RuntimeException("No main model found to compile. Cannot calculate feature list.");
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation object that should exist if this is a compile run. By convention this
     * is the first model of the intermediate results.
     * 
     * @return the transformation object
     */
    public EObject getTransformationObject() {
        if ((getCompilationResult() == null
                || getCompilationResult().getTransformationIntermediateResults().get(0) == null || (!(getCompilationResult()
                .getTransformationObject() instanceof EObject)))) {
            // throw new RuntimeException(
            // "compiler(context) must be called with a model to compile as the first elements"
            // + " of intermediate results in the compiled results object");
            return null;
        }
        EObject transformationObject = (EObject) getCompilationResult().getTransformationObject();
        return transformationObject;

    }

    // -------------------------------------------------------------------------

    /**
     * Sets the transformation object that must exist if this is a compile run. By convention this
     * is the first model of the intermediate results.
     * 
     * @param eObject
     *            the new transformation object
     * @return the e object
     */
    public void setTransformationObject(EObject eObject) {
        if (getCompilationResult() == null) {
            this.compilationResult = new CompilationResult(eObject);
            return;
        } else {
            if (getCompilationResult().getTransformationIntermediateResults().size() < 1) {
                getCompilationResult().getTransformationIntermediateResults().add(
                        new TransformationIntermediateResult(eObject));
            } else {
                getCompilationResult().getTransformationIntermediateResults().add(0,
                        new TransformationIntermediateResult(eObject));
            }
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the main overall progress monitor. A progress monitor is optional therefore this method
     * may return null if there exists no progress monitor to be used.
     * 
     * @return the monitor
     */
    public IProgressMonitor getProgressMonitor() {
        return monitor;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the main overall progress monitor. A progress monitor is optional and by default is set
     * to null.
     * 
     * @param monitor
     *            the monitor to set
     */
    public void setProgressMonitor(IProgressMonitor monitor) {
        this.monitor = monitor;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the progress monitor for the currently called transformation. This may be used by
     * transformations to give the status of their current work using
     * getCurrentTransformationProgressMonitor().setPercentDone(int percent).
     * 
     * @return the currentTransformationProgressMonitor
     */
    public KielerCompilerProgressMonitor getCurrentTransformationProgressMonitor() {
        return currentTransformationProgressMonitor;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the progress monitor for the currently called transformation. This is internally used by
     * the KielerCompiler to pass a new sub progress monitor (KielerCompilerProgressMonitor) for
     * each transformation step.
     * 
     * @param currentTransformationProgressMonitor
     *            the currentTransformationProgressMonitor to set
     */
    public void setCurrentTransformationProgressMonitor(
            KielerCompilerProgressMonitor currentTransformationProgressMonitor) {
        this.currentTransformationProgressMonitor = currentTransformationProgressMonitor;
    }

    // -------------------------------------------------------------------------
}
