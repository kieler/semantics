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
package de.cau.cs.kieler.sccharts.klighd;

import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.progress.UIJob;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kitt.tracing.TracingManager;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;
import de.cau.cs.kieler.klighd.util.ModelingUtil;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.SCGraph;

/**
 * @author als
 *
 */
public class TimingAnalysis extends Job {

    public static final boolean DEBUG = true;

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

                    // TODO add correct label layout configuration (maybe move label creation into
                    // xtend file)

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
            // TODO error output
            return Status.CANCEL_STATUS;
        }

        SCGraph scg = (SCGraph) compilationResult.getEObject();

        if (!TracingManager.isTracingActivated(scg)) {
            // TODO error output
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
                                 * In this case the tracing associates multiple regions with the current node.
                                 * This case seems only appearing rarely.
                                 * Ignore case: the possible incorrect region results from a mapping to the superstate of the current region.
                                 * Because this often happens due to the mapping of exit nodes and can be ignored (hopefully)
                                 * Due to the arbitrary order of the 'targetElements' collection this case may happen in opposite order and result in an error.
                                 */
                                if(targetObj instanceof State && ((State)targetObj).getRegions().contains(region)) {
                                    break;
                                }
                                throw new Error("Tracing associates multiple inconsistent regions with a scg node");
                            }
                            region = (Region) targetElement;
                            break;
                        } else {
                            targetElement = targetElement.eContainer();
                        }
                    }
                    // break; //Only break when you are sure that all nodes are always mapped to one region
                }
                nodeRegionMapping.put((Node) oringinElement, region);
            }
        }

        // Step 3: Calculate timing blocks and add additional timing mark nodes into SCG

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        // Step 4: Compile SCG to C code

        if (monitor.isCanceled()) {
            // Stop as soon as possible when job canceled
            return Status.CANCEL_STATUS;
        }

        compilationResult = KielerCompiler.compile("SCG2S,S2C", scg, false, false);

        if (compilationResult.getString() == null
                || compilationResult.getPostponedErrors().size() > 0) {
            // TODO error output
            return Status.CANCEL_STATUS;
        }

        String code = compilationResult.getString();

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
            if(r == null) {
                if (timingResults.containsKey(r)) {
                    timingResults.put(r, timingResults.get(r) + " " + node.toString());
                } else {
                    timingResults.put(r, node.toString());
                }
            }else{
                //In this case the node is mapped to the root state and thus to no region
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

}
