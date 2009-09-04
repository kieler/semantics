/**
 * 
 */
package de.cau.cs.kieler.synccharts.dsl.kits.glue.actions;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;

/**
 * @author oba
 * 
 */
public class GoToDeclaration implements IObjectActionDelegate {

	private IWorkbenchPart targetPart;
	private URI semanticElementURI;
	private Resource eResource;

	/**
	 * Constructor for Action1.
	 */
	public GoToDeclaration() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		OpenXtextDeclarationTool.openXtextDeclaration(semanticElementURI,
				eResource, targetPart);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1) {
				Object firstElement = structuredSelection.getFirstElement();
				if (firstElement instanceof IGraphicalEditPart) {
					IGraphicalEditPart editPart = (IGraphicalEditPart) firstElement;
					EObject semanticElement = editPart.resolveSemanticElement();
					if (semanticElement != null) {
						NodeAdapter nodeAdapter = NodeUtil
								.getNodeAdapter(semanticElement);
						if (nodeAdapter != null) {
							CompositeNode parserNode = nodeAdapter
									.getParserNode();
							if (parserNode != null) {
								eResource = semanticElement.eResource();
								semanticElementURI = EcoreUtil
										.getURI(semanticElement);
								action.setEnabled(true);
								return;
							}
						}
					}
				}
			}
		}
		action.setEnabled(false);
	}

}
