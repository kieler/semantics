/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 *
 *****************************************************************************/
package de.cau.cs.kieler.sc;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.Random;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

/**
 * This class is intended to compile and execute SC code.
 * 
 * @author cmot
 * 
 */
public class SCExecution {

	private Process executionProcess = null;
	private PrintWriter executionInterfaceToSC;
	private BufferedReader executionInterfaceFromSC;
	private BufferedReader executionInterfaceError;

	private String compileError;
	private String outputPath;

	private boolean compiled;
	private boolean started;

	private String compiler;
	private String executableName;

	// -------------------------------------------------------------------------

	/**
	 * Instantiates a new SCExecution with a random outputPath.
	 * @throws IOException 
	 */
	public SCExecution() throws IOException {
		setCompiled(false);
		setStarted(false);
		setOutputPath(SCExecution.generateRandomTempOutputFolder());
	}
	
	/**
	 * Instantiates a new SCExecution with a concrete outputPath.
	 */
	public SCExecution(String outputPath) {
		setCompiled(false);
		setStarted(false);
		setOutputPath(outputPath);
	}	

	// -------------------------------------------------------------------------
	// -------------------------------------------------------------------------

	/**
	 * 
	 * Compile the filePaths SC files together with the bundled SC core files
	 * within the given outputPath folder. The executable will be randomly
	 * named and can later be started after a successful compilation.
	 * 
	 * {@inheritDoc}
	 */
	public void compile(List<String> filePaths) throws IOException,
			InterruptedException {
		// reset successful compiled flag
		setCompiled(false);
		// choose a random name for the compiled executable
		executableName = SCExecution.randomString();

		// building path to bundle
		Bundle bundle = Platform
				.getBundle("de.cau.cs.kieler.synccharts.codegen.sc");

		URL url = null;
		try {
			// the SC path is the path to the needed SC c files
			url = FileLocator.toFileURL(FileLocator.find(bundle,
					new Path("sc"), null));
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		String bundleLocation = url.getFile();

		// Windows vs. Linux: Exchange possibly wrong slash/backslash
		bundleLocation = bundleLocation.replaceAll("[/\\\\]+", "\\"
				+ File.separator);
		if (bundleLocation.startsWith("\\")) {
			bundleLocation = bundleLocation.substring(1);
		}
		for (String filePath : filePaths) {
			filePath = filePath.replaceAll("[/\\\\]+", "\\" + File.separator);
			if (filePath.startsWith("\\")) {
				filePath = filePath.substring(1);
			}
		}

		try {
			String compile = compiler;

			for (String filePath : filePaths) {
				compile = compile + " " + filePath;
			}

			compile += " "
					// + outPath
					// + "sim.c "
					// + outPath
					// + "sim_data.c "
					// + outPath
					// + "misc.c "
					+ bundleLocation
					+ "sc.c "
					+ bundleLocation
					+ "cJSON.c "
					+ "-I "
					+ bundleLocation
					+ " "
					+ "-o "
					+ outputPath
					+ executableName
					// -m32 = 32 bit compatibility mode to prevent compiler errors on
					// 64bit machines/architectures.
					+ " -lm -D_SC_NOTRACE -D_SC_SUPPRESS_ERROR_DETECT -D_SC_USE_PRE -m32";
			executionProcess = Runtime.getRuntime().exec(compile);
			System.out.println(compile);

			InputStream stderr = executionProcess.getErrorStream();
			InputStreamReader isr = new InputStreamReader(stderr);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			setCompileError("");
			while ((line = br.readLine()) != null) {
				setCompileError(getCompileError() + "\n" + line);
			}

			// TODO: -D_SC_SUPPRESS_ERROR_DETECT: error messages detecting
			// (use own buffer)
			int exitValue = executionProcess.waitFor();

			if (exitValue != 0) {
				throw new IOException(
						"Could not compile the generated SC code.\n\nCheck that the path to your Workspace/Eclipse installation does not contain any white spaces.\n");
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
			if (executionProcess != null) {
				executionProcess.destroy();
			}
			throw e;

		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
			if (executionProcess != null) {
				executionProcess.destroy();
			}
			throw e;
		}

		// set successful compiled flag
		setCompiled(true);
	}

	// -------------------------------------------------------------------------

	/**
	 * Start execution and start the execution process.
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void startExecution() throws IOException {
		// reset successful started flag
		setStarted(false);

		// if the sc code was not successfully compiled yet, do not try to
		// execute it
		if (!compiled) {
			throw new IOException("SC code was not compiled yet.");
		}

		// start compiled sc code
		String executable = outputPath + executableName + " ";
		executionProcess = Runtime.getRuntime().exec(executable);

		setExecutionInterfaceToSC(new PrintWriter(new OutputStreamWriter(
				executionProcess.getOutputStream())));
		setExecutionInterfaceFromSC(new BufferedReader(new InputStreamReader(
				executionProcess.getInputStream())));
		setExecutionInterfaceError(new BufferedReader(new InputStreamReader(
				executionProcess.getErrorStream())));

		// set successful started flag
		setStarted(true);
	}

	// -------------------------------------------------------------------------

	/**
	 * Stop execution and destroy the execution process.
	 */
	public void stopExecution() {
		// reset successful started flag
		setStarted(false);

		// close streams
		getExecutionInterfaceToSC().close();
		try {
			getExecutionInterfaceFromSC().close();
		} catch (IOException e) {
			// ignore errors
		}
		try {
			getExecutionInterfaceError().close();
		} catch (IOException e) {
			// ignore errors
		}

		// destroy process
		executionProcess.destroy();

		// delete temp folder
		File folder = new File(outputPath);
		if (folder.getAbsolutePath().contains(
				System.getProperty("java.io.tmpdir"))) {
			boolean folderDeleted = deleteFolder(folder);
			if (folderDeleted) {
				System.out.println("temp folder " + folder
						+ " successfully deleted");
			} else {
				System.err.println("error while deleting temp folder: "
						+ folder);
			}
		}
	}

	// -------------------------------------------------------------------------

	/**
	 * Generate a random temporary output folder in the java tempdir directory.
	 * 
	 * @return the string
	 * @throws IOException 
	 */
	public static String generateRandomTempOutputFolder() throws IOException {
		String folderName = System.getProperty("java.io.tmpdir") + SCExecution.randomString() + File.separator;
		File folder = new File(folderName);
		if (folder.createNewFile()) {
			return (folderName);
		}
		throw new IOException("Could not create folder '"+folderName+"'.");
	}

	// -------------------------------------------------------------------------

	/**
	 * Create random string of 16 letters/numbers.
	 * 
	 * @return the string
	 */
	private static String randomString() {
		final int folderLength = 16;
		String allowedChars = "0123456789abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		int max = allowedChars.length();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < folderLength; i++) {
			int value = random.nextInt(max);
			buffer.append(allowedChars.charAt(value));
		}
		return buffer.toString();
	}

	// -------------------------------------------------------------------------

	/**
	 * Delete folder.
	 * 
	 * @param directory
	 *            the directory to be deleted
	 * @return true, if successful
	 */
	private boolean deleteFolder(final File directory) {
		if (directory.isDirectory()) {
			String[] entries = directory.list();
			for (int x = 0; x < entries.length; x++) {
				File aktFile = new File(directory.getPath(), entries[x]);
				deleteFolder(aktFile);
			}
		}
		return directory.delete();
	}

	// -------------------------------------------------------------------------
	// -------------------------------------------------------------------------

	public String getExecutableName() {
		return executableName;
	}

	public String getCompiler() {
		return compiler;
	}

	public void setCompiler(String compiler) {
		this.compiler = compiler;
	}

	public String getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public PrintWriter getExecutionInterfaceToSC() {
		return executionInterfaceToSC;
	}

	private void setExecutionInterfaceToSC(PrintWriter toSC) {
		this.executionInterfaceToSC = toSC;
	}

	public BufferedReader getExecutionInterfaceFromSC() {
		return executionInterfaceFromSC;
	}

	private void setExecutionInterfaceFromSC(BufferedReader fromSC) {
		this.executionInterfaceFromSC = fromSC;
	}

	public BufferedReader getExecutionInterfaceError() {
		return executionInterfaceError;
	}

	private void setExecutionInterfaceError(BufferedReader error) {
		this.executionInterfaceError = error;
	}

	public String getCompileError() {
		return compileError;
	}

	private void setCompileError(String compileError) {
		this.compileError = compileError;
	}

	public boolean isStarted() {
		return started;
	}

	private void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isCompiled() {
		return started;
	}

	private void setCompiled(boolean compiled) {
		this.compiled = compiled;
	}

	// -------------------------------------------------------------------------
	// -------------------------------------------------------------------------

}
