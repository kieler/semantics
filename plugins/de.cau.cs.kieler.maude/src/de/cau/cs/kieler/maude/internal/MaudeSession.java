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

package de.cau.cs.kieler.maude.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * A MaudeSession used internally by the MaudInterfacePlugin to handle calls to Maude.
 * 
 * @author cmot, jes
 */
public class MaudeSession {

    /** The constant for the Maude timeout. */
    private static final int MAUDETIMEOUT = 900000;

    /** The path to maude.exe. */
    private String pathToMaude;

    /** The path to the maude code. */
    private String pathToMaudeCode;

    /** The process. */
    private Process process = null;

    /** The stream to maude. */
    private PrintWriter toMaude;

    /** The stream from maude. */
    private BufferedReader fromMaude;

    /** The error stream from maude. */
    private BufferedReader error;

    /** The started flag. */
    private boolean started;

    // -------------------------------------------------------------------------

    /**
     * Instantiates a new maude session.
     * 
     * @param pathToMaudeParam
     *            the path to maude param
     * @param pathToMaudeCodeParam
     *            the path to maude code param
     */
    public MaudeSession(final String pathToMaudeParam, final String pathToMaudeCodeParam) {
        pathToMaude = pathToMaudeParam;
        pathToMaudeCode = pathToMaudeCodeParam;
        started = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Starts a maude session.
     * 
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void startSession() throws IOException {
        process = Runtime.getRuntime().exec(pathToMaude + " " + pathToMaudeCode);

        toMaude = new PrintWriter(new OutputStreamWriter(process.getOutputStream()));
        fromMaude = new BufferedReader(new InputStreamReader(process.getInputStream()));
        error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

        started = true;
    }

    // -------------------------------------------------------------------------

    /**
     * Stops a maude session.
     */
    public void stopSession() {
        try {
            if (process != null) {
                process.destroy();
            }
        } catch (Exception e) {
            // ignore errors
        }
        try {
            toMaude.close();
        } catch (Exception e) {
            // ignore errors
        }
        try {
            fromMaude.close();
        } catch (Exception e) {
            // ignore errors
        }
        try {
            error.close();
        } catch (Exception e) {
            // ignore errors
        }
        started = false;
    }

    // -------------------------------------------------------------------------

    /**
     * Checks whether the maude session is started.
     * 
     * @return true, if is started
     */
    public boolean isStarted() {
        return started;
    }

    // -------------------------------------------------------------------------

    /**
     * Query maude with a string returning a string for a given maude session id.
     * 
     * @param queryRequest
     *            the query request
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public String queryMaude(final String queryRequest) throws IOException {
        return queryMaude(queryRequest, 0);
    }

    // -------------------------------------------------------------------------

    /**
     * Query maude with a string returning a string for a given maude session id. The optional wait
     * parameter can be used the first time after initialization to get all contens.
     * 
     * @param queryRequest
     *            the query request
     * @param wait
     *            the wait
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public String queryMaude(final String queryRequest, final int wait) throws IOException {
        String returnValue = "";

        if (queryRequest != null) {
            toMaude.write(queryRequest);
        }
        toMaude.flush();

        if (wait > 0) {
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                // ignore error
            }
        }

        boolean done = false;
        long startTime = System.currentTimeMillis();

        while (!done) {
            while (error.ready()) {
                returnValue += (((char) error.read() + ""));
            }
            while (fromMaude.ready()) {
                returnValue += ((char) fromMaude.read() + "");
            }
            if (returnValue.contains("Maude>")) {
                done = true;
            }
            if (System.currentTimeMillis() - startTime > MAUDETIMEOUT) {
                throw new IOException("A timeout occurred while calling Maude.");
            }
        }

        return returnValue;
    }

    // -------------------------------------------------------------------------
}
