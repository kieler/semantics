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
package de.cau.cs.kieler.synccharts.synchronizer;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;

// CHECKSTYLEOFF Javadoc|FinalParameters

/**
 * @deprecated
 * @kieler.ignore (excluded from review process)
 */
public class ModelChangeTriggerListener extends TriggerListener {

    private static boolean enabled = false;

    public ModelChangeTriggerListener() {
        super(NotificationFilter.createNotifierTypeFilter(
                AnnotationsPackage.eINSTANCE.getAnnotatable()).or(
                NotificationFilter.createNotifierTypeFilter(
                        KExpressionsPackage.eINSTANCE.getExpression())));
    }

    public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
        return null;
    }

    public void resourceSetChanged(ResourceSetChangeEvent event) {
        if (enabled && ModelSynchronizer.INSTANCE != null) {
            // System.out.println("GMF triggering is " + (enabled?"":"not ") + "enabled!");
            ModelSynchronizer.INSTANCE.triggerModelChangeListener(event);
        }
    }

    @Override
    protected Command trigger(TransactionalEditingDomain domain, Notification notification) {
//        System.out.println("Hier");
        return null;
    }

    @Override
    public boolean isPrecommitOnly() {
        return false;
    }

    @Override
    public boolean isPostcommitOnly() {
        return true;
    }

    public static void setEnabled(boolean isEnabled) {
        enabled = isEnabled;
    }
}
