package de.cau.cs.kieler.yakindu.sccharts.scl.handler;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;
import org.yakindu.sct.ui.editor.DiagramActivator;

import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;

import com.google.inject.Injector;

import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.SCCToCoreTransformation;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class SCCModelFileHandler extends AbstractModelFileHandler {

        private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
        
	public static final String SCCTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.SCCToCoreTransformation";

	public SCCModelFileHandler() {
	}

	public String ModelHandlerFileExtension() {
		return "scc";
	}

	public String ModelHandlerFileExtensionTransformed() {
		return "core.scc";
	}

	public String ModelHandlerDiagramEditorID() {
		return StatechartDiagramEditor.ID;
	}

	public PreferencesHint ModelHandlerDiagramPreferencesHint() {
		return DiagramActivator.DIAGRAM_PREFERENCES_HINT;
	}

	public boolean ModelHandlerCreateDiagram() {
		return true;
	}

	public boolean ModelHandlerOpenEditor() {
		return true;
	}
	
	public Injector CreateResourceInjector() {
	    return injector;
	}

	public EObject doTransformation(EObject modelObject,
			String commandString) {
		if (commandString.equals(SCCTRANSFORMATIONCOMMAND)) {
	                System.out.println("scc core transformation: " + commandString);
			EObject transformed = (new SCCToCoreTransformation())
					.transformSCCAborts((Statechart) modelObject);
			transformed = (new SCCToCoreTransformation())
					.transformSCCConditional((Statechart) transformed);
			return transformed;
		}
                
		return null;
	}

}
