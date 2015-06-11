package de.cau.cs.kieler.esterel.esterelv5_100;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.cau.cs.kieler.sim.kiem.util.KiemUtil;

public class Esterelv5_100 {

	private Esterelv5_100() {

	}

	public enum MODULE {
		STRLIC("strlic"), ICLC("iclc"), LCSC("lcsc"), SCOC("scoc"), SCC("scc"), OCC(
				"occ"), SCSSC("scssc"), SSCC("sscc");

		private String cmd;

		private MODULE(final String c) {
			this.cmd = c;
		}

		public String toString() {
			return cmd;
		}
	}

	/** The Constant INIT_TIME. */
	private static final int INIT_TIME = 10000;

	/** The Constant TIMEOUT. */
	private static final int TIMEOUT = 200;

	/** The Constant STEP_TIME. */
	private static final int STEP_TIME = 50;

	private static URL resolveBundleOrWorkspaceFile(final String file,
			final String pluginId) {
		// if the bundle is not ready then there is no image
		final Bundle bundle = Platform.getBundle(pluginId);

		System.out.println("Bundle:" + bundle.getBundleId() + "///"
				+ bundle.getSymbolicName());

		// first try to resolve bundle files (give preference to bundle files)
		URL fileURL = org.eclipse.core.runtime.FileLocator.find(bundle,
				new Path(file), null);

		if (fileURL == null) {
			System.out.println("fileURL: NULL");
		} else {
			System.out.println("fileURL:" + fileURL.toString());
		}

		return fileURL;
	}

	private static String resolveFragmentModule(final MODULE module) {
		try {
			// first try the non-windows case
			URL resolvedFileName = resolveBundleOrWorkspaceFile("" + module,
					"de.cau.cs.kieler.esterel.esterelv5_100");

			if (resolvedFileName != null) {
				resolvedFileName = KiemUtil
						.getAbsoluteBundlePath(resolvedFileName);
			}
			if (resolvedFileName != null) {
				String resolvedModuleExecutable = KiemUtil
						.getAbsoluteFilePath(resolvedFileName);
				// Set MODULE executable if can not execute
				// *************************************************************************************
				File execFile = new File(FileLocator.resolve(resolvedFileName)
						.getFile());
				if (!execFile.canExecute()) {
					boolean success = execFile.setExecutable(true);
					if (!success) {
						try {
							throw new Exception(
									"Failed to set executable permission for "
											+ execFile.getPath());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				// *************************************************************************************
				return resolvedModuleExecutable;
			}
			// } catch (URISyntaxException e) {
			// throw new
			// RuntimeException("Cannot resolve executable of CEC module '" +
			// module +
			// "'",
			// e);
		} catch (MalformedURLException e) {
			throw new RuntimeException(
					"Cannot resolve executable of Esterelv5_100 module '"
							+ module + "'", e);
		} catch (IOException e) {
			throw new RuntimeException(
					"Cannot resolve executable of Esterelv5_100 module '"
							+ module + "'", e);
		}
		throw new RuntimeException(
				"Cannot resolve executable of Esterelv5_100 module '" + module
						+ "'");
	}

	public static InputStream exec(final MODULE module, final InputStream input)
			throws IOException {

		String cmd = resolveFragmentModule(module);

		System.out.println(cmd);

		return EsterelExec.exec(cmd, input, INIT_TIME, TIMEOUT, STEP_TIME);
	}

	public static InputStream runSTRL(final URI strlFile)
			throws FileNotFoundException {
		System.out.println("STRL at work");
		return new FileInputStream(strlFile.getPath());
	}

	public static InputStream runSTRLIC(final InputStream strl)
			throws IOException {
		System.out.println("STRLIC at work");
		return exec(MODULE.STRLIC, strl);
	}

	public static InputStream runICLC(final InputStream ic) throws IOException {
		System.out.println("ICLC at work");
		return exec(MODULE.ICLC, ic);
	}

	public static InputStream runLCSC(final InputStream lc) throws IOException {
		System.out.println("LCSC at work");
		return exec(MODULE.LCSC, lc);
	}

	public static InputStream runSCOC(final InputStream sc) throws IOException {
		System.out.println("SCOC at work");
		return exec(MODULE.SCOC, sc);
	}

	public static InputStream runSCC(final InputStream sc) throws IOException {
		System.out.println("SCC at work");
		return exec(MODULE.SCC, sc);
	}

	public static InputStream runOCC(final InputStream oc) throws IOException {
		System.out.println("OCC at work");
		return exec(MODULE.OCC, oc);
	}

	public static InputStream runSCSSC(final InputStream sc) throws IOException {
		System.out.println("SCSSC at work");
		return exec(MODULE.SCSSC, sc);
	}

	public static InputStream runSSCC(final InputStream ssc) throws IOException {
		System.out.println("SSCC at work");
		return exec(MODULE.SSCC, ssc);
	}

	public static URI runCODEGEN(final InputStream c, final File outFile)
			throws IOException {
		FileWriter out = new FileWriter(outFile);
		try {
			while (c.available() > 0) {
				out.append(new String(Character.toChars(c.read())));
			}
			out.flush();
		} finally {
			out.close();
		}
		return outFile.toURI();
	}

	public static URI run(final URI strlFile, final File outFile)
			throws IOException {
		InputStream strl = Esterelv5_100.runSTRL(strlFile);
		InputStream ic = Esterelv5_100.runSTRLIC(strl);
		InputStream lc = Esterelv5_100.runICLC(ic);
		InputStream sc = Esterelv5_100.runLCSC(lc);
		// InputStream oc = Esterelv5_100.runSCOC(sc);
		// InputStream c = Esterelv5_100.runOCC(oc);
		InputStream ssc = Esterelv5_100.runSCSSC(sc);
		InputStream c = Esterelv5_100.runSSCC(ssc);
		return runCODEGEN(c, outFile);
	}

	public static File getDefaultOutFile() throws IOException {
		File outFile = File.createTempFile("strl", ".c");
		return outFile;
	}

	public static URI run(final URI strlFile) throws IOException {
		return run(strlFile, getDefaultOutFile());
	}
}
