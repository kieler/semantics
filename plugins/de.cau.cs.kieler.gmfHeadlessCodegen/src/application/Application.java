package application;

// import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.codegen.util.Generator;
//import org.eclipse.gmf.internal.bridge.transform.ValidationHelper;
import org.eclipse.gmf.internal.codegen.CodeGenUIPlugin;
import org.eclipse.gmf.internal.common.migrate.ModelLoadHelper;

@SuppressWarnings("restriction")
public class Application implements IApplication {
	
	private GenEditorGenerator myGenModel = null;
	
	public Object start(IApplicationContext context) throws Exception {
		
		String file = (String) ((String[]) context.getArguments().get("application.args"))[0];
		loadGenModel(URI.createFileURI(file));
		if (myGenModel!=null) new Generator(myGenModel, CodeGenUIPlugin.getDefault().getEmitters(myGenModel)).run();
		unloadGenModel();

		return IApplication.EXIT_OK;
	}

	/** @author chris
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

	/** @author chris
	  * @copied from original source file
	  */
	private void unloadGenModel() {
		if (myGenModel != null && myGenModel.eResource() != null) {
			myGenModel.eResource().unload();
		}
		myGenModel = null;
	}

	public void stop() {
		// nothing to do
	}
}
