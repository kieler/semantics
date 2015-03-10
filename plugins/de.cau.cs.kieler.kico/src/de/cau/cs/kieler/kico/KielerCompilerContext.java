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
package de.cau.cs.kieler.kico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * This class implements the context of a KielerCompiler call
 * 
 * @author cmot
 * @kieler.design 2014-06-08 proposed
 * @kieler.rating 2014-06-08 proposed yellow
 * 
 */
public class KielerCompilerContext {

    /** The global verbose mode. */
    private boolean verboseMode = false;

    /** Further included models can be searched by a scoper. */
    private ArrayList<EObject> includedModels = new ArrayList<EObject>();

    /** The resource set of all models for a compile run. */
    private ResourceSet modelResourceSet = null;

    /** The main resource for a compile run. */
    private Resource mainResource = null;

    /** The originally selected transformation Ids. */
    private List<String> selectedTransformationIds = new ArrayList<String>();

    /** The originally priorized transformation Ids. */
    private List<String> priorizedTransformationIds = new ArrayList<String>();

    /** The originally disabled transformation Ids. */
    private List<String> disabledTransformationIds = new ArrayList<String>();

    /** The (intermediate) compilation result. */
    CompilationResult compilationResult = null;

    /** The transformation used for compilation. */
    private List<String> compilationTransformationIds = new ArrayList<String>();

    /** The internal compile graph is the 'state' of a compilation. */
    private List<FeatureDummy> graph = null;

    /** The cached transformations to graph elements. */
    private static HashMap<Transformation, FeatureDummy> transformation2graph =
            new HashMap<Transformation, FeatureDummy>();;

    /** The flag to output no grous. */
    private boolean noGrous = false;

    /** The flag to calculate prerequirements. */
    private boolean prerequirements = false;

    /** The flag to do all transformations inplace and NOT on a copy. */
    private boolean inplace = false;

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

    /**
     * Gets the list of priorized transformations Ids which are preferred if an alternative group is
     * selected an no other transformation is selected.
     * 
     * @return the priorized transformations
     */
    public List<String> getPriorizedTransformationsIds() {
        // FIXME: THIS IS A TEMPORARY HACK!!! REMOVE THIS HACK LATER AND EVAL THE EXTENSION POINT
        // FROM KICO.UI TO FILL THIS!
        priorizedTransformationIds.clear();
        priorizedTransformationIds.add("S2ARDUINO");
        return priorizedTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context without any original source model. Using this
     * constructor is only advised if you do not intent to compile any model but want to calculate
     * pre-requirements.
     * 
     * @param selectedAndDisabledTransformationIds
     *            the selected and disabled transformation i ds
     */
    public KielerCompilerContext(String selectedAndDisabledTransformationIds) {
        compilationResult = new CompilationResult();
        parseSelectedAndDisabledTransformationIds(selectedAndDisabledTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context with an original source model.
     * 
     * @param selectedAndDisabledTransformationIds
     *            the selected and disabled transformation i ds
     * @param eObject
     *            the e object
     */
    public KielerCompilerContext(String selectedAndDisabledTransformationIds, EObject eObject) {
        compilationResult = new CompilationResult(eObject);
        parseSelectedAndDisabledTransformationIds(selectedAndDisabledTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context without any original source model. Using this
     * constructor is only advised if you do not intent to compile any model but want to calculate
     * pre-requirements.
     * 
     * @param selectedTransformationIds
     *            the selected transformation i ds
     * @param disabledTransformationIds
     *            the disabled transformation i ds
     */
    public KielerCompilerContext(List<String> selectedTransformationIds,
            List<String> disabledTransformationIds) {
        compilationResult = new CompilationResult();
        copySelectedAndDisabledTransformationIds(selectedTransformationIds,
                disabledTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new kieler compiler context with an original source model.
     * 
     * @param selectedTransformationIds
     *            the selected transformation i ds
     * @param disabledTransformationIds
     *            the disabled transformation i ds
     * @param eObject
     *            the e object
     */
    public KielerCompilerContext(List<String> selectedTransformationIds,
            List<String> disabledTransformationIds, EObject eObject) {
        compilationResult = new CompilationResult(eObject);
        copySelectedAndDisabledTransformationIds(selectedTransformationIds,
                disabledTransformationIds);
    }

    // -------------------------------------------------------------------------

    /**
     * Copy the selected and disabled transformation Id lists.
     * 
     * @param selectedTransformationIds
     *            the selected transformation i ds
     * @param disabledTransformationIds
     *            the disabled transformation i ds
     */
    private void copySelectedAndDisabledTransformationIds(List<String> selectedTransformationIds,
            List<String> disabledTransformationIds) {
        this.selectedTransformationIds.clear();
        this.disabledTransformationIds.clear();
        for (String transformationId : selectedTransformationIds) {
            this.selectedTransformationIds.add(transformationId);
        }
        for (String transformationId : disabledTransformationIds) {
            this.disabledTransformationIds.add(transformationId);
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Parses the selected and disabled transformation i ds.
     * 
     * @param selectedAndDisabledTransformationIds
     *            the selected and disabled transformation i ds
     */
    private void parseSelectedAndDisabledTransformationIds(
            String selectedAndDisabledTransformationIds) {

        String trimmed = selectedAndDisabledTransformationIds.replace(" ", "");
        if (trimmed.length() == 0) {
            return;
        }
        String[] transformationIdArray = trimmed.split(",");
        if (transformationIdArray == null) {
            return;
        }
        this.selectedTransformationIds.clear();
        this.disabledTransformationIds.clear();
        for (String transformation : Arrays.asList(transformationIdArray)) {
            if (transformation.startsWith("!")) {
                disabledTransformationIds.add(transformation.substring(1));
            } else {
                selectedTransformationIds.add(transformation);
            }
        }
    }

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
     * @param includedModels
     *            the new included models
     */
    public void addIncludedModel(EObject includedModel) {
        this.includedModels.add(includedModel);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the included model resource.
     * 
     * @param includedModel
     *            the included model
     * @return the included model resource
     */
    public ResourceSet getModelResourceSet() {
        return this.modelResourceSet;
    }

    // -------------------------------------------------------------------------
    /**
     * Sets the included model resource.
     * 
     * @param includedModel
     *            the included model
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
     * @param includedModel
     *            the included model
     * @return the included model resource
     */
    public void setMainResource(Resource resource) {
        this.mainResource = resource;
    }

    // -------------------------------------------------------------------------

    /**
     * Get additionally included models that can be searched by a scoper.
     * 
     * @param includedModels
     *            the new included models
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
     * Gets the graph which represents the current compilation state of a compilation run.
     * 
     * @return the graph
     */
    public List<FeatureDummy> getGraph() {
        return this.graph;
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
     * Gets the selected transformation Ids.
     * 
     * @return the selected transformation Ids
     */
    public List<String> getSelectedTransformationIds() {
        return selectedTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the disabled transformation Ids.
     * 
     * @return the disabled transformation Ids
     */
    public List<String> getDisabledTransformationIds() {
        return disabledTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the graph adding only defaults for alternatives iff not prioritized.
     * 
     * @param prioritizedTransformationIds
     *            the prioritized transformation i ds
     * @return the list
     */
    public void buildGraph(List<String> prioritizedTransformationIds) {
        buildGraph(prioritizedTransformationIds, true);
    }

    // -------------------------------------------------------------------------

    /**
     * Builds the full graph with all alternatives.
     * 
     * @return the list
     */
    public void buildGraph() {
        buildGraph(new ArrayList<String>(), false);
    }

    // -------------------------------------------------------------------------
    // -------------------------------------------------------------------------

    /**
     * Builds the graph with filtering optional transformation Ids of alternative groups.
     * 
     * @param prioritizedTransformationIds
     *            the prioritized transformation i ds
     * @param preselectAlternatives
     *            the preselect alternatives
     * @return the list
     */
    public void buildGraph(List<String> prioritizedTransformationIds, boolean preselectAlternatives) {
        ArrayList<FeatureDummy> returnList = new ArrayList<FeatureDummy>();

        transformation2graph.clear();
        List<Transformation> transformations = KielerCompiler.getRegisteredTransformations();

        // Build all nodes first
        for (Transformation transformation : transformations) {
            FeatureDummy transformationDummy = new FeatureDummy(transformation);

            returnList.add(transformationDummy);
            transformationDummy.parent = returnList;
            transformation2graph.put(transformation, transformationDummy);
            // System.out.println("Adding Dummy node for " + transformation.getId() + ", "
            // + transformation.toString());
        }

        // Calculate dependencies
        for (Transformation transformation : transformations) {
            FeatureDummy transformationDummy = transformation2graph.get(transformation);

            List<String> producesDependencies = transformation.getProducesFeatureIds();
            List<String> notHandlesDependencies = transformation.getNotHandlesFeatureIds();
            if (transformationDummy.isAlternative()) {
                producesDependencies = new ArrayList<String>();
                if (preselectAlternatives) {
                    // If this is an alternative group, then ONLY add the SELECTED alternative
                    // according to the prioritizedTransformationIds (input)
                    TransformationGroup group =
                            (TransformationGroup) transformationDummy.transformation;
                    List<String> priorized = new ArrayList<String>();

                    // FIXME: BAD HACK FOR WEIHNACHTSFEIER, USE KICO.UI EXTENSION POINT!!!
                    // priorized.add("S2ARDUINO");

                    String selectedAlternative =
                            (group).getSelectedProducesDependency(prioritizedTransformationIds,
                                    disabledTransformationIds, priorized);
                    producesDependencies.add(selectedAlternative);
                } else {
                    // Also here by convention in GROUP alternatives consider ther produces dependencies
                    List<String> allAlternative =
                            ((TransformationGroup) transformationDummy.transformation)
                                    .getProducesFeatureIds();
                    for (String alternative : allAlternative) {
                        producesDependencies.add(alternative);
                    }
                }
            }

            // Handle produces depencencies
            for (String producesDependencyId : producesDependencies) {
                Transformation otherTransformationOrGroup =
                        KielerCompiler.getTransformation(producesDependencyId);
                if (otherTransformationOrGroup != null) {
                    // System.out.println("Dependencies for " + transformation.getId());
                    // System.out.println("  " + otherTransformationOrGroup.getId());
                    FeatureDummy otherTransformationDummy =
                            transformation2graph.get(otherTransformationOrGroup);

                    // Example: dummy-ABORT produces otherDummy=INIT ==> dummy=ABORT-->otherDummy=INIT
                    // Insert dependency in dummy that produces other dummy
                    transformationDummy.dependencies.add(otherTransformationDummy);
                    // Insert reverse dependency in other dummy
                    otherTransformationDummy.reverseDependencies.add(transformationDummy);
                }
            }

            // Handle not handles dependencies
            
            // 14.02.2015: Attention: if we hit a transformation GROUP that is not handled, we mus
            // fully resolve this group first into sets of transformations:
            // we resolve group $G$ to the set of transformations $T$ where we follow all pseudo dependencies from $G$ until we hit
            // the first transformation, which then must be part of $T$. If we hit another group $G_i$ we recursively follow each 
            // pseudo dependencies of $G_i$.
            
            for (String notHandlesDependencyId : notHandlesDependencies) {
                Transformation otherTransformationOrGroup =
                        KielerCompiler.getTransformation(notHandlesDependencyId);
                if (otherTransformationOrGroup != null) {
                    // System.out.println("Dependencies for " + transformation.getId());
                    // System.out.println("  " + otherTransformationOrGroup.getId());
                    FeatureDummy otherTransformationDummy =
                            transformation2graph.get(otherTransformationOrGroup);

                    if (preselectAlternatives) {
                        // If this is an alternative group, then ONLY add the SELECTED alternative
                        // according to the prioritizedTransformationIds (input)
                        break;
                    }

                    HashSet<FeatureDummy> otherResolvedTransformationDummys = resolveTransformationGroup(otherTransformationDummy);
                    for (FeatureDummy otherResolvedTransformationDummy : otherResolvedTransformationDummys) {
                        // Example: dummy=ABORT not handles otherDummy=DURING ==> otherDummy=DURING-->dummy=ABORT
                        // Insert dependency in other dummy
                        otherResolvedTransformationDummy.dependencies.add(transformationDummy);
                        // Insert reverse dependency in dummy that
                        transformationDummy.reverseDependencies.add(otherResolvedTransformationDummy);
                    }
                }
            }
            
        }

        // set the graph of this context to the new built graph
        graph = returnList;
    }

    
    // -------------------------------------------------------------------------
    
    public HashSet<FeatureDummy> resolveTransformationGroup(FeatureDummy transformationDummy) {
        HashSet<FeatureDummy> returnList = new HashSet<FeatureDummy>();
        if (transformationDummy.isGroup()) {
            // follow pseudo dependencies
            for (FeatureDummy groupTransformationDummy : transformationDummy.dependencies) {
                 returnList.addAll(resolveTransformationGroup(groupTransformationDummy));
            }
        }
        else {
            // We arrived at a transformation that is NOT a group. This is the resolved transformation we
            // are looking for.
            returnList.add(transformationDummy);
        }
        return returnList;
    }

    
    // -------------------------------------------------------------------------

    /**
     * Gets the graph transformation dummy.
     * 
     * @param transformation
     *            the transformation
     * @return the graph transformation dummy
     */
    public FeatureDummy getGraphTransformationDummy(Transformation transformation) {
        if (transformation2graph != null) {
            return transformation2graph.get(transformation);
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is no groups flag is set. If false then mark groups, i.e., boolean mark alternative
     * groups if ONE of the alternatives is selected and mark non-alternatives groups if ALL are
     * selected.
     * 
     * @return true, if is no groups
     */
    public boolean isNoGroups() {
        return this.noGrous;
    }

    /**
     * Sets the no groups flag. If false then mark groups, i.e., boolean mark alternative groups if
     * ONE of the alternatives is selected and mark non-alternatives groups if ALL are selected.
     * 
     * @param noGrous
     *            the new no groups
     */
    public void setNoGroups(boolean noGrous) {
        this.noGrous = noGrous;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks if is prerequirements. Note that if switched off no dependencies are considered. The
     * transformations will be applied straight forward in the order defined by the
     * transformationIds list.
     * 
     * @return true, if is prerequirements
     */
    public boolean isPrerequirements() {
        return this.prerequirements;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the prerequirements. Note that if switched off no dependencies are considered. The
     * transformations will be applied straight forward in the order defined by the
     * transformationIds list.
     * 
     * @param prerequirements
     *            the new prerequirements
     */
    public void setPrerequirements(boolean prerequirements) {
        this.prerequirements = prerequirements;
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
     * Checks if is inplace.
     * 
     * @return true, if is inplace
     */
    public boolean isInplace() {
        return this.inplace;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the inplace.
     * 
     * @param inplace
     *            the new inplace
     */
    public void setInplace(boolean inplace) {
        this.inplace = inplace;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformationIds that are/will be used for compilation.
     * 
     * @return the compilation transformation Ids
     */
    public List<String> getCompilationTransformationIds() {
        return compilationTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Sets the compilation transformation Id. Internally used by KiCo.
     * 
     * @param compilationTransformationIds
     *            the new compilation transformation Id
     */
    public void setCompilationTransformationIds(List<String> compilationTransformationIds) {
        this.compilationTransformationIds = compilationTransformationIds;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the transformation object that should exist if this is a compile run. By convention this
     * is the first model of the intermediate results. The following will return null if you
     * requested a pre-requirement analysis.
     * 
     * @return the transformation object
     */
    public EObject getTransformationObject() {
        if ((getCompilationResult() == null
                || getCompilationResult().getIntermediateResults().get(0) == null || (!(getCompilationResult()
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
     * @return the e object
     */
    public void setTransformationObject(EObject eObject) {
        if (getCompilationResult() == null) {
            this.compilationResult = new CompilationResult(eObject);
            return;
        } else {
            if (getCompilationResult().getIntermediateResults().size() < 1) {
                getCompilationResult().getIntermediateResults().add(
                        new IntermediateResult("", eObject, 0));
            } else {
                getCompilationResult().getIntermediateResults().add(0,
                        new IntermediateResult("", eObject, 0));
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
