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
import java.lang.reflect.InvocationTargetException;
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
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.krep.evalbench.ui.Activator;
import de.cau.cs.kieler.krep.evalbench.ui.EvalBenchPreferencePage;
import de.cau.cs.kieler.krep.evalbench.ui.views.ConnectionView;
import de.cau.cs.kieler.krep.evalbench.comm.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.comm.ICommunicationProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.JNIConnection;
import de.cau.cs.kieler.krep.evalbench.comm.KepProtocol;
import de.cau.cs.kieler.krep.evalbench.comm.KlpProtocol;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.program.LstAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KepAssembler;
import de.cau.cs.kieler.krep.evalbench.program.KlpAssembler;
import de.cau.cs.kieler.krep.evalbench.program.ParseException;
import de.cau.cs.kieler.krep.evalbench.trace.TraceList;

/**
 * Action that runs the current program. The plugin activator and the common layer are used to
 * access all relevant data. This action is obsolete as soon as the execution manager has a feature
 * for automatic validation.
 * 
 * @author ctr
 * 
 * @kieler.rating 2010-02-01 proposed yellow ctr
 */
public class VerifyAction extends Action {

    /** Identifier string for this action. */
    private static final String VERIFY_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.verify"; // TODO rename

    /** Relative path to the icon to use for this action. */
    private static final String ICON_PATH = "icons/run.gif";

    private TableViewer table;

    private static final int ROW_STATUS = 1;
    private static final int ROW_RT = 2;
    private static final int ROW_WCRT = 3;
    private static final int ROW_TICKS = 4;
    private static final int ROM_COMMENT = 5;

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
        // this.statusLineManager = manager;
        this.table = tTable;
    }

    /**
     * Runs a runnable with progress in the UI Thread of the active workbench window.
     * 
     * @param runnable
     *            runnable to run
     */
    private static void runWithProgress(final IRunnableWithProgress runnable) {
        try {
            // IRunnableContext context =
            PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            // TODO check for null pointer, improve exception handling
            PlatformUI.getWorkbench().getProgressService().run(true, true, runnable);
        } catch (InvocationTargetException e) {
            // silently ignore exception
            return;
        } catch (InterruptedException e) {
            // silently ignore exception
            return;
        }
    }

    @Override
    public void run() {
        // Tools.tic();
        final Display display = Display.getDefault();

        IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();

        File dir = new File(preferenceStore.getString(EvalBenchPreferencePage.BENCHMARK_PATH));

        final boolean ignoreInvalid = preferenceStore
                .getBoolean(EvalBenchPreferencePage.IGNORE_INVALID);
        final String logFile = preferenceStore.getString(EvalBenchPreferencePage.VERIFY_LOG);
        final String protocol = preferenceStore.getString(EvalBenchPreferencePage.PROTOCOL_TYPE);
        final String regExpr = preferenceStore.getString(EvalBenchPreferencePage.BENCHMARK_FILES);

        data = new LinkedList<String[]>();
        final LinkedList<File> files = new LinkedList<File>();

        if (dir != null) {
            for (File f : dir.listFiles()) {
                if (f.isDirectory() && f.getName().matches(regExpr)) {
                    files.add(f);
                }
            }
        }

        Collections.sort(files);

        for (File f : files) {
            String[] s = { f.getName(), "", "", "", "", "" };
            data.add(s);
        }

        final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage();
        ConnectionView c;
        try {
            c = (ConnectionView) (page.showView(ConnectionView.VIEW_ID, null,
                    IWorkbenchPage.VIEW_VISIBLE));
        } catch (PartInitException e1) {
            c = null;
        }
        final ConnectionView krepView = c;

        table.setInput(data.toArray(new String[0][0]));
        runWithProgress(new IRunnableWithProgress() {
            public void run(final IProgressMonitor monitor) {
                int k = 0;
                monitor.beginTask("Verify", files.size());

                Iterator<File> i = files.iterator();
                Iterator<String[]> j = data.iterator();
                while (i.hasNext() && j.hasNext() && !monitor.isCanceled()) {
                    boolean success = false;
                    File f = i.next();
                    String[] s = j.next();
                    try {
                        monitor.subTask(f.getName());
                        IAssembler asm = parse(f);

                        TraceList traces = new TraceList(asm, f.getAbsolutePath() + "/"
                                + f.getName());
                        // Execute Trace
                        if (traces == null || !traces.hasNext()) {
                            s[ROM_COMMENT] = "no trace found";
                        } else {

                            ICommunicationProtocol krep;
                            if (protocol.equals(ICommunicationProtocol.P_KEP)) {
                                krep = new KepProtocol(new JNIConnection(protocol, logFile));
                            } else {
                                krep = new KlpProtocol(new JNIConnection(protocol, logFile));
                            }
                            if (krepView != null) {
                                krep.addCommunicationListener(krepView);
                            }
                            krep.reset();
                            krep.loadProgram(asm, null);
                            krep.reset();

                            boolean valid = true;
                            int steps = 0;
                            while (traces.hasNext() && (valid || ignoreInvalid)
                                    && !monitor.isCanceled()) {
                                valid = traces.executeStep(krep);
                                steps++;
                            }
                            if (monitor.isCanceled()) {
                                s[ROM_COMMENT] = "canceled";
                            }
                            success = valid;
                            s[ROW_RT] = traces.getWCRT();
                            s[ROW_WCRT] = String.valueOf(asm.getTickLen());
                            s[ROW_TICKS] = String.valueOf(steps);
                            if (!success) {
                                s[ROM_COMMENT] = "traces differ (" + (steps - 1) + ")";
                            }
                        }

                        s[ROW_STATUS] = success ? "true" : "false";

                        monitor.worked(1);
                    } catch (CommunicationException eCom) {
                        s[ROM_COMMENT] = eCom.getMessage();
                    } catch (ParseException eParse) {
                        s[ROM_COMMENT] = eParse.getMessage();
                        // } catch (LoadException eLoad) {
                        // s[rowComment] = eLoad.getMessage();
                    } catch (Exception e) {
                        s[ROM_COMMENT] = e.getMessage();
                    } catch (Throwable t) {
                        s[ROM_COMMENT] = t.getMessage();
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

                String verifyLog = preferenceStore.getString(EvalBenchPreferencePage.VERIFY_LOG);

                if (verifyLog.length() > 0) {
                    BufferedWriter out = null;
                    try {
                        File f = new File(verifyLog);
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
            }
        });
    }

    /**
     * TODO comment.
     * 
     * @param path
     * @return
     * @throws ParseException
     */
    private IAssembler parse(final File path) throws ParseException {
        IAssembler res = null;
        File file = null;
        String prefix = path.getAbsolutePath() + File.separator + path.getName();
        try {
            file = new File(prefix + ".lst");
            if (file.exists()) {
                res = new LstAssembler();
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
            throw new ParseException(e1.getMessage());
        }
    }
}
