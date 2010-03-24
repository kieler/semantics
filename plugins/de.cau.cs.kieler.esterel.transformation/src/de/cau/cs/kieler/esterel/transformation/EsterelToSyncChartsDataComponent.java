package de.cau.cs.kieler.esterel.transformation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.json.JSONObject;

import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.StateType;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.diagram.part.SyncchartsDiagramEditorUtil;

/**
 * A KIELER Execution Manager (KIEM) Data Component that executes Esterel2SyncCharts 
 * transformations. It takes the currently active Esterel Editor and initializes
 * a SyncChart with an initial State with the Esterel program as its contents.
 * 
 * A stepwise execution will execute the transformation.
 *  
 * @author haf
 *
 */
public class EsterelToSyncChartsDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private static final String ESTEREL_LANGUAGE = "de.cau.cs.kieler.esterel.Esterel";

    // the syncchart that initially will contain a rootRegion with
    // exactly one textual state. BodyText will be the Esterel source
    // code and bodyContents will be the Esterel Module objects.
    private Region syncchart;
        
    public JSONObject step(JSONObject jSONObject) throws KiemExecutionException {
        System.out.println("Stepping Esterel Transformation.");
        // TODO: Add stepwise transformation here
        return null;
    }

    public void initialize() throws KiemInitializationException {
        System.out.println("Initializing Esterel Transformation.");

        System.out.println("Reading current Esterel Editor");
        try {
            IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage().getActiveEditor();
            XtextEditor xeditor = ((XtextEditor) editor);
            if (!xeditor.getLanguageName().equals(ESTEREL_LANGUAGE)) {
                throw new IllegalArgumentException(
                        "The currently open Xtext Editor is no Esterel Editor. Editor language is "
                                + xeditor.getLanguageName() + " but should be " + ESTEREL_LANGUAGE);
            }

            IFile file = ((FileEditorInput) xeditor.getEditorInput()).getFile();

            final URI strlURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            final URI kidsURI = URI.createPlatformResourceURI(file.getFullPath()
                    .removeFileExtension().addFileExtension("kids").toString(), false);
            final URI kixsURI = URI.createPlatformResourceURI(file.getFullPath()
                    .removeFileExtension().addFileExtension("kixs").toString(), false);

            System.out.println("Creating new SyncCharts Diagram.");
            IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
                protected void execute(IProgressMonitor monitor) throws CoreException,
                        InterruptedException {
                    Resource diagram = SyncchartsDiagramEditorUtil.createDiagram(kidsURI, kixsURI,
                            monitor);
                    try {
                        diagram.save(null);
                        SyncchartsDiagramEditorUtil.openDiagram(diagram);
                    } catch (Exception e) {
                        System.out.println(e);
                        e.printStackTrace();
                    }

                }
            };
            op.run(null);

            System.out.println("Creating initial SyncCharts contents.");
            ResourceSet resourceSet = new ResourceSetImpl();
            Resource resource = resourceSet.getResource(kixsURI, true);
            SyncchartsFactory sf = SyncchartsFactory.eINSTANCE;
            Region rootRegion = (Region) resource.getContents().get(0);
            State rootState = sf.createState();
            rootRegion.getInnerStates().add(rootState);
            rootState.setLabel("EsterelState");
            rootState.setType(StateType.TEXTUAL);

            System.out.println("Reading Esterel Source Code.");
            IXtextDocument document = xeditor.getDocument();
            
            rootState.setBodyText(document.get());

            System.out.println("Parsing Esterel Source Code.");
            Resource xtextResource = resourceSet.getResource(strlURI, true);
            EObject esterelModule = xtextResource.getContents().get(0);

            System.out.println("Attaching Esterel Model to SyncChart");
            rootState.setBodyContents(esterelModule);

            this.syncchart = rootRegion;
            resource.save(null);

        } catch (Exception e) {
            throw new KiemInitializationException(
                    "Failed to initialize Esterel Transformation. No valid Esterel Editor found.",
                    true, e);
        }

    }

    public boolean isObserver() {
        return false;
    }

    public boolean isProducer() {
        return true;
    }

    public void wrapup() throws KiemInitializationException {
        // TODO: add any cleanup here
    }

}
