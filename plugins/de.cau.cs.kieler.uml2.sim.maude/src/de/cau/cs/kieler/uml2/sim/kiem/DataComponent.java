package de.cau.cs.kieler.uml2.sim.kiem;

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

import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;

import org.eclipse.uml2.uml.UMLPackage;

public class DataComponent extends JSONObjectSimulationDataComponent implements
        IJSONObjectDataComponent {

    String outPath;
    
    public DataComponent() {
        // TODO Auto-generated constructor stub
    }

    public JSONObject doStep(JSONObject arg0) throws KiemExecutionException {
        // TODO Auto-generated method stub
        return null;
    }

    public void initialize() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }
    
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
        
        // Outlet
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);
        
        // Meta models
        EmfMetaModel metaModel0 = new EmfMetaModel(UMLPackage.eINSTANCE);

        // Xpand Generator
        Generator generator = new Generator();
        generator.addMetaModel(metaModel0);
        generator.addOutlet(outlet);
        generator.setExpand("model::Template::main FOR model");

        // workflow
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        M2MProgressMonitor m2mMonitor = new M2MProgressMonitor(monitor, 3);

        workflow.addComponent(emfReader);
        workflow.addComponent(generator);
        // workflow.invoke(wfx, (ProgressMonitor)monitor.subTask(80), issues);
        workflow.invoke(wfx, m2mMonitor, issues);
    }
   

    private static String part2Location(final IEditorPart editor) {
        String out = null;
        FileEditorInput uri = (FileEditorInput) editor.getEditorInput();
        String outName = uri.getName();
        out = uri.getURI().getRawPath().replace(outName, "");
        return out;
    }

    public boolean checkModelValidation(EObject rootEObject) {
        return true;
    }
    
    public JSONObject doProvideInitialVariables() throws KiemInitializationException {
        return null;
    }
    
    public boolean isObserver() {
        // TODO Auto-generated method stub
        return true;
    }

    public boolean isProducer() {
        // TODO Auto-generated method stub
        return true;
    }

    public void wrapup() throws KiemInitializationException {
        // TODO Auto-generated method stub

    }
    
    //-------------------------------------------------------------------------

    // Adapted method because papyrus editors are not instance of DiagramEditor
    protected View getNotationElement(IEditorPart diagramEditor) {
        if (diagramEditor instanceof PapyrusMultiDiagramEditor) {
            View notationElement = ((View) ((PapyrusMultiDiagramEditor) diagramEditor).getDiagramEditPart()
                    .getModel());
           return notationElement;
        }
        return null;
     }
     
}
