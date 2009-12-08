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
 */
package de.cau.cs.kieler.krep.evalbench.ui.actions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.exceptions.ParseException;
import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KasmAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KepAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KlpAssembler;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;
import de.cau.cs.kieler.krep.evalbench.ui.VerifyPreferencePage;

/**
 * Action that runs the current program. The plugin activator and the common layer are used to
 * access all relevant data.
 * 
 * @author ctr
 */
public class VerifyAction extends Action {

    /** Identifier string for this action. */
    private static final String VERIFY_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.verify";

    /** Relative path to the icon to use for this action. */
    private static final String ICON_PATH = "icons/run.gif";

    /** The status line manager that can be used to display messages. */
    private IStatusLineManager statusLineManager;

    private TableViewer table;

    private LinkedList<String[]> data = new LinkedList<String[]>();

    /**
     * Creates a new Run Action.
     * 
     * @param manager
     *            status line manager used to display action result
     * @param tTable
     *            table to present the results
     */
    public VerifyAction(final IStatusLineManager manager, final TableViewer tTable) {
        setId(VERIFY_ID);
        setText("R&un");
        setToolTipText("Verify all benchmarks");
        setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, ICON_PATH));
        manager.setCancelEnabled(true);
        this.statusLineManager = manager;
        this.table = tTable;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.action.Action#run()
     */
    @Override
    public void run() {
        // Activator.getDefault().commonLayer.getTargetInfo();
        Tools.tic();
        final Display display = Display.findDisplay(Thread.currentThread());

        IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();

        File dir = new File(preferenceStore.getString(VerifyPreferencePage.BENCHMARK_PATH));

        // File dir = new File("/home/ctr/code/benchmarks_wcrt");

        final boolean ignoreInvalid = preferenceStore
                .getBoolean(VerifyPreferencePage.IGNORE_INVALID);

        data = new LinkedList<String[]>();
        final LinkedList<File> files = new LinkedList<File>();

        for (File f : dir.listFiles()) {
            if (f.isDirectory()
                    && f.getName().matches(
                            preferenceStore.getString(VerifyPreferencePage.BENCHMARK_FILES))) {
                files.add(f);
            }
        }

        Collections.sort(files);

        for (File f : files) {
            String[] s = { f.getName(), "", "", "" };
            data.add(s);
        }

        table.setInput(data.toArray(new String[0][0]));
        Tools.runWithProgress(new IRunnableWithProgress() {
            public void run(final IProgressMonitor monitor) {
                final int rowWCRT = 2;
                final int rowComment = 3;
                int k = 0;
                monitor.beginTask("Verify", files.size());
                Iterator<File> i = files.iterator();
                Iterator<String[]> j = data.iterator();
                while (i.hasNext() && j.hasNext() && !monitor.isCanceled()) {
                    boolean success = false;
                    File f = i.next();
                    String[] s = j.next();
                    try {
                        // MessageView.print("verify: " + f.getName());
                        monitor.subTask(f.getName());
                        IAssembler asm = parse(f);

                        TraceList traces = new TraceList(asm, f.getAbsolutePath() + "/"
                                + f.getName());
                        // Execute Trace
                        if (traces == null || !traces.hasNext()) {
                            s[rowComment] = "no trace found";
                        } else {
                            Activator.getDefault().commonLayer.connect();
                            // Activator.getDefault().commonLayer.connect(CommonLayer.JNI_CON,
                            // ICommunicationProtocol.P_KEP, "", "", 0);

                            Activator.getDefault().commonLayer.reset();
                            Activator.getDefault().commonLayer.loadProgram(asm, null);

                            Activator.getDefault().commonLayer.reset();

                            boolean valid = true;
                            while (traces.hasNext() && (valid || ignoreInvalid)) {
                                valid = traces.executeStep(statusLineManager);

                            }
                            success = valid;
                            s[rowWCRT] = traces.getWCRT();

                            if (!success) {
                                s[rowComment] = "traces differ";
                            }
                        }

                        s[1] = success ? "true" : "false";

                        monitor.worked(1);
                    } catch (CommunicationException eCom) {
                        s[rowComment] = eCom.getMessage();
                    } catch (ParseException eParse) {
                        s[rowComment] = eParse.getMessage();
                    } catch (LoadException eLoad) {
                        s[rowComment] = eLoad.getMessage();
                    } catch (Exception e) {
                        s[rowComment] = e.getMessage();
                    } catch (Throwable t) {
                        s[rowComment] = t.getMessage();
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
                IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();

                String logFile = preferenceStore.getString(VerifyPreferencePage.VERIFY_LOG);
                if (logFile.length() > 0) {
                    BufferedWriter out = null;
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
                        Status myStatus = new Status(IStatus.WARNING, Activator.PLUGIN_ID,
                                "Cannot write verify results to Log-File", e);
                        StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                    } finally {
                        if (out != null) {
                            try {
                                out.close();
                            } catch (IOException e) {
                                Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                                        "Cannot write verify results to Log-File", e);
                                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                            }
                        }
                    }
                }
                Status myStatus = new Status(IStatus.INFO, Activator.PLUGIN_ID,
                        "Verification done: " + Tools.showTime(), null);
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
            }
        });
    }

    private IAssembler parse(final File path) throws ParseException {
        IAssembler res = null;
        File file = null;
        String prefix = path.getAbsolutePath() + File.separator + path.getName();
        try {
            file = new File(prefix + ".lst");
            if (file.exists()) {
                res = new KasmAssembler();
            } else {
                file = new File(prefix + ".kasm");
                if (file.exists()) {
                    res = new KepAssembler();
                } else if (new File(prefix + ".klp").exists()) {
                    file = new File(prefix + ".klp");
                    res = new KlpAssembler();
                } else {
                    throw new ParseException("No assembler found in " + path);
                }
            }
            res.assemble(file.getName(), new FileInputStream(file));
            return res;
        } catch (FileNotFoundException e1) {
            // e1.printStackTrace();
            throw new ParseException(e1.getMessage());
        }
    }
}
