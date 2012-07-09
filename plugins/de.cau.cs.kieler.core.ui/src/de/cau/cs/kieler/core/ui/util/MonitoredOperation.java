/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.ui.util;

import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.ui.CoreUIPlugin;
import de.cau.cs.kieler.core.util.Maybe;

/**
 * An operation that can be tracked with a progress bar. This operation can be called
 * from any thread, UI or non-UI, and adds only very little overhead for progress
 * tracking compared to the usual synchronous tracking of the workbench progress service.
 * Just implement {@link #execute(IProgressMonitor)} and call {@link #runMonitored()}.
 *
 * @kieler.rating 2010-01-14 proposed yellow msp
 * @author msp
 */
public abstract class MonitoredOperation {

    /** Wrapper class for progress monitors. */
    private static class ProgressMonitorWrapper implements IProgressMonitor {

        /** Enumeration of command types. */
        enum CommandType {
            BEGIN_TASK, SET_TASK_NAME, SUB_TASK, WORKED, INTERNAL_WORKED, DONE
        }
        
        /** Data type for progress monitor commands. */
        static final class Command {
            private CommandType type;
            private String name;
            private int work;
            
            private Command(final CommandType thetype, final String thename, final int thework) {
                this.type = thetype;
                this.name = thename;
                this.work = thework;
            }
        }
        
        private LinkedList<Command> commands = new LinkedList<Command>();
        private boolean canceled = false;
        private Display display;
        
        public ProgressMonitorWrapper(final Display thedisplay) {
            this.display = thedisplay;
        }
        
        public void beginTask(final String name, final int totalWork) {
            synchronized (commands) {
                commands.addLast(new Command(CommandType.BEGIN_TASK, name, totalWork));
            }
            display.wake();
        }
        public void done() {
            synchronized (commands) {
                commands.addLast(new Command(CommandType.DONE, null, 0));
            }
            display.wake();
        }
        public void internalWorked(final double work) {
            synchronized (commands) {
                commands.addLast(new Command(CommandType.INTERNAL_WORKED, null, (int) work));
            }
            display.wake();
        }
        public void setTaskName(final String name) {
            synchronized (commands) {
                commands.addLast(new Command(CommandType.SET_TASK_NAME, name, 0));
            }
            display.wake();
        }
        public void subTask(final String name) {
            synchronized (commands) {
                commands.addLast(new Command(CommandType.SUB_TASK, name, 0));
            }
            display.wake();
        }
        public void worked(final int work) {
            synchronized (commands) {
                commands.addLast(new Command(CommandType.WORKED, null, work));
            }
            display.wake();
        }
        public boolean isCanceled() {
            return canceled;
        }
        public void setCanceled(final boolean value) {
            canceled = value;
        }
        
    }
    
    /**
     * Execute the monitored operation.
     * 
     * @param monitor the progress monitor for the operation, or {@code null} if the operation
     *     is not run in monitored mode
     * @return a status indicating success or failure
     */
    protected abstract IStatus execute(IProgressMonitor monitor);
    
    /**
     * Executed in the UI thread before the operation starts. The default
     * implementation does nothing.
     */
    protected void preUIexec() {
    }
    
    /**
     * Executed in the UI thread after the operation has ended. The default
     * implementation does nothing.
     */
    protected void postUIexec() {
    }
    
    /** the status of the last operation run. */
    private IStatus lastStatus;
    
    /**
     * Run the operation. If the current thread is the UI thread, the actual operation
     * is executed in a new thread that runs in parallel. Otherwise the operation is
     * executed directly and a handler for the progress monitor is executed in the
     * parallel UI thread. In either case the method returns only after execution of
     * the operation is done.
     */
    public final void runMonitored() {
        Display display = Display.getCurrent();
        if (display == null) {
            display = PlatformUI.getWorkbench().getDisplay();
            runMonitored(display, false);
        } else {
            runMonitored(display, true);
        }
    }
    
    /**
     * Run the operation without any progress monitor. If the current thread is the UI thread,
     * the actual operation is executed in a new thread that runs in parallel. Otherwise the
     * operation is executed directly and a handler for the progress monitor is executed in the
     * parallel UI thread. In either case the method returns only after execution of
     * the operation is done.
     * 
     */
    public final void runUnmonitored() {
        Display display = Display.getCurrent();
        if (display == null) {
            display = PlatformUI.getWorkbench().getDisplay();
            runUnmonitored(display, false);
        } else {
            runUnmonitored(display, true);
        }
    }
    
    /**
     * Run the operation from the current thread without a progress monitor. 
     * 
     * @param display the display that runs the UI thread
     * @param isUiThread if true, the current thread is the UI thread
     */
    private void runUnmonitored(final Display display, final boolean isUiThread) {
        final Maybe<IStatus> status = new Maybe<IStatus>();
        
        if (isUiThread) {
            try {
                // execute UI code prior to the actual operation
                preUIexec();

                // execute the actual operation without progress monitor
                Thread thread = new Thread("Monitored Operation") { //$NON-NLS-1$
                    public void run() {
                        status.set(execute(null));
                        assert status.get() != null;
                    }
                };
                thread.start();
                
                while (status.get() == null) {
                    boolean hasMoreToDispatch;
                    do {
                        hasMoreToDispatch = display.readAndDispatch();
                    } while (hasMoreToDispatch && status.get() == null);
                    if (status.get() == null) {
                        display.sleep();
                    }
                }
                
                if (status.get().getSeverity() == IStatus.OK) {
                    // execute UI code after the actual operation
                    postUIexec();
                }
            } catch (Throwable throwable) {
                status.set(new Status(IStatus.ERROR, CoreUIPlugin.PLUGIN_ID,
                        "Error in monitored operation", throwable));
            }
        } else {
            // execute UI code prior to the actual operation
            display.syncExec(new Runnable() {
                public void run() {
                    try {
                        preUIexec();
                    } catch (Throwable throwable) {
                        status.set(new Status(IStatus.ERROR, CoreUIPlugin.PLUGIN_ID,
                                "Error in monitored operation", throwable));
                    }
                }
            });
            
            if (status.get() == null) {
                // execute the actual operation without progress monitor
                status.set(execute(null));
                
                if (status.get().getSeverity() == IStatus.OK) {
                    // execute UI code after the actual operation
                    display.syncExec(new Runnable() {
                        public void run() {
                            try {
                                postUIexec();
                            } catch (Throwable throwable) {
                                status.set(new Status(IStatus.ERROR, CoreUIPlugin.PLUGIN_ID,
                                        "Error in monitored operation", throwable));
                            }
                        }
                    });
                }
            }
        }
        
        handleStatus(status);
    }
    
    /**
     * Run the operation from the current thread. 
     * 
     * @param display the display that runs the UI thread
     * @param isUiThread if true, the current thread is the UI thread
     */
    private void runMonitored(final Display display, final boolean isUiThread) {
        final Maybe<IProgressMonitor> monitor = new Maybe<IProgressMonitor>();
        final Maybe<IStatus> status = new Maybe<IStatus>();
        
        if (isUiThread) {
            // execute the operation in a new thread and the UI code in the current thread
            Thread thread = new Thread("Monitored Operation") { //$NON-NLS-1$
                public void run() {
                    runOperation(display, monitor, status);
                }
            };
            thread.start();
            runUiHandler(display, monitor, status);
        } else {
            // execute the operation in the current thread and the UI code in the UI thread
            display.asyncExec(new Runnable() {
                public void run() {
                    runUiHandler(display, monitor, status);
                }
            });
            runOperation(display, monitor, status);
        }
        
        handleStatus(status);
    }
    
    /**
     * Handle a status object.
     * 
     * @param status a status
     */
    private void handleStatus(final Maybe<IStatus> status) {
        if (status.get() != null) {
            lastStatus = status.get();
            int handlingStyle = StatusManager.NONE;
            switch (lastStatus.getSeverity()) {
            case IStatus.ERROR:
                handlingStyle = StatusManager.SHOW | StatusManager.LOG;
                break;
            case IStatus.WARNING:
            case IStatus.INFO:
                handlingStyle = StatusManager.LOG;
                break;
            }
            StatusManager.getManager().handle(lastStatus, handlingStyle);
        }
    }
    
    /**
     * Runs the operation after synchronization with the UI handler.
     * 
     * @param display the current display
     * @param monitor the progress monitor wrapper
     * @param status the returned status
     */
    private void runOperation(final Display display, final Maybe<IProgressMonitor> monitor,
            final Maybe<IStatus> status) {
        try {
            synchronized (monitor) {
                while (monitor.get() == null) {
                    try {
                        monitor.wait();
                    } catch (InterruptedException exception) {
                        // ignore exception
                    }
                }
            }
            if (status.get() == null) {
                status.set(execute(monitor.get()));
                assert status.get() != null;
            }
        } finally {
            synchronized (status) {
                if (status.get() == null) {
                    status.set(Status.OK_STATUS);
                }
                display.wake();
            }
        }
    }
    
    /**
     * Runs the UI handler.
     * 
     * @param display the current display
     * @param monitor the progress monitor wrapper
     * @param status the returned status
     */
    private void runUiHandler(final Display display, final Maybe<IProgressMonitor> monitor,
            final Maybe<IStatus> status) {
        try {
            
            // execute UI code prior to the actual operation
            preUIexec();
            
            // execute UI handler until the operation has finished
            PlatformUI.getWorkbench().getProgressService().run(
                    false, true, new IRunnableWithProgress() {
                public void run(final IProgressMonitor uiMonitor) {
                    ProgressMonitorWrapper monitorWrapper = new ProgressMonitorWrapper(display);
                    synchronized (monitor) {
                        monitor.set(monitorWrapper);
                        monitor.notify();
                    }
                    while (status.get() == null) {
                        boolean hasMoreToDispatch = false;
                        do {
                            hasMoreToDispatch = display.readAndDispatch();
                            monitorWrapper.canceled = uiMonitor.isCanceled();
                        } while (hasMoreToDispatch && status.get() == null);
                        if (status.get() == null) {
                            display.sleep();
                        }
                        while (!monitorWrapper.commands.isEmpty() && status.get() == null) {
                            ProgressMonitorWrapper.Command command;
                            synchronized (monitorWrapper.commands) {
                                command = monitorWrapper.commands.removeFirst();
                            }
                            switch (command.type) {
                            case BEGIN_TASK:
                                uiMonitor.beginTask(command.name, command.work);
                                break;
                            case SET_TASK_NAME:
                                uiMonitor.setTaskName(command.name);
                                break;
                            case SUB_TASK:
                                uiMonitor.subTask(command.name);
                                break;
                            case WORKED:
                                uiMonitor.worked(command.work);
                                break;
                            case INTERNAL_WORKED:
                                uiMonitor.internalWorked(command.work);
                            case DONE:
                                uiMonitor.done();
                                return;
                            }
                        }
                    }
                }
            });
            while (status.get() == null) {
                boolean hasMoreToDispatch;
                do {
                    hasMoreToDispatch = display.readAndDispatch();
                } while (hasMoreToDispatch && status.get() == null);
                if (status.get() == null) {
                    display.sleep();
                }
            }
            
            // execute UI code after the actual operation
            if (status.get().getSeverity() == IStatus.OK) {
                postUIexec();
            }
            
        } catch (Throwable throwable) {
            synchronized (monitor) {
                if (monitor.get() == null) {
                    monitor.set(new NullProgressMonitor());
                    monitor.notify();
                }
            }
            synchronized (status) {
                if (status.get() == null || status.get().getSeverity() == IStatus.OK) {
                    status.set(new Status(IStatus.ERROR, CoreUIPlugin.PLUGIN_ID,
                            "Error in monitored operation", throwable));
                    handleStatus(status);
                }
            }
        }
    }
    
    /**
     * Returns the status of the last operation run.
     * 
     * @return the last status, or {@code null} if the operation has not
     *         run yet
     */
    public IStatus getStatus() {
        return lastStatus;
    }

    /**
     * Execute the given runnable in the UI thread. If the current thread is the
     * UI thread, the runnable is simply run. Otherwise it is executed either
     * synchronously or asynchronously in the UI thread.
     * 
     * @param runnable a runnable
     * @param synch if true or if the current thread is the UI thread, the method returns
     *     only after execution of the runnable, else it returns immediately
     * @deprecated use {@link Display#syncExec(Runnable)} or {@link Display#asyncExec(Runnable)} instead
     */
    public static final void runInUI(final Runnable runnable, final boolean synch) {
        Display display = Display.getCurrent();
        if (display == null) {
            display = PlatformUI.getWorkbench().getDisplay();
            if (synch) {
                display.syncExec(runnable);
            } else {
                display.asyncExec(runnable);
            }
        } else {
            runnable.run();
        }   
    }
    
}
