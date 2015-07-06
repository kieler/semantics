/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.util;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.statushandlers.WorkbenchErrorHandler;

import de.cau.cs.kieler.core.model.CoreModelPlugin;

/**
 * Generic error handler, mainly taken from IDEWorkbenchErrorHandler. All
 * handled statuses are checked against severity and logged using logging
 * facility (by superclass).
 * 
 * As subclassing the IDEWorkbenchErrorHandler is restricted, this is a slightly
 * customized copy.
 * 
 * TODO: Augment by more useful error messages customized to KIELER users.
 * 
 * @author haf
 */
public class GenericErrorHandler extends WorkbenchErrorHandler {

    /** The list of listeners. */
    private List<StatusListener> listeners;

    private int exceptionCount = 0;

    /** The dialog for displaying a fatal error. */
    private static FatalErrorDialog dialog;

    private boolean closing = false;

    // SUPPRESS CHECKSTYLE NEXT 7 LineLength
    private static final String MSG_OUT_OF_MEMORY_ERROR = "The Java Virtual Machine has run out of memory while trying to create an object. Consult the \"Running Eclipse\" section of the readme file for information on preventing this kind of error in the future.";
    private static final String MSG_STACK_OVERFLOW_ERR = "Stack Overflow!\nThe Java Virtual Machine reached a too deep recursion level which caused the stack to overflow. This could be caused by a non-terminating recursion.";
    private static final String MSG_VM_ERROR = "Virtual Machine Error!\nThe Java Virtual Machine broke down due to an internal error and has run out of resources to keep operating.";
    private static final String MSG_SWT_ERROR = "Standard Widget Toolkit (SWT) Error!\nA graphical component entered an undefined state while trying to get the OS to create a Shell.";
    private static final String MSG_FATAL_ERROR = "\n\nYou are recommended to exit the workbench.\nSubsequent errors may happen and may terminate the workbench without warning.\nSee the .log file for details.\n\nDo you want to exit the workbench?";
    private static final String MSG_FATAL_REC_ERROR = "Fatal Recursive Error!\nThe application keeps producing new errors recursively.";
    private static final String MSG_FATAL_ERROR_TITLE = "Internal Fatal Error!";

    /** cache handled statuses. */
    private final Map<IStatus, Object> map = Collections
            .synchronizedMap(new WeakHashMap<IStatus, Object>());

    /**
     * {@inheritDoc}
     */
    @Override
    public void handle(final StatusAdapter statusAdapter, final int style) {

        // if fatal error occurs, we will show the blocking error dialog anyway
        if (isFatal(statusAdapter)) {
            // if we modify the hint, we have to be sure that status picked up
            // from .log will not be handled if it is reported independently via
            // StatusManager
            if (!map.containsKey(statusAdapter.getStatus())) {
                map.put(statusAdapter.getStatus(), null);
            } else {
                return;
            }
            Object o = statusAdapter
                    .getProperty(IProgressConstants.NO_IMMEDIATE_ERROR_PROMPT_PROPERTY);
            if (o == Boolean.TRUE) {
                statusAdapter.setProperty(
                        IProgressConstants.NO_IMMEDIATE_ERROR_PROMPT_PROPERTY,
                        Boolean.FALSE);
            }
            super.handle(statusAdapter, style | StatusManager.BLOCK);
        } else {
            int shownStyle = 0;
            boolean noOneCares = true;

            if (listeners != null && !listeners.isEmpty()) {
                for (StatusListener listener : listeners) {
                    // ask all components for the style they want
                    int requestedStyle = listener.reroute(statusAdapter, style);
                    if (requestedStyle != StatusListener.DONT_CARE) {
                        shownStyle = shownStyle | requestedStyle;
                        noOneCares = false;
                    }
                }

            }
            if (noOneCares) {
                // no component cared about the style, use default one
                shownStyle = style;
            }
            super.handle(statusAdapter, shownStyle);
        }

        // if fatal error occurs, we will ask to close the workbench
        if (isFatal(statusAdapter)) {
            UIJob handlingExceptionJob = new UIJob("IDE Exception Handler") //$NON-NLS-1$
            {

                /**
                 * {@inheritDoc}
                 */
                @Override
                public IStatus runInUIThread(final IProgressMonitor monitor) {
                    handleException(statusAdapter.getStatus().getException());
                    return new Status(IStatus.OK, CoreModelPlugin.PLUGIN_ID, "Exception handled");
                }

            };

            handlingExceptionJob.setSystem(true);
            handlingExceptionJob.schedule();
        }
    }

    /**
     * 
     * @param statusAdapter
     * @return
     */
    private boolean isFatal(final StatusAdapter statusAdapter) {
        Throwable exception = statusAdapter.getStatus().getException();
        if (exception != null
                && (exception instanceof OutOfMemoryError
                        || exception instanceof StackOverflowError
                        || exception instanceof VirtualMachineError || exception instanceof SWTError)) {
            return true;
        }
        return false;
    }

    /**
     * 
     * @param t
     */
    private void handleException(final Throwable t) {
        try {
            exceptionCount++;
            if (exceptionCount > 1) {
                dialog.updateMessage(MessageFormat.format(MSG_FATAL_ERROR,
                        new Object[] { MSG_FATAL_REC_ERROR }));
                dialog.getShell().forceActive();
            } else {
                if (openQuestionDialog(t)) {
                    closeWorkbench();
                }
            }
        } finally {
            exceptionCount--;
        }
    }

    /**
     * Informs the user about a fatal error. Returns true if the user decide to
     * exit workbench or if another fatal error happens while reporting it.
     * 
     * @param t
     *            the exception causing the dialog to open
     * @return
     */
    private boolean openQuestionDialog(final Throwable t) {
        try {
            String msg = null;
            if (t instanceof OutOfMemoryError) {
                msg = MSG_OUT_OF_MEMORY_ERROR;
            } else if (t instanceof StackOverflowError) {
                msg = MSG_STACK_OVERFLOW_ERR;
            } else if (t instanceof VirtualMachineError) {
                msg = MSG_VM_ERROR;
            } else if (t instanceof SWTError) {
                msg = MSG_SWT_ERROR;
            } else {
                if (t.getMessage() == null) {
                    msg = "Internal Error!";
                } else {
                    msg = NLS.bind("Internal Error!", t.getMessage());
                }
            }

            // Always open the dialog in case of major error but do not show the
            // detail button if not in debug mode.
            Throwable detail = t;
            // if (!Policy.DEBUG_OPEN_ERROR_DIALOG) {
            // detail = null;
            // }

            dialog = openInternalQuestionDialog(PlatformUI.getWorkbench()
                    .getActiveWorkbenchWindow().getShell(),
                    MSG_FATAL_ERROR_TITLE, msg + MSG_FATAL_ERROR, detail, 1);

            return dialog.open() == 0;
        } catch (Throwable th) {
            // Workbench may be in such bad shape (no OS handles left, out of memory, etc)
            // that is cannot show a message to the user. Just bail out now.
            System.err.println("Error while informing user about event loop exception:"); //$NON-NLS-1$
            t.printStackTrace();
            System.err.println("Dialog open exception:"); //$NON-NLS-1$
            th.printStackTrace();
            return true;
        }
    }

    /**
     * 
     * @param parent
     * @param title
     * @param message
     * @param detail
     * @param defaultIndex
     * @return
     */
    private FatalErrorDialog openInternalQuestionDialog(final Shell parent,
            final String title, final String message, final Throwable detail,
            final int defaultIndex) {
        String[] labels;
        if (detail == null) {
            labels = new String[] { IDialogConstants.YES_LABEL,
                    IDialogConstants.NO_LABEL };
        } else {
            labels = new String[] { IDialogConstants.YES_LABEL,
                    IDialogConstants.NO_LABEL,
                    IDialogConstants.SHOW_DETAILS_LABEL };
        }

        FatalErrorDialog errorDialog = new FatalErrorDialog(parent, title,
                message, detail, MessageDialog.QUESTION, labels, defaultIndex);
        if (detail != null) {
            errorDialog.setDetailButton(2);
        }
        return errorDialog;
    }

    /**
     * Closes the workbench and make sure all exceptions are handled.
     */
    private void closeWorkbench() {
        if (closing) {
            return;
        }

        try {
            closing = true;
            if (dialog != null && dialog.getShell() != null
                    && !dialog.getShell().isDisposed()) {
                dialog.close();
            }
            // @see WorkbenchAdvisor#getWorkbenchConfigurer()
            BusyIndicator.showWhile(null, new Runnable() {
                public void run() {
                    System.exit(-1);
                }
            });
        } catch (RuntimeException re) {
            // Workbench may be in such bad shape (no OS handles left, out of memory, etc)
            // that is cannot even close. Just bail out now.
            String message = "Fatal runtime error happened during "
                    + "workbench emergency close."; //$NON-NLS-1$
            System.err.println(message);
            re.printStackTrace();
            System.exit(-1);
            throw re;
        } catch (Error e) {
            // Workbench may be in such bad shape (no OS handles left, out of memory, etc)
            // that is cannot even close. Just bail out now.
            System.err.println("Fatal error happened during workbench emergency close."); //$NON-NLS-1$
            e.printStackTrace();
            System.exit(-1);
            throw e;
        }
    }

    /**
     * The dialog for displaying the fatal error.
     * 
     * @author haf
     */
    private class FatalErrorDialog extends InternalErrorDialog {

        /**
         * @param parentShell
         * @param dialogTitle
         * @param dialogMessage
         * @param detail
         * @param dialogImageType
         * @param dialogButtonLabels
         * @param defaultIndex
         */
        public FatalErrorDialog(final Shell parentShell,
                final String dialogTitle, final String dialogMessage,
                final Throwable detail, final int dialogImageType,
                final String[] dialogButtonLabels, final int defaultIndex) {
            super(parentShell, dialogTitle, null, dialogMessage, detail,
                    dialogImageType, dialogButtonLabels, defaultIndex);
        }

        /**
         * Updates the dialog message.
         * 
         * @param message
         *            new message
         */
        public void updateMessage(final String message) {
            this.message = message;
            this.messageLabel.setText(message);
            this.messageLabel.update();
        }
    }

    /**
     * Add a new listener to the list of listeners.
     * 
     * @param listener
     *            the listener
     */
    public void addListener(final StatusListener listener) {
        if (listeners == null) {
            listeners = new LinkedList<StatusListener>();
        }
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    /**
     * Remove the listener from the list.
     * 
     * @param listener
     *            the listener
     */
    public void removeListener(final StatusListener listener) {
        if (listeners != null) {
            listeners.remove(listener);
        }
    }

    /**
     * Classes implementing this interface will be notified when a non-fatal
     * exception passes through the error handler. The notified components can
     * then decide if they want to modify the style of the exception.
     * {@link StatusManager#BLOCK} {@link StatusManager#SHOW}
     * {@link StatusManager#LOG} {@link StatusManager#NONE}
     * 
     * @author soh
     */
    public interface StatusListener {

        /**
         * Indicates that the component doesn't care about the style of the
         * error.
         */
        int DONT_CARE = -1;

        /**
         * Reroute the exception to the given listener. If the listener wants to
         * modify the style it should return the style that it wants the
         * exception to have. If the component doesn't care about that
         * particular exception it should return the
         * {@link StatusListener#DONT_CARE} style.
         * 
         * @param statusAdapter
         *            the status adapter
         * @param style
         *            the style
         * @return the style that the status should have
         */
        int reroute(StatusAdapter statusAdapter, int style);
    }
}
