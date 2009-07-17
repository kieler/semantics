package antTask;

import org.apache.tools.ant.Task;
// import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.util.Generator;
// import org.eclipse.gmf.internal.bridge.transform.ValidationHelper;
import org.eclipse.gmf.internal.codegen.CodeGenUIPlugin;
import org.eclipse.gmf.internal.common.migrate.ModelLoadHelper;

@SuppressWarnings("restriction")
public class GMFCodeGenTask extends Task {
	
	private String GmfgenModelPath = null;
	private GenEditorGenerator myGenModel = null;
	
	public GMFCodeGenTask() {
	}
	
	public void setGmfgenModel(String gmfgenModel) {
		this.GmfgenModelPath = gmfgenModel;		
	}
	
	public void execute() {
		if (this.GmfgenModelPath == null) {
			log("Usage: <kieler.genGMFdiagramCode gmfgenModel=<absolute/path/to/file.genmodel> />\n\n"
			  + "The project will be generated in the given workspace (specified by -data <path/to/workspace> while launching antRunner).");
		}
		else {
			log(GmfgenModelPath);
			loadGenModel(URI.createFileURI(GmfgenModelPath));
			new Generator(myGenModel, CodeGenUIPlugin.getDefault().getEmitters(myGenModel)).run();
			unloadGenModel();
		}
	}
	
	/** @author chsch
	  * @copied from original source file
	  */
	private void loadGenModel(URI genModelURI) {
		ResourceSet srcResSet = new ResourceSetImpl();
		srcResSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());		
		ModelLoadHelper loadHelper = new ModelLoadHelper(srcResSet, genModelURI);
		Object root = loadHelper.getContentsRoot();
		if (root instanceof GenDiagram) {
			myGenModel = ((GenDiagram) root).getEditorGen();
		} else if (root instanceof GenEditorGenerator) {
			myGenModel = (GenEditorGenerator) root;
		}
		if (myGenModel != null && myGenModel.getDomainGenModel() != null) {
			myGenModel.getDomainGenModel().reconcile();
		}
		// return ValidationHelper.createResourceProblemMarkers(loadHelper.getDiagnostics());
	}
	
	/** @author chsch
	  * @copied from original source file
	  */
	private void unloadGenModel() {
		if (myGenModel != null && myGenModel.eResource() != null) {
			myGenModel.eResource().unload();
		}
		myGenModel = null;
	}
	

}
