package de.cau.cs.kieler.ant.xtend2codegen;

import org.apache.log4j.BasicConfigurator;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.Path;
import org.eclipse.xtext.xtend2.Xtend2StandaloneSetup;
import org.eclipse.xtext.xtend2.compiler.batch.Xtend2BatchCompiler;

import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class Xtend2CodegenTask extends Task {
	
	private String sourcePath = "";
	private String outputPath = "";
	private String classPath = "";
	private Path classPathP = new Path(getProject());
	
	public Xtend2CodegenTask() {
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void execute() {
		
		this.classPath = this.classPathP.toString();
		// System.err.println(this.classPath);
		
		BasicConfigurator.configure();
		Injector injector = new Xtend2StandaloneSetup().createInjectorAndDoEMFRegistration();
		Xtend2BatchCompiler xtend2BatchCompiler = injector.getInstance(Xtend2BatchCompiler.class);
		
		xtend2BatchCompiler.setSourcePath(sourcePath);
		xtend2BatchCompiler.setOutputPath(outputPath);
		xtend2BatchCompiler.setClassPath(classPath);
		xtend2BatchCompiler.setFileEncoding("utf8");
		
		xtend2BatchCompiler.compile();		
	}
	
	public void setSourceFolder(final String s) {
		this.sourcePath = s;
	}
	
	public void setOutputFolder(final String s) {
		this.outputPath = s;
	}
	
    /**
     * add...-variant won't work since the Path class has no public noarg constructor.	
     * @return
     */
	public Path createClasspath() {
		Path p = new Path(getProject());
		this.classPathP.add(p);
		// System.err.println("createClasspath");
		return p;
	}

}
