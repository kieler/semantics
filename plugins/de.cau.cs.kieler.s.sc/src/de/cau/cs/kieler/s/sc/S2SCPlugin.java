package de.cau.cs.kieler.s.sc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sc.xtend.S2SC;

/**
 * The activator class controls the plug-in life cycle
 */
public class S2SCPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "de.cau.cs.kieler.s.sc"; //$NON-NLS-1$

	// The shared instance
	private static S2SCPlugin plugin;
	
	/**
	 * The constructor
	 */
	public S2SCPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	
	public static void generateSCCode(Program program, String outputFile, String outputFolder) throws IOException {
		S2SC s2SC = new S2SC();
		String ccode = s2SC.transform(program, outputFolder).toString(); 

		// Write out c program
			FileWriter fileWriter = new FileWriter(outputFile);
			if (fileWriter != null) {
				BufferedWriter out = new BufferedWriter(fileWriter);
				if (out != null) {
					out.write(ccode);
					out.close();
				}
			}
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static S2SCPlugin getDefault() {
		return plugin;
	}

}
