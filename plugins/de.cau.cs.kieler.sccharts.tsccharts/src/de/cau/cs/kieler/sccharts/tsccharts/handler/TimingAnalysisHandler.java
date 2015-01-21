/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sccharts.tsccharts.handler;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.swt.program.Program;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.HorizontalAlignment;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.VerticalAlignment;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.klighd.KlighdTreeSelection;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension;
//import de.cau.cs.kieler.sccharts.text.sct.sct.impl.SCChartImpl;
import de.cau.cs.kieler.sccharts.tsccharts.TimingAnnotationProvider;
import de.cau.cs.kieler.sccharts.tsccharts.annotation.extensions.TSCChartsAnnotationExtension;
import de.cau.cs.kieler.scg.Assignment;
import de.cau.cs.kieler.scg.Conditional;
import de.cau.cs.kieler.scg.ControlFlow;
import de.cau.cs.kieler.scg.Depth;
import de.cau.cs.kieler.scg.Entry;
import de.cau.cs.kieler.scg.Exit;
import de.cau.cs.kieler.scg.Fork;
import de.cau.cs.kieler.scg.Join;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.SCGraph;
//import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreTransformation;
//import de.cau.cs.kieler.scg.c.SCG2C;

/**
 * This class handles the interactive timing analysis for modeling with SCCharts. It generates C
 * code that is annotated with timing tags, uses a WCET tool responding to this interface to
 * retrieve timing values and displays them to the modeler.
 * 
 * @author: ima, chsch
 * @kieler.design
 * @kieler.rating
 */
public class TimingAnalysisHandler extends AbstractHandler {

    public TimingAnalysisHandler() {
        Guice.createInjector().injectMembers(this);
    }

    public TSCChartsAnnotationExtension annotationExtension = new TSCChartsAnnotationExtension();
    public KRenderingExtensions renderingExtensions = new KRenderingExtensions();
    public KContainerRenderingExtensions containerRenderingExtensions =
            new KContainerRenderingExtensions();
    public SCChartsExtension scchartsExtension = new SCChartsExtension();

    @Inject
    private TimingAnnotationProvider annotationProvider;

    // private SCG2C scg2c = new SCG2C();

    // @Inject
    // private SCChartsCoreTransformation SCCtransformation;

    // @Inject
    // private SCGTransformation SCGtransformation;
    //
    // @Inject
    // private SCGToSTransformation Stransformation;
    // import de.cau.cs.kieler.scg.Entry;
    // private final TransformationTreeExtensions transformationTree = Guice.createInjector()
    // .getInstance(TransformationTreeExtensions.class);

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final ISelection s = HandlerUtil.getCurrentSelection(event);
        final KlighdTreeSelection kts;

        if (s instanceof KlighdTreeSelection) {
            kts = (KlighdTreeSelection) s;
        } else {
            return null;
        }

        // 20.01.2015 Check whether still needed
        // // final State state;
        // final Iterator<?> it = kts.sourceElementIterator();
        //
        // if (it.hasNext()) {
        // Object o = it.next();
        //
        // if (o instanceof State || o instanceof Region ) {
        // // state = (State) o;
        // } else {
        // return null;
        // }
        // } else {
        // return null;
        // }
        // End 20.01.2015

        Job job = new Job("TimingAnalysis") {

            @Override
            protected IStatus run(IProgressMonitor monitor) {
                IWorkbenchPart part = kts.getViewContext().getSourceWorkbenchPart();
                IXtextDocument document = null;

                if (part instanceof XtextEditor) {
                    document = ((XtextEditor) part).getDocument();
                } else {
                    return Status.CANCEL_STATUS;
                }

                final Maybe<State> maybe = new Maybe<>();
                document.readOnly(new IUnitOfWork.Void<XtextResource>() {
                    @Override
                    public void process(XtextResource resource) throws Exception {
                        EList<EObject> contents = resource.getContents();
                        if (resource.getContents().isEmpty()
                                || (!(resource.getContents().get(0) instanceof State))) {
                            return;
                        }

                        maybe.set((State) resource.getContents().get(0));

                    }
                });

                State scchart;
                State maybeGet = (State) maybe.get();
                if (scchartsExtension.isRootState(maybeGet)) {
                    scchart = maybeGet;
                } else
                    return Status.CANCEL_STATUS;

                // ///////////////Setting of timing domains in both SCChart and S code with the help
                // of the KTM tree.////
                // ///////////////Get thread tree on the
                // fly.//////////////////////////////////////////////////// CompilationResult
                // transformed2 = KielerCompiler.compile("ALL", result1, true, true);
                // //////

                HashMap<Integer, LinkedList<Integer>> threadTree =
                        new HashMap<Integer, LinkedList<Integer>>();

                Integer domainNumber =
                        annotationProvider.setTimingDomainsWithS(scchart, 0, threadTree, null);

                CompilationResult transformed =
                        KielerCompiler.compile("SCGRAPH", scchart, true, true);
                EObject transformedEObject = transformed.getEObject();
                SCGraph sequentialSCG = (SCGraph) transformedEObject;

                // HashMultimap<EObject, EObject> testMappingSCC2SCG= getTestMapping(1);
                EList<Node> nodeList = sequentialSCG.getNodes();
                Iterator<Node> nodeListIterator = nodeList.iterator();
                // collect all edges with their source nodes
                HashMap<ControlFlow, Node> edgesWithSource = new LinkedHashMap<ControlFlow, Node>();
                while (nodeListIterator.hasNext()) {
                    Node node = nodeListIterator.next();
                    if (node instanceof Conditional) {
                        Conditional conditional = (Conditional) node;
                        edgesWithSource.put(conditional.getElse(), node);
                        edgesWithSource.put(conditional.getThen(), node);
                    } else {
                        if (node instanceof Depth) {
                            Depth depth = (Depth) node;
                            edgesWithSource.put(depth.getNext(), node);
                        } else {
                            if (node instanceof Assignment) {
                                Assignment assignment = (Assignment) node;
                                edgesWithSource.put(assignment.getNext(), node);
                            } else {
                                if (node instanceof Join) {
                                    Join join = (Join) node;
                                    edgesWithSource.put(join.getNext(), node);
                                } else {
                                    if (node instanceof Fork) {
                                        Fork fork = (Fork) node;
                                        EList<ControlFlow> forkEdges = fork.getNext();
                                        Iterator<ControlFlow> forkEdgesIterator =
                                                forkEdges.iterator();
                                        while (forkEdgesIterator.hasNext()) {
                                            edgesWithSource.put(forkEdgesIterator.next(), node);
                                        }
                                    } else {
                                        if (node instanceof Entry) {
                                            Entry entry = (Entry) node;
                                            edgesWithSource.put(entry.getNext(), node);
                                        } else {
                                            if (node instanceof Exit) {
                                                Exit exit = (Exit) node;
                                                edgesWithSource.put(exit.getNext(), node);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Iterator<ControlFlow> edgeIterator = edgesWithSource.keySet().iterator();

                while (edgeIterator.hasNext()) {
                    ControlFlow edge = edgeIterator.next();
                    ControlFlow test = edge;
                    modifySequentialSCGWithHandMapping(edgeIterator, edgesWithSource, sequentialSCG);
                    // - check for each node, to which region it maps and insert a TTP node
                    // ('TTP(n);' into
                    // the edge, if it is a different region than the one before
                    // - store the domain Number of the Region together with the TTP number in a
                    // List, this
                    // is done to keep the relation of TTPs and Regions (as TTP numbers have to be
                    // unique
                    // in the new interface version). For each Region domain there should be a List
                    // of
                    // TTP numbers, which can be used to look the values up in a TimeValueTable
                }
                // Start 13.01.2015
                // CompilationResult codeGeneration =
                // KielerCompiler.compile("CodeGeneration", sequentialSCG, true, true);
                // End 13.01.2015

                State state = scchart;// rootRegionStates.get(0);
                IFile file = ResourceUtil.getFile(maybe.get().eResource());
                String uri = file.getLocationURI().toString();
                String taFile = uri.replace(".sct", ".ta.out");
                String taPath = taFile.replace("file:", "");
                annotationProvider.doTimingAnnotations(state, taPath);
                List<Region> childRegions = state.getRegions();
                Iterator<Region> childRegionsIterator = childRegions.iterator();
                while (childRegionsIterator.hasNext()) {
                    Region childRegion = childRegionsIterator.next();
                    showRegionTimingRecursive(childRegion, kts.getViewContext());
                }

                // old
                //
                // annotationProvider.setTimingDomainsSimple(rootRegion, 0);
                //
                // Region transformed = SCCtransformation.transformTriggerEffect(rootRegion);
                // transformed = SCCtransformation.transformSurfaceDepth((Region) transformed);
                //
                // // in the following only memory related issues
                //
                // IFile file = ResourceUtil.getFile(maybe.get().eResource());
                // String uri = file.getLocationURI().toString();
                //
                // Resource r = new ResourceSetImpl().
                // createResource(URI.createURI(uri.replace(".sct", "a.scc")));
                //
                // // boolean test = new File(r.getURI().toFileString()).delete();
                // // System.out.println(r.getURI());
                //
                // r.getContents().add(transformed);
                //
                // try {
                // r.save(Collections.emptyMap());
                // file.getProject().refreshLocal(IResource.DEPTH_INFINITE, new
                // NullProgressMonitor());
                //
                // } catch (Exception e) {
                // StatusManager.getManager().handle(new Status(IStatus.WARNING, "",
                // "Saving or refresh"
                // + "failed.", e));
                // }
                // old
                return Status.OK_STATUS;
            }

            /* Caution: This is only a test method that involves a hard coded mapping for only one model:
             * robot.sct, the lead example for ITA. This method will be used only for test reasons as 
             * long as the automatic mapping is not fully implemented and integrated.
             * @
             */
            private void modifySequentialSCGWithHandMapping(Iterator<ControlFlow> edgeIterator,
                    HashMap<ControlFlow, Node> edgesWithSource, SCGraph sequentialSCG) {
                // TODO Auto-generated method stub
                
            }
        };

        job.schedule();

        return null;
    }

    /* Displays flat and hierarchical timing values for all regions */
    private void showRegionTimingRecursive(Region region, ViewContext viewContext) {
        Integer hierarchicalWCET = annotationExtension.getTimeHierarchical(region);
        String hWCETString = hierarchicalWCET.toString();
        Integer flatWCET = annotationExtension.getTimeFlat(region);
        String fWCETString = flatWCET.toString();
        // Integer timeDomain = annotationExtension.getTimeDomain(region);
        // String domain = timeDomain.toString();
        String timeString = fWCETString + "/" + hWCETString;
        EObject viewModelElement = viewContext.getTargetElement(region, null);

        if (viewModelElement instanceof KNode) {
            KContainerRendering rect =
                    ((KNode) viewModelElement).getData(KContainerRendering.class);

            if (rect != null) {
                KText text = KRenderingFactory.eINSTANCE.createKText();
                text.setText(timeString);
                renderingExtensions.setFontSize(text, 12);
                renderingExtensions.setForegroundColor(text, 255, 0, 0);
                renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
                        renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
                        VerticalAlignment.TOP, 5, 5, 0, 0);

                rect.getChildren().add(text);
            }

        }
        EList<State> states = region.getStates();
        Iterator<State> statesIterator = states.iterator();
        while (statesIterator.hasNext()) {
            State childState = statesIterator.next();
            EList<Region> childRegions = childState.getRegions();
            Iterator<Region> childRegionsIterator = childRegions.iterator();
            while (childRegionsIterator.hasNext()) {
                Region childRegion = childRegionsIterator.next();
                showRegionTimingRecursive(childRegion, viewContext);
            }
        }
    }
}
