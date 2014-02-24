package de.cau.cs.kieler.sccharts.tsccharts.action;
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

import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.util.ResourceUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.HorizontalAlignment;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.VerticalAlignment;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.tsccharts.TimingAnnotationProvider;
import de.cau.cs.kieler.sccharts.tsccharts.annotation.extensions.TSCChartsAnnotationExtension;

public class TimingAction implements IAction {

    public KRenderingExtensions renderingExtensions = new KRenderingExtensions();
    public KContainerRenderingExtensions containerRenderingExtensions =
            new KContainerRenderingExtensions();
    public TSCChartsAnnotationExtension annotationExtension = new TSCChartsAnnotationExtension();

    @Inject
    public TimingAnnotationProvider annotationProvider;

    public TimingAction() {
        Guice.createInjector().injectMembers(this);
    }
    
    private IUnitOfWork<?, XtextResource> annotateRegions() {
        return new IUnitOfWork.Void<XtextResource>() {

            @Override
            public void process(XtextResource resource) throws Exception {
                if (resource.getContents().isEmpty()
                        || (!(resource.getContents().get(0) instanceof Region))) {
                    return;
                }
                
                IFile file = ResourceUtil.getFile(resource);
                String uri = file.getLocationURI().toString();
                
                
                Resource r = //resource.getResourceSet().
                        new ResourceSetImpl().
                   createResource(URI.createURI(/* "file:/home/ima/runtime-SemanticsM/test/robot.scc")); */ uri.replace(".sct", "a.scc")));
                
                // boolean test = new File(r.getURI().toFileString()).delete();
                // System.out.println(r.getURI());
                
                Region rootRegion = (Region) EcoreUtil.copy(resource.getContents().get(0));
                
                annotationProvider.setTimingDomainsSimple(rootRegion, 0);
                
                r.getContents().add(rootRegion);
                
                r.save(Collections.emptyMap());
                
                file.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
            }
        
        };
    }

    @Override
    public ActionResult execute(final ActionContext context) {
        
        Job job = new Job("TiminAnalysis") {
            
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                ViewContext viewContext = context.getViewContext();
                IWorkbenchPart part = context.getViewContext().getSourceWorkbenchPart();
                IXtextDocument document = null;
                
                if (part instanceof XtextEditor) {
                    document = ((XtextEditor) part).getDocument();
                } else {
                    return Status.CANCEL_STATUS;
                }
                
                document.readOnly(annotateRegions());

                return Status.OK_STATUS;
            }
        };
        
        job.schedule();
        
        // in deinem Falle eine Region/State
        Object semanticElement =
                context.getViewContext().getSourceElement(context.getKGraphElement());
        // Region region = null;
        State state = null;
        // if (semanticElement instanceof Region) {
        // region = (Region) semanticElement;
        // //annotationExtension.setTimeHierarchical(region, 12345);
        // }
        if (semanticElement instanceof State) {
            state = (State) semanticElement;
            annotationProvider.doTimingAnnotations(state, "robot");
            List<Region> childRegions = state.getRegions();
            Iterator<Region> childRegionsIterator = childRegions.iterator();
            while (childRegionsIterator.hasNext()) {
                Region childRegion = childRegionsIterator.next();
                showRegionTimingRecursive(childRegion, context);
                // Integer hierarchicalWCET = annotationExtension.getTimeHierarchical(childRegion);
                // String hWCETString = hierarchicalWCET.toString();
                // EObject viewModelElement =
                // context.getViewContext().getTargetElement(childRegion, null);
                //
                // if (viewModelElement instanceof KNode) {
                // KContainerRendering rect =
                // ((KNode) viewModelElement).getData(KContainerRendering.class);
                //
                //
                // if (rect != null) {
                // KText text = containerRenderingExtensions.addText(rect, hWCETString);
                // renderingExtensions.setFontSize(text, 12);
                // renderingExtensions.setForegroundColor(text, 255, 0, 0);
                // renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
                // renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
                // VerticalAlignment.TOP, 5, 5, 0, 0);
                //
                // rect.getChildren().add(text);
            }
        }

        // Integer highestNumber = annotationProvider.setTimingDomainsSimple(region, 0);

        // EObject viewModelElement =
        // context.getViewContext().getTargetElement(
        // /* eure states & regions */semanticElement, null);
        //
        // if (viewModelElement instanceof KNode) {
        // KContainerRendering rect =
        // ((KNode) viewModelElement).getData(KContainerRendering.class);
        //
        //
        // if (rect != null) {
        // // Integer hierarchicalWCET = annotationExtension.getTimeHierarchical(region);
        // // String hWCETString = hierarchicalWCET.toString();
        // // Integer domainNumber = annotationExtension.getTimeDomain(region);
        // // String domainNumberString = domainNumber.toString();
        //
        // KText text = containerRenderingExtensions.addText(rect, WCETString);
        // renderingExtensions.setFontSize(text, 12);
        // renderingExtensions.setForegroundColor(text, 255, 0, 0);
        // renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
        // renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
        // VerticalAlignment.TOP, 5, 5, 0, 0);
        //
        // rect.getChildren().add(text);
        // }
        // }
        //
        // if (viewModelElement instanceof KNode) {
        // KContainerRendering rect = ((KNode) viewModelElement).getData(KContainerRendering.class);
        //
        // if (rect != null) {
        //
        // KText text = containerRenderingExtensions.addText(rect, "HUGO");
        // renderingExtensions.setFontSize(text, 13);
        // renderingExtensions.setForegroundColor(text, 255, 0, 0);
        // renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
        // renderingExtensions.TOP, 5, 0, HorizontalAlignment.RIGHT,
        // VerticalAlignment.TOP, 5, 5, 0, 0);
        //
        // rect.getChildren().add(text);
        // }
        // }

        return ActionResult.createResult(false);
    }

    /* Displays flat and hierarchical timing values for all regions */
    private void showRegionTimingRecursive(Region region, ActionContext context) {
        Integer hierarchicalWCET = annotationExtension.getTimeHierarchical(region);
        String hWCETString = hierarchicalWCET.toString();
        Integer flatWCET = annotationExtension.getTimeFlat(region);
        String fWCETString = flatWCET.toString();
//        Integer timeDomain = annotationExtension.getTimeDomain(region);
//        String domain = timeDomain.toString();
        String timeString = fWCETString + "/" + hWCETString;
        EObject viewModelElement = context.getViewContext().getTargetElement(region, null);

        if (viewModelElement instanceof KNode) {
            KContainerRendering rect =
                    ((KNode) viewModelElement).getData(KContainerRendering.class);

            if (rect != null) {
                KText text = containerRenderingExtensions.addText(rect, timeString);
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
                showRegionTimingRecursive(childRegion, context);
            }
        }
    }
}
