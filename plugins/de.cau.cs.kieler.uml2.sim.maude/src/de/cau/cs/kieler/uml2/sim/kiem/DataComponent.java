package de.cau.cs.kieler.uml2.sim.kiem;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVar;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

import org.eclipse.uml2.uml.UMLPackage;

// TODO: Auto-generated Javadoc
/**
 * The Class DataComponent.
 */
public class DataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {

    /** The out path. */
    String outPath;

    /**
     * Instantiates a new data component.
     */
    public DataComponent() {
        // TODO Auto-generated constructor stub
    }

    // -------------------------------------------------------------------------

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#doStep(org.json.JSONObject)
     */
    public JSONObject doStep(JSONObject arg0) throws KiemExecutionException {
        // TODO Auto-generated method stub
        return null;
    }

    // -------------------------------------------------------------------------
    
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#initialize()
     */
    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }

    // -------------------------------------------------------------------------

    /**
     * Refresh workspace so that, e.g. the Project Explorer is updated to display
     * the generated maude file.
     */
    public void refreshWorkspace() {
        try {
            // get resource
            IResource myresource = ResourcesPlugin.getWorkspace().getRoot();
            // then just refresh it
            myresource.refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------
    
    /**
     * Gets the maude gen code location. It is the same path where the original
     * source file lives just ending with the maude file extension instead of
     * uml.
     * 
     * @return the maude gen code location
     */
    public String getMaudeGenCodeLocation() {
        String outPath = part2Location(this.getInputEditor());
        String stringUri = this.getInputModel();
        String stringUri2 = stringUri.replace(".uml", "");
        stringUri2 = stringUri2.substring(stringUri2.indexOf("/", 1) + 1);
        return (outPath + stringUri2);
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maude base code location that must be included into the generated
     * maude file that has to access these maude base files.
     * 
     * @return the maude base code location
     */
    public String getMaudeBaseCodeLocation() {
        // building path to bundle
        Bundle bundle = Platform.getBundle("de.cau.cs.kieler.uml2.sim.maude");

        URL url = null;
        try {
            url = FileLocator.toFileURL(FileLocator.find(bundle, new Path("maude"), null));
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        String bundleLocation = url.getFile();
        // because of windows vs. linux
        bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\" + "/");
        if (bundleLocation.startsWith("\\")) {
            bundleLocation = bundleLocation.substring(1);
        }

        return bundleLocation;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the system is based on windows.
     * 
     * @return true, if is windows
     */
    public static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf("win") >= 0);
    }
    
    // -------------------------------------------------------------------------

    /**
     * Transforms a normal Windows path into a cygwin path because Maude for
     * Windows is compiled w/ cygwin.
     * 
     * @param WindowsPath
     *            the windows path
     * @return the string
     */
    public String transformToCygwinPath(String WindowsPath) {
        int i = WindowsPath.indexOf(":");
        String drive = WindowsPath.substring(i-1,i);
        String location = WindowsPath.substring(i+2);
        location = location.replaceAll("[/\\\\]+", "\\" + "/");
        return "/cygdrive/"+drive.toLowerCase()+"/"+location;
    }

    // -------------------------------------------------------------------------

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#doModel2ModelTransform(de.cau.cs.kieler.core.ui.KielerProgressMonitor)
     */
    public void doModel2ModelTransform(KielerProgressMonitor monitor) throws Exception {
        // Workflow
        Workflow workflow = new Workflow();

        // EMF reader
        Reader emfReader = new Reader();
        String stringUri = this.getInputModel();
        emfReader.setUri(stringUri);
        emfReader.setModelSlot("model");
        // DO NOT USE THE SAME INPUT RESOUCRCE SET
        // OTHERWISE WE MAY CHANGE THE INPUT MODEL!
        // emfReader.setResourceSet(this.getInputResourceSet());
        // emfReader.setResourceSet(ptolemyModel.getResourceSet());

        outPath = part2Location(this.getInputEditor());

        // Set model name (gets model.maude)
        GlobalVar modelname = new GlobalVar();
        modelname.setName("modelname");
        String stringUri2 = stringUri.replace(".uml", "");
        stringUri2 = stringUri2.substring(stringUri2.indexOf("/", 1));
        modelname.setValue(stringUri2);

        GlobalVar maudebasecode = new GlobalVar();
        maudebasecode.setName("maudebasecode");
        String baseLocation = getMaudeBaseCodeLocation();
        if (isWindows()) {
            baseLocation = transformToCygwinPath(baseLocation); 
        }
        maudebasecode.setValue(baseLocation);

        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);

        // Meta models
        EmfMetaModel metaModel0 = new EmfMetaModel(UMLPackage.eINSTANCE);

        // Xpand Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel0);
        generator.addOutlet(outlet);
        generator.addGlobalVar(modelname);
        generator.addGlobalVar(maudebasecode);
        generator.setExpand("model::Template::main FOR model");

        // workflow
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        M2MProgressMonitor m2mMonitor = new M2MProgressMonitor(monitor, 3);

        workflow.addComponent(emfReader);
        workflow.addComponent(generator);
        // workflow.invoke(wfx, (ProgressMonitor)monitor.subTask(80), issues);
        workflow.invoke(wfx, m2mMonitor, issues);

        // refresh the workspace because we created a new file
        refreshWorkspace();
    }

    // -------------------------------------------------------------------------
    
    /**
     * Get the editor input as fill directory.
     * 
     * @param editor
     *            the editor
     * @return the string
     */
    private static String part2Location(final IEditorPart editor) {
        String out = null;
        FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");
        return out;
    }

    // -------------------------------------------------------------------------

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#checkModelValidation(org.eclipse.emf.ecore.EObject)
     */
    public boolean checkModelValidation(EObject rootEObject) {
        return true;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#doProvideInitialVariables()
     */
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        return null;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#isObserver()
     */
    public boolean isObserver() {
        // TODO Auto-generated method stub
        return true;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#isProducer()
     */
    public boolean isProducer() {
        // TODO Auto-generated method stub
        return true;
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.IDataComponent#wrapup()
     */
    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }

    // -------------------------------------------------------------------------

    // Adapted method because papyrus editors are not instance of DiagramEditor
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#getNotationElement(org.eclipse.ui.IEditorPart)
     */
    @Override
    protected View getNotationElement(IEditorPart diagramEditor) {
        if (diagramEditor instanceof PapyrusMultiDiagramEditor) {
            View notationElement = ((View) ((PapyrusMultiDiagramEditor) diagramEditor)
                    .getDiagramEditPart().getModel());
            return notationElement;
        }
        return null;
    }
    
    // -------------------------------------------------------------------------

    // Only return the papyrus uml editor
    /* (non-Javadoc)
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent#getInputEditor()
     */
    @Override
    protected IEditorPart getInputEditor() {
        IEditorPart ep = super.getInputEditor();
        if (!(ep instanceof PapyrusMultiDiagramEditor)) {
            return null;
        }
        return ep;
    }


}
