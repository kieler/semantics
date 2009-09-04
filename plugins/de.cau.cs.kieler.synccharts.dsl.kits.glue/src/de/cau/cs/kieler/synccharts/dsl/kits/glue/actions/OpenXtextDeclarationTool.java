/**
 * 
 */
package de.cau.cs.kieler.synccharts.dsl.kits.glue.actions;

/**
 * @author oba
 *
 */

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;

public class OpenXtextDeclarationTool {

	private static final String EDITOR_ID = "de.cau.cs.kieler.synccharts.dsl.Kits";
	private static final String PLATFORM_RESOURCE = "platform:/resource";

	public static void openXtextDeclaration(EObject semanticElement,
			IWorkbenchPart targetPart) {
		try {
			String uri = semanticElement.eResource().getURI().toString();
			if (uri.startsWith(PLATFORM_RESOURCE)) {
				String fileString = uri.substring(PLATFORM_RESOURCE.length());
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(
						new Path(fileString));
				if (file != null && file.exists()) {
					NodeAdapter nodeAdapter = NodeUtil
							.getNodeAdapter(semanticElement);
					if (nodeAdapter != null) {
						CompositeNode parserNode = nodeAdapter.getParserNode();
						if (parserNode != null) {
							ITextEditor editor = (ITextEditor) targetPart
									.getSite().getPage().openEditor(
											new FileEditorInput(file),
											EDITOR_ID);
							editor.getSelectionProvider().setSelection(
									new TextSelection(parserNode.getOffset(),
											parserNode.getLength()));
						}
					}
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

	public static void openXtextDeclaration(URI semanticElementURI,
			Resource eResource, IWorkbenchPart targetPart) {
		EObject semanticElement = eResource.getResourceSet().getEObject(
				semanticElementURI, true);
		if (semanticElement != null) {
			openXtextDeclaration(semanticElement, targetPart);
		}
	}
}
