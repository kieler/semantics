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
package de.cau.cs.kieler.synccharts.listener;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * An abstract TriggerListener, that catches all Exceptions and logs them.
 * Problem with TriggerListeners is that in case of an Exception, the whole
 * corresponding transaction will be rolled back. Even commands that have not
 * much to do with the trigger listener will be undone. Subclasses of this class
 * can throw any exceptions which get only logged (to get some not annoying fail
 * silent behavior) and still return a null Command, which will be correctly
 * processed by the transaction service. Hence the original transaction can be
 * executed correctly and will not be disturbed by this TriggerListener.
 * 
 * @author haf
 */
public abstract class FailSafeTriggerListener extends TriggerListener {

    /**
     * Constructor.
     */
    public FailSafeTriggerListener() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param filter a filter
     */
    public FailSafeTriggerListener(final NotificationFilter filter) {
        super(filter);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Command transactionAboutToCommit(final ResourceSetChangeEvent event)
            throws RollbackException {
        try {
            return super.transactionAboutToCommit(event);
        } catch (Exception e) {
            Status myStatus = new Status(IStatus.ERROR, "de.cau.cs.kieler.synccharts",
                    "Failed to apply a SyncCharts trigger listener.", e);
            StatusManager.getManager().handle(myStatus, StatusManager.LOG);
            return null;
        }
    }

}
