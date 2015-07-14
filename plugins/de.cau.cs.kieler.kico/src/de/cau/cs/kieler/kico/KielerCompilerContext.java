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
package de.cau.cs.kieler.kico;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.cau.cs.kieler.core.properties.MapPropertyHolder;
import de.cau.cs.kieler.kico.features.Feature;
import de.cau.cs.kieler.kico.internal.KiCoUtil;
import de.cau.cs.kieler.kico.internal.Transformation;
import de.cau.cs.kieler.kico.internal.TransformationDummy;
import de.cau.cs.kieler.kico.internal.TransformationDummyGraph;

/**
 * This class implements the context of a KielerCompiler call.
 * 
 * @author cmot
 * @kieler.design 2015-03-09 proposed
 * @kieler.rating 2015-03-09 proposed yellow
 */
public class KielerCompilerContext extends MapPropertyHolder {

    /** the serial version UID. */
    private static final long serialVersionUID = -6086745674842248093L;

    /** The (intermediate) compilation result. */
    CompilationResult compilationResult = null;

    /** The user selection for interactive compilation. */
    private KielerCompilerSelection selection = new KielerCompilerSelection();

    /**
     * The flag to automatically select not only based on feature groups but also auto select
     * transformations based on the selected features (defining the target) and the model features
     * (defining the requirements).
     */
    private boolean advancedSelect = false;

    /**
     * The overall compilation is inplace and should happen directly on the source model (as far as
     * there is no meta model change).
     */
    private boolean isInplace = false;

    /** The global verbose mode. */
    private boolean verboseMode = false;

    /** The resource set of all models for a compile run. */
    private ResourceSet modelResourceSet = null;

    /** The main resource for a compile run. */
    private Resource mainResource = null;

    /** Further included models can be searched by a scoper. */
    private ArrayList<EObject> includedModels = new ArrayList<EObject>();

    /** The calculated transformation chain used for compilation. */
    private List<Transformation> compilationChain = null;

    /** The internal graph. */
    private TransformationDummyGraph graph = null;

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
     * Instantiates a new kieler compiler context with an original source model. <BR>
     * <BR>
     * The string arguments are a list of IDs, where disabled IDs are marked with a "!" before the
     * ID and preferred with a "*". Transformation IDs start with a preceding "T_" and processor
     * options with "P_". <BR>
     * Example:<BR>
     * "ABORT, *T_ABORT_WTO,!P_DEADCODE"
     * 
     * @param stringArguments
     *            the string arguments
     * @param eObject
     *            the e object
     */
    public KielerCompilerContext(String stringArguments, EObject eObject) {
        compilationResult = new CompilationResult(eObject);
        selection = new KielerCompilerSelection(stringArguments);
    }

    // -------------------------------------------------------------------------

    /**
     * Validates the selection and produces warnings for transformation or feature IDs that cannot
     * be resolved.
     * 
     */
    public void validateSelection() {
        for (String id : selection.getSelectedFeatureAndTransformationIds()) {
            if (id.startsWith("T_")) {
                id = id.substring(2);
                Transformation transformation = KielerCompiler.getTransformation(id);
                if (transformation == null) {
                    this.getCompilationResult().addPostponedWarning(
                            new KielerCompilerException("KieleCompiler", "KielerCompiler",
                                    "Transformation with '" + id + "' cannot be found."));
                }
            } else {
                Feature feature = KielerCompiler.getFeature(id);
                if (feature == null) {
                    this.getCompilationResult().addPostponedWarning(
                            new KielerCompilerException("KieleCompiler", "KielerCompiler",
                                    "Feature with '" + id + "' cannot be found."));
                }
            }
        }

    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context with an original source model and an existing
     * KielerCompilerSelection.
     * 
     * @param selection
     *            the selection
     * @param eObject
     *            the e object
     */
    public KielerCompilerContext(KielerCompilerSelection selection, EObject eObject) {
        compilationResult = new CompilationResult(eObject);
        this.selection = selection;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context with an original source model.
     * 
     * @param selectedFeatureAndTransformationIds
     *            the selected feature and transformation IDs
     * @param disabledTransformationIds
     *            the disabled transformation IDs
     * @param preferredTransformationIds
     *            the preferred transformation ids
     * @param enabledProcessorOptionIds
     *            the enabled processor option ids
     * @param disabledProcessorOptionIds
     *            the disabled processor option ids
     * @param eObject
     *            the e object
     */
    public KielerCompilerContext(List<String> selectedFeatureAndTransformationIds,
            List<String> disabledTransformationIds, List<String> preferredTransformationIds,
            List<String> enabledProcessorOptionIds, List<String> disabledProcessorOptionIds,
            EObject eObject) {
        compilationResult = new CompilationResult(eObject);
        selection.clear();
        selection.setSelectedFeatureAndTransformationIds(selectedFeatureAndTransformationIds);
        selection.setDisabledTransformationIds(disabledTransformationIds);
        selection.setPreferredTransformationIds(preferredTransformationIds);
        selection.setEnabledProcessorOptionIds(enabledProcessorOptionIds);
        selection.setDisabledProcessorOptionIds(disabledProcessorOptionIds);
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
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Gets the transformation chain as it was calculated, derived by the selection. If there was
     * not yet a compilation chain computed or forceUpdate is true then this method will first
     * trigger a fresh computation of the compilation chain. The transformation chain is computed
     * prior to the real compilation and can also be used for visualization purposes. If the model
     * or the user selection changed forceUpdate should be true, otherwise it mostly should be
     * false.
     * 
     * @param forceUpdate
     *            the force update
     * @return the transformation chain
     */
    public List<Transformation> getTransformationChain(boolean forceUpdate) {
        if (compilationChain == null || forceUpdate) {
            recomputeTransformationChain(true);
        }
        return compilationChain;
    }

    // -------------------------------------------------------------------------

    /**
     * Recompute transformation chain as based on the current selection and the registered features,
     * transformations and processors. If forceUpdate is true then the internal representation of
     * transformations is also recomputed. If the model or the user selection changed forceUpdate
     * should be true, otherwise it mostly should be false. <BR>
     * <BR>
     * This is also the hook to
     * 
     * @param forceUpdate
     *            the force update
     */
    public TransformationDummyGraph recomputeTransformationChain(boolean forceUpdate) {
        graph = new TransformationDummyGraph(this);
        compilationChain = new ArrayList<Transformation>();
        List<TransformationDummy> dummies = graph.getTransformationDummies(forceUpdate);
        for (TransformationDummy dummy : dummies) {
            compilationChain.add(dummy.transformation);
        }
        return graph;
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * The flag to additionally automatically select transformations based on the selected features
     * (defining the target) and the model features (defining the requirements). Note that if
     * switched off no dependencies or model features are considered and only the current
     * feature/feature group or transformation selection is processed. Note that selected features
     * and transformations are possibly re-ordered and may also be filtered if not present in the
     * model.
     * 
     * @return true, if is advancedSelect is switched on
     */
    public boolean isAdvancedSelect() {
        return this.advancedSelect;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the advancedSelect flag to automatically advanced select transformations based on the
     * selected features (defining the target) and the model features (defining the requirements)
     * considering the produced and not-handled-by dependencies. Note that if switched off no
     * dependencies are considered.
     * 
     * @param autoSelect
     *            the new autoSelect
     */
    public void setAdvancedSelect(boolean advancedSelect) {
        this.advancedSelect = advancedSelect;
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
     * Retrieves the set of features for the transformation object (the main source model). If
     * contrary forceFastCached is true then this will just return the cached version if there
     * exists one or null otherwise. ForceFastCached should ONLY be used if it is sure that the
     * model has not changed. ForceFastCached will also prevent a recalculation if the model hash.
     * If ForceFastCached is true the caller must be sure that the model has not changed and was
     * previously been processed. The default is forceUpdate == false and forceFastCached == false.
     * 
     * @param forceUpdate
     *            the force update
     * @param forceFastCached
     *            the force fast cached
     * @return the transformation object features
     */
    public Set<Feature> getTransformationObjectFeatures(boolean forceUpdate, boolean forceFastCached) {
        EObject mainModel = getTransformationObject();
        if (mainModel != null) {
            return KiCoUtil.getModelFeatures(mainModel, forceUpdate, forceFastCached);
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
        if (getCompilationResult() == null) {
            return null;
        }
        if (getCompilationResult().getTransformationIntermediateResults().get(0) == null) {
            return null;
        }
        if (!(getCompilationResult().getTransformationObject() instanceof EObject)) {
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

    /**
     * Checks if the overall compilation is inplace and should happen directly on the source model
     * (as far as there is no meta model change).
     * 
     * @return true, if is inplace
     */
    public boolean isInplace() {
        return isInplace;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the checks if the overall compilation is inplace and should happen directly on the
     * source model (as far as there is no meta model change).
     * 
     * @param isInplace
     *            the new checks if is inplace
     */
    public void setInplace(boolean isInplace) {
        this.isInplace = isInplace;
    }

    // -------------------------------------------------------------------------

}
