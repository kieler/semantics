/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by + Christian-Albrechts-University of Kiel + Department of Computer Science +
 * Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL). See the file
 * epl-v10.html for the license text.
 */

package de.cau.cs.kieler.xkev.mapping.animations;

import org.apache.batik.swing.svg.SVGDocumentLoaderEvent;
import org.apache.batik.swing.svg.SVGDocumentLoaderListener;

import de.cau.cs.kieler.xkev.Activator;

/**
 * This class implements the SVGDocumentLoaderListener. It returns the loadingStatus of the
 * SVGDocument.
 * 
 * return values for the getLoadingStatus() method are: -1 : not initilized! 0 : loading completed 1
 * : document loading cancelled 2 : document loading failed 3 : document loading started
 * 
 * @author Stephan Knauer (skn) - skn[at]informatik.uni-kiel.de
 * 
 */
public class SVGLoadingStatusListener implements SVGDocumentLoaderListener {

    /**
     * This the default value, if no event was ever triggered for this listener.
     */
    public static final byte NOT_INITILIZED = -1;

    /**
     * Return value for status LoadingStarted.
     */
    public static final byte LOADING_STARTED = 1;

    /**
     * Return value for status LoadingCompleted.
     */
    public static final byte LOADING_COMPLETED = 2;

    /**
     * Return value for status LoadingFailed.
     */
    public static final byte LOADING_FAILED = 3;

    /**
     * Return value for status LoadingCancelled.
     */
    public static final byte LOADING_CANCELLED = 4;

    /**
     * Value which indicates the current loading status.
     */
    private byte loadingStatus = NOT_INITILIZED;

    /**
     * Just returns the current loading status.
     * 
     * @return the current loading status.
     */
    public byte getLoadingStatus() {
        return loadingStatus;
    }

    /**
     * Threadsafe method for setting the current loading status.
     * 
     * @param loadingStatus
     */
    private synchronized void setLoadingStatus(final byte currentStatus) {
        loadingStatus = currentStatus;
    }

    /**
     * Documents SVG-document loadingstatus.
     * 
     * @param e
     *            the current SVGDocumentLoaderEvent
     */
    public void documentLoadingCancelled(final SVGDocumentLoaderEvent e) {
        setLoadingStatus(LOADING_CANCELLED);
        Activator
                .reportDebugMessage("SVGDocumentLoadingListener: Loading of SVG file was cancelled!");
    }

    /**
     * Documents SVG-document loadingstatus.
     * 
     * @param e
     *            the current SVGDocumentLoaderEvent
     */
    public void documentLoadingCompleted(final SVGDocumentLoaderEvent e) {
        setLoadingStatus(LOADING_COMPLETED);
        Activator
                .reportDebugMessage("SVGDocumentLoadingListener: Loading of SVG file successfully "
                        + "completed!");
    }

    /**
     * Documents SVG-document loadingstatus.
     * 
     * @param e
     *            the current SVGDocumentLoaderEvent
     */
    public void documentLoadingFailed(final SVGDocumentLoaderEvent e) {
        setLoadingStatus(LOADING_FAILED);
        Activator.reportDebugMessage("SVGDocumentLoadingListener: Loading of SVG file failed!");
    }

    /**
     * Documents SVG-document loadingstatus.
     * 
     * @param e
     *            the current SVGDocumentLoaderEvent
     */
    public void documentLoadingStarted(final SVGDocumentLoaderEvent e) {
        setLoadingStatus(LOADING_STARTED);
        Activator.reportDebugMessage("SVGDocumentLoadingListener: Loading of SVG file started!");
    }

}
