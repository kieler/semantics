/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.tsccharts.transformation

import com.google.common.collect.Iterators
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.TextExpression
import de.cau.cs.kieler.kico.CompilationResult
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.KielerCompilerException
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Tracing
import de.cau.cs.kieler.klighd.util.ModelingUtil
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.tsccharts.TimingAnalysis
import de.cau.cs.kieler.sccharts.tsccharts.TimingUtil
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Link
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.features.SCGFeatures
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.Iterator
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource;
import de.cau.cs.kieler.kico.KiCoProperties

/**
 * Transform a sequentialized SCG to a sequentialized SCG with timing program points.
 * Create a basic .ta file for interactive timing analysis also.
 * 
 * @author ima, als
 * @kieler.design 2016-01-20 proposed 
 * @kieler.rating 2016-01-20 proposed yellow
 * 
 */
class TPPTransformation extends AbstractProductionTransformation
{

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId()
    {
        return TimingAnalysisTransformations::TPP_ID
    }

    override getName()
    {
        return TimingAnalysisTransformations::TPP_ID
    }

    override getProducedFeatureId()
    {
        return TimingAnalysisTransformations::TPP_FEATURE_ID
    }

    override getRequiredFeatureIds()
    {
        return newHashSet(SCGFeatures::SEQUENTIALIZE_ID)
    }

    // -------------------------------------------------------------------------   
    @Inject
    extension AnnotationsExtensions

    @Inject
    extension SCChartsExtension

    /**
     * Transform add TPPs to the sequentialized SCG.
     * 
     * @param scg the SCG
     * @return the SCG with TPP
     */
    def public Object transform(SCGraph scg, KielerCompilerContext context)
    {
        var TPPInformation tppInformation = null
        var Collection<Object> targetElements = null
        var HashMap<Region, Integer> regionDepth = null
        var HashMap<Node, Region> nodeRegionMapping = null
        var mappingSize = 0 as int
        var Multimap<Object, Object> mapping = null
        var Tracing tracing = null
        var List<Tracing> tracings = null
        var CompilationResult compilationResult = null

        // get mapping
        compilationResult = context.compilationResult
        tracings = compilationResult.getAuxiliaryData(Tracing)
        if (!tracings.isEmpty())
        {
            tracing = tracings.get(0)
        }
        if (tracing == null)
        {
            throw new KielerCompilerException(TimingAnalysisTransformations::TPP_ID,
                TimingAnalysisTransformations::TPP_ID,
                "TPP Transformation was not successful. No tracing information could be found.")
            }

            // Analyse tracing relation into a node to region mapping
            val input = context.getProperty(KiCoProperties.RAW_INPUT_MODEL)
            if (!(input instanceof State))
            {
                throw new KielerCompilerException(TimingAnalysisTransformations::TPP_ID,
                    TimingAnalysisTransformations::TPP_ID, "TPP Transformation was not successful./n" +
                        "The original SCChart was not determined.")
            }
            val scchart = input as State
                    mapping = tracing.getMapping(scg, scchart);
                    mappingSize = mapping.keySet().size();
                    nodeRegionMapping = new HashMap<Node, Region>(mappingSize);
                    regionDepth = TimingUtil.createRegionDepthMap(scchart);
                    for (Object originElement : mapping.keySet())
                    {
                        if (originElement instanceof Node)
                        {
                            targetElements = mapping.get(originElement);
                            var Region region = null;
                            var int depth = -1;
                            for (Object targetObj : targetElements)
                            {
                                var EObject targetElement = targetObj as EObject;
                                if (!(targetElement instanceof State &&
                                    ((targetElement as State).hasInnerStatesOrControlflowRegions)) ||
                                        targetElements.size() == 1)
                                    {
                                        var regionFound = false
                                        while (targetElement != null && !regionFound)
                                        {
                                            if (targetElement instanceof Region)
                                            {
                                                var Region newRegionCandidate = targetElement as Region;
                                                var int candidateDepth = regionDepth.get(
                                                    newRegionCandidate);
                                                /*
                                                 * If new region candidate has a strictly greater depth than the
                                                 * current region the new candidate becomes the region this node is
                                                 * associated with. Otherwise the region is contained in the new
                                                 * candidate and is ignored. Assumption: No node is mapped to
                                                 * elements in parallel Regions
                                                 */
                                                if (candidateDepth > depth)
                                                {
                                                    region = newRegionCandidate;
                                                    depth = candidateDepth;
                                                }
                                                regionFound = true;
                                            }
                                            else
                                            {
                                                targetElement = targetElement.eContainer();
                                            }
                                        }
                                    }
                                }
                                nodeRegionMapping.put(originElement as Node, region);
                            }
                        }

                        var HashMap<String, Region> tppRegionMap = new HashMap<String, Region>();
                        val Region scchartDummyRegion = SCChartsFactory.eINSTANCE.createRegion();
                        scchartDummyRegion.setId("SCChartDummyRegion");

                        // insert timing program points
                        val int highestInsertedTPPNumber = insertTPP(scg, nodeRegionMapping,
                            tppRegionMap, scchartDummyRegion);

                        // save the highest inserted TPP number and the TPP Region Mapping in auxiliary    
                        tppInformation = new TPPInformation(highestInsertedTPPNumber, tppRegionMap);
                        compilationResult.addAuxiliaryData(tppInformation);

                        // Mark scg with feature
                        scg.createStringAnnotation(TimingAnalysisTransformations::TPP_FEATURE_ID, "")
                        return scg
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
                    def private int insertTPP(SCGraph scg, HashMap<Node, Region> nodeRegionMapping,
                        HashMap<String, Region> tppRegionMap, Region scchartDummyRegion)
                    {
                        // Get all edges of the sequential scg
                        // get the SCG nodes in fixed traversing order (top to bottom, then branch first)
                        var LinkedList<ControlFlow> edgeList = getEdgesInFixedTraversingOrder(scg);
                        val Iterator<ControlFlow> edgeListIterator = edgeList.iterator();
                        val ArrayList<Link> redirectedEdges = new ArrayList<Link>();
                        // insertion starts with TPP(1);
                        var Integer tppCounter = 1;
                        // Preprocessing step: Assign the first Region to the entry TPP
                        val ControlFlow firstEdge = edgeList.getFirst();
                        val Region firstSourceRegion = getSourceRegion(firstEdge, nodeRegionMapping,
                            scchartDummyRegion);
                        tppRegionMap.put("entry", firstSourceRegion);
                        while (edgeListIterator.hasNext())
                        {
                            if (tppCounter == 13)
                            {
                                // avoid a TPP with the number 13, as this one has a special meaning for the timing
                                // analysis tool prototype
                                tppCounter = 1 + tppCounter;
                            }
                            val ControlFlow currentEdge = edgeListIterator.next();
                            val Node edgeTarget = currentEdge.getTarget();
                            // get the region the target node of the edge stems from
                            var Region targetRegion = nodeRegionMapping.get(edgeTarget);
                            if (targetRegion == null)
                            {
                                // It is normal that nodes of the SCG get mapped to null, if they are considered to
                                // belong to the scchart but not to one of its regions, for the timing analysis,
                                // they are attributed to a dummy region representing all parts of the scchart that
                                // does not belong to a region (thus enabling us to keep track of the timing for
                                // those
                                // parts
                                targetRegion = scchartDummyRegion;
                            }
                            val Region sourceRegion = getSourceRegion(currentEdge, nodeRegionMapping,
                                scchartDummyRegion);
                            // check if the mapping has yielded a complete answer
                            if ((targetRegion != null) && (sourceRegion != null))
                            {
                                // check for a context switch, in any other case nothing will be done
                                if (!(sourceRegion.equals(targetRegion)))
                                {
                                    // also, if this edge has been visited before, there is nothing to do (important
                                    // for edges that have the same target node as other edges)
                                    if (!(redirectedEdges.contains(currentEdge)))
                                    {
                                        // now this edge is processed, record that
                                        redirectedEdges.add(currentEdge);
                                        // insert tpp node, keep it for the redirection of other edges
                                        val Assignment tpp = insertSingleTPP(scg, currentEdge,
                                            tppCounter, redirectedEdges);
                                        // Save which Region starts at this TPP value
                                        tppRegionMap.put((tppCounter).toString(), targetRegion);
                                        tppCounter = tppCounter + 1;
                                        // make sure that all edges that also point to the same target node as the
                                        // current edge did before redirection are redirected to the TPP as well
                                        val EList<Link> targetIncomingEdges = edgeTarget.getIncoming();
                                        if (targetIncomingEdges.size() > 1)
                                        {
                                            val Iterator<Link> targetIncomingIterator = targetIncomingEdges.
                                                iterator();
                                            while (targetIncomingIterator.hasNext())
                                            {
                                                val Link redirectionLink = targetIncomingIterator.next();
                                                if ((!(currentEdge.equals(redirectionLink))) &&
                                                    (!(redirectedEdges.contains(redirectionLink))))
                                                {
                                                    redirectionLink.setTarget(tpp);
                                                    redirectedEdges.add(redirectionLink);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                // a mapping for at least one of the nodes could not be determined
                                System.out.println(
                                    "A mapping for at least one node of an edge cannot be found.");
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
                    def private LinkedList<ControlFlow> getEdgesInFixedTraversingOrder(SCGraph scg)
                    {
                        val LinkedList<ControlFlow> edgeList = new LinkedList<ControlFlow>();
                        // Find start entry node
                        val Iterator<Entry> entryIter = Iterators.filter(
                            ModelingUtil.eAllContentsOfType2(scg, Node), Entry);
                        var Node entry = null;
                        while (entryIter.hasNext())
                        {
                            var Entry currentEntry = entryIter.next();
                            if (currentEntry.getIncoming().size() == 0)
                            {
                                entry = currentEntry as Node;
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
                    def private void traverseSequentialGraphEdges(Node currentNode,
                        LinkedList<ControlFlow> edgeList)
                    {
                        // There is only one Entry node in a sequential SCG, this is the start call
                        if (currentNode instanceof Entry)
                        {
                            var ControlFlow outgoingEdge = (currentNode as Entry).getNext();
                            edgeList.add(outgoingEdge);
                            traverseSequentialGraphEdges(outgoingEdge.getTarget(), edgeList);
                        }
                        else
                        {
                            // There is only one Exit node in a sequential SCG, if we reach it, we are finished.
                            if (currentNode instanceof Exit)
                            {
                                return;
                            }
                            else
                            {
                                if (currentNode instanceof Conditional)
                                {
                                    // We do then branch first order
                                    val ControlFlow thenEdge = (currentNode as Conditional).getThen();
                                    edgeList.add(thenEdge);
                                    traverseSequentialGraphEdges(thenEdge.getTarget(), edgeList);
                                }
                                else
                                {
                                    if (currentNode instanceof Assignment)
                                    {
                                        val ControlFlow outgoingEdge = (currentNode as Assignment).
                                            getNext();
                                        edgeList.add(outgoingEdge);
                                        // check whether this node ends a then branch, if so, add the else edge to
                                        // the
                                        // list also
                                        val EList<Link> targetIncomingList = outgoingEdge.getTarget().
                                            getIncoming();
                                        if (targetIncomingList.size() > 1)
                                        {
                                            val Iterator<Link> incomingEdgeIterator = targetIncomingList.
                                                iterator();
                                            while (incomingEdgeIterator.hasNext())
                                            {
                                                var Link currentLink = incomingEdgeIterator.next();
                                                if (!(currentLink == outgoingEdge))
                                                {
                                                    edgeList.add(currentLink as ControlFlow);
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
                     * This method retrieves the region the source node of the controlFlow edge given as a parameter
                     * is attributed to.
                     * 
                     * @param nodeRegionMapping
                     *            The given mapping of nodes to regions
                     * @param scchartDummyRegion
                     *            The dummy region representing the SCChart itself (for not all elements can
                     *            attributed to regions of the SCChart and are then attributed to the SCChart, resp.
                     *            its dummy region)
                     * @param controlFlow
                     *            The edge for which the start node region ist to be determined
                     * @return Returns the Region the source node of the controlFlow edge belongs to. Returns null,
                     *         if the edge container is no Node.
                     */
                    def private Region getSourceRegion(ControlFlow controlFlow,
                        HashMap<Node, Region> nodeRegionMapping, Region scchartDummyRegion)
                    {
                        // get the region the source node of the edge stems from
                        val EObject edgeEContainer = controlFlow.eContainer();
                        var Node sourceNode = null;
                        if (edgeEContainer instanceof Node)
                        {
                            sourceNode = (edgeEContainer as Node);
                        }
                        else
                        {
                            // source node of edge could not be determined
                            return null;
                        }
                        var Region sourceRegion = nodeRegionMapping.get(sourceNode);
                        if (sourceRegion == null)
                        {
                            // Nodes that do not belong to a region are attributed to the scchart dummy region
                            sourceRegion = scchartDummyRegion;
                        }
                        return sourceRegion;
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
                    def private Assignment insertSingleTPP(SCGraph scg, ControlFlow controlFlow,
                        int tppNumber, ArrayList<Link> redirectedEdges)
                    {
                        // make target reachable via a new edge
                        val Node target = controlFlow.getTarget();
                        val ControlFlow newEdge = ScgFactory.eINSTANCE.createControlFlow();
                        redirectedEdges.add(newEdge);
                        newEdge.setTarget(target);
                        // prepare assignment node with the tpp
                        val Assignment tpp = ScgFactory.eINSTANCE.createAssignment();
                        val TextExpression tppText = KExpressionsFactory.eINSTANCE.
                            createTextExpression();
                        tppText.setText("TPP(" + tppNumber + ")");
                        tpp.setAssignment(tppText);
                        // insert the new assignment node in the edge
                        tpp.setNext(newEdge);
                        controlFlow.setTarget(tpp);
                        scg.getNodes().add(tpp);
                        return tpp;
                    }

                }
