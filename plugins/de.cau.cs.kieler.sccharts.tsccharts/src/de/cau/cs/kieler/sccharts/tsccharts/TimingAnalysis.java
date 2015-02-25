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

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.progress.UIJob;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimap;

import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.HorizontalAlignment;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.VerticalAlignment;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerException;
import de.cau.cs.kieler.kitt.tracing.TracingManager;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;
import de.cau.cs.kieler.klighd.util.ModelingUtil;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.scg.Assignment;
import de.cau.cs.kieler.scg.ControlFlow;
import de.cau.cs.kieler.scg.Link;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.ScgFactory;

/**
 * @author als, ima
 *
 */
public class TimingAnalysis extends Job {

    public static final boolean DEBUG = true;

    // no side effects on runtime, so static OK here
    public static KRenderingExtensions renderingExtensions = new KRenderingExtensions();

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
                    renderingExtensions.setFontSize(text, 12);
                    renderingExtensions.setForegroundColor(text, 255, 0, 0);
                    renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5,
                            0, renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
                            VerticalAlignment.TOP, 5, 5, 0, 0);
                    rect.getChildren().add(text);
                    timingLabels.put((Region) sourceElem, new WeakReference<KText>(text));
                }
            }
        }
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
        // Step 1: Compile SCChart to sequentialized SCG

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        TracingManager.activateTracing(scchart);
        CompilationResult compilationResult =
                KielerCompiler.compile("SCGSEQUENTIALIZE", scchart, true, false);

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
            return Status.CANCEL_STATUS;
        }

        SCGraph scg = (SCGraph) compilationResult.getEObject();

        if (!TracingManager.isTracingActivated(scg)) {
            System.out.println("Tracing is not activated for the given model.\n");
            return Status.CANCEL_STATUS;
        }

        // Step 2: Analyse tracing relation into a node to region mapping

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        Multimap<Object, Object> tracing = TracingManager.getMapping(scg, scchart);
        HashMap<Node, Region> nodeRegionMapping =
                new HashMap<Node, Region>(tracing.keySet().size());
        for (Object oringinElement : tracing.keySet()) {
            if (oringinElement instanceof Node) {
                Collection<Object> targetElements = tracing.get(oringinElement);
                Region region = null;
                for (Object targetObj : targetElements) {
                    EObject targetElement = (EObject) targetObj;
                    while (targetElement != null) {
                        if (targetElement instanceof Region) {
                            if (region != null && region != targetElement) {
                                /*
                                 * In this case the tracing associates multiple regions with the
                                 * current node. If one of the regions is directly contained (depth
                                 * 1) in the other take the inner one
                                 */
                                if (region.getStates().contains(targetElement.eContainer())) {
                                    // new one is inner region
                                    region = (Region) targetElement;
                                    break;
                                } else if (((Region) targetElement).getStates().contains(
                                        region.eContainer())) {
                                    // old one is inner region so keep it
                                    break;
                                } else {
                                    // encapsulation depth higher than 1 or no encapsulation
                                    throw new Error(
                                            "Tracing associates multiple inconsistent regions "
                                                    + "with a scg node");
                                }
                            }
                            region = (Region) targetElement;
                            break;
                        } else {
                            targetElement = targetElement.eContainer();
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
        HashMap<Integer, Region> ttpRegionMap = new HashMap<Integer, Region>();
        
        // Debugging, may be removed
        EList<Node> debugNodeList = scg.getNodes();
        Iterator<Node> debugNodeListIterator = debugNodeList.iterator();
        while(debugNodeListIterator.hasNext()){
           if (nodeRegionMapping.get(debugNodeListIterator.next()) == null) {
               System.out.println("Node has no tracing map information.");
           }
        }
        // End Debugging
        
        int highestInsertedTTPNumber = insertTTP(scg, nodeRegionMapping, ttpRegionMap);

        // Step 4: Compile SCG to C code

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        compilationResult = KielerCompiler.compile("SCG2S,S2C", scg, false, false);

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
            return Status.CANCEL_STATUS;
        }

        String code = compilationResult.getString();
        System.out.print(code);

        // Step 5: Send C code to timing analyzer

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        // TODO ima

        // Step 6: Retrieve timing data and associate with regions

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        // TODO remove this test code

        for (Node node : nodeRegionMapping.keySet()) {
            Region r = nodeRegionMapping.get(node);
            if (r != null) {
                if (timingResults.containsKey(r)) {
                    timingResults.put(r, timingResults.get(r) + " " + node.toString());
                } else {
                    timingResults.put(r, node.toString());
                }
            } else {
                // In this case the node is mapped to the root state and thus to no region
            }
        }

        // TODO ima

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

        return Status.OK_STATUS;
    }

    /**
     * The method checks all edges of the SCG and finds edges, where source and target node are
     * associated with different regions from the original SCChart, of which the SCG is a
     * compilation result. This means, the method determines, at which edges of the SCG a context
     * switch between threads happens (which is determined with the help of a map provided by
     * tracing). Into those edges, it inserts Assignment nodes with a Timing Program Point (TTP) for
     * the interface of Interactive Timing Analysis.
     * 
     * @param scg
     *            A sequential SCG, into which timing program points are to be inserted.
     * @param nodeRegionMapping
     *            A map determined by tracing, which relates the nodes of a sequential SCG with
     *            regions of the corresponding SCChart.
     * @param ttpRegionMap
     *            A map, into which the method stores the related region for each TTP (which will be
     *            the one corresponding to the thread, to which the context is switched a the
     *            location where the TTP is inserted.
     * @param debugNodeList 
     * @return returns -1, if the TTP-insertion ran into a problem else the highest inserted TTP
     *         number
     */
    private int insertTTP(SCGraph scg, HashMap<Node, Region> nodeRegionMapping,
            HashMap<Integer, Region> ttpRegionMap) {
        // Get all edges of the sequential scg
        Iterator<ControlFlow> edgeIter =
                Iterators.filter(
                        ModelingUtil.eAllContentsOfType2(scg, Node.class, ControlFlow.class),
                        ControlFlow.class);
        ArrayList<Link> visitedEdges = new ArrayList<Link>();
        // insertion starts with TTP(1);
        int ttpCounter = 1;
        while (edgeIter.hasNext()) {
            if (ttpCounter == 13) {
                // avoid a TTP with the number 13, as this one has a special meaning for the timing
                // analysis tool prototype
                ttpCounter = 1 + ttpCounter;
            }
            ControlFlow currentEdge = edgeIter.next();
            // get the region the target node of the edge stems from
            Region targetRegion = nodeRegionMapping.get(currentEdge.getTarget());
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
            // check if the mapping has yielded a complete answer
            if ((targetRegion != null) && (sourceRegion != null)) {
                // check for a context switch, in any other case nothing will be done
                if (!(sourceRegion.equals(targetRegion))) {
                    // also, if this edge has been visited before, there is nothing to do (important
                    // for edges that have the same target node as other edges)
                    if (!(visitedEdges.contains(currentEdge))) {
                        // now this edge is processed, record that
                        visitedEdges.add(currentEdge);
                        // insert ttp node, keep it for the redirection of other edges
                        Assignment ttp = insertTTP(scg, currentEdge, ttpCounter);
                        // Save which Region starts at this TTP value
                        ttpRegionMap.put(ttpCounter, targetRegion);
                        ttpCounter = ttpCounter + 1;
                        // make sure that all edges that also point to the same target node as the
                        // current edge redirected to the TPP as well
                        EList<Link> targetIncomingEdges = currentEdge.getTarget().getIncoming();
                        if (targetIncomingEdges.size() > 1) {
                            Iterator<Link> targetIncomingIterator = targetIncomingEdges.iterator();
                            while (targetIncomingIterator.hasNext()) {
                                Link redirectionLink = targetIncomingIterator.next();
                                if ((!(currentEdge.equals(redirectionLink)))
                                        && (!(visitedEdges.contains(redirectionLink)))) {
                                    redirectionLink.setTarget(ttp);
                                    visitedEdges.add(redirectionLink);
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
        return ttpCounter - 1;
    }

    /**
     * @param currentEdge
     * @param ttpCounter
     * @return
     */
    private Assignment insertTTP(SCGraph scg, ControlFlow currentEdge, int ttpCounter) {
        // make target reachable via a new edge
        Node target = currentEdge.getTarget();
        ControlFlow newEdge = ScgFactory.eINSTANCE.createControlFlow();
        newEdge.setTarget(target);
        // prepare assignment node with the ttp
        Assignment ttp = ScgFactory.eINSTANCE.createAssignment();
        TextExpression ttpText = KExpressionsFactory.eINSTANCE.createTextExpression();
        ttpText.setText("TTP(" + ttpCounter + ")");
        ttp.setAssignment(ttpText);
        // insert the new assignment node in the edge
        ttp.setNext(newEdge);
        currentEdge.setTarget(ttp);
        scg.getNodes().add(ttp);
        return ttp;
    }
}
