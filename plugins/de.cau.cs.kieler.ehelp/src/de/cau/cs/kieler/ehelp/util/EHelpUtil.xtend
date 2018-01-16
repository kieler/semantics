package de.cau.cs.kieler.ehelp.util

import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.ui.editor.model.XtextDocument
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.ui.texteditor.ITextEditor
import org.eclipse.jface.text.ITextSelection
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.emf.ecore.EObject

class EHelpUtil {

//				IWorkspace workspace = ResourcesPlugin.getWorkspace(); 
//				IWorkspaceRoot workspaceRoot = workspace.getRoot();
//				IPath location = workspaceRoot.getLocation();
//				String baseDir = location.toString();
	public static def getCurrentSelection() { 
		val xtextEditor = EHelpUtil.getXtextEditor();
		val textSelection = xtextEditor.editorSite.getSelectionProvider().getSelection() as ITextSelection
		return textSelection
	}

	public static def getCurrentModelElement(EObject root) {
		val offset = getCurrentSelection.getOffset();
		val rootNode = NodeModelUtils.findActualNodeFor(root)
		val modelLeafNode = NodeModelUtils.findLeafNodeAtOffset(rootNode, offset)
		val modelElement = NodeModelUtils.findActualSemanticObjectFor(modelLeafNode);
		return modelElement
	}

	public static def addToCurrentEditor(String text) {
		val page = getActivePage
		val part = page.getActiveEditor();
		val editor = part as ITextEditor
		val dp = editor.getDocumentProvider();
		val doc = dp.getDocument(editor.getEditorInput());

		val textSelection = getCurrentSelection
		val offset = textSelection.getOffset();
		doc.replace(offset, 0, text);
	}

	public static def String getCurrentWorkspaceLocationString() {
		return getCurrentWorkspaceLocationString(true, false)
	}

	var static String currentWorkspaceLocationStringCache = null

	public static def String getCurrentWorkspaceLocationString(boolean update, boolean runningInDisplayThread) {
		if (currentWorkspaceLocationStringCache == null || update) {
			if (runningInDisplayThread) {
				val editor = EHelpUtil.getXtextEditor();
				currentWorkspaceLocationStringCache = editor.getResource().getLocation().removeLastSegments(1).
					toString();
			} else {
				PlatformUI.workbench.display.asyncExec(
					new Runnable {
						override run() {
							val editor = EHelpUtil.getXtextEditor();
							currentWorkspaceLocationStringCache = editor.getResource().getLocation().
								removeLastSegments(1).toString();
						}
					})
			}
		}
		return currentWorkspaceLocationStringCache
	}

	public static def refreshWorkspaces() {
		for (project : ResourcesPlugin.workspace.root.projects) {
			project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		}
	}

	public static def getActivePage() {
		if (PlatformUI.getWorkbench() == null) {
			return null
		}
		if (PlatformUI.getWorkbench().getActiveWorkbenchWindow() == null) {
			return null
		}
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
	}

	public static def getXtextEditor() {
		if (PlatformUI.getWorkbench() == null) {
			return null
		}
		if (PlatformUI.getWorkbench().getActiveWorkbenchWindow() == null) {
			return null
		}
		if (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage() == null) {
			return null
		}
		val editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor()
		if ((editorPart != null) && (editorPart instanceof XtextEditor)) {
			val localXtextEditor = editorPart as XtextEditor;
			if (localXtextEditor.getDocument() instanceof XtextDocument &&
				localXtextEditor.getLanguageName().equals(EHelpConsts.XTEXT_EDITOR_ID)) {

				return localXtextEditor;
			}
		}
	}
}
