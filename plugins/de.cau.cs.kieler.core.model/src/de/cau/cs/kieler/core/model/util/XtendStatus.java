package de.cau.cs.kieler.core.model.util;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;

import de.cau.cs.kieler.core.model.CoreModelPlugin;

/**
 * Class to create a MultiStatus object from an Issues object that contains
 * Xtend Errors, Warnings and Infos. Might still be IStatus.OK, if the Issues
 * object is empty. Can be used to directly show issues in the Status Manager.
 * 
 * @author haf
 */
public class XtendStatus implements IStatus {

    private Issues myIssues;
    private IStatus[] children;
    private int severity = IStatus.OK;
    private Throwable firstException = null;

    /**
     * Constructor taking an Xtend Issues which contains Errors, Infos,
     * Warnings.
     * 
     * @param issues
     *            the input diagnostic information
     */
    public XtendStatus(final Issues issues) {
        this.myIssues = issues;
    }

    /**
     * {@inheritDoc}
     */
    public IStatus[] getChildren() {
        if (children == null) {
            List<IStatus> myStatus = new LinkedList<IStatus>();

            MWEDiagnostic[] tempDiags = myIssues.getErrors();
            for (int i = 0; i < tempDiags.length; i++) {
                MWEDiagnostic diagnostic = tempDiags[i];
                IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                        "Error: " + diagnostic.getMessage(), diagnostic
                                .getException());
                myStatus.add(status);
                severity = IStatus.ERROR;
                if(firstException == null){
                    firstException = diagnostic.getException();
                }
            }

            tempDiags = myIssues.getWarnings();
            for (int i = 0; i < tempDiags.length; i++) {
                MWEDiagnostic diagnostic = tempDiags[i];
                IStatus status = new Status(IStatus.WARNING, CoreModelPlugin.PLUGIN_ID,
                        "Warning: " + diagnostic.getMessage(), diagnostic
                                .getException());
                myStatus.add(status);
                if(firstException == null){
                    firstException = diagnostic.getException();
                }
                if (severity != IStatus.ERROR) {
                    severity = IStatus.WARNING;
                }
            }

            tempDiags = myIssues.getInfos();
            for (int i = 0; i < tempDiags.length; i++) {
                MWEDiagnostic diagnostic = tempDiags[i];
                IStatus status = new Status(IStatus.INFO, CoreModelPlugin.PLUGIN_ID,
                        "Info: " + diagnostic.getMessage(), diagnostic
                                .getException());
                myStatus.add(status);
                if(firstException == null){
                    firstException = diagnostic.getException();
                }
                if (severity != IStatus.ERROR && severity != IStatus.WARNING) {
                    severity = IStatus.INFO;
                }
            }

            children = new IStatus[myStatus.size()];
            children = myStatus.toArray(children);

        }
        return children;

    }

    /**
     * {@inheritDoc}
     */
    public int getCode() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public Throwable getException() {
        return firstException;
    }

    /**
     * {@inheritDoc}
     */
    public String getMessage() {
        if(severity== IStatus.OK){
            return "Model-to-model transformation successfully done.";
        }
        StringBuffer msg = new StringBuffer();
        if(severity == IStatus.WARNING){
            msg.append("Info");
        }
        if(severity == IStatus.WARNING){
            msg.append("Warning");
        }
        if(severity == IStatus.ERROR){
            msg.append("Error");
        }
        if(getChildren().length > 1){
            msg.append("s");
        }
        msg.append(" in an Xtend model-to-model transformation.");
        return msg.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String getPlugin() {
        return CoreModelPlugin.PLUGIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    public int getSeverity() {
        getChildren(); // calc severity from children
        return severity;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isMultiStatus() {
        IStatus[] status = getChildren();
        return status.length > 0;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isOK() {
        return severity == IStatus.OK;
    }

    /**
     * {@inheritDoc}
     */
    public boolean matches(final int severityMask) {
        return ((severity & severityMask) > 0);
    }
}
