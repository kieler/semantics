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
package de.cau.cs.kieler.sccharts.tsccharts;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.ui.util.ResourceUtil;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimap;
import com.google.inject.Guice;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.HorizontalAlignment;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KRoundedRectangle;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.VerticalAlignment;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kitt.tracing.Tracing;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;
import de.cau.cs.kieler.klighd.util.ModelingUtil;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.SCChartsFactory;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension;
import de.cau.cs.kieler.sccharts.tsccharts.handler.FileWriter;
import de.cau.cs.kieler.sccharts.tsccharts.handler.RequestType;
import de.cau.cs.kieler.sccharts.tsccharts.handler.TimingRequestResult;
import de.cau.cs.kieler.scg.Assignment;
import de.cau.cs.kieler.scg.Conditional;
import de.cau.cs.kieler.scg.ControlFlow;
import de.cau.cs.kieler.scg.Entry;
import de.cau.cs.kieler.scg.Exit;
import de.cau.cs.kieler.scg.Link;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.ScgFactory;
import de.cau.cs.kieler.scg.features.SCGFeatures;
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures;
import de.cau.cs.kieler.scg.s.transformations.CodeGenerationTransformations;

/**
 * @author als, ima
 *
 */
public class TimingAnalysis extends Job {

    public static final boolean DEBUG = true;

    private String pluginId = "de.cau.cs.kieler.sccharts.tsccharts";

    private FileWriter fileWriter = new FileWriter();

    private TimingAnnotationProvider timingAnnotationProvider = new TimingAnnotationProvider();

    // no side effects on runtime, so static OK here
    private static KRenderingExtensions renderingExtensions = new KRenderingExtensions();
    private static SCChartsExtension scchartsExtension = Guice.createInjector().getInstance(
            SCChartsExtension.class);

    public static void startAnalysis(State rootState, KNode rootNode) {
        // Step 0: (Preprocessing)
        // Add timing labels (while still in synthesis run)

        // Hashmap contains weak references, thus the KGraph can be deleted completely while
        // timing analysis is running
        HashMultimap<Region, WeakReference<KText>> timingLabels = HashMultimap.create();
        Iterator<EObject> graphIter =
                ModelingUtil.eAllContentsOfType2(rootNode, KNode.class, KContainerRendering.class,
                        KRectangle.class);
        while (graphIter.hasNext()) {
            EObject eObj = graphIter.next();
            if (eObj instanceof KRectangle) {
                KRectangle rect = (KRectangle) eObj;
                Object sourceElem = rect.getProperty(KlighdInternalProperties.MODEL_ELEMEMT);
                if (sourceElem instanceof Region) {
                    KText text = KRenderingFactory.eINSTANCE.createKText();
                    text.setText("???/???");
                    renderingExtensions.setFontSize(text, 18);
                    renderingExtensions.setForegroundColor(text, 255, 0, 0);
                    renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5,
                            0, renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
                            VerticalAlignment.TOP, 5, 5, 0, 0);
                    rect.getChildren().add(text);
                    timingLabels.put((Region) sourceElem, new WeakReference<KText>(text));
                }
            }
        }
        KRectangle rectangle =
                (KRectangle) rootNode.getChildren().get(0).getData(KRoundedRectangle.class)
                        .getChildren().get(0);
        KText text = KRenderingFactory.eINSTANCE.createKText();
        text.setText("???");
        renderingExtensions.setFontSize(text, 22);
        renderingExtensions.setForegroundColor(text, 255, 0, 0);
        renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
                renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT, VerticalAlignment.TOP, 5,
                5, 0, 0);
        rectangle.getChildren().add(text);
        timingLabels.put(null, new WeakReference<KText>(text));
        // start analysis job
        new TimingAnalysis(rootState, timingLabels).schedule();
    }

    private State scchart;
    private HashMultimap<Region, WeakReference<KText>> timingLabels;
    private HashMap<Region, String> timingResults;

    /**
     * @param name
     * @param rootState
     * @param rootNode
     */
    public TimingAnalysis(State rootState, HashMultimap<Region, WeakReference<KText>> regionLabels) {
        super("Timing Analysis");
        this.scchart = rootState;
        this.timingLabels = regionLabels;
        this.timingResults = new HashMap<Region, String>();
    }

    /**
     * {@inheritDoc}
     * 
     * @param ttpRegionMapping
     */
    @Override
    protected IStatus run(IProgressMonitor monitor) {
        long startTime = System.currentTimeMillis();
        // Step 1: Compile SCChart to sequentialized SCG

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        KielerCompilerContext context = new KielerCompilerContext(SCGFeatures.SEQUENTIALIZE_ID+",*T_ABORT,*T_scg.basicblock.sc", scchart);
        context.setProperty(Tracing.ACTIVE_TRACING, true);
        context.setAdvancedSelect(true);
        CompilationResult compilationResult = KielerCompiler.compile(context);

        if (!(compilationResult.getEObject() instanceof SCGraph)
                || compilationResult.getPostponedErrors().size() > 0) {
            if (!(compilationResult.getEObject() instanceof SCGraph)) {
                System.out.println("The scg sequentialization did not return a scg.");
            } else {
                System.out.println("The sequentialization yielded postponed Errors:\n");
                Iterator<KielerCompilerException> errorIterator =
                        compilationResult.getPostponedErrors().iterator();
                while (errorIterator.hasNext()) {
                    KielerCompilerException currentError = errorIterator.next();
                    System.out.println(currentError.getMessage() + "\n");
                }
            }
            return new Status(IStatus.ERROR, pluginId, "SCG sequentialization failed.");
        }

        SCGraph scg = (SCGraph) compilationResult.getEObject();
        List<Tracing> tracings = compilationResult.getAuxiliaryData(Tracing.class);
        Tracing tracing = tracings.isEmpty() ? null : tracings.get(0);

        if (tracing == null) {
            return new Status(IStatus.ERROR, pluginId,
                    "The tracing is not activated for the given model.");
        }

        // Step 2: Analyse tracing relation into a node to region mapping

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        Multimap<Object, Object> mapping = tracing.getMapping(scg, scchart);
        HashMap<Node, Region> nodeRegionMapping =
                new HashMap<Node, Region>(mapping.keySet().size());
        HashMap<Region, Integer> regionDepth = TimingUtil.createRegionDepthMap(scchart);
        for (Object oringinElement : mapping.keySet()) {
            if (oringinElement instanceof Node) {
                Collection<Object> targetElements = mapping.get(oringinElement);
                Region region = null;
                int depth = -1;
                for (Object targetObj : targetElements) {
                    EObject targetElement = (EObject) targetObj;
                    /*
                     * If the associated element is NOT a macro state (refinement due to entry node
                     * mappings in tracing in combination with guards) a region is searched to
                     * associate this node to. Except the macro state is the only associated
                     * element.
                     */
                    if (!(targetElement instanceof State && (scchartsExtension
                            .hasInnerStatesOrControlflowRegions((State) targetElement)))
                            || targetElements.size() == 1) {
                        while (targetElement != null) {
                            if (targetElement instanceof Region) {
                                Region newRegionCandidate = (Region) targetElement;
                                int candidateDepth = regionDepth.get(newRegionCandidate);
                                /*
                                 * If new region candidate has a strictly greater depth than the
                                 * current region the new candidate becomes the region this node is
                                 * associated with. Otherwise the region is contained in the new
                                 * candidate and is ignored. Assumption: No node is mapped to
                                 * elements in parallel Regions
                                 */
                                if (candidateDepth > depth) {
                                    region = newRegionCandidate;
                                    depth = candidateDepth;
                                }
                                break;
                            } else {
                                targetElement = targetElement.eContainer();
                            }
                        }
                    }
                }
                nodeRegionMapping.put((Node) oringinElement, region);
            }
        }

        // Step 3: Calculate timing blocks and add additional timing mark nodes into SCG

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }
        HashMap<Integer, Region> tppRegionMap = new HashMap<Integer, Region>();

        // It is normal that some nodes of the SCG will be mapped to null, because they belong to the
        // SCChart itself not to a Region of the SCChart (they cannot be attributed to the outermost
        // Region in the root state, because there may be several of those). So create a dummy region
        // to represent the SCChart in Timing Analysis. Will be mapped to TPP "entry", represented by 0
        Region scchartDummyRegion = SCChartsFactory.eINSTANCE.createRegion();
        scchartDummyRegion.setId("SCChartDummyRegion");

        // insert timing program points
        int highestInsertedTPPNumber =
                insertTPP(scg, nodeRegionMapping, tppRegionMap, scchartDummyRegion);

        // Step 4: Compile SCG to C code

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }
        
        context = new KielerCompilerContext(CodeGenerationFeatures.S_CODE_ID+","+CodeGenerationFeatures.TARGET_ID+",T_"+CodeGenerationTransformations.S2C_ID, scg);
        compilationResult = KielerCompiler.compile(context);

        if (compilationResult.getString() == null
                || compilationResult.getPostponedErrors().size() > 0) {
            if (compilationResult.getString() == null) {
                System.out.println("The code generation yielded no code string.");
            } else {
                System.out.println("The code generation yielded postponed Errors:\n");
                Iterator<KielerCompilerException> errorIterator =
                        compilationResult.getPostponedErrors().iterator();
                while (errorIterator.hasNext()) {
                    KielerCompilerException currentError = errorIterator.next();
                    System.out.println(currentError.getMessage() + "\n");
                }
            }
            return new Status(IStatus.ERROR, pluginId, "The code generation failed.");
        }

        String code = compilationResult.getString();
        // Debug, might be removed
        System.out.print(code);

        // Step 5: Send C code to timing analyzer

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        IFile file = ResourceUtil.getFile(scchart.eResource());
        String uri = file.getLocationURI().toString();

        // Write the generated code to file
        String codeTargetFile = uri.replace(".sct", ".c");
        String codeTargetFilePath = codeTargetFile.replace("file:", "");
        fileWriter.writeToFile(code, codeTargetFilePath);

        // get assumptions
        String assumptionFile = uri.replace(".sct", ".asu");
        String assumptionFilePath = assumptionFile.replace("file:", "");
        StringBuilder stringBuilder = new StringBuilder();
        timingAnnotationProvider.getAssumptions(assumptionFilePath, stringBuilder);
        // just debug, may be removed
        System.out.println(stringBuilder.toString());

        // write timing requests appended to the assumptionString
        LinkedList<TimingRequestResult> resultList =
                timingAnnotationProvider.writeTimingRequests(highestInsertedTPPNumber,
                        stringBuilder);
        // just debug, may be removed
        System.out.println(stringBuilder.toString());
        
        // .ta file string complete, write it to file
        String requestFile = uri.replace(".sct", ".ta");
        String requestFilePath = requestFile.replace("file:", "");
        fileWriter.writeToFile(stringBuilder.toString(), requestFilePath);

        Runtime rt = Runtime.getRuntime();
        String command = "/Users/ima/shared/ptc/bin/ptc " + requestFilePath;
        try {
            Process pr = rt.exec(command);
            // wait for the timing analysis tool to complete its job
            pr.waitFor();
        } catch (IOException e) {
            return new Status(IStatus.ERROR, pluginId,
                    "The timing analysis tool could not be invoked.");
        } catch (InterruptedException e) {
            return new Status(IStatus.ERROR, pluginId,
                    "The timing analysis tool invokation was interrupted");
        }

        // Refresh to make sure the .c file can be found
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
            return new Status(IStatus.ERROR, pluginId, "Files could not be refreshed.");
        }

        // Step 6: Retrieve timing data and associate with regions

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        // construct uri, where the analysis tool will deposit the response file (.ta)
        String taFile = uri.replace(".sct", ".ta.out");
        String taPath = taFile.replace("file:", "");

        int timingInformationFetch =
                timingAnnotationProvider.getTimingInformation(resultList, taPath);
        if (timingInformationFetch == 1) {
            return new Status(IStatus.ERROR, pluginId, "The timing information file was not found");
        } else if (timingInformationFetch == 2) {
            return new Status(IStatus.ERROR, pluginId,
                    "An IO error occurred while timing information was retrieved from file.");
        }
        extractTimingLabels(RequestType.FWCET, resultList, timingLabels, timingResults,
                tppRegionMap, scchart);

        // Step 7: Feedback information back to the diagram

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        // Changing diagram should be in UI thread (maybe ask chsch)
        new UIJob("Inserting timing data") {
            @Override
            public IStatus runInUIThread(IProgressMonitor monitor) {
                for (Region region : timingLabels.keySet()) {
                    Set<WeakReference<KText>> labels = timingLabels.get(region);
                    for (WeakReference<KText> labelRef : labels) {
                        KText label = labelRef.get();
                        if (label != null) {
                            label.setText(timingResults.get(region));
                        }
                    }
                }

                return Status.OK_STATUS;
            }
        }.schedule();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Interactive Timing Analysis completed (elapsed time: " + elapsedTime
                + " ms).");
        return Status.OK_STATUS;
    }

    /**
     * Method extracts timing labels with format <deep timing value> / <flat timing value> for the
     * regions in the resultList.
     * 
     * @param lwcet
     *            : The requestType for which the timing labels are to be extracted. The method
     *            expects either RequestType.LWCET, RequestType.LBCET, RequestType.FWCET or
     *            RequestType.FBCET
     * @param resultList
     *            A list with TimingRequestResults extracted from the timing analysis response file
     * @param timingLabelList
     *            A Map between the Regions of the SCChart which is to be annotated with timing
     *            values and References to the associated labels
     * @param regionLabelStringMap
     *            A Map between Regions and the Strings that will be the timing information labels
     *            to feed back to the diagram
     * @param tppRegionMap
     *            A Mapping between Timing Program Points and Regions
     * @param rootState
     */
    private void extractTimingLabels(RequestType requestType,
            LinkedList<TimingRequestResult> resultList,
            HashMultimap<Region, WeakReference<KText>> timingLabelList,
            HashMap<Region, String> regionLabelStringMap, HashMap<Integer, Region> tppRegionMap,
            State rootState) {
        // Integer because there will be calculations with those values
        HashMap<Region, Integer> deepValues = new HashMap<Region, Integer>();
        HashMap<Region, Integer> flatValues = new HashMap<Region, Integer>();
        Iterator<TimingRequestResult> resultListIterator = resultList.iterator();
        // fill the map for flat values
        while (resultListIterator.hasNext()) {
            TimingRequestResult currentResult = resultListIterator.next();
            if (currentResult.getRequestType() == requestType) {
                Region resultRegion;
                if (!(currentResult.getStartPoint().equals("entry"))){
                resultRegion =
                        tppRegionMap.get(Integer.parseInt(currentResult.getStartPoint()));
                } else {
                resultRegion =
                        tppRegionMap.get(0);
                }
                if (flatValues.get(resultRegion) == null) {
                    flatValues
                            .put(resultRegion, Integer.parseInt(currentResult.getResult().get(0)));
                } else {
                    // there may be more than one timing result for a region, sum the values up
                    flatValues.put(
                            resultRegion,
                            flatValues.get(resultRegion)
                                    + Integer.parseInt(currentResult.getResult().get(0)));
                }
            }
        }
        calculateDeepTimingValues(rootState, flatValues, deepValues);
        Iterator<Region> regionIterator = timingLabelList.keySet().iterator();
        while (regionIterator.hasNext()) {
            Region currentRegion = regionIterator.next();
            if (!(currentRegion == null)) {
                regionLabelStringMap.put(currentRegion, deepValues.get(currentRegion) + " / "
                        + flatValues.get(currentRegion));
            } else {
                Integer WCRT = 0;
                Iterator<Region> outerRegionsIterator = rootState.getRegions().iterator();
                while (outerRegionsIterator.hasNext()) {
                    Integer currentValue = deepValues.get(outerRegionsIterator.next());
                    WCRT = WCRT + currentValue;
                }
                regionLabelStringMap.put(currentRegion, WCRT.toString());
            }
        }
    }

    /**
     * The method takes a state and a Mapping between Regions and Integer values. For each region,
     * it sums up the values for its child regions and itself and puts the result in a map
     * associating regions with their deep timing values. It works recursively from state down to
     * the innermost states of the given scchart.
     * 
     * @param state
     *            The current state, in the original call the sccchart root state
     * @param flatValues
     *            Mapping of Regions to their flat timing values.
     * @param deepValues
     *            Mapping of Regions to their hierarchical timing values. Empty on first call.
     */
    private void calculateDeepTimingValues(State state, HashMap<Region, Integer> flatValues,
            HashMap<Region, Integer> deepValues) {
        EList<Region> regionList = state.getRegions();
        // base case is a state with
        Iterator<Region> regionListIterator = regionList.iterator();
        List<State> macroChildStates = timingAnnotationProvider.getMacroChildStates(state);
        if (!macroChildStates.isEmpty()) {
            Iterator<State> macroChildStatesIterator = macroChildStates.iterator();
            while (macroChildStatesIterator.hasNext()) {
                State macroChild = macroChildStatesIterator.next();
                calculateDeepTimingValues(macroChild, flatValues, deepValues);
            }
        }
        while (regionListIterator.hasNext()) {
            Region childRegion = regionListIterator.next();
            // Add the region's own flat value to its deep value
            Integer flatTiming = flatValues.get(childRegion);
            if (deepValues.get(childRegion) != null) {
                deepValues.put(childRegion, deepValues.get(childRegion) + flatTiming);
            } else {
                deepValues.put(childRegion, flatTiming);
            }
            Integer deepTiming = deepValues.get(childRegion);
            // Add deep timing value of this region to the hierarchical timing value of its parent
            // region
            Region stateParentRegion = state.getParentRegion();
            if (stateParentRegion != null) {
                if (deepValues.get(stateParentRegion) != null) {
                    deepValues.put(stateParentRegion, deepValues.get(stateParentRegion)
                            + deepTiming);
                } else {
                    deepValues.put(stateParentRegion, deepTiming);
                }
            }

        }
    }

    /**
     * The method checks all edges of the SCG and finds edges, where source and target node are
     * associated with different regions from the original SCChart, of which the SCG is a
     * compilation result. This means, the method determines, at which edges of the SCG a context
     * switch between threads happens (which is determined with the help of a map provided by
     * tracing). Into those edges, it inserts Assignment nodes with a Timing Program Point (TPP) for
     * the interface of Interactive Timing Analysis.
     * 
     * @param scg
     *            A sequential SCG, into which timing program points are to be inserted.
     * @param nodeRegionMapping
     *            A map determined by tracing, which relates the nodes of a sequential SCG with
     *            regions of the corresponding SCChart.
     * @param tppRegionMap
     *            A map, into which the method stores the related region for each TPP (which will be
     *            the one corresponding to the thread, to which the context is switched a the
     *            location where the TPP is inserted.
     * @param scchartDummyRegion
     * @param debugNodeList
     * @return returns -1, if the TPP-insertion ran into a problem else the highest inserted TPP
     *         number
     */
    private int insertTPP(SCGraph scg, HashMap<Node, Region> nodeRegionMapping,
            HashMap<Integer, Region> tppRegionMap, Region scchartDummyRegion) {
        // Get all edges of the sequential scg
        // get the SCG nodes in fixed traversing order (top to bottom, then branch first)
        LinkedList<ControlFlow> edgeList = getEdgesInFixedTraversingOrder(scg);
        Iterator<ControlFlow> edgeListIterator = edgeList.iterator();
        ArrayList<Link> redirectedEdges = new ArrayList<Link>();
        // insertion starts with TPP(1);
        int tppCounter = 1;
        while (edgeListIterator.hasNext()) {
            if (tppCounter == 13) {
                // avoid a TPP with the number 13, as this one has a special meaning for the timing
                // analysis tool prototype
                tppCounter = 1 + tppCounter;
            }
            ControlFlow currentEdge = edgeListIterator.next();
            Node edgeTarget = currentEdge.getTarget();
            // get the region the target node of the edge stems from
            Region targetRegion = nodeRegionMapping.get(edgeTarget);
            if (targetRegion == null) {
                // It is normal that nodes of the SCG get mapped to null, if they are considered to
                // belong to the scchart but not to one of its regions, for the timing analysis,
                // they are attributed to a dummy region representing all parts of the scchart that
                // does not belong to a region (thus enabling us to keep track of the timing for
                // those
                // parts
                targetRegion = scchartDummyRegion;
            }
            // get the region the source node of the edge stems from
            EObject edgeEContainer = currentEdge.eContainer();
            Node sourceNode = null;
            if (edgeEContainer instanceof Node) {
                sourceNode = (Node) edgeEContainer;
            } else {
                // source node of edge could not be determined
                return -1;
            }
            Region sourceRegion = nodeRegionMapping.get(sourceNode);
            if (sourceRegion == null) {
                // Nodes that do not belong to a region are attributed to the scchart dummy region
                sourceRegion = scchartDummyRegion;
            }
            // check if the mapping has yielded a complete answer
            if ((targetRegion != null) && (sourceRegion != null)) {
                // check for a context switch, in any other case nothing will be done
                if (!(sourceRegion.equals(targetRegion))) {
                    // also, if this edge has been visited before, there is nothing to do (important
                    // for edges that have the same target node as other edges)
                    if (!(redirectedEdges.contains(currentEdge))) {
                        // now this edge is processed, record that
                        redirectedEdges.add(currentEdge);
                        // insert tpp node, keep it for the redirection of other edges
                        Assignment tpp =
                                insertSingleTPP(scg, currentEdge, tppCounter, redirectedEdges);
                        // Save which Region starts at this TPP value
                        tppRegionMap.put(tppCounter, targetRegion);
                        tppCounter = tppCounter + 1;
                        // make sure that all edges that also point to the same target node as the
                        // current edge did before redirection are redirected to the TPP as well
                        EList<Link> targetIncomingEdges = edgeTarget.getIncoming();
                        if (targetIncomingEdges.size() > 1) {
                            Iterator<Link> targetIncomingIterator = targetIncomingEdges.iterator();
                            while (targetIncomingIterator.hasNext()) {
                                Link redirectionLink = targetIncomingIterator.next();
                                if ((!(currentEdge.equals(redirectionLink)))
                                        && (!(redirectedEdges.contains(redirectionLink)))) {
                                    redirectionLink.setTarget(tpp);
                                    redirectedEdges.add(redirectionLink);
                                }
                            }
                        }
                    }
                }
            } else {
                // a mapping for at least one of the nodes could not be determined
                System.out.println("A mapping for at least one node of an edge cannot be found.");
            }
        }
        return tppCounter - 1;
    }

    /**
     * Creates a linked list of all controlflow edges of a sequential scg in fixed traversing order,
     * meaning top to bottom, then-branches first.
     * 
     * @param The
     *            sequential SCG
     * @return The linked list with all controlflow edges in the graph traversal order top to
     *         bottom, then branches first.
     */
    private LinkedList<ControlFlow> getEdgesInFixedTraversingOrder(SCGraph scg) {
        LinkedList<ControlFlow> edgeList = new LinkedList<ControlFlow>();
        // Find start entry node
        Iterator<Entry> entryIter =
                Iterators.filter(ModelingUtil.eAllContentsOfType2(scg, Node.class), Entry.class);
        Node entry = null;
        while (entryIter.hasNext()) {
            Entry currentEntry = entryIter.next();
            if (currentEntry.getIncoming().size() == 0) {
                entry = (Node) currentEntry;
            }
        }
        traverseSequentialGraphEdges(entry, edgeList);
        return edgeList;
    }

    /**
     * Recursive method to collect the edges of a sequential SCG in the traversing order top to
     * bottom, then branch first. The method relies on the special structure of the sequential SCG:
     * there are no nested conditionals and only the then branches of a conditional have content.
     * Assumes that there are no empty then branches.
     * 
     * @param currentNode
     *            The sequential SCG entry node, else the currentNode
     * @param edgeList
     *            The list to add the edges in traversing order, empty in initial call
     */
    private void traverseSequentialGraphEdges(Node currentNode, LinkedList<ControlFlow> edgeList) {
        // There is only one Entry node in a sequential SCG, this is the start call
        if (currentNode instanceof Entry) {
            ControlFlow outgoingEdge = ((Entry) currentNode).getNext();
            edgeList.add(outgoingEdge);
            traverseSequentialGraphEdges(outgoingEdge.getTarget(), edgeList);
        } else {
            // There is only one Exit node in a sequential SCG, if we reach it, we are finished.
            if (currentNode instanceof Exit) {
                return;
            } else {
                if (currentNode instanceof Conditional) {
                    // We do then branch first order
                    ControlFlow thenEdge = ((Conditional) currentNode).getThen();
                    edgeList.add(thenEdge);
                    traverseSequentialGraphEdges(thenEdge.getTarget(), edgeList);
                } else {
                    if (currentNode instanceof Assignment) {
                        ControlFlow outgoingEdge = ((Assignment)currentNode).getNext();
                        edgeList.add(outgoingEdge);
                        // check whether this node ends a then branch, if so, add the else edge to the 
                        // list also
                        EList<Link> targetIncomingList = outgoingEdge.getTarget().getIncoming();
                        if (targetIncomingList.size() > 1) {
                            Iterator<Link> incomingEdgeIterator = targetIncomingList.iterator();
                            while (incomingEdgeIterator.hasNext()) {
                                Link currentLink = incomingEdgeIterator.next();
                                if (!(currentLink == outgoingEdge)) {
                                    edgeList.add((ControlFlow)currentLink);
                                }
                            }
                        }
                            traverseSequentialGraphEdges(outgoingEdge.getTarget(), edgeList);
                    }
                }
            }
        }
    }

    /**
     * Method inserts a single timing program point for interactive timing analysis in the edge
     * given as parameter controlFlow. This happens by inserting an Assignment with the TPP as text
     * expression as new target of the edge and connecting it by a new edge with the original target
     * of the edge.
     * 
     * @param controlFlow
     *            The edge, into which the TPP node is to be inserted.
     * @param tppNumber
     *            The number of the TPP to be created, for example the 2 in 'TPP(2);'
     * @param redirectedEdges
     *            The list of already redirectedEdges, into which the newly created edge has to be
     *            inserted to keep it from being redirected again
     * @return The Assignment wit the TPP
     */
    private Assignment insertSingleTPP(SCGraph scg, ControlFlow controlFlow, int tppNumber,
            ArrayList<Link> redirectedEdges) {
        // make target reachable via a new edge
        Node target = controlFlow.getTarget();
        ControlFlow newEdge = ScgFactory.eINSTANCE.createControlFlow();
        redirectedEdges.add(newEdge);
        newEdge.setTarget(target);
        // prepare assignment node with the tpp
        Assignment tpp = ScgFactory.eINSTANCE.createAssignment();
        TextExpression tppText = KExpressionsFactory.eINSTANCE.createTextExpression();
        tppText.setText("TPP(" + tppNumber + ")");
        tpp.setAssignment(tppText);
        // insert the new assignment node in the edge
        tpp.setNext(newEdge);
        controlFlow.setTarget(tpp);
        scg.getNodes().add(tpp);
        return tpp;
    }
}
