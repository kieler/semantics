import org.eclipse.emf.ecore.EObject;

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
import de.cau.cs.kieler.sccharts.tsccharts.annotation.extensions.TSCChartsAnnotationExtension;


public class TimingAction implements IAction {
    
    public KRenderingExtensions renderingExtensions = new KRenderingExtensions();
    public KContainerRenderingExtensions containerRenderingExtensions = new KContainerRenderingExtensions();
    public TSCChartsAnnotationExtension annotationExtension = new TSCChartsAnnotationExtension();

    @Override
    public ActionResult execute(ActionContext context) {
        // in deinem Falle eine Region/State
        Object semanticElement =
                context.getViewContext().getSourceElement(context.getKGraphElement());
        Region region = null;
        if (semanticElement instanceof Region) {
            region = (Region) semanticElement;
            annotationExtension.setTimeHierarchical(region, 12345);   
        }

        EObject viewModelElement =
                context.getViewContext().getTargetElement(
                        /* eure states & regions */semanticElement, null);
        
        if (viewModelElement instanceof KNode) {
            KContainerRendering rect =
                    ((KNode) viewModelElement).getData(KContainerRendering.class);

         
            if (rect != null) {
                Integer hierarchicalWCET = annotationExtension.getTimeHierarchical(region);
                String hWCETString = hierarchicalWCET.toString();
                KText text = containerRenderingExtensions.addText(rect, hWCETString);
                renderingExtensions.setFontSize(text, 12);
                renderingExtensions.setForegroundColor(text, 255, 0, 0);
                renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
                        renderingExtensions.TOP, 1, 0, HorizontalAlignment.RIGHT,
                        VerticalAlignment.TOP, 5, 5, 0, 0);

                rect.getChildren().add(text);
            }
        }
        
//        if (viewModelElement instanceof KNode) {
//            KContainerRendering rect = ((KNode) viewModelElement).getData(KContainerRendering.class);
//            
//            if (rect != null) {
//
//                KText text = containerRenderingExtensions.addText(rect, "HUGO");
//                renderingExtensions.setFontSize(text, 13);
//                renderingExtensions.setForegroundColor(text, 255, 0, 0);
//                renderingExtensions.setPointPlacementData(text, renderingExtensions.RIGHT, 5, 0,
//                        renderingExtensions.TOP, 5, 0, HorizontalAlignment.RIGHT,
//                        VerticalAlignment.TOP, 5, 5, 0, 0);
//
//                rect.getChildren().add(text);
//            }
//        }
        
        return ActionResult.createResult(false);
    }

}
