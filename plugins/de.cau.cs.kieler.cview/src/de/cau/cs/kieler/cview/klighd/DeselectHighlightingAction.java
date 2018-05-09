package de.cau.cs.kieler.cview.klighd;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.cview.KLighDController;
import de.cau.cs.kieler.cview.model.cViewModel.Component;
import de.cau.cs.kieler.cview.model.cViewModel.Connection;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.kgraph.KGraphElement;
import de.cau.cs.kieler.klighd.krendering.KBackground;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KForeground;
import de.cau.cs.kieler.klighd.krendering.KRendering;
import de.cau.cs.kieler.klighd.krendering.KStyle;

/** 
 * A class for de-selecting the high-lighting as opposed to the selection.
 * 
 * @author cmot
 *
 */
public class DeselectHighlightingAction extends HighlightElementAction {
	
	/** The action ID. */
    public static final String ID = "de.cau.cs.kieler.cview.DeselectHighlightingAction";
	
//    
//    /** 
//	 * Sets the alpha of an element to the desired value
//	 * @param elem The graph element to change the alpha value
//	 * @param alpha The alpha value
//	 * @param considerChildren whether children should be considered when changing the alpha value
//	 */
//	private void setAlpha(KGraphElement elem, int alpha, boolean considerChildren) {
//		KRendering kRendering = elem.getData(KRendering.class);
//		setRenderingAlpha(kRendering, alpha);
//		if(considerChildren) {
//			if(kRendering instanceof KContainerRendering) {
//				for(KRendering child : ((KContainerRendering) kRendering).getChildren()) {
//					setRenderingAlpha(child, alpha);
//				}
//			}
//		}
//	}
////	
//	/** 
//	 * Sets the alpha of a rendering element
//	 * @param kRendering The rendering to change the alpha value
//	 * @param alpha The alpha value
//	 */
//	private void setRenderingAlpha(KRendering kRendering, int alpha) {
//		for(KStyle style : kRendering.getStyles()) {
//			if(style instanceof KForeground) {
//				KForeground foreground = (KForeground) style;
//				foreground.setAlpha(alpha);
//				foreground.setTargetAlpha(alpha);
//			}
//			if(style instanceof KBackground) {
//				KBackground background = (KBackground) style;
//				background.setAlpha(alpha);
//				background.setTargetAlpha(alpha);
//			}
//		}
//	}
//    
    
	@Override
	public ActionResult execute(ActionContext context) {

		for(Component component : KLighDController.getModel().getComponents()) {
			for(EObject obj : context.getViewContext().getTargetElements(component)) {
				if(obj instanceof KGraphElement) {
					setAlpha((KGraphElement) obj, 255, true);
				}
			}
		}
		
		for(Connection connection : KLighDController.getModel().getConnections()) {
			for(EObject obj : context.getViewContext().getTargetElements(connection)) {
				if(obj instanceof KGraphElement) {
					setAlpha((KGraphElement) obj, 255, true);
				}
			}
		}
		
		
		return ActionResult.createResult(false);
	}

}
