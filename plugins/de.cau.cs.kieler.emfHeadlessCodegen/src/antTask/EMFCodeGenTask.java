package antTask;

import org.apache.tools.ant.Task;

public class EMFCodeGenTask extends Task {
	
	String genModel = null;
	String genModelCode = "";
	String genEditCode = "";
	String genEditorCode = "";
	String genTestsCode = "";

	public EMFCodeGenTask() {
	}
	
	public void setGenModel(String genModel) {
		this.genModel = genModel;		
	}
	
	public void setGenModelCode(Boolean genModelCode) {
		if (genModelCode) this.genModelCode = "-model";
	}
	
	public void setGenEditCode(Boolean genEditCode) {
		if (genEditCode) this.genEditCode = "-edit";
	}
	
	public void setGenEditorCode(Boolean genEditorCode) {
		if (genEditorCode) this.genEditorCode = "-editor";
	}
	
	public void setGenTestsCode(Boolean genTestsCode) {
		if (genTestsCode) this.genTestsCode = "-tests";
	}
	
	public void execute() {
		if (this.genModel == null) {
			log("Usage: <kieler.genEMFcode genModel=<absolute/path/to/file.genmodel> [ genModelCode=true ] [ genEditCode=true ]\n"
              + "                                                                    [ genEditorCode=true ] [ genTestsCode=true ] />\n\n"
			  + "The particular projects will be generated in the given workspace (specified by -data <path/to/workspace> while launching antRunner).");
		}
		else {
			String[] params = new String[] {this.genModelCode, this.genEditCode, this.genEditorCode, this.genTestsCode, this.genModel};
			log(params[0]+" "+params[1]+" "+params[2]+" "+params[3]+" "+params[4]);
			new org.eclipse.emf.codegen.ecore.Generator().run(params);
		}

	}
}
