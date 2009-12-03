package antTask;

import java.util.ArrayList;

import org.apache.tools.ant.Task;

public class EMFCodeGenTask extends Task {
	
	String genModel = null;
	String genModelCode = null;
	String genEditCode = null;
	String genEditorCode = null;
	String genTestsCode = null;

	ArrayList<String> config = new ArrayList<String>();
	
	public EMFCodeGenTask() {
	}
	
	public void setGenModel(String genModel) {
		this.genModel = genModel;		
	}
	
	public void setGenModelCode(Boolean genModelCode) {
		if (genModelCode) /* this.genModelCode = */ this.config.add("-model");
	}
	
	public void setGenEditCode(Boolean genEditCode) {
		if (genEditCode) /* this.genEditCode = */ this.config.add("-edit");
	}
	
	public void setGenEditorCode(Boolean genEditorCode) {
		if (genEditorCode) /* this.genEditorCode = */ this.config.add("-editor");
	}
	
	public void setGenTestsCode(Boolean genTestsCode) {
		if (genTestsCode) /* this.genTestsCode = */ this.config.add("-tests");
	}
	
	public void execute() {
		if (this.genModel == null) {
			log("Usage: <kieler.genEMFcode genModel=<absolute/path/to/file.genmodel> [ genModelCode=true ] [ genEditCode=true ]\n"
              + "                                                                    [ genEditorCode=true ] [ genTestsCode=true ] />\n\n"
			  + "The particular projects will be generated in the given workspace (specified by -data <path/to/workspace> while launching antRunner).");
		}
		else {
			config.add(genModel);
			log(config.toString());
			String[] params = (String[]) config.toArray(new String[1]); //new String[] {this.genModelCode, this.genEditCode, this.genEditorCode, this.genTestsCode, this.genModel};
			new org.eclipse.emf.codegen.ecore.Generator().run(params);
		}

	}
}
