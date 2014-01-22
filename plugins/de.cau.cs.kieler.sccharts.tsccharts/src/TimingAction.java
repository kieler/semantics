import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Guice;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.HorizontalAlignment;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.VerticalAlignment;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.IAction;
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

    @Override
    public ActionResult execute(ActionContext context) {
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
