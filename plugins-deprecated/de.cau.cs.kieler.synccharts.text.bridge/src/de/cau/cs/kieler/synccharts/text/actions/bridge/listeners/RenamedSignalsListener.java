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
 * 
 */
package de.cau.cs.kieler.synccharts.text.actions.bridge.listeners;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.synccharts.listener.FireOnceTriggerListener;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;
import de.cau.cs.kieler.synccharts.text.actions.bridge.LabelParserBridgePlugin;

/**
 * Listen to renamings of Signals and Variables and then re-serialize all
 * affected transition labels.
 * 
 * @author haf
 * @kieler.ignore (excluded from review process)
 */
public class RenamedSignalsListener extends FireOnceTriggerListener {

    /**
     * Constructor.
     */
    public RenamedSignalsListener() {
        super(NotificationFilter
                .createFeatureFilter(KExpressionsPackage.eINSTANCE
                        .getValuedObject_Name()));
    }

    private ActionLabelProcessorWrapper actionLabelProcessor = new ActionLabelProcessorWrapper();

    @Override
    protected Command trigger(final TransactionalEditingDomain domain,
            final Notification notification) {
        ValuedObject signal = (ValuedObject) notification.getNotifier();
        CompoundCommand cc = new CompoundCommand();
        /*
         * serialize the label again if any names have changed. Conditions for serialization: - the
         * name attribute of a Signal/Variable is affected - new name is not null - name has really
         * changed (new and old are not the same, but old might be null)
         */
        if (notification.getNewStringValue() != null
                && (notification.getOldStringValue() == null || !notification
                        .getNewStringValue().equals(
                                notification.getOldStringValue()))) {
            // first serialize the label
            // then re-parse it again (might be necessary if new Signals have
            // been introduced) Reparsing is done automatically by the
            // corresponding TriggerListener.
            if (LabelParserBridgePlugin.getDefault().doAutomaticSerialization()) {
                cc.append(actionLabelProcessor
                        .getProcessAffectedActionLabelCommand(signal, null,
                                ActionLabelProcessorWrapper.SERIALIZE));
            }
        }
        return cc;
    }

}
