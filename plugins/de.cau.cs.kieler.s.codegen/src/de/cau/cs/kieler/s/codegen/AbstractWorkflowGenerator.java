package de.cau.cs.kieler.s.codegen;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xpand2.output.PostProcessor;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork.Void;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.model.util.XpandTransformationUtil;
import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.s.SPackage;

public abstract class AbstractWorkflowGenerator {

    protected EObject myModel = null;
    protected static String outPath = null;
    protected String uriString = null;
    private IEditorPart editor = null;
    protected URI uri = null;
    protected PostProcessor postProcessor = null;

    /**
     * The constructor sets the location in the KIELER workspace to save the sc
     * files if you just generate sc code without simulation. It also sets the
     * variables for the EMF reader.
     */
    public AbstractWorkflowGenerator() {
        // location for the sc file in the KIELER workspace
        IWorkbenchPage activePage = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage();
        editor = activePage.getActiveEditor();
        outPath = part2Location(editor);
        uriString = null;
        if (editor instanceof XtextEditor) {
            XtextEditor xtextEditor = (XtextEditor) editor;
            checkForDirtyEditor(xtextEditor);
            IXtextDocument docu = xtextEditor.getDocument();

            if (docu instanceof XtextDocument) {
                XtextDocument document = (XtextDocument) docu;

                document.readOnly(new Void<XtextResource>() {

                    @Override
                    public void process(final XtextResource state)
                            throws Exception {
                        List<EObject> eObj = state.getContents();

                        myModel = eObj.get(0);
                        uri = myModel.eResource().getURI();
                        uriString = uri.toString();
                    }
                });
            }
        }
        // System.out.println("URI:" + uri);
        // System.out.println("Outpath:" + outPath);
    }

    /**
     * The constructor to use a given diagram (as *.kixs file) for generating
     * code.
     * 
     * @param fileLocation
     *            the location of the given diagram file
     */
    public AbstractWorkflowGenerator(final String fileLocation) {
        // location for the sc file in the KIELER workspace
        uriString = fileLocation;
        uri = URI.createURI(uriString);
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(uri, true);
        Program rootProgram = (Program) resource.getContents().get(0);
        myModel = rootProgram;
    }

    /**
     * Creates a new AbstractWorkflowGenerator.java.
     * 
     * @param selectedFile
     */
    public AbstractWorkflowGenerator(final IFile selectedFile) {
        // System.out.println("File:" + selectedFile);
        uri = URI.createPlatformResourceURI(selectedFile.getFullPath()
                .makeRelativeTo(Platform.getLocation()).toOSString(), true);
        outPath = selectedFile.getRawLocation().removeLastSegments(1)
                .addTrailingSeparator().toOSString();
        // System.out.println("URI:" + uri);
        // System.out.println("Outpath:" + outPath);
    }

    /**
     * Creates a new AbstractWorkflowGenerator.java.
     * 
     * @param selectedFile
     * @param fileLocation
     */
    public AbstractWorkflowGenerator(final IFile selectedFile,
            final String fileLocation) {
        // System.out.println("File:" + selectedFile);
        uri = URI.createPlatformResourceURI(selectedFile.getFullPath()
                .makeRelativeTo(Platform.getLocation()).toOSString(), true);
        outPath = selectedFile.getRawLocation().removeLastSegments(1)
                .addTrailingSeparator().toOSString();
        // System.out.println("URI:" + uri);
        // System.out.println("Outpath:" + outPath);
    }

    /**
     * Invocation of the workflow. Prepares the environment for generating code.
     * 
     * @param sim
     *            is false if you just want to generate code and true if you
     *            want to generate code and simulate it
     * @param path
     *            the path where the generated files should be written
     */
    public void invokeWorkflow(final boolean sim, final String path) {

        try {
            XpandTransformationUtil.model2TextTransform(
                    getPathToMainTemplate(), getNameOfMainMethod(), uri,
                    outPath, this.postProcessor, SPackage.eINSTANCE, KExpressionsPackage.eINSTANCE);
            ResourcesPlugin
                    .getWorkspace()
                    .getRoot()
                    .refreshLocal(IResource.DEPTH_INFINITE,
                            new NullProgressMonitor());
        } catch (KielerException e0) {
            e0.printStackTrace();
        } catch (CoreException e0) {
            e0.printStackTrace();
        }

    }

    
 
    
    /**
     * Getter for the path to the main code generation template file. e.g.:
     * de::cau::cs::kieler::s::sj::templates::Codegen
     * 
     * @return the template path
     */
    public abstract String getPathToMainTemplate();

    /**
     * Getter for the name of the root method.
     * 
     * @return the root methods name
     */
    public abstract String getNameOfMainMethod();

    private static void checkForDirtyEditor(final XtextEditor diagramEditor) {
        if (diagramEditor.isDirty()) {
            final Shell shell = Display.getCurrent().getShells()[0];
            boolean b = MessageDialog
                    .openQuestion(
                            shell,
                            "Save Resource",
                            "'"
                                    + diagramEditor.getEditorInput().getName()
                                    + "'"
                                    + " has been modified. Save changes before simulating? (recommended)");
            if (b) {
                IEditorSite part = diagramEditor.getEditorSite();
                part.getPage().saveEditor((IEditorPart) part.getPart(), false);
            }
        }
    }

    private static String part2Location(final IEditorPart editor) {
        String out = null;

        FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");

        return out;
    }

    /**
     * Returns the model.
     * 
     * @return model
     */
    public EObject getModel() {
        return myModel;
    }

    /**
     * Returns the uri.
     * 
     * @return uri
     */
    public URI getURI() {
        return uri;
    }

    /**
     * Returns the name of the file.
     * 
     * @return filename
     */
    public String getFileName() {
        String out = "";
        out = uri.lastSegment().replace("." + uri.fileExtension(), "");
        return out;
    }

}
