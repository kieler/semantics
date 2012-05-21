/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */

package de.cau.cs.kieler.sim.kiem.automated.junit;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import de.cau.cs.kieler.sim.kiem.IDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemPlugin;
import de.cau.cs.kieler.sim.kiem.execution.Execution;
import de.cau.cs.kieler.sim.kiem.internal.AbstractDataComponent;
import de.cau.cs.kieler.sim.kiem.internal.DataComponentWrapper;
import de.cau.cs.kieler.sim.kiem.properties.KiemProperty;

/**
 * The class KiemAutomatedJUnit enabled the integration of several KIEM
 * execution runs into a JUNIT plugin test.
 * 
 * The model file extension MUST be passed as -model=kids to let the
 * KiemAutomatedJUnit derive the model file name from the eso file name.
 * 
 * Execution schedules may be passed using the
 * -execution="/project/file.exeution" parameter. Typically all ESO files found
 * in all projects of the selected workspace are run.
 * 
 * If you want to select only some eso files use the
 * -eso={"/project/file1.eso","/project/file2.eso"} parameter to select some.
 * 
 * ATTENTION: Be sure to uncheck the run in UI thread option in the run configuration 
 * of the JUnit test case ([ ] run in UI thread).  
 * 
 * ATTENTION: The Kiem.UI Plugin should not be part of the run configuration because
 * the executions may be too fast done and the Kiem.UI Plugin may get problems handling
 * already closed widgets.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * 
 */
public class KiemAutomatedJUnit {

	/** The Constant EXECUTION_FILE_ARG. */
	static final String EXECUTION_FILE_ARG = "-execution";

	/** The Constant ESO_FILE_ARG. */
	static final String ESO_FILE_ARG = "-eso";

	/** The Constant MODEL_FILE_EXTENSION. */
	static final String MODEL_FILE_EXTENSION = "-model";

	/** The plugin id of the required KART plugin. */
	static final String KART_REPLAY_DATACOMPONENT_ID_START = "de.cau.cs.kieler.sim.kart.replay";

	/** The plugin id of the required KART plugin. */
	static final String KART_VALIDATION_DATACOMPONENT_ID_START = "de.cau.cs.kieler.sim.kart.validation";

	/**
	 * The Constant KART_PROPERTY_ESOFILE - must be equal to the one defined in
	 * sim.kart.Constants!
	 */
	static final String KART_PROPERTY_ESOFILE = "ESI/ESO trace file";

	/**
	 * The Constant KART_PROPERTY_TRACNUMBER - must be equal to the one defined
	 * in sim.kart.Constants!
	 */
	static final String KART_PROPERTY_TRACNUMBER = "Trace number to replay";

	/**
	 * The Constant KART_PROPERTY_ERRORVARIABLE - must be equal to the one
	 * defined in sim.kart.Constants!
	 */
	static final String KART_PROPERTY_ERRORVARIABLE = "Erroneous signals variable";

	/**
	 * The Constant KART_PROPERTY_STOPONSUCCESS - must be equal to the one
	 * defined in sim.kart.Constants!
	 */
	static final String KART_PROPERTY_STOPONSUCCESS = "Stop execution upon end of ESO file";

	/**
	 * The id used to separate traces within eso files is used to count the
	 * number of available traces.
	 */
	static final String ESO_FILE_RESET_TRACE_ID = "! reset;";

	// -------------------------------------------------------------------------

	/** The kiem plugin sigle instance. */
	private KiemPlugin kiemPlugin = null;

	/**
	 * The error signal name to observe the KIEM data pool for potential
	 * execution errors detected by KART. This is configurable in the KART data
	 * component properties and need to be extracted from the execution file.
	 */
	private String errorSignalName = "errorState";

	/** The execution file name. */
	private String executionFile = "automated.execution";

	/** The model file extension. */
	private String modelFileExtension = "kids";

	/** The eso file names. */
	private List<String> esoFiles = new LinkedList<String>();

	/** The current model file path. */
	private IPath modelFilePath;

	// -------------------------------------------------------------------------

	/**
	 * This generic test will look for *.eso files in the current workspace and
	 * run the models using the automated.execution execution scheduling file by
	 * default.
	 * 
	 * Use -execution="/project/file.exeution" to change the default execution
	 * scheduling file. Use -eso={"/project/file1.eso","/project/file2.eso"} to
	 * select some eso files.
	 */
	@Test
	public void KiemAutomatedJUnitTest() {

		// -----------------------------------------------------------------------------------------
		// Inspect program arguments for -execution and -eso parameters
		for (String arg : Platform.getApplicationArgs()) {
			if (arg.startsWith(EXECUTION_FILE_ARG)) {
				executionFile = arg.substring(EXECUTION_FILE_ARG.length() + 1,
						arg.length());
				executionFile = executionFile.replace("\"", "");
			}
			if (arg.startsWith(MODEL_FILE_EXTENSION)) {
				modelFileExtension = arg.substring(
						MODEL_FILE_EXTENSION.length() + 1, arg.length());
				modelFileExtension = modelFileExtension.replace("\"", "");
			}
			if (arg.startsWith(ESO_FILE_ARG)) {
				// if this code is executed twice newer parameters replace older
				// ones
				esoFiles.clear();
				String esoFilesString = arg.substring(
						ESO_FILE_ARG.length() + 1, arg.length());
				esoFilesString = esoFilesString.replace("\"", "");
				esoFilesString = esoFilesString.replace("{", "");
				esoFilesString = esoFilesString.replace("}", "");
				String[] esoFilesArray = esoFilesString.split(",");
				if (esoFilesArray != null && esoFilesArray.length > 0) {
					for (String esoFileString : esoFilesArray) {
						esoFiles.add(esoFileString);
					}
				}

			}
		}

		// -----------------------------------------------------------
		// Set the KIEM plugin
		kiemPlugin = KiemPlugin.getDefault();
		if (kiemPlugin == null) {
			throw new RuntimeException(
					"KIEM Plugin is not loaded. Verify that it is added in the run configuration with all its dependend plugins.");
		}

		// -----------------------------------------------------------------------------------------
		// Figure out execution file path and try to load it with KIEM
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
				.getRoot();
		IPath executionFilePath = new Path(executionFile);
		try {
			kiemPlugin.openFile(executionFilePath, true);
		} catch (IOException e) {
			e.printStackTrace();
			fail("Cannot find execution scheduling file '"
					+ executionFilePath.toString() + "'.");
		}

		// -----------------------------------------------------------------------------------------
		// Figure out ESO files of the all projects in the workspace if no
		// parameter was set
		if (esoFiles.size() == 0) {
			// find ESO files in the workspace
			IProject[] projects = myWorkspaceRoot.getProjects();
			for (IProject project : projects) {
				try {
					IResource[] resources = project.members();
					for (IResource resource : resources) {
						if (resource.getFileExtension().equalsIgnoreCase("eso")) {
							esoFiles.add(resource.getFullPath().toString());
						}
					}
				} catch (CoreException e) {
					// ignore
				}
			}
		}

		// -----------------------------------------------------------------------------------------
		// Initialize the KART data component properties
		DataComponentWrapper kartReplay = getKartReplayComponent();
		DataComponentWrapper kartValidation = getKartValidationComponent();
		KiemProperty fileProperty = getProperty(KART_PROPERTY_ESOFILE,
				kartReplay);
		KiemProperty traceProperty = getProperty(KART_PROPERTY_TRACNUMBER,
				kartReplay);
		KiemProperty errorProperty = getProperty(KART_PROPERTY_ERRORVARIABLE,
				kartValidation);
		KiemProperty stopProperty = getProperty(KART_PROPERTY_STOPONSUCCESS,
				kartReplay);
		stopProperty.setValue("true"); // stop execution after eso file is done
		errorSignalName = errorProperty.getValue(); // extract the corrct error
													// signal name to look for

		// -----------------------------------------------------------------------------------------
		// For all ESO files grab the number of executions (separated by
		// reset!), set the
		// validation KART component and play the execution until stop.
		// Continuously monitor the
		// the KART variable/signal for errors and declare success if this stays
		// empty. Otherwise
		// raise a JUNIT error and abort the testing

		boolean errorFlag = false;
		String errorInformation = "";

		for (String esoFileString : esoFiles) {
			IPath esoFilePath = new Path(esoFileString);
			IFile esoFile = myWorkspaceRoot.getFile(esoFilePath);
			String esoFileAbsolute = getAbsoluteFilePath(esoFile);

			// set the correct eso file
			fileProperty.setValue(esoFileAbsolute);

			// open the according model file
			modelFilePath = esoFilePath.removeFileExtension().addFileExtension(
					modelFileExtension);
			openModelFile(modelFilePath);


			System.out.println("Model File" + modelFilePath.toString());

			int numberOfTraces = getNumberOfTraces(esoFileAbsolute);
			System.out.println("NUMBER OF TRACES " + numberOfTraces);

			for (int traceNumber = 0; traceNumber < numberOfTraces; traceNumber++) {
				System.out.println("traceNumber" + traceNumber);

				// set the current trace number
				traceProperty.setValue(traceNumber + "");
				// now run the execution stepwise until it has stopped

				if (kiemPlugin.initExecution()) {

					Execution execution = kiemPlugin.getExecution();
					if (execution == null) {
						throw new RuntimeException(
								"KIEM cannot start execution. Try to do this manually for the following scheduling file:'"
										+ executionFile + "'.");
					}
					// at this point we know that the execution is not null
					while (execution.isRunning() && !errorFlag) {
						// remember the pool counter number
						long poolCounter = execution.getDataPool()
								.getPoolCounter();
						execution.stepExecutionSync();
						// wait until step is done
						while (!execution.isPaused()) {
							try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
								// ignore sleeping errors
							}
						}
						// now inspect the data pool
						try {
							JSONObject jSONData = execution.getDataPool()
									.getData(null, poolCounter);
							if (jSONData != null) {
								if (jSONData.has(errorSignalName)) {
									Object errorContent = jSONData
											.get(errorSignalName);
									if (errorContent instanceof String) {
										if (!((String) errorContent).equals("")) {
											// !!! ERRROR DETECTED !!! //
											errorFlag = true;
											errorInformation = "Error in trace number "
													+ traceNumber
													+ " of ESO file '"
													+ esoFileString
													+ "' during execution '"
													+ executionFile + "'.";
											break;
										}
									}
								}
							}
						} catch (JSONException e) {
							e.printStackTrace();
						}

					} // while executing
				} // init execution

				// if an error occurred, do not proceed with the next trace!
				if (errorFlag) {
					break;
				}
			} // next trace

			// if an error occurred, do not proceed with the next eso file!
			if (errorFlag) {
				break;
			}
		} // next eso file

		// -----------------------------------------------------------------------------------------
		// if an error occurred than print it out
		if (errorFlag) {
			fail(errorInformation);
		}

	}

	// -------------------------------------------------------------------------

	void initExecution() {
		(new Thread(new Runnable() {
			public void run() {
				// otherwise default implementation
				if (kiemPlugin.getExecution() == null) {
					if (kiemPlugin.initExecution()) {
//						// per default make a pause as a first step
						kiemPlugin.getExecution().pauseExecutionSync();
					}
				}
			}
		})).start();
	}

	// -------------------------------------------------------------------------

	/**
	 * Open model file.
	 * 
	 * @param modelFilePath
	 *            the model file path
	 */
	void openModelFile(IPath modelFilePath2) {
		this.modelFilePath = modelFilePath2;
		
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
        		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace()
        				.getRoot();

        		IWorkbenchWindow win = PlatformUI.getWorkbench()
        				.getActiveWorkbenchWindow();
        		IWorkbenchPage page = win.getActivePage();

        		IFile modelFile = myWorkspaceRoot.getFile(modelFilePath);

        		IEditorDescriptor defaultEditor = PlatformUI.getWorkbench()
        				.getEditorRegistry().getDefaultEditor(modelFile.getName());

        		if (defaultEditor == null) {
        			defaultEditor = PlatformUI.getWorkbench().getEditorRegistry()
        					.findEditor(IEditorRegistry.SYSTEM_EXTERNAL_EDITOR_ID);
        		}
        		try {
        			page.openEditor(new FileEditorInput(modelFile),
        					defaultEditor.getId());
        		} catch (PartInitException e) {

        		}
            }
        });

	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the number of traces.
	 * 
	 * @param esoFileAbsolute
	 *            the eso file absolute
	 * @return the number of traces
	 */
	int getNumberOfTraces(String esoFileAbsolute) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(esoFileAbsolute);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line;
			int number = 0;
			while ((line = br.readLine()) != null) {
				if (line.contains(ESO_FILE_RESET_TRACE_ID)) {
					number++;
				}
			}
			br.close();
			fis.close();
			return number;
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Cannot load ESO file '"
					+ esoFileAbsolute
					+ "' in order to count the maximum number of traces.");
		} catch (IOException e) {
			throw new RuntimeException("Cannot load ESO file '"
					+ esoFileAbsolute
					+ "' in order to count the maximum number of traces.");
		}
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the property.
	 * 
	 * @param propertyKey
	 *            the property key
	 * @param dataComponentWrapper
	 *            the data component wrapper
	 * @return the property
	 */
	KiemProperty getProperty(String propertyKey,
			DataComponentWrapper dataComponentWrapper) {
		KiemProperty[] kiemProperties = dataComponentWrapper.getProperties();
		for (KiemProperty kiemProperty : kiemProperties) {
			if (kiemProperty.getKey().equals(propertyKey)) {
				return kiemProperty;
			}
		}
		throw new RuntimeException(
				"This is most likely a KIELER internal programming error. KART Property ("
						+ propertyKey
						+ ") was not found. Maybe the property name has changed in the KART plugin? This is name binded and must be consistent.");
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the KART Replay component.
	 * 
	 * @return the KART Replay component
	 */
	DataComponentWrapper getKartReplayComponent() {
		List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
				.getDataComponentWrapperList();
		for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
			String dataComponentId = dataComponentWrapper.getDataComponent()
					.getDataComponentId();
			if (dataComponentId.startsWith(KART_REPLAY_DATACOMPONENT_ID_START)) {
				return dataComponentWrapper;
			}
		}
		throw new RuntimeException(
				"KART DataComponent ("
						+ KART_REPLAY_DATACOMPONENT_ID_START
						+ ") was not loaded. The KART Plugin must be added to the run configuration together with all dependend plugins.");
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the KART Validation component.
	 * 
	 * @return the KART Validation component
	 */
	DataComponentWrapper getKartValidationComponent() {
		List<DataComponentWrapper> dataComponentWrapperList = kiemPlugin
				.getDataComponentWrapperList();
		for (DataComponentWrapper dataComponentWrapper : dataComponentWrapperList) {
			String dataComponentId = dataComponentWrapper.getDataComponent()
					.getDataComponentId();
			if (dataComponentId
					.startsWith(KART_VALIDATION_DATACOMPONENT_ID_START)) {
				return dataComponentWrapper;
			}
		}
		throw new RuntimeException(
				"KART DataComponent ("
						+ KART_VALIDATION_DATACOMPONENT_ID_START
						+ ") was not loaded. The KART Plugin must be added to the run configuration together with all dependend plugins.");
	}

	// -------------------------------------------------------------------------

	/**
	 * Gets the absolute file path.
	 * 
	 * @param file
	 *            the file
	 * @return the absolute file path
	 */
	String getAbsoluteFilePath(IFile file) {
		IPath fullPath = file.getLocation();
		// If we have spaces, try it like this...
		if (fullPath == null
				&& file instanceof org.eclipse.core.internal.resources.Resource) {
			org.eclipse.core.internal.resources.Resource resource = (org.eclipse.core.internal.resources.Resource) file;
			fullPath = resource.getLocalManager().locationFor(resource);
		}
		// Ensure it is absolute
		fullPath.makeAbsolute();
		java.io.File javaFile = new File(fullPath.toString().replaceAll("%20",
				" "));
		if (javaFile.exists()) {
			String fileString = javaFile.getAbsolutePath();
			return fileString;
		}
		// Something went wrong, we could not resolve the file location
		return null;
	}

}
