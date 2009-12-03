package application;

// import java.io.File;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
// import org.eclipse.emf.ant.taskdefs.codegen.ecore.GeneratorTask;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
/*		GenModel genModel = null;
	    genModel.reconcile();
	    genModel.setCanGenerate(true);

		Generator generator = GenModelUtil.createGenerator(genModel);
        Object[] generatorAndArguments = new Object[4];
        generatorAndArguments[0] = generator;
        generatorAndArguments[1] = genModel;
        generatorAndArguments[2] = projectType.getID();
        generatorAndArguments[3] = projectType.getLabel();
	*/	
		
		System.out.println("Start");
		/*
		GeneratorTask task = new GeneratorTask(){
			@Override
			protected void createGenModel(String[] arguments) throws Exception {
			}};
			
		System.out.println(Platform.getLocation());
		task.setModel(new File("/MyDeveloping/workspace/de.cau.cs.kieler.synccharts/model/synccharts.ecore"));
		task.setGenModel(new File("/MyDeveloping/workspace/de.cau.cs.kieler.synccharts/model/synccharts.genmodel"));
		task.setModelProject(new File("/MyDeveloping/workspace/de.cau.cs.kieler.synccharts.model2"));
		task.setReconcileGenModel("keep");
		task.setModelProjectFragmentPath("src");
		task.setModelPluginID("de.cau.cs.kieler.synccharts.model2");
		task.setGenerateJavaCode(true);
		task.setGenerateModelProject(true);
		task.setGenerateEditProject(true);
		task.setGenerateEditorProject(true);
		task.setJdkLevel("5.0");
		task.execute();
		*/
		
		String file = (String) ((String[]) context.getArguments().get("application.args"))[0];
		new org.eclipse.emf.codegen.ecore.Generator().run(
				new String[] {/*"-projects", "/MyDeveloping/workspace5/", */ "-model", "-edit", "-editor", "-tests", file});
		
		System.out.println("Finished");
		
		
		return IApplication.EXIT_OK;		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
	}
}
