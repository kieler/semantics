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

package de.cau.cs.kieler.maude;

import java.util.LinkedList;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import de.cau.cs.kieler.maude.internal.MaudeSession;

/**
 * This activator class controls the life cycle of the MaudeInterfacePlugin. It also provides the
 * access to the one and only instance of this class and hence a way to access the maude interface
 * thread.
 * 
 * @author Christian Motika - cmot AT informatik.uni-kiel.de
 * @kieler.rating 2010-08-15 yellow
 * 
 */
public class MaudeInterfacePlugin extends AbstractUIPlugin {

    /** The Constant PLUGIN_ID. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.maude"; //$NON-NLS-1$

    /** The plugin. */
    private static MaudeInterfacePlugin plugin;

    /** The sessions. */
    private LinkedList<MaudeSession> sessions;

    // ---------------------------------------------------------------------

    /**
     * The constructor.
     */
    public MaudeInterfacePlugin() {
        sessions = new LinkedList<MaudeSession>();
    }

    // ---------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void start(final BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    // ---------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void stop(final BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    // ---------------------------------------------------------------------

    /**
     * Returns the shared instance of the Maude Interface plug-in. This is mainly used by the
     * execution thread to access the view of the KIELER Execution Manager or the other way round.
     * 
     * @return the shared instance
     */
    public static MaudeInterfacePlugin getDefault() {
        return plugin;
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new maude session.
     * 
     * @param pathToMaudeParam
     *            the path to maude.exe
     * @param pathToMaudeCodeParam
     *            the path to the maude code
     * @return the int
     */
    public int createMaudeSession(final String pathToMaudeParam, final String pathToMaudeCodeParam) {
        MaudeSession session = new MaudeSession(pathToMaudeParam, pathToMaudeCodeParam);

        sessions.add(session);

        return session.hashCode();
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maude session to a given session id.
     * 
     * @param maudeSessionId
     *            the maude session id
     * @return the maude session
     */
    private MaudeSession getMaudeSession(final int maudeSessionId) {
        for (MaudeSession session : sessions) {
            if (session.hashCode() == maudeSessionId) {
                return session;
            }
        }
        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * Gets the maude session index to a given session id.
     * 
     * @param maudeSessionId
     *            the maude session id
     * @return the maude session index
     */
    private int getMaudeSessionIndex(final int maudeSessionId) {
        int index = 0;
        for (MaudeSession session : sessions) {
            if (session.hashCode() == maudeSessionId) {
                return index;
            }
            index++;
        }
        return -1;
    }

    // -------------------------------------------------------------------------

    /**
     * Closes a maude session and removes all links to it.
     * 
     * @param maudeSessionId
     *            the maude session id
     * @return true, if successful
     */
    public boolean closeMaudeSession(final int maudeSessionId) {
        MaudeSession session = getMaudeSession(maudeSessionId);
        int sessionIndex = getMaudeSessionIndex(maudeSessionId);
        if (session == null) {
            return false;
        }
        // stop the session
        session.stopSession();
        // remove any links to it
        sessions.remove(sessionIndex);
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * Query maude with a string returning a string for a given maude session id.
     * 
     * @param queryRequest
     *            the query request
     * @param wait
     *            the wait in milliseconds
     * @param maudeSessionId
     *            the maude session id
     * @return the string
     * @throws Exception
     *             the exception
     */
    public String queryMaude(final String queryRequest, final int wait, final int maudeSessionId)
            throws Exception {
        MaudeSession session = getMaudeSession(maudeSessionId);
        if (session == null) {
            throw (new Exception("Maude session with id " + maudeSessionId + " not found."));
        }
        if (!session.isStarted()) {
            throw (new Exception("Maude session with id " + maudeSessionId + " not started yet."));
        }
        return session.queryMaude(queryRequest, wait);
    }

    // -------------------------------------------------------------------------

    /**
     * Query maude with a string returning a string for a given maude session id.
     * 
     * @param queryRequest
     *            the query request
     * @param maudeSessionId
     *            the maude session id
     * @return the string
     * @throws Exception
     *             the exception
     */
    public String queryMaude(final String queryRequest, final int maudeSessionId) throws Exception {
        MaudeSession session = getMaudeSession(maudeSessionId);
        if (session == null) {
            throw (new Exception("Maude session with id " + maudeSessionId + " not found."));
        }
        if (!session.isStarted()) {
            throw (new Exception("Maude session with id " + maudeSessionId + " not started yet."));
        }
        return session.queryMaude(queryRequest);
    }

    // -------------------------------------------------------------------------

    /**
     * Starts a maude session.
     * 
     * @param maudeSessionId
     *            the maude session id
     * @throws Exception
     *             the exception
     */
    public void startMaudeSession(final int maudeSessionId) throws Exception {
        MaudeSession session = getMaudeSession(maudeSessionId);
        if (session == null) {
            throw (new Exception("Maude session with id " + maudeSessionId + " not found."));
        }
        session.startSession();
    }

    // -------------------------------------------------------------------------
}
