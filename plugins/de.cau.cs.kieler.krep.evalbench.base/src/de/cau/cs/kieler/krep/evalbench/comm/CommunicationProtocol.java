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

package de.cau.cs.kieler.krep.evalbench.comm;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.swt.widgets.Display;

/**
 * Abstract class, implements common protocol features.
 * 
 * @author msp, ctr
 */
public abstract class CommunicationProtocol implements ICommunicationProtocol {

    /** List of communication listeners. */
    protected LinkedList<ICommunicationListener> communicationListeners;

    /** The currently active connection protocol. */
    protected IConnectionProtocol connection;

    /**
     * Constructs a new instance of the KEP protocol.
     * 
     * @param connectionProtocol
     *            underlying connection protocol to be used; this protocol instance is expected to
     *            be already initialized
     */
    protected CommunicationProtocol(final IConnectionProtocol connectionProtocol) {
        // create list of communication listeners
        communicationListeners = new LinkedList<ICommunicationListener>();
        // store instance of connection protocol
        this.connection = connectionProtocol;
    }

    /**
     * Notifies all registered communication listeners about sent data.
     * 
     * @param data
     *            data that was sent
     */
    protected void notifySend(final String data) {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                Iterator<ICommunicationListener> iterator = communicationListeners.iterator();
                while (iterator.hasNext()) {
                    iterator.next().dataSent(data);
                }
            }
        });
    }

    /**
     * Notifies all registered communication listeners about received data.
     * 
     * @param data
     *            data that was received
     */
    protected void notifyReceive(final String data) {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                Iterator<ICommunicationListener> iterator = communicationListeners.iterator();
                while (iterator.hasNext()) {
                    iterator.next().dataReceived(data);
                }
            }
        });
    }

    /**
     * Notifies all registered communication listeners about a comment.
     * 
     * @param comment
     *           comment about the next transaction
     */
    protected void notifyComment(final String comment) {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                Iterator<ICommunicationListener> iterator = communicationListeners.iterator();
                while (iterator.hasNext()) {
                    iterator.next().comment(comment);
                }
            }
        });
    }
    
    
    /**
     * {@inheritDoc}
     */
    public void comment(final String comment) {
        connection.comment(comment);
    }

    /**
     * {@inheritDoc}
     */
    public void addCommunicationListener(final ICommunicationListener listener) {
        communicationListeners.add(listener);
    }

    /**
     * {@inheritDoc}
     */
    public void removeCommunicationListener(final ICommunicationListener listener) {
        communicationListeners.remove(listener);
    }

}
