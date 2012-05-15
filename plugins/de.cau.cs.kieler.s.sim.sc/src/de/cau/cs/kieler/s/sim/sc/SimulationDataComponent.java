package de.cau.cs.kieler.s.sim.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import com.google.inject.Guice;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtend.util.stdlib.CloningExtensions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.core.kexpressions.Input;
import de.cau.cs.kieler.core.kexpressions.InterfaceSignalDecl;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.core.kexpressions.Signal;
import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.s.s.Program; 
import de.cau.cs.kieler.s.sim.sc.xtend.S2Simulation;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;
import de.cau.cs.kieler.sim.kiem.properties.KiemPropertyTypeFile;
import de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent;
import de.cau.cs.kieler.sim.signals.JSONSignalValues;

public class SimulationDataComponent extends JSONObjectSimulationDataComponent implements
		IJSONObjectDataComponent {
	
	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------

	class SSimulationProgressMonitor implements ProgressMonitor {

		private KielerProgressMonitor kielerProgressMonitor;
		private int numberOfComponents = 1;
		private int numberOfComponentsDone = 0;

		public SSimulationProgressMonitor(
				final KielerProgressMonitor kielerProgressMonitorParam,
				final int numberOfComponentsParam) {
			kielerProgressMonitor = kielerProgressMonitorParam;
			numberOfComponents = numberOfComponentsParam;
			numberOfComponentsDone = 0;
		}

		public void beginTask(final String name, final int totalWork) {
			kielerProgressMonitor.begin(name, numberOfComponents);
		}

		public void done() {
			// is called by the workflow wrapper
		}

		public void finished(final Object element, final Object context) {
		}

		public void internalWorked(final double work) {
		}

		public boolean isCanceled() {
			return (kielerProgressMonitor.isCanceled());
		}

		public void postTask(final Object element, final Object context) {
			kielerProgressMonitor.worked(numberOfComponentsDone);
			numberOfComponentsDone++;
		}

		public void preTask(final Object element, final Object context) {
			// kielerProgressMonitor.begin(element.toString(), 1);
			kielerProgressMonitor.worked(numberOfComponentsDone);
		}

		public void setCanceled(final boolean value) {
		}

		public void setTaskName(final String name) {
		}

		public void started(final Object element, final Object context) {
		}

		public void subTask(final String name) {
			kielerProgressMonitor.subTask(UNKNOWN);
		}

		public void worked(final int work) {
			kielerProgressMonitor.worked(work);
		}

	}

	// -----------------------------------------------------------------------------
	// -----------------------------------------------------------------------------
	

	private Program myModel = null;
	private Process process = null;
	private PrintWriter toS = null;
	private BufferedReader fromS = null;
	private BufferedReader error = null;

	private File simFile = null;

	private LinkedList<String> outputSignalList = null;


    // -------------------------------------------------------------------------

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.sim.kiem.ui.datacomponent.JSONObjectSimulationDataComponent
     * #checkModelValidation (org.eclipse.emf.ecore.EObject)
     */
    @Override
    public boolean checkModelValidation(final EObject rootEObject) throws KiemInitializationException {
        if (!(rootEObject instanceof Program)) {
    		throw new KiemInitializationException(
                    "S Simulator can only be used with an S editor.\n\n"
                            ,
                    true, null);
        }
        
        return true;
    }    

    // -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public void initialize() throws KiemInitializationException {

	}

	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public JSONObject doStep(final JSONObject jSONObject)
			throws KiemExecutionException {
		// The return object to construct
		JSONObject returnObj = new JSONObject();

		// Collect active statements
		String activeStatements = "";

		if (process == null) {
			throw new KiemExecutionException(
					"No s simulation is running", true, null);
		}
		try {

			toS.write(jSONObject.toString() + "\n");
			toS.flush();
			while (error.ready()) {
				System.out.print(error.read());
			}

			String receivedMessage = fromS.readLine();

			if (receivedMessage != null) {
				JSONObject esterelOutput = new JSONObject(receivedMessage);
				JSONArray esterelOutputArray = esterelOutput.names();

				if (esterelOutputArray != null) {
					// First add auxiliary signals
					for (int i = 0; i < esterelOutputArray.length(); i++) {
						String esterelOutputName = esterelOutputArray
								.getString(i);

						// Test if the output variable is an auxiliary signal
						// that is only there to mark the current S
						// statement
						// in full_simulation mode of the simulator.
						// These auxiliary signals must be encapsulated in a
						// state
						// variable.
						if (esterelOutputName
								.startsWith(SSimSCPlugin.AUXILIARY_VARIABLE_TAG)) {
							try {
								String statementWithoutAuxiliaryVariableTag = esterelOutputName
										.substring(SSimSCPlugin.AUXILIARY_VARIABLE_TAG
												.length());

								// Insert a "," if not the first statement
								if (activeStatements.length() != 0) {
									activeStatements += ",";
								}

								// Add active statement to string.
								activeStatements += statementWithoutAuxiliaryVariableTag;

							} catch (Exception e) {
							}

						}

					}
				}

				// Then add normal output signals
				for (String outputSignal : outputSignalList) {
					if (esterelOutput.has(outputSignal)) {
						
						// retrieve jsonSignal
						JSONObject jsonSignal = esterelOutput.getJSONObject(outputSignal);
						
						if (jsonSignal.has("value")) {
							Object value = jsonSignal.get("value");
							// valued signals
							returnObj.accumulate(outputSignal,
									JSONSignalValues.newValue(value, true));
						}
						else {
							// pure signals
							returnObj.accumulate(outputSignal,
									JSONSignalValues.newValue(true));
						}
					} else {
						returnObj.accumulate(outputSignal,
								JSONSignalValues.newValue(false));
					}
				}
			} else {
				throw new KiemExecutionException(
						"No S simulation is running", true, null);

			}

			// Finally accumulate all active Statements (activeStatements)
			// under the statementName
			String statementName = this.getProperties()[1].getValue();
			returnObj.accumulate(statementName, activeStatements);

		} catch (IOException e) {
			System.err.println(e.getMessage());
			process.destroy();
		} catch (JSONException e) {
			e.printStackTrace();
			process.destroy();
		}

		return returnObj;
	}

	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public boolean isObserver() {
		return true;
	}

	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public boolean isProducer() {
		return true;
	}

	// -------------------------------------------------------------------------

	@Override
	public KiemProperty[] doProvideProperties() {
		final int nProperties = 3;
		KiemProperty[] properties = new KiemProperty[nProperties];
		KiemPropertyTypeFile compilerFile = new KiemPropertyTypeFile();
		properties[0] = new KiemProperty("Statement Name", "statement");

		properties[1] = new KiemProperty("C-Compiler", compilerFile, "gcc");
		properties[2] = new KiemProperty("Full Debug Mode", true);

		return properties;
	}

	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	public void wrapup() throws KiemInitializationException {
		if (process != null) {
			process.destroy();
		}
		// boolean ok = true;
		//
		// if (strlFile != null && strlFile.exists()) {
		// ok &= strlFile.delete();
		// }
		// if (dataFile != null && dataFile.exists()) {
		// ok &= dataFile.delete();
		// }
		// if (simFile != null && simFile.exists()) {
		// ok &= simFile.delete();
		// }
		// strlFile = null;
		// dataFile = null;
		// simFile = null;
		//
		// if (!ok) {
		// throw new KiemInitializationException(
		// "Could not delete temp files", false, null);
		// }
	}

	// -------------------------------------------------------------------------

	/**
	 * Convert an EMF URI to a Java.net.URI.
	 * 
	 * @param uri
	 *            the uri
	 * @return the java.net. uri
	 * @throws URISyntaxException
	 *             the uRI syntax exception
	 */
	private java.net.URI convertURI(URI uri) throws URISyntaxException {
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();

		IPath path = new Path(uri.toPlatformString(false));
		IFile file = myWorkspaceRoot.getFile(path);
		IPath fullPath = file.getLocation();

		return new java.net.URI(fullPath.toString());
	}

	// -------------------------------------------------------------------------

	/**
	 * Compile S to SC using the s.codegen.sc plugin.
	 * 
	 * @param strlFile
	 *            the strl file
	 * @param outFile
	 *            the out file
	 * @param monitor
	 *            the monitor
	 * @return the java.net. uri
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws URISyntaxException
	 *             the uRI syntax exception
	 */
	private java.net.URI compileSToSC(final URI strlFile,
			final File outFile, SSimulationProgressMonitor monitor)
			throws IOException, URISyntaxException {

		monitor.subTask("Reading Esterel file");
		java.net.URI inputURI = convertURI(strlFile);
		monitor.worked(1);
		if (monitor.isCanceled()) {
			return null;
		}
		
		//TODO: sc code generation and c code compilation here

		monitor.subTask("Generating C code");
		java.net.URI uri = null; 
		monitor.worked(1);
		return uri;
	}

	// -------------------------------------------------------------------------

	public void doModel2ModelTransform(final KielerProgressMonitor monitor)
			throws KiemInitializationException {
		monitor.begin("S Simulation", 10);

		SSimulationProgressMonitor esterelSimulationProgressMonitor = new SSimulationProgressMonitor(
				monitor, 10);

		File executable = null;
		String compile = "";
		
		try {
			// get active editor
			IEditorPart editorPart = this.getInputEditor();
			if (editorPart == null) {
				throw new KiemInitializationException(
						"No active editor selected!", true, null);
			}

			myModel = (Program) this.getInputModelEObject(editorPart);

			if (myModel == null) {
				throw new KiemInitializationException(
						"Cannot simulate active editor using the S Simulator", true,
						null);
			}

			// Make a copy of the S program in case it was from
			// an active Editor

			URI sOutput = URI.createURI("");
			// By default there is no additional transformation necessary
			Program transformedProgram = myModel;
			
			// If 'Full Debug Mode' is turned on then the user wants to have
			// also states visualized.
			// Hence some pre-processing is needed and done by the
			// Esterl2Simulation Xtend2 model transformation
			if (this.getProperties()[3].getValueAsBoolean()) {
				// Try to load synccharts model
				// 'Full Debug Mode' is turned ON
				S2Simulation transform = Guice.createInjector()
						.getInstance(S2Simulation.class);
				transformedProgram = transform.transform2Simulation(myModel);
			}

			// Calculate output path
			FileEditorInput editorInput = (FileEditorInput) editorPart
					.getEditorInput();
			URI input = URI.createPlatformResourceURI(editorInput.getFile()
					.getFullPath().toString(), true);

			sOutput = URI.createURI(input.toString());
			sOutput = sOutput.trimFragment();
			sOutput = sOutput.trimFileExtension()
					.appendFileExtension("simulation.s");

			try {
				// Write out copy/transformation of Esterel program
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("daform", new XMIResourceFactoryImpl());
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource = resSet.createResource(sOutput);
				resource.getContents().add(transformedProgram);
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				throw new KiemInitializationException(
						"Cannot write output S file.", true, null);
			}

//			// Compile Esterel to C
//			URL output = this.compileSToSC(sOutput,
//					null, esterelSimulationProgressMonitor)
//					.toURL();

			
			// Cannot be done before because otherwise the new model cannot be serialized (24.01.2012)
			// Do this on a copy to not destroy original program;
			// Make Esterel Interface delcration consistent
//			InterfaceDeclarationFix interfaceDeclarationFix = Guice.createInjector()
//					.getInstance(InterfaceDeclarationFix.class);
//			Program fixedTransformedProgram = (Program) CloningExtensions.clone(transformedProgram); 
//			interfaceDeclarationFix.fix(fixedTransformedProgram);
			
			
//			// Generate data.c
//			URL data = generateCSimulationInterface(transformedProgram,
//					sOutput);

//			// Compile C code
//			Bundle bundle = Platform
//					.getBundle("de.cau.cs.kieler.s.sim.sc");
//
//			URL fileUrl = FileLocator.find(bundle,
//					new Path("simulation"), null);
//			URL bundleLocation = FileLocator.toFileURL(fileUrl);
//
//			executable = File.createTempFile("sim", "");
//			String compiler = (getProperties()[2]).getValue();
//			compile = compiler + " " + output.getPath() + " "
//					+ data.getPath() + " " + bundleLocation.getPath()
//					+ "cJSON.c " + "-I " + bundleLocation.getPath() + " "
//					+ "-lm -o " + executable;
//
//			if (isWindows()) {
//				executable = File.createTempFile("sim", ".exe");
//				compile = compiler + " " + output.getPath().substring(1) + " "
//						+ data.getPath().substring(1) + " "
//						+ bundleLocation.getPath().substring(1) + "cJSON.c "
//						+ "-I " + bundleLocation.getPath().substring(1) + " "
//						+ "-lm -o " + executable;
//			}
//
//			simFile = executable;
//
//			System.out.println(compile);
//
//			process = Runtime.getRuntime().exec(compile);
//			InputStream stderr = process.getErrorStream();
//			InputStreamReader isr = new InputStreamReader(stderr);
//			BufferedReader br = new BufferedReader(isr);
//			String line = null;
//			StringBuilder errorString = new StringBuilder();
//			while ((line = br.readLine()) != null) {
//				errorString.append("\n" + line);
//
//			}
//
//			int exitValue = process.waitFor();
//
//			if (exitValue != 0) {
//				throw new KiemInitializationException("could not compile",
//						true, new Exception(errorString.toString()));
//			}

		} catch (Exception e) {
			throw new KiemInitializationException(
					"Error compiling S program:\n\n " + e.getMessage() + "\n\n" + compile,
					true, e);
		}
	}

	// -------------------------------------------------------------------------

	@Override
	public JSONObject doProvideInitialVariables()
			throws KiemInitializationException {

		if ((simFile == null) || (!simFile.exists())) {
			throw new KiemInitializationException(
					"Error running S program. Compiled simulation does not exist.\n",
					true, null);
		}

		try {
			// Execute the compiled C program (asynchronously)
			String executablePath = simFile.getPath();
			process = Runtime.getRuntime().exec(executablePath);

			toS = new PrintWriter(new OutputStreamWriter(
					process.getOutputStream()));
			fromS = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			error = new BufferedReader(new InputStreamReader(
					process.getErrorStream()));
		} catch (IOException e) {
			throw new KiemInitializationException(
					"Error running S program:\n\n" + e.getMessage(), true, e);
		}

		// Build the list of interface output signals
		outputSignalList = new LinkedList<String>();
		JSONObject res = new JSONObject();
		try {
			if (myModel != null && myModel.getSignals() != null) {
				for (Signal signal : myModel.getSignals()) {
					if (signal.isIsInput()) {
						res.accumulate(signal.getName(),
								JSONSignalValues.newValue(false));
					}
					if (signal.isIsOutput()) {
						String signalName = signal.getName();
						if (!signalName
								.startsWith(SSimSCPlugin.AUXILIARY_VARIABLE_TAG)) {
							res.accumulate(signalName,
									JSONSignalValues
											.newValue(false));
							outputSignalList.add(signalName);
						}
					}
				}
			}
		} catch (JSONException e) {
			// ignore
		}
		return res;
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

//	/**
//	 * Generate the CSimulationInterface.
//	 * 
//	 * @param esterelProgram
//	 *            the esterel program
//	 * @param esterelProgramURI
//	 *            the esterel program uri
//	 * @return the uRL
//	 * @throws KiemInitializationException
//	 *             the kiem initialization exception
//	 */
//	private URL generateCSimulationInterface(Program esterelProgram,
//			URI esterelProgramURI) throws KiemInitializationException {
//		File data;
//		try {
//			data = File.createTempFile("data", ".c");
//			CSimulationInterfaceGenerator cSimulationInterfaceGenerator = new CSimulationInterfaceGenerator(
//					esterelProgram, esterelProgramURI);
//			cSimulationInterfaceGenerator.execute(data.getPath());
//			return data.toURI().toURL();
//		} catch (IOException e) {
//			throw new KiemInitializationException("Error creating data file",
//					true, e);
//		} catch (ExecutionException e) {
//			throw new KiemInitializationException("Error creating data file",
//					true, e);
//		}
//	}

	// -------------------------------------------------------------------------

}
