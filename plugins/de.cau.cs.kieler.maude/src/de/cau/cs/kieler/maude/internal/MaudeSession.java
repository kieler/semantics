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

public class MaudeSession {

    private String pathToMaude;
    private String pathToMaudeCode;
    private Process process = null;
    private PrintWriter toMaude;
    private BufferedReader fromMaude;
    private BufferedReader error;
    private boolean started;
    
    //-------------------------------------------------------------------------

    /**
     * Instantiates a new maude session.
     * 
     * @param pathToMaudeParam
     *            the path to maude param
     * @param pathToMaudeCodeParam
     *            the path to maude code param
     */
    public MaudeSession(String pathToMaudeParam, String pathToMaudeCodeParam) {
        pathToMaude = pathToMaudeParam;
        pathToMaudeCode = pathToMaudeCodeParam;
        started = false;
    }

    //-------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------

    /**
     * Checks whether the maude session is started.
     * 
     * @return true, if is started
     */
    public boolean isStarted() {
        return started;
    }
    
    //-------------------------------------------------------------------------
    
    /**
     * Query maude with a string returning a string for a given maude session id.
     * 
     * @param queryRequest
     *            the query request
     * @return the string
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public String queryMaude(String queryRequest) throws IOException {
        String returnValue = "";
        
        toMaude.write(queryRequest);
        toMaude.flush();
        
        while (error.ready()) {
            returnValue += (((char)error.read() + ""));
        }
        
        while (fromMaude.ready()) {
            returnValue += ((char)fromMaude.read() + "");
        }
        
        
        while (error.ready()) {
            System.err.print(error.readLine());
        }

        return returnValue;
    }
    
    //-------------------------------------------------------------------------
}
