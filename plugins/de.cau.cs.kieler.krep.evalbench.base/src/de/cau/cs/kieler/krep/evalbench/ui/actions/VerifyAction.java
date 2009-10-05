package de.cau.cs.kieler.krep.evalbench.ui.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader; //import java.text.ParseException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KasmAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KepAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KlpAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KrepAssembler;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;
import de.cau.cs.kieler.krep.evalbench.ui.VerifyPreferencePage;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;

/**
 * Action that runs the current program. The plugin activator and the common
 * layer are used to access all relevant data.
 * 
 * @author ctr
 */
public class VerifyAction extends Action {

	/** Identifier string for this action */
	private static final String VERIFY_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.verify";

	/** Relative path to the icon to use for this action */
	private static final String ICON_PATH = "icons/run.gif";

	/** The status line manager that can be used to display messages */
	private IStatusLineManager statusLineManager;

	private TableViewer table;

	private LinkedList<String[]> data = new LinkedList<String[]>();

	/**
	 * Creates a new Run Action.
	 * 
	 * @param manager
	 *            status line manager used to display action result
	 * @param table
	 *            table to present the results
	 */
	public VerifyAction(IStatusLineManager manager, TableViewer table) {
		setId(VERIFY_ID);
		setText("R&un");
		setToolTipText("Verify all benchmarks");
		setImageDescriptor(Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, ICON_PATH));
		manager.setCancelEnabled(true);
		this.statusLineManager = manager;
		this.table = table;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		Activator.commonLayer.getTargetInfo();
		Tools.tic();
		final Display display = Display.findDisplay(Thread.currentThread());

		IPreferenceStore preferenceStore = Activator.getDefault()
				.getPreferenceStore();

		File dir = new File(preferenceStore
				.getString(VerifyPreferencePage.BENCHMARK_PATH));

		final boolean ignoreInvalid = preferenceStore
				.getBoolean(VerifyPreferencePage.IGNORE_INVALID);

		data = new LinkedList<String[]>();
		final LinkedList<File> files = new LinkedList<File>();
		for (File f : dir.listFiles()) {
			if (f.isDirectory()
					&& f
							.getName()
							.matches(
									preferenceStore
											.getString(VerifyPreferencePage.BENCHMARK_FILES))) {
				files.add(f);
			}
		}

		Collections.sort(files);

		for (File f : files) {
			String[] s = { f.getName(), "", "", "" };
			data.add(s);
		}

		table.setInput(data.toArray(new String[0][0]));
		// final UIJob job = new UIJob("verify"){
		Tools.runWithProgress(new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) {
				int k = 0;
				monitor.beginTask("Verify", files.size());
				Iterator<File> i = files.iterator();
				Iterator<String[]> j = data.iterator();
				while (i.hasNext() && j.hasNext() && !monitor.isCanceled()) {
					boolean success = false;
					File f = i.next();
					String[] s = j.next();
					try {
						MessageView.print("verify: " + f.getName());
						monitor.subTask(f.getName());
						IAssembler asm = parse(f);

						TraceList traces = new TraceList(asm, f
								.getAbsolutePath()
								+ "/" + f.getName());
						// Execute Trace
						if (traces == null || !traces.hasNext()) {
							s[3] = "no trace found";
						} else {
							Activator.commonLayer.reset();
							Activator.commonLayer.loadProgram(asm, null);

							Activator.commonLayer.reset();

							boolean valid = true;
							while (traces.hasNext() && (valid || ignoreInvalid)) {
								valid = traces.executeStep(statusLineManager);

							}
							success = valid;
							s[2] = traces.getWCRT();

							if (!success) {
								s[3] = "traces differ";
							}
						}

						s[1] = success ? "true" : "false";

						monitor.worked(1);
					} catch (CommunicationException eCom) {
						s[3] = eCom.getMessage();
					} catch (ParseException eParse) {
						s[3] = eParse.getMessage();
					} catch (LoadException eLoad) {
						s[3] = eLoad.getMessage();
					} catch (Exception e) {
						s[3] = e.getMessage();
					} catch (Throwable t) {
						s[3] = t.getMessage();
					}

					display.asyncExec(new Runnable() {
						public void run() {
							if (!table.isBusy()) {
								table.setInput(data.toArray(new String[0][0]));
								table.refresh();
							}
						}
					});
					k++;
				}
				monitor.done();
				IPreferenceStore preferenceStore = Activator.getDefault()
						.getPreferenceStore();

				String logFile = preferenceStore
						.getString(VerifyPreferencePage.VERIFY_LOG);
				if (logFile.length() > 0) {
					BufferedWriter out=null;
					try {
						File f = new File(logFile);
						out = new BufferedWriter(new FileWriter(f));
						out.append("verifcation: " + new Date());
						out.newLine();
						out.append("======================================");
						out.newLine();
						for (String[] ss : data) {
							for (String s : ss) {
								out.append(s + "\t");
							}
							out.newLine();
						}
						out.newLine();
						out.flush();
					} catch (IOException e) {
						MessageView.print("cannot log to file " + logFile);
					} finally {
						if(out!=null){
							try {
								out.close();
							} catch (IOException e) {
								// silently ignore
							}
						}
					}
				}
				MessageView.print("test done:" + Tools.showTime());
				// return Status.OK_STATUS;

			}
		});
	}

	private IAssembler parse(File path) throws ParseException {
		IAssembler res = null;
		File file = null;
		String prefix = path.getAbsolutePath() + File.separator
				+ path.getName();
		try {
			if ((file = new File(prefix + ".lst")).exists()) {
				res = new KasmAssembler();
			} else if ((file = new File(prefix + ".kasm")).exists()) {
				res = new KepAssembler();
			} else if ((file = new File(prefix + ".klp")).exists()) {
				res = new KlpAssembler();
			} else if ((file = new File(prefix + ".krp")).exists()) {
				res = new KrepAssembler();
			} else {
				throw new ParseException("No assembler found in " + path);
			}
			res.assemble(file.getName(), new FileReader(file));
			return res;
		} catch (FileNotFoundException e1) {
			// e1.printStackTrace();
			throw new ParseException(e1.getMessage());
		} catch (ParseException e1) {
			// e1.printStackTrace();
			throw e1;
		}
	}
}
