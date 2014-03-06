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

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;
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
import de.cau.cs.kieler.klighd.KlighdTreeSelection;
import de.cau.cs.kieler.klighd.IAction.ActionContext;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreTransformation;
import de.cau.cs.kieler.sccharts.tsccharts.TimingAnnotationProvider;
import de.cau.cs.kieler.sccharts.tsccharts.annotation.extensions.TSCChartsAnnotationExtension;


/**
 * This class handles the interactive timing analysis for modeling with SCCharts. It generates C code 
 * that is annotated with timing tags, uses a WCET tool responding to this interface to retrieve timing 
 * values and displays them to the modeler.
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
    
    @Inject
    private TimingAnnotationProvider annotationProvider;
    
    
    @Inject
    private SCChartsCoreTransformation transformation;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final ISelection s = HandlerUtil.getCurrentSelection(event);
        final KlighdTreeSelection kts;
        
        if (s instanceof KlighdTreeSelection) {
            kts = (KlighdTreeSelection) s;
        } else {
            return null;
        }
        
//        final State state;
        final Iterator<?> it = kts.sourceElementIterator();
        
        if (it.hasNext()) {
            Object o = it.next();
           
            if (o instanceof State || o instanceof Region) {
//                state = (State) o;
            } else {
                return null;
            }
        } else {
            return null;
        }
       
        
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
                                      
                final Maybe<Region> maybe = new Maybe<>();
                
                document.readOnly(new IUnitOfWork.Void<XtextResource>() {

                    @Override
                    public void process(XtextResource resource) throws Exception {
                        if (resource.getContents().isEmpty()
                                || (!(resource.getContents().get(0) instanceof Region))) {
                            return;
                        }
                        
                        maybe.set((Region) resource.getContents().get(0));
                        
                    }
                });
                
                Region rootRegion = (Region) /*EcoreUtil.copy(*/maybe.get();
                
                //annotationProvider.setTimingDomainsSimple(rootRegion, 0);
                
                
                EList<State> rootRegionStates = rootRegion.getStates();
                
//                PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
//                    
//                    @Override
//                    public void run() {
//                        // TODO Auto-generated method stub
//                        
//                    }
//                });
                
                State state = rootRegionStates.get(0);
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
                     
//                
//                
//                annotationProvider.setTimingDomainsSimple(rootRegion, 0);
//                
//                Region transformed = transformation.transformTriggerEffect(rootRegion);
//                transformed = transformation.transformSurfaceDepth((Region) transformed);
//                
//                // in the following only memory related issues
//                
//                IFile file = ResourceUtil.getFile(maybe.get().eResource());
//                String uri = file.getLocationURI().toString();
//
//                Resource r = new ResourceSetImpl().
//                   createResource(URI.createURI(uri.replace(".sct", "a.scc")));
//                
//                // boolean test = new File(r.getURI().toFileString()).delete();
//                // System.out.println(r.getURI());
//                
//                r.getContents().add(transformed);
//                
//                try {
//                    r.save(Collections.emptyMap());
//                    file.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
//                    
//                } catch (Exception e) {
//                    StatusManager.getManager().handle(new Status(IStatus.WARNING, "", "Saving or refresh"
//                            + "failed.", e));
//                }
//                
               return Status.OK_STATUS;
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
//        Integer timeDomain = annotationExtension.getTimeDomain(region);
//        String domain = timeDomain.toString();
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
        while(statesIterator.hasNext()){
            State childState = statesIterator.next();
            EList<Region> childRegions = childState.getRegions();
            Iterator<Region> childRegionsIterator = childRegions.iterator();
            while(childRegionsIterator.hasNext()){
                Region childRegion = childRegionsIterator.next();
                showRegionTimingRecursive(childRegion, viewContext);
            }
        }
    }
}
